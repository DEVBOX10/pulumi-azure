// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.azure.logicapps.outputs.GetStandardConnectionString;
import com.pulumi.azure.logicapps.outputs.GetStandardIdentity;
import com.pulumi.azure.logicapps.outputs.GetStandardSiteConfig;
import com.pulumi.azure.logicapps.outputs.GetStandardSiteCredential;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetStandardResult {
    private String appServicePlanId;
    private Map<String,String> appSettings;
    private String bundleVersion;
    private Boolean clientAffinityEnabled;
    private String clientCertificateMode;
    private List<GetStandardConnectionString> connectionStrings;
    private String customDomainVerificationId;
    private String defaultHostname;
    private Boolean enabled;
    private Boolean httpsOnly;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return An `identity` block as defined below.
     * 
     */
    private List<GetStandardIdentity> identities;
    private String kind;
    /**
     * @return The Azure location where the Logic App Standard exists.
     * 
     */
    private String location;
    private String name;
    private String outboundIpAddresses;
    private String possibleOutboundIpAddresses;
    private String resourceGroupName;
    private GetStandardSiteConfig siteConfig;
    private List<GetStandardSiteCredential> siteCredentials;
    private String storageAccountAccessKey;
    private String storageAccountName;
    private String storageAccountShareName;
    private @Nullable Map<String,String> tags;
    private Boolean useExtensionBundle;
    private String version;
    private String virtualNetworkSubnetId;

    private GetStandardResult() {}
    public String appServicePlanId() {
        return this.appServicePlanId;
    }
    public Map<String,String> appSettings() {
        return this.appSettings;
    }
    public String bundleVersion() {
        return this.bundleVersion;
    }
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }
    public String clientCertificateMode() {
        return this.clientCertificateMode;
    }
    public List<GetStandardConnectionString> connectionStrings() {
        return this.connectionStrings;
    }
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    public String defaultHostname() {
        return this.defaultHostname;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An `identity` block as defined below.
     * 
     */
    public List<GetStandardIdentity> identities() {
        return this.identities;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure location where the Logic App Standard exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public GetStandardSiteConfig siteConfig() {
        return this.siteConfig;
    }
    public List<GetStandardSiteCredential> siteCredentials() {
        return this.siteCredentials;
    }
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }
    public String storageAccountName() {
        return this.storageAccountName;
    }
    public String storageAccountShareName() {
        return this.storageAccountShareName;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Boolean useExtensionBundle() {
        return this.useExtensionBundle;
    }
    public String version() {
        return this.version;
    }
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appServicePlanId;
        private Map<String,String> appSettings;
        private String bundleVersion;
        private Boolean clientAffinityEnabled;
        private String clientCertificateMode;
        private List<GetStandardConnectionString> connectionStrings;
        private String customDomainVerificationId;
        private String defaultHostname;
        private Boolean enabled;
        private Boolean httpsOnly;
        private String id;
        private List<GetStandardIdentity> identities;
        private String kind;
        private String location;
        private String name;
        private String outboundIpAddresses;
        private String possibleOutboundIpAddresses;
        private String resourceGroupName;
        private GetStandardSiteConfig siteConfig;
        private List<GetStandardSiteCredential> siteCredentials;
        private String storageAccountAccessKey;
        private String storageAccountName;
        private String storageAccountShareName;
        private @Nullable Map<String,String> tags;
        private Boolean useExtensionBundle;
        private String version;
        private String virtualNetworkSubnetId;
        public Builder() {}
        public Builder(GetStandardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServicePlanId = defaults.appServicePlanId;
    	      this.appSettings = defaults.appSettings;
    	      this.bundleVersion = defaults.bundleVersion;
    	      this.clientAffinityEnabled = defaults.clientAffinityEnabled;
    	      this.clientCertificateMode = defaults.clientCertificateMode;
    	      this.connectionStrings = defaults.connectionStrings;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.enabled = defaults.enabled;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundIpAddresses = defaults.outboundIpAddresses;
    	      this.possibleOutboundIpAddresses = defaults.possibleOutboundIpAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteConfig = defaults.siteConfig;
    	      this.siteCredentials = defaults.siteCredentials;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageAccountShareName = defaults.storageAccountShareName;
    	      this.tags = defaults.tags;
    	      this.useExtensionBundle = defaults.useExtensionBundle;
    	      this.version = defaults.version;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        @CustomType.Setter
        public Builder appServicePlanId(String appServicePlanId) {
            this.appServicePlanId = Objects.requireNonNull(appServicePlanId);
            return this;
        }
        @CustomType.Setter
        public Builder appSettings(Map<String,String> appSettings) {
            this.appSettings = Objects.requireNonNull(appSettings);
            return this;
        }
        @CustomType.Setter
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = Objects.requireNonNull(bundleVersion);
            return this;
        }
        @CustomType.Setter
        public Builder clientAffinityEnabled(Boolean clientAffinityEnabled) {
            this.clientAffinityEnabled = Objects.requireNonNull(clientAffinityEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificateMode(String clientCertificateMode) {
            this.clientCertificateMode = Objects.requireNonNull(clientCertificateMode);
            return this;
        }
        @CustomType.Setter
        public Builder connectionStrings(List<GetStandardConnectionString> connectionStrings) {
            this.connectionStrings = Objects.requireNonNull(connectionStrings);
            return this;
        }
        public Builder connectionStrings(GetStandardConnectionString... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }
        @CustomType.Setter
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            this.customDomainVerificationId = Objects.requireNonNull(customDomainVerificationId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultHostname(String defaultHostname) {
            this.defaultHostname = Objects.requireNonNull(defaultHostname);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder httpsOnly(Boolean httpsOnly) {
            this.httpsOnly = Objects.requireNonNull(httpsOnly);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identities(List<GetStandardIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetStandardIdentity... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outboundIpAddresses(String outboundIpAddresses) {
            this.outboundIpAddresses = Objects.requireNonNull(outboundIpAddresses);
            return this;
        }
        @CustomType.Setter
        public Builder possibleOutboundIpAddresses(String possibleOutboundIpAddresses) {
            this.possibleOutboundIpAddresses = Objects.requireNonNull(possibleOutboundIpAddresses);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder siteConfig(GetStandardSiteConfig siteConfig) {
            this.siteConfig = Objects.requireNonNull(siteConfig);
            return this;
        }
        @CustomType.Setter
        public Builder siteCredentials(List<GetStandardSiteCredential> siteCredentials) {
            this.siteCredentials = Objects.requireNonNull(siteCredentials);
            return this;
        }
        public Builder siteCredentials(GetStandardSiteCredential... siteCredentials) {
            return siteCredentials(List.of(siteCredentials));
        }
        @CustomType.Setter
        public Builder storageAccountAccessKey(String storageAccountAccessKey) {
            this.storageAccountAccessKey = Objects.requireNonNull(storageAccountAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountShareName(String storageAccountShareName) {
            this.storageAccountShareName = Objects.requireNonNull(storageAccountShareName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder useExtensionBundle(Boolean useExtensionBundle) {
            this.useExtensionBundle = Objects.requireNonNull(useExtensionBundle);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }
        public GetStandardResult build() {
            final var _resultValue = new GetStandardResult();
            _resultValue.appServicePlanId = appServicePlanId;
            _resultValue.appSettings = appSettings;
            _resultValue.bundleVersion = bundleVersion;
            _resultValue.clientAffinityEnabled = clientAffinityEnabled;
            _resultValue.clientCertificateMode = clientCertificateMode;
            _resultValue.connectionStrings = connectionStrings;
            _resultValue.customDomainVerificationId = customDomainVerificationId;
            _resultValue.defaultHostname = defaultHostname;
            _resultValue.enabled = enabled;
            _resultValue.httpsOnly = httpsOnly;
            _resultValue.id = id;
            _resultValue.identities = identities;
            _resultValue.kind = kind;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.outboundIpAddresses = outboundIpAddresses;
            _resultValue.possibleOutboundIpAddresses = possibleOutboundIpAddresses;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.siteConfig = siteConfig;
            _resultValue.siteCredentials = siteCredentials;
            _resultValue.storageAccountAccessKey = storageAccountAccessKey;
            _resultValue.storageAccountName = storageAccountName;
            _resultValue.storageAccountShareName = storageAccountShareName;
            _resultValue.tags = tags;
            _resultValue.useExtensionBundle = useExtensionBundle;
            _resultValue.version = version;
            _resultValue.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return _resultValue;
        }
    }
}
