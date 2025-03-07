# WARNING: This file is autogenerated - changes will be overwritten if not made via https://github.com/pulumi/ci-mgmt

PACK := azure
ORG := pulumi
PROJECT := github.com/$(ORG)/pulumi-$(PACK)
PROVIDER_PATH := provider/v5
VERSION_PATH := $(PROVIDER_PATH)/pkg/version.Version
TFGEN := pulumi-tfgen-$(PACK)
PROVIDER := pulumi-resource-$(PACK)
VERSION := $(shell pulumictl get version)
JAVA_GEN := pulumi-java-gen
JAVA_GEN_VERSION := v0.9.8
TESTPARALLELISM := 10
WORKING_DIR := $(shell pwd)
PULUMI_PROVIDER_BUILD_PARALLELISM ?= -p 2
PULUMI_CONVERT := 0

development: install_plugins provider build_sdks install_sdks

build: install_plugins provider build_sdks install_sdks

build_sdks: build_nodejs build_python build_go build_dotnet build_java

install_go_sdk:

install_java_sdk:

install_python_sdk:

install_sdks: install_dotnet_sdk install_python_sdk install_nodejs_sdk install_java_sdk

only_build: build

build_dotnet: DOTNET_VERSION := $(shell pulumictl get version --language dotnet)
build_dotnet: upstream
	pulumictl get version --language dotnet
	$(WORKING_DIR)/bin/$(TFGEN) dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		printf "module fake_dotnet_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		echo "$(DOTNET_VERSION)" >version.txt && \
		dotnet build /p:Version=$(DOTNET_VERSION)

build_go: upstream
	$(WORKING_DIR)/bin/$(TFGEN) go --out sdk/go/
	cd sdk && go list "$$(grep -e "^module" go.mod | cut -d ' ' -f 2)/go/..." | xargs go build

build_java: PACKAGE_VERSION := $(shell pulumictl get version --language generic)
build_java: bin/pulumi-java-gen upstream
	$(WORKING_DIR)/bin/$(JAVA_GEN) generate --schema provider/cmd/$(PROVIDER)/schema.json --out sdk/java  --build gradle-nexus
	cd sdk/java/ && \
		printf "module fake_java_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		gradle --console=plain build

build_nodejs: VERSION := $(shell pulumictl get version --language javascript)
build_nodejs: upstream
	$(WORKING_DIR)/bin/$(TFGEN) nodejs --out sdk/nodejs/
	cd sdk/nodejs/ && \
		printf "module fake_nodejs_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		yarn install && \
		yarn run tsc && \
		cp ../../README.md ../../LICENSE* package.json yarn.lock ./bin/ && \
		sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" ./bin/package.json

build_python: PYPI_VERSION := $(shell pulumictl get version --language python)
build_python: upstream
	rm -rf sdk/python/
	$(WORKING_DIR)/bin/$(TFGEN) python --out sdk/python/
	cd sdk/python/ && \
		printf "module fake_python_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		cp ../../README.md . && \
		rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
		sed -i.bak -e 's/^  version = .*/  version = "$(PYPI_VERSION)"/g' ./bin/pyproject.toml && \
		rm ./bin/pyproject.toml.bak && rm ./bin/go.mod && \
		python3 -m venv venv && \
		./venv/bin/python -m pip install build && \
		cd ./bin && \
		../venv/bin/python -m build .

clean:
	rm -rf sdk/{dotnet,nodejs,go,python}

cleanup:
	rm -r $(WORKING_DIR)/bin
	rm -f provider/cmd/$(PROVIDER)/schema.go

help:
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
	expand -t20

install_dotnet_sdk:
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} $(WORKING_DIR)/nuget \;

install_nodejs_sdk:
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_plugins: .pulumi/bin/pulumi
	.pulumi/bin/pulumi plugin install resource random 4.8.2
	.pulumi/bin/pulumi plugin install resource azuread 5.33.0
	.pulumi/bin/pulumi plugin install resource time 0.0.15
	.pulumi/bin/pulumi plugin install resource local 0.0.1

lint_provider: provider
	cd provider && golangci-lint run -c ../.golangci.yml

provider: tfgen install_plugins
	(cd provider && go build $(PULUMI_PROVIDER_BUILD_PARALLELISM) -o $(WORKING_DIR)/bin/$(PROVIDER) -ldflags "-X $(PROJECT)/$(VERSION_PATH)=$(VERSION) -X github.com/hashicorp/terraform-provider-azurerm/version.ProviderVersion=$(VERSION)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(PROVIDER))

test:
	cd examples && go test -v -tags=all -parallel $(TESTPARALLELISM) -timeout 2h

test_provider:
	@echo ""
	@echo "== test_provider ==================================================================="
	@echo ""
	cd provider && go test -v -short ./... -parallel $(TESTPARALLELISM)

tfgen: install_plugins upstream
	(cd provider && go build $(PULUMI_PROVIDER_BUILD_PARALLELISM) -o $(WORKING_DIR)/bin/$(TFGEN) -ldflags "-X $(PROJECT)/$(VERSION_PATH)=$(VERSION)" $(PROJECT)/$(PROVIDER_PATH)/cmd/$(TFGEN))
	PATH=${PWD}/.pulumi/bin:$$PATH PULUMI_CONVERT=$(PULUMI_CONVERT) $(WORKING_DIR)/bin/$(TFGEN) schema --out provider/cmd/$(PROVIDER)
	(cd provider && VERSION=$(VERSION) go generate cmd/$(PROVIDER)/main.go)

upstream:
ifneq ("$(wildcard upstream)","")
	scripts/upstream.sh "$@" apply
endif

upstream.finalize:
	scripts/upstream.sh "$@" end_rebase

upstream.rebase:
	scripts/upstream.sh "$@" start_rebase

bin/pulumi-java-gen:
	pulumictl download-binary -n pulumi-language-java -v $(JAVA_GEN_VERSION) -r pulumi/pulumi-java

# To make an immediately observable change to .ci-mgmt.yaml:
#
# - Edit .ci-mgmt.yaml
# - Run make ci-mgmt to apply the change locally.
#
ci-mgmt: .ci-mgmt.yaml
	rm .github/workflows/*.yml # Copied from update-workflows.yml
	go run github.com/pulumi/ci-mgmt/provider-ci@master generate \
		--name pulumi/pulumi-$(PACK) \
		--out . \
		--template bridged-provider \
		--config $<

.pulumi/bin/pulumi: .pulumi/version
	curl -fsSL https://get.pulumi.com | HOME=$(WORKING_DIR) sh -s -- --version $(cat .pulumi/version)

# Compute the version of Pulumi to use by inspecting the Go dependencies of the provider.
.pulumi/version:
	@mkdir -p .pulumi
	@cd provider && go list -f "{{slice .Version 1}}" -m github.com/pulumi/pulumi/pkg/v3 | tee ../$@

.PHONY: development build build_sdks install_go_sdk install_java_sdk install_python_sdk install_sdks only_build build_dotnet build_go build_java build_nodejs build_python clean cleanup help install_dotnet_sdk install_nodejs_sdk install_plugins lint_provider provider test tfgen upstream upstream.finalize upstream.rebase ci-mgmt test_provider
