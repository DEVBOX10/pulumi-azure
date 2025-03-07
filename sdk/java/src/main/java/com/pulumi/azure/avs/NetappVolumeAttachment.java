// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.avs;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.avs.NetappVolumeAttachmentArgs;
import com.pulumi.azure.avs.inputs.NetappVolumeAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a VMware Private Cloud Netapp File Attachment.
 * 
 * ## Example Usage
 * 
 * &gt; **NOTE :** For Azure VMware private cloud, normal `pulumi up` could ignore this note. Please disable correlation request id for continuous operations in one build (like acctest). The continuous operations like `update` or `delete` could not be triggered when it shares the same `correlation-id` with its previous operation.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.network.VirtualNetworkGateway;
 * import com.pulumi.azure.network.VirtualNetworkGatewayArgs;
 * import com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs;
 * import com.pulumi.azure.netapp.Account;
 * import com.pulumi.azure.netapp.AccountArgs;
 * import com.pulumi.azure.netapp.Pool;
 * import com.pulumi.azure.netapp.PoolArgs;
 * import com.pulumi.azure.netapp.Volume;
 * import com.pulumi.azure.netapp.VolumeArgs;
 * import com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs;
 * import com.pulumi.azure.avs.PrivateCloud;
 * import com.pulumi.azure.avs.PrivateCloudArgs;
 * import com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs;
 * import com.pulumi.azure.avs.Cluster;
 * import com.pulumi.azure.avs.ClusterArgs;
 * import com.pulumi.azure.avs.ExpressRouteAuthorization;
 * import com.pulumi.azure.avs.ExpressRouteAuthorizationArgs;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnection;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs;
 * import com.pulumi.azure.avs.NetappVolumeAttachment;
 * import com.pulumi.azure.avs.NetappVolumeAttachmentArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var testPublicIp = new PublicIp(&#34;testPublicIp&#34;, PublicIpArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var testVirtualNetwork = new VirtualNetwork(&#34;testVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .addressSpaces(&#34;10.6.0.0/16&#34;)
 *             .build());
 * 
 *         var netappSubnet = new Subnet(&#34;netappSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .virtualNetworkName(testVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.6.2.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;testdelegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Netapp/volumes&#34;)
 *                     .actions(                    
 *                         &#34;Microsoft.Network/networkinterfaces/*&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var gatewaySubnet = new Subnet(&#34;gatewaySubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .virtualNetworkName(testVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.6.1.0/24&#34;)
 *             .build());
 * 
 *         var testVirtualNetworkGateway = new VirtualNetworkGateway(&#34;testVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .type(&#34;ExpressRoute&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfigurationArgs.builder()
 *                 .name(&#34;vnetGatewayConfig&#34;)
 *                 .publicIpAddressId(testPublicIp.id())
 *                 .subnetId(gatewaySubnet.id())
 *                 .build())
 *             .build());
 * 
 *         var testAccount = new Account(&#34;testAccount&#34;, AccountArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .build());
 * 
 *         var testPool = new Pool(&#34;testPool&#34;, PoolArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .accountName(testAccount.name())
 *             .serviceLevel(&#34;Standard&#34;)
 *             .sizeInTb(4)
 *             .build());
 * 
 *         var testVolume = new Volume(&#34;testVolume&#34;, VolumeArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .accountName(testAccount.name())
 *             .poolName(testPool.name())
 *             .volumePath(&#34;my-unique-file-path-%d&#34;)
 *             .serviceLevel(&#34;Standard&#34;)
 *             .subnetId(netappSubnet.id())
 *             .protocols(&#34;NFSv3&#34;)
 *             .storageQuotaInGb(100)
 *             .azureVmwareDataStoreEnabled(true)
 *             .exportPolicyRules(VolumeExportPolicyRuleArgs.builder()
 *                 .ruleIndex(1)
 *                 .allowedClients(&#34;0.0.0.0/0&#34;)
 *                 .protocolsEnabled(&#34;NFSv3&#34;)
 *                 .unixReadOnly(false)
 *                 .unixReadWrite(true)
 *                 .rootAccessEnabled(true)
 *                 .build())
 *             .build());
 * 
 *         var testPrivateCloud = new PrivateCloud(&#34;testPrivateCloud&#34;, PrivateCloudArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .location(azurerm_resource_group.test().location())
 *             .skuName(&#34;av36&#34;)
 *             .managementCluster(PrivateCloudManagementClusterArgs.builder()
 *                 .size(3)
 *                 .build())
 *             .networkSubnetCidr(&#34;192.168.48.0/22&#34;)
 *             .build());
 * 
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .vmwareCloudId(testPrivateCloud.id())
 *             .clusterNodeCount(3)
 *             .skuName(&#34;av36&#34;)
 *             .build());
 * 
 *         var testExpressRouteAuthorization = new ExpressRouteAuthorization(&#34;testExpressRouteAuthorization&#34;, ExpressRouteAuthorizationArgs.builder()        
 *             .privateCloudId(testPrivateCloud.id())
 *             .build());
 * 
 *         var testVirtualNetworkGatewayConnection = new VirtualNetworkGatewayConnection(&#34;testVirtualNetworkGatewayConnection&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(azurerm_resource_group.test().location())
 *             .resourceGroupName(azurerm_resource_group.test().name())
 *             .type(&#34;ExpressRoute&#34;)
 *             .virtualNetworkGatewayId(testVirtualNetworkGateway.id())
 *             .expressRouteCircuitId(testPrivateCloud.circuits().applyValue(circuits -&gt; circuits[0].expressRouteId()))
 *             .authorizationKey(testExpressRouteAuthorization.expressRouteAuthorizationKey())
 *             .build());
 * 
 *         var testNetappVolumeAttachment = new NetappVolumeAttachment(&#34;testNetappVolumeAttachment&#34;, NetappVolumeAttachmentArgs.builder()        
 *             .netappVolumeId(testVolume.id())
 *             .vmwareClusterId(testCluster.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testVirtualNetworkGatewayConnection)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VMware Private Clouds Netapp File Volume Attachment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:avs/netappVolumeAttachment:NetappVolumeAttachment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/privateCloud1/clusters/Cluster1/dataStores/datastore1
 * ```
 * 
 */
@ResourceType(type="azure:avs/netappVolumeAttachment:NetappVolumeAttachment")
public class NetappVolumeAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this VMware Private Cloud Netapp File Volume Attachment. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this VMware Private Cloud Netapp File Volume Attachment. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The netapp file volume for this VMware Private Cloud Netapp File Volume Attachment to connect to. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     */
    @Export(name="netappVolumeId", refs={String.class}, tree="[0]")
    private Output<String> netappVolumeId;

    /**
     * @return The netapp file volume for this VMware Private Cloud Netapp File Volume Attachment to connect to. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     */
    public Output<String> netappVolumeId() {
        return this.netappVolumeId;
    }
    /**
     * The vmware cluster for this VMware Private Cloud Netapp File Volume Attachment to associated to. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     * &gt; **NOTE :** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/en-us/azure/azure-vmware/attach-azure-netapp-files-to-azure-vmware-solution-hosts?tabs=azure-portal#prerequisites) before associating the netapp file volume to the vmware solution hosts.
     * 
     */
    @Export(name="vmwareClusterId", refs={String.class}, tree="[0]")
    private Output<String> vmwareClusterId;

    /**
     * @return The vmware cluster for this VMware Private Cloud Netapp File Volume Attachment to associated to. Changing this forces a new VMware Private Cloud Netapp File Volume Attachment to be created.
     * 
     * &gt; **NOTE :** please follow the prerequisites mentioned in this [article](https://learn.microsoft.com/en-us/azure/azure-vmware/attach-azure-netapp-files-to-azure-vmware-solution-hosts?tabs=azure-portal#prerequisites) before associating the netapp file volume to the vmware solution hosts.
     * 
     */
    public Output<String> vmwareClusterId() {
        return this.vmwareClusterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetappVolumeAttachment(String name) {
        this(name, NetappVolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetappVolumeAttachment(String name, NetappVolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetappVolumeAttachment(String name, NetappVolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:avs/netappVolumeAttachment:NetappVolumeAttachment", name, args == null ? NetappVolumeAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetappVolumeAttachment(String name, Output<String> id, @Nullable NetappVolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:avs/netappVolumeAttachment:NetappVolumeAttachment", name, state, makeResourceOptions(options, id));
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
    public static NetappVolumeAttachment get(String name, Output<String> id, @Nullable NetappVolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetappVolumeAttachment(name, id, state, options);
    }
}
