// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arckubernetes.inputs;

import com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterExtensionState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterExtensionState Empty = new ClusterExtensionState();

    /**
     * Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this extension.
     * 
     */
    @Import(name="configurationProtectedSettings")
    private @Nullable Output<Map<String,String>> configurationProtectedSettings;

    /**
     * @return Configuration settings that are sensitive, as name-value pairs for configuring this extension.
     * 
     */
    public Optional<Output<Map<String,String>>> configurationProtectedSettings() {
        return Optional.ofNullable(this.configurationProtectedSettings);
    }

    /**
     * Configuration settings, as name-value pairs for configuring this extension.
     * 
     */
    @Import(name="configurationSettings")
    private @Nullable Output<Map<String,String>> configurationSettings;

    /**
     * @return Configuration settings, as name-value pairs for configuring this extension.
     * 
     */
    public Optional<Output<Map<String,String>>> configurationSettings() {
        return Optional.ofNullable(this.configurationSettings);
    }

    /**
     * The current version of the extension.
     * 
     */
    @Import(name="currentVersion")
    private @Nullable Output<String> currentVersion;

    /**
     * @return The current version of the extension.
     * 
     */
    public Optional<Output<String>> currentVersion() {
        return Optional.ofNullable(this.currentVersion);
    }

    /**
     * Specifies the type of extension. It must be one of the extension types registered with Microsoft.KubernetesConfiguration by the Extension publisher. For more information, please refer to [Available Extensions for Arc-enabled Kubernetes clusters](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/extensions-release). Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="extensionType")
    private @Nullable Output<String> extensionType;

    /**
     * @return Specifies the type of extension. It must be one of the extension types registered with Microsoft.KubernetesConfiguration by the Extension publisher. For more information, please refer to [Available Extensions for Arc-enabled Kubernetes clusters](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/extensions-release). Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> extensionType() {
        return Optional.ofNullable(this.extensionType);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ClusterExtensionIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<ClusterExtensionIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Specifies the name which should be used for this Arc Kubernetes Cluster Extension. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Arc Kubernetes Cluster Extension. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Namespace where the extension release must be placed for a cluster scoped extension. If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="releaseNamespace")
    private @Nullable Output<String> releaseNamespace;

    /**
     * @return Namespace where the extension release must be placed for a cluster scoped extension. If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> releaseNamespace() {
        return Optional.ofNullable(this.releaseNamespace);
    }

    /**
     * The release train used by this extension. Possible values include but are not limited to `Stable`, `Preview`. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="releaseTrain")
    private @Nullable Output<String> releaseTrain;

    /**
     * @return The release train used by this extension. Possible values include but are not limited to `Stable`, `Preview`. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> releaseTrain() {
        return Optional.ofNullable(this.releaseTrain);
    }

    /**
     * Namespace where the extension will be created for a namespace scoped extension.  If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="targetNamespace")
    private @Nullable Output<String> targetNamespace;

    /**
     * @return Namespace where the extension will be created for a namespace scoped extension.  If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> targetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    /**
     * User-specified version that the extension should pin to. If it is not set, Azure will use the latest version and auto upgrade it. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return User-specified version that the extension should pin to. If it is not set, Azure will use the latest version and auto upgrade it. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ClusterExtensionState() {}

    private ClusterExtensionState(ClusterExtensionState $) {
        this.clusterId = $.clusterId;
        this.configurationProtectedSettings = $.configurationProtectedSettings;
        this.configurationSettings = $.configurationSettings;
        this.currentVersion = $.currentVersion;
        this.extensionType = $.extensionType;
        this.identity = $.identity;
        this.name = $.name;
        this.releaseNamespace = $.releaseNamespace;
        this.releaseTrain = $.releaseTrain;
        this.targetNamespace = $.targetNamespace;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterExtensionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterExtensionState $;

        public Builder() {
            $ = new ClusterExtensionState();
        }

        public Builder(ClusterExtensionState defaults) {
            $ = new ClusterExtensionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Specifies the Cluster ID. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param configurationProtectedSettings Configuration settings that are sensitive, as name-value pairs for configuring this extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationProtectedSettings(@Nullable Output<Map<String,String>> configurationProtectedSettings) {
            $.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        /**
         * @param configurationProtectedSettings Configuration settings that are sensitive, as name-value pairs for configuring this extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationProtectedSettings(Map<String,String> configurationProtectedSettings) {
            return configurationProtectedSettings(Output.of(configurationProtectedSettings));
        }

        /**
         * @param configurationSettings Configuration settings, as name-value pairs for configuring this extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationSettings(@Nullable Output<Map<String,String>> configurationSettings) {
            $.configurationSettings = configurationSettings;
            return this;
        }

        /**
         * @param configurationSettings Configuration settings, as name-value pairs for configuring this extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationSettings(Map<String,String> configurationSettings) {
            return configurationSettings(Output.of(configurationSettings));
        }

        /**
         * @param currentVersion The current version of the extension.
         * 
         * @return builder
         * 
         */
        public Builder currentVersion(@Nullable Output<String> currentVersion) {
            $.currentVersion = currentVersion;
            return this;
        }

        /**
         * @param currentVersion The current version of the extension.
         * 
         * @return builder
         * 
         */
        public Builder currentVersion(String currentVersion) {
            return currentVersion(Output.of(currentVersion));
        }

        /**
         * @param extensionType Specifies the type of extension. It must be one of the extension types registered with Microsoft.KubernetesConfiguration by the Extension publisher. For more information, please refer to [Available Extensions for Arc-enabled Kubernetes clusters](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/extensions-release). Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(@Nullable Output<String> extensionType) {
            $.extensionType = extensionType;
            return this;
        }

        /**
         * @param extensionType Specifies the type of extension. It must be one of the extension types registered with Microsoft.KubernetesConfiguration by the Extension publisher. For more information, please refer to [Available Extensions for Arc-enabled Kubernetes clusters](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/extensions-release). Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(String extensionType) {
            return extensionType(Output.of(extensionType));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ClusterExtensionIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(ClusterExtensionIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param name Specifies the name which should be used for this Arc Kubernetes Cluster Extension. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Arc Kubernetes Cluster Extension. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param releaseNamespace Namespace where the extension release must be placed for a cluster scoped extension. If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder releaseNamespace(@Nullable Output<String> releaseNamespace) {
            $.releaseNamespace = releaseNamespace;
            return this;
        }

        /**
         * @param releaseNamespace Namespace where the extension release must be placed for a cluster scoped extension. If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder releaseNamespace(String releaseNamespace) {
            return releaseNamespace(Output.of(releaseNamespace));
        }

        /**
         * @param releaseTrain The release train used by this extension. Possible values include but are not limited to `Stable`, `Preview`. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder releaseTrain(@Nullable Output<String> releaseTrain) {
            $.releaseTrain = releaseTrain;
            return this;
        }

        /**
         * @param releaseTrain The release train used by this extension. Possible values include but are not limited to `Stable`, `Preview`. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder releaseTrain(String releaseTrain) {
            return releaseTrain(Output.of(releaseTrain));
        }

        /**
         * @param targetNamespace Namespace where the extension will be created for a namespace scoped extension.  If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(@Nullable Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * @param targetNamespace Namespace where the extension will be created for a namespace scoped extension.  If this namespace does not exist, it will be created. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        /**
         * @param version User-specified version that the extension should pin to. If it is not set, Azure will use the latest version and auto upgrade it. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version User-specified version that the extension should pin to. If it is not set, Azure will use the latest version and auto upgrade it. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ClusterExtensionState build() {
            return $;
        }
    }

}
