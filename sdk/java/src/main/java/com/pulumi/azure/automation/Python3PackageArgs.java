// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Python3PackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final Python3PackageArgs Empty = new Python3PackageArgs();

    /**
     * The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    @Import(name="contentUri", required=true)
    private Output<String> contentUri;

    /**
     * @return The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    public Output<String> contentUri() {
        return this.contentUri;
    }

    /**
     * Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    @Import(name="contentVersion")
    private @Nullable Output<String> contentVersion;

    /**
     * @return Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    public Optional<Output<String>> contentVersion() {
        return Optional.ofNullable(this.contentVersion);
    }

    /**
     * Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    @Import(name="hashAlgorithm")
    private @Nullable Output<String> hashAlgorithm;

    /**
     * @return Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    public Optional<Output<String>> hashAlgorithm() {
        return Optional.ofNullable(this.hashAlgorithm);
    }

    /**
     * Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    @Import(name="hashValue")
    private @Nullable Output<String> hashValue;

    /**
     * @return Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    public Optional<Output<String>> hashValue() {
        return Optional.ofNullable(this.hashValue);
    }

    /**
     * The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags which should be assigned to the Automation Python3 Package.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Automation Python3 Package.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private Python3PackageArgs() {}

    private Python3PackageArgs(Python3PackageArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.contentUri = $.contentUri;
        this.contentVersion = $.contentVersion;
        this.hashAlgorithm = $.hashAlgorithm;
        this.hashValue = $.hashValue;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Python3PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Python3PackageArgs $;

        public Builder() {
            $ = new Python3PackageArgs();
        }

        public Builder(Python3PackageArgs defaults) {
            $ = new Python3PackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Python3 Package is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param contentUri The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder contentUri(Output<String> contentUri) {
            $.contentUri = contentUri;
            return this;
        }

        /**
         * @param contentUri The URL of the python package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder contentUri(String contentUri) {
            return contentUri(Output.of(contentUri));
        }

        /**
         * @param contentVersion Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder contentVersion(@Nullable Output<String> contentVersion) {
            $.contentVersion = contentVersion;
            return this;
        }

        /**
         * @param contentVersion Specify the version of the python3 package. The value should meet the system.version class format like `1.1.1`. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder contentVersion(String contentVersion) {
            return contentVersion(Output.of(contentVersion));
        }

        /**
         * @param hashAlgorithm Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder hashAlgorithm(@Nullable Output<String> hashAlgorithm) {
            $.hashAlgorithm = hashAlgorithm;
            return this;
        }

        /**
         * @param hashAlgorithm Specify the hash algorithm used to hash the content of the python3 package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder hashAlgorithm(String hashAlgorithm) {
            return hashAlgorithm(Output.of(hashAlgorithm));
        }

        /**
         * @param hashValue Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder hashValue(@Nullable Output<String> hashValue) {
            $.hashValue = hashValue;
            return this;
        }

        /**
         * @param hashValue Specity the hash value of the content. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder hashValue(String hashValue) {
            return hashValue(Output.of(hashValue));
        }

        /**
         * @param name The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Automation Python3 Package. Changing this forces a new Automation Python3 Package to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Python3 Package is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Automation Python3 Package.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Automation Python3 Package.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Python3PackageArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.contentUri = Objects.requireNonNull($.contentUri, "expected parameter 'contentUri' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
