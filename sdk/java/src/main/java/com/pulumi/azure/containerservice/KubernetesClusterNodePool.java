// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs;
import com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolKubeletConfig;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolLinuxOsConfig;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolNodeNetworkProfile;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolUpgradeSettings;
import com.pulumi.azure.containerservice.outputs.KubernetesClusterNodePoolWindowsProfile;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Node Pool within a Kubernetes Cluster
 * 
 * &gt; **NOTE:** Multiple Node Pools are only supported when the Kubernetes Cluster is using Virtual Machine Scale Sets.
 * 
 * ## Example Usage
 * 
 * This example provisions a basic Kubernetes Node Pool.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.containerservice.KubernetesCluster;
 * import com.pulumi.azure.containerservice.KubernetesClusterArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs;
 * import com.pulumi.azure.containerservice.inputs.KubernetesClusterServicePrincipalArgs;
 * import com.pulumi.azure.containerservice.KubernetesClusterNodePool;
 * import com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleKubernetesCluster = new KubernetesCluster(&#34;exampleKubernetesCluster&#34;, KubernetesClusterArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .dnsPrefix(&#34;exampleaks1&#34;)
 *             .defaultNodePool(KubernetesClusterDefaultNodePoolArgs.builder()
 *                 .name(&#34;default&#34;)
 *                 .nodeCount(1)
 *                 .vmSize(&#34;Standard_D2_v2&#34;)
 *                 .build())
 *             .servicePrincipal(KubernetesClusterServicePrincipalArgs.builder()
 *                 .clientId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *                 .clientSecret(&#34;00000000000000000000000000000000&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleKubernetesClusterNodePool = new KubernetesClusterNodePool(&#34;exampleKubernetesClusterNodePool&#34;, KubernetesClusterNodePoolArgs.builder()        
 *             .kubernetesClusterId(exampleKubernetesCluster.id())
 *             .vmSize(&#34;Standard_DS2_v2&#34;)
 *             .nodeCount(1)
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Kubernetes Cluster Node Pools can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:containerservice/kubernetesClusterNodePool:KubernetesClusterNodePool pool1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ContainerService/managedClusters/cluster1/agentPools/pool1
 * ```
 * 
 */
@ResourceType(type="azure:containerservice/kubernetesClusterNodePool:KubernetesClusterNodePool")
public class KubernetesClusterNodePool extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the ID of the Capacity Reservation Group where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="capacityReservationGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> capacityReservationGroupId;

    /**
     * @return Specifies the ID of the Capacity Reservation Group where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> capacityReservationGroupId() {
        return Codegen.optional(this.capacityReservationGroupId);
    }
    /**
     * Specifies whether to trust a Custom CA.
     * 
     * &gt; **Note:** This requires that the Preview Feature `Microsoft.ContainerService/CustomCATrustPreview` is enabled and the Resource Provider is re-registered, see [the documentation](https://learn.microsoft.com/en-us/azure/aks/custom-certificate-authority) for more information.
     * 
     */
    @Export(name="customCaTrustEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> customCaTrustEnabled;

    /**
     * @return Specifies whether to trust a Custom CA.
     * 
     * &gt; **Note:** This requires that the Preview Feature `Microsoft.ContainerService/CustomCATrustPreview` is enabled and the Resource Provider is re-registered, see [the documentation](https://learn.microsoft.com/en-us/azure/aks/custom-certificate-authority) for more information.
     * 
     */
    public Output<Optional<Boolean>> customCaTrustEnabled() {
        return Codegen.optional(this.customCaTrustEnabled);
    }
    /**
     * Whether to enable [auto-scaler](https://docs.microsoft.com/azure/aks/cluster-autoscaler).
     * 
     */
    @Export(name="enableAutoScaling", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableAutoScaling;

    /**
     * @return Whether to enable [auto-scaler](https://docs.microsoft.com/azure/aks/cluster-autoscaler).
     * 
     */
    public Output<Optional<Boolean>> enableAutoScaling() {
        return Codegen.optional(this.enableAutoScaling);
    }
    /**
     * Should the nodes in this Node Pool have host encryption enabled? Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Additional fields must be configured depending on the value of this field - see below.
     * 
     */
    @Export(name="enableHostEncryption", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableHostEncryption;

    /**
     * @return Should the nodes in this Node Pool have host encryption enabled? Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Additional fields must be configured depending on the value of this field - see below.
     * 
     */
    public Output<Optional<Boolean>> enableHostEncryption() {
        return Codegen.optional(this.enableHostEncryption);
    }
    /**
     * Should each node have a Public IP Address? Changing this forces a new resource to be created.
     * 
     */
    @Export(name="enableNodePublicIp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableNodePublicIp;

    /**
     * @return Should each node have a Public IP Address? Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> enableNodePublicIp() {
        return Codegen.optional(this.enableNodePublicIp);
    }
    /**
     * The Eviction Policy which should be used for Virtual Machines within the Virtual Machine Scale Set powering this Node Pool. Possible values are `Deallocate` and `Delete`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** An Eviction Policy can only be configured when `priority` is set to `Spot` and will default to `Delete` unless otherwise specified.
     * 
     */
    @Export(name="evictionPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return The Eviction Policy which should be used for Virtual Machines within the Virtual Machine Scale Set powering this Node Pool. Possible values are `Deallocate` and `Delete`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** An Eviction Policy can only be configured when `priority` is set to `Spot` and will default to `Delete` unless otherwise specified.
     * 
     */
    public Output<Optional<String>> evictionPolicy() {
        return Codegen.optional(this.evictionPolicy);
    }
    /**
     * Should the nodes in this Node Pool have Federal Information Processing Standard enabled? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** FIPS support is in Public Preview - more information and details on how to opt into the Preview can be found in [this article](https://docs.microsoft.com/azure/aks/use-multiple-node-pools#add-a-fips-enabled-node-pool-preview).
     * 
     */
    @Export(name="fipsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fipsEnabled;

    /**
     * @return Should the nodes in this Node Pool have Federal Information Processing Standard enabled? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** FIPS support is in Public Preview - more information and details on how to opt into the Preview can be found in [this article](https://docs.microsoft.com/azure/aks/use-multiple-node-pools#add-a-fips-enabled-node-pool-preview).
     * 
     */
    public Output<Optional<Boolean>> fipsEnabled() {
        return Codegen.optional(this.fipsEnabled);
    }
    /**
     * The fully qualified resource ID of the Dedicated Host Group to provision virtual machines from. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hostGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostGroupId;

    /**
     * @return The fully qualified resource ID of the Dedicated Host Group to provision virtual machines from. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> hostGroupId() {
        return Codegen.optional(this.hostGroupId);
    }
    /**
     * A `kubelet_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="kubeletConfig", refs={KubernetesClusterNodePoolKubeletConfig.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesClusterNodePoolKubeletConfig> kubeletConfig;

    /**
     * @return A `kubelet_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<KubernetesClusterNodePoolKubeletConfig>> kubeletConfig() {
        return Codegen.optional(this.kubeletConfig);
    }
    /**
     * The type of disk used by kubelet. Possible values are `OS` and `Temporary`.
     * 
     */
    @Export(name="kubeletDiskType", refs={String.class}, tree="[0]")
    private Output<String> kubeletDiskType;

    /**
     * @return The type of disk used by kubelet. Possible values are `OS` and `Temporary`.
     * 
     */
    public Output<String> kubeletDiskType() {
        return this.kubeletDiskType;
    }
    /**
     * The ID of the Kubernetes Cluster where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** The type of Default Node Pool for the Kubernetes Cluster must be `VirtualMachineScaleSets` to attach multiple node pools.
     * 
     */
    @Export(name="kubernetesClusterId", refs={String.class}, tree="[0]")
    private Output<String> kubernetesClusterId;

    /**
     * @return The ID of the Kubernetes Cluster where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** The type of Default Node Pool for the Kubernetes Cluster must be `VirtualMachineScaleSets` to attach multiple node pools.
     * 
     */
    public Output<String> kubernetesClusterId() {
        return this.kubernetesClusterId;
    }
    /**
     * A `linux_os_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="linuxOsConfig", refs={KubernetesClusterNodePoolLinuxOsConfig.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesClusterNodePoolLinuxOsConfig> linuxOsConfig;

    /**
     * @return A `linux_os_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<KubernetesClusterNodePoolLinuxOsConfig>> linuxOsConfig() {
        return Codegen.optional(this.linuxOsConfig);
    }
    /**
     * The maximum number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` and must be greater than or equal to `min_count`.
     * 
     */
    @Export(name="maxCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxCount;

    /**
     * @return The maximum number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` and must be greater than or equal to `min_count`.
     * 
     */
    public Output<Optional<Integer>> maxCount() {
        return Codegen.optional(this.maxCount);
    }
    /**
     * The maximum number of pods that can run on each agent. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maxPods", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxPods;

    /**
     * @return The maximum number of pods that can run on each agent. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> maxPods() {
        return this.maxPods;
    }
    /**
     * A base64-encoded string which will be written to /etc/motd after decoding. This allows customization of the message of the day for Linux nodes. It cannot be specified for Windows nodes and must be a static string (i.e. will be printed raw and not executed as a script). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="messageOfTheDay", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> messageOfTheDay;

    /**
     * @return A base64-encoded string which will be written to /etc/motd after decoding. This allows customization of the message of the day for Linux nodes. It cannot be specified for Windows nodes and must be a static string (i.e. will be printed raw and not executed as a script). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> messageOfTheDay() {
        return Codegen.optional(this.messageOfTheDay);
    }
    /**
     * The minimum number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` and must be less than or equal to `max_count`.
     * 
     */
    @Export(name="minCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minCount;

    /**
     * @return The minimum number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` and must be less than or equal to `max_count`.
     * 
     */
    public Output<Optional<Integer>> minCount() {
        return Codegen.optional(this.minCount);
    }
    /**
     * Should this Node Pool be used for System or User resources? Possible values are `System` and `User`. Defaults to `User`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    /**
     * @return Should this Node Pool be used for System or User resources? Possible values are `System` and `User`. Defaults to `User`.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the Node Pool which should be created within the Kubernetes Cluster. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A Windows Node Pool cannot have a `name` longer than 6 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Node Pool which should be created within the Kubernetes Cluster. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A Windows Node Pool cannot have a `name` longer than 6 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` (inclusive) for user pools and between `1` and `1000` (inclusive) for system pools.
     * 
     */
    @Export(name="nodeCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> nodeCount;

    /**
     * @return The number of nodes which should exist within this Node Pool. Valid values are between `0` and `1000` (inclusive) for user pools and between `1` and `1000` (inclusive) for system pools.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }
    /**
     * A map of Kubernetes labels which should be applied to nodes in this Node Pool.
     * 
     */
    @Export(name="nodeLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> nodeLabels;

    /**
     * @return A map of Kubernetes labels which should be applied to nodes in this Node Pool.
     * 
     */
    public Output<Map<String,String>> nodeLabels() {
        return this.nodeLabels;
    }
    /**
     * A `node_network_profile` block as documented below.
     * 
     */
    @Export(name="nodeNetworkProfile", refs={KubernetesClusterNodePoolNodeNetworkProfile.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesClusterNodePoolNodeNetworkProfile> nodeNetworkProfile;

    /**
     * @return A `node_network_profile` block as documented below.
     * 
     */
    public Output<Optional<KubernetesClusterNodePoolNodeNetworkProfile>> nodeNetworkProfile() {
        return Codegen.optional(this.nodeNetworkProfile);
    }
    /**
     * Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `enable_node_public_ip` should be `true`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="nodePublicIpPrefixId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodePublicIpPrefixId;

    /**
     * @return Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `enable_node_public_ip` should be `true`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> nodePublicIpPrefixId() {
        return Codegen.optional(this.nodePublicIpPrefixId);
    }
    /**
     * A list of Kubernetes taints which should be applied to nodes in the agent pool (e.g `key=value:NoSchedule`). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="nodeTaints", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> nodeTaints;

    /**
     * @return A list of Kubernetes taints which should be applied to nodes in the agent pool (e.g `key=value:NoSchedule`). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<String>>> nodeTaints() {
        return Codegen.optional(this.nodeTaints);
    }
    /**
     * Version of Kubernetes used for the Agents. If not specified, the latest recommended version will be used at provisioning time (but won&#39;t auto-upgrade). AKS does not require an exact patch version to be specified, minor version aliases such as `1.22` are also supported. - The minor version&#39;s latest GA patch is automatically chosen in that case. More details can be found in [the documentation](https://docs.microsoft.com/en-us/azure/aks/supported-kubernetes-versions?tabs=azure-cli#alias-minor-version).
     * 
     * &gt; **Note:** This version must be supported by the Kubernetes Cluster - as such the version of Kubernetes used on the Cluster/Control Plane may need to be upgraded first.
     * 
     */
    @Export(name="orchestratorVersion", refs={String.class}, tree="[0]")
    private Output<String> orchestratorVersion;

    /**
     * @return Version of Kubernetes used for the Agents. If not specified, the latest recommended version will be used at provisioning time (but won&#39;t auto-upgrade). AKS does not require an exact patch version to be specified, minor version aliases such as `1.22` are also supported. - The minor version&#39;s latest GA patch is automatically chosen in that case. More details can be found in [the documentation](https://docs.microsoft.com/en-us/azure/aks/supported-kubernetes-versions?tabs=azure-cli#alias-minor-version).
     * 
     * &gt; **Note:** This version must be supported by the Kubernetes Cluster - as such the version of Kubernetes used on the Cluster/Control Plane may need to be upgraded first.
     * 
     */
    public Output<String> orchestratorVersion() {
        return this.orchestratorVersion;
    }
    /**
     * The Agent Operating System disk size in GB. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="osDiskSizeGb", refs={Integer.class}, tree="[0]")
    private Output<Integer> osDiskSizeGb;

    /**
     * @return The Agent Operating System disk size in GB. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> osDiskSizeGb() {
        return this.osDiskSizeGb;
    }
    /**
     * The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="osDiskType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osDiskType;

    /**
     * @return The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> osDiskType() {
        return Codegen.optional(this.osDiskType);
    }
    /**
     * Specifies the OS SKU used by the agent pool. Possible values include: `AzureLinux`, `Ubuntu`, `Windows2019`, `Windows2022`. If not specified, the default is `Ubuntu` if OSType=Linux or `Windows2019` if OSType=Windows. And the default Windows OSSKU will be changed to `Windows2022` after Windows2019 is deprecated. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="osSku", refs={String.class}, tree="[0]")
    private Output<String> osSku;

    /**
     * @return Specifies the OS SKU used by the agent pool. Possible values include: `AzureLinux`, `Ubuntu`, `Windows2019`, `Windows2022`. If not specified, the default is `Ubuntu` if OSType=Linux or `Windows2019` if OSType=Windows. And the default Windows OSSKU will be changed to `Windows2022` after Windows2019 is deprecated. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> osSku() {
        return this.osSku;
    }
    /**
     * The Operating System which should be used for this Node Pool. Changing this forces a new resource to be created. Possible values are `Linux` and `Windows`. Defaults to `Linux`.
     * 
     */
    @Export(name="osType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> osType;

    /**
     * @return The Operating System which should be used for this Node Pool. Changing this forces a new resource to be created. Possible values are `Linux` and `Windows`. Defaults to `Linux`.
     * 
     */
    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    /**
     * The ID of the Subnet where the pods in the Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="podSubnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> podSubnetId;

    /**
     * @return The ID of the Subnet where the pods in the Node Pool should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> podSubnetId() {
        return Codegen.optional(this.podSubnetId);
    }
    /**
     * The Priority for Virtual Machines within the Virtual Machine Scale Set that powers this Node Pool. Possible values are `Regular` and `Spot`. Defaults to `Regular`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="priority", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> priority;

    /**
     * @return The Priority for Virtual Machines within the Virtual Machine Scale Set that powers this Node Pool. Possible values are `Regular` and `Spot`. Defaults to `Regular`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The ID of the Proximity Placement Group where the Virtual Machine Scale Set that powers this Node Pool will be placed. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When setting `priority` to Spot - you must configure an `eviction_policy`, `spot_max_price` and add the applicable `node_labels` and `node_taints` [as per the Azure Documentation](https://docs.microsoft.com/azure/aks/spot-node-pool).
     * 
     */
    @Export(name="proximityPlacementGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group where the Virtual Machine Scale Set that powers this Node Pool will be placed. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When setting `priority` to Spot - you must configure an `eviction_policy`, `spot_max_price` and add the applicable `node_labels` and `node_taints` [as per the Azure Documentation](https://docs.microsoft.com/azure/aks/spot-node-pool).
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupId() {
        return Codegen.optional(this.proximityPlacementGroupId);
    }
    /**
     * Specifies how the node pool should deal with scaled-down nodes. Allowed values are `Delete` and `Deallocate`. Defaults to `Delete`.
     * 
     */
    @Export(name="scaleDownMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scaleDownMode;

    /**
     * @return Specifies how the node pool should deal with scaled-down nodes. Allowed values are `Delete` and `Deallocate`. Defaults to `Delete`.
     * 
     */
    public Output<Optional<String>> scaleDownMode() {
        return Codegen.optional(this.scaleDownMode);
    }
    /**
     * The ID of the Snapshot which should be used to create this Node Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The ID of the Snapshot which should be used to create this Node Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * The maximum price you&#39;re willing to pay in USD per Virtual Machine. Valid values are `-1` (the current on-demand price for a Virtual Machine) or a positive value with up to five decimal places. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This field can only be configured when `priority` is set to `Spot`.
     * 
     */
    @Export(name="spotMaxPrice", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> spotMaxPrice;

    /**
     * @return The maximum price you&#39;re willing to pay in USD per Virtual Machine. Valid values are `-1` (the current on-demand price for a Virtual Machine) or a positive value with up to five decimal places. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This field can only be configured when `priority` is set to `Spot`.
     * 
     */
    public Output<Optional<Double>> spotMaxPrice() {
        return Codegen.optional(this.spotMaxPrice);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     * &gt; At this time there&#39;s a bug in the AKS API where Tags for a Node Pool are not stored in the correct case - you may wish to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) functionality to ignore changes to the casing until this is fixed in the AKS API.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     * &gt; At this time there&#39;s a bug in the AKS API where Tags for a Node Pool are not stored in the correct case - you may wish to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) functionality to ignore changes to the casing until this is fixed in the AKS API.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Used to specify whether the UltraSSD is enabled in the Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/azure/aks/use-ultra-disks) for more information. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="ultraSsdEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ultraSsdEnabled;

    /**
     * @return Used to specify whether the UltraSSD is enabled in the Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/azure/aks/use-ultra-disks) for more information. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> ultraSsdEnabled() {
        return Codegen.optional(this.ultraSsdEnabled);
    }
    /**
     * A `upgrade_settings` block as documented below.
     * 
     */
    @Export(name="upgradeSettings", refs={KubernetesClusterNodePoolUpgradeSettings.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesClusterNodePoolUpgradeSettings> upgradeSettings;

    /**
     * @return A `upgrade_settings` block as documented below.
     * 
     */
    public Output<Optional<KubernetesClusterNodePoolUpgradeSettings>> upgradeSettings() {
        return Codegen.optional(this.upgradeSettings);
    }
    /**
     * The SKU which should be used for the Virtual Machines used in this Node Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vmSize", refs={String.class}, tree="[0]")
    private Output<String> vmSize;

    /**
     * @return The SKU which should be used for the Virtual Machines used in this Node Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmSize() {
        return this.vmSize;
    }
    /**
     * The ID of the Subnet where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A route table must be configured on this Subnet.
     * 
     */
    @Export(name="vnetSubnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vnetSubnetId;

    /**
     * @return The ID of the Subnet where this Node Pool should exist. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A route table must be configured on this Subnet.
     * 
     */
    public Output<Optional<String>> vnetSubnetId() {
        return Codegen.optional(this.vnetSubnetId);
    }
    /**
     * A `windows_profile` block as documented below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="windowsProfile", refs={KubernetesClusterNodePoolWindowsProfile.class}, tree="[0]")
    private Output</* @Nullable */ KubernetesClusterNodePoolWindowsProfile> windowsProfile;

    /**
     * @return A `windows_profile` block as documented below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<KubernetesClusterNodePoolWindowsProfile>> windowsProfile() {
        return Codegen.optional(this.windowsProfile);
    }
    /**
     * Used to specify the workload runtime. Allowed values are `OCIContainer`, `WasmWasi` and `KataMshvVmIsolation`.
     * 
     * &gt; **Note:** WebAssembly System Interface node pools are in Public Preview - more information and details on how to opt into the preview can be found in [this article](https://docs.microsoft.com/azure/aks/use-wasi-node-pools)
     * 
     * &gt; **Note:** Pod Sandboxing / KataVM Isolation node pools are in Public Preview - more information and details on how to opt into the preview can be found in [this article](https://learn.microsoft.com/azure/aks/use-pod-sandboxing)
     * 
     */
    @Export(name="workloadRuntime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> workloadRuntime;

    /**
     * @return Used to specify the workload runtime. Allowed values are `OCIContainer`, `WasmWasi` and `KataMshvVmIsolation`.
     * 
     * &gt; **Note:** WebAssembly System Interface node pools are in Public Preview - more information and details on how to opt into the preview can be found in [this article](https://docs.microsoft.com/azure/aks/use-wasi-node-pools)
     * 
     * &gt; **Note:** Pod Sandboxing / KataVM Isolation node pools are in Public Preview - more information and details on how to opt into the preview can be found in [this article](https://learn.microsoft.com/azure/aks/use-pod-sandboxing)
     * 
     */
    public Output<Optional<String>> workloadRuntime() {
        return Codegen.optional(this.workloadRuntime);
    }
    /**
     * Specifies a list of Availability Zones in which this Kubernetes Cluster Node Pool should be located. Changing this forces a new Kubernetes Cluster Node Pool to be created.
     * 
     */
    @Export(name="zones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Kubernetes Cluster Node Pool should be located. Changing this forces a new Kubernetes Cluster Node Pool to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesClusterNodePool(String name) {
        this(name, KubernetesClusterNodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesClusterNodePool(String name, KubernetesClusterNodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesClusterNodePool(String name, KubernetesClusterNodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/kubernetesClusterNodePool:KubernetesClusterNodePool", name, args == null ? KubernetesClusterNodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KubernetesClusterNodePool(String name, Output<String> id, @Nullable KubernetesClusterNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:containerservice/kubernetesClusterNodePool:KubernetesClusterNodePool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static KubernetesClusterNodePool get(String name, Output<String> id, @Nullable KubernetesClusterNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesClusterNodePool(name, id, state, options);
    }
}
