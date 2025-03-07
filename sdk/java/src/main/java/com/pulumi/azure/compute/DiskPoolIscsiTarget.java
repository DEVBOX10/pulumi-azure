// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.DiskPoolIscsiTargetArgs;
import com.pulumi.azure.compute.inputs.DiskPoolIscsiTargetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an iSCSI Target.
 * 
 * !&gt; **Note:** Azure are officially [halting](https://learn.microsoft.com/en-us/azure/azure-vmware/attach-disk-pools-to-azure-vmware-solution-hosts?tabs=azure-cli) the preview of Azure Disk Pools, and it **will not** be made generally available. New customers will not be able to register the Microsoft.StoragePool resource provider on their subscription and deploy new Disk Pools. Existing subscriptions registered with Microsoft.StoragePool may continue to deploy and manage disk pools for the time being.
 * 
 * !&gt; **Note:** Each Disk Pool can have a maximum of 1 iSCSI Target.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.compute.DiskPool;
 * import com.pulumi.azure.compute.DiskPoolArgs;
 * import com.pulumi.azure.compute.ManagedDisk;
 * import com.pulumi.azure.compute.ManagedDiskArgs;
 * import com.pulumi.azuread.AzureadFunctions;
 * import com.pulumi.azuread.inputs.GetServicePrincipalArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.compute.DiskPoolManagedDiskAttachment;
 * import com.pulumi.azure.compute.DiskPoolManagedDiskAttachmentArgs;
 * import com.pulumi.azure.compute.DiskPoolIscsiTarget;
 * import com.pulumi.azure.compute.DiskPoolIscsiTargetArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.0.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;diskspool&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/read&#34;)
 *                     .name(&#34;Microsoft.StoragePool/diskPools&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDiskPool = new DiskPool(&#34;exampleDiskPool&#34;, DiskPoolArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .subnetId(exampleSubnet.id())
 *             .zones(&#34;1&#34;)
 *             .skuName(&#34;Basic_B1&#34;)
 *             .build());
 * 
 *         var exampleManagedDisk = new ManagedDisk(&#34;exampleManagedDisk&#34;, ManagedDiskArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .createOption(&#34;Empty&#34;)
 *             .storageAccountType(&#34;Premium_LRS&#34;)
 *             .diskSizeGb(4)
 *             .maxShares(2)
 *             .zone(&#34;1&#34;)
 *             .build());
 * 
 *         final var exampleServicePrincipal = AzureadFunctions.getServicePrincipal(GetServicePrincipalArgs.builder()
 *             .displayName(&#34;StoragePool Resource Provider&#34;)
 *             .build());
 * 
 *         final var roles =         
 *             &#34;Disk Pool Operator&#34;,
 *             &#34;Virtual Machine Contributor&#34;;
 * 
 *         for (var i = 0; i &lt; roles.length(); i++) {
 *             new Assignment(&#34;exampleAssignment-&#34; + i, AssignmentArgs.builder()            
 *                 .principalId(exampleServicePrincipal.applyValue(getServicePrincipalResult -&gt; getServicePrincipalResult.id()))
 *                 .roleDefinitionName(roles[range.value()])
 *                 .scope(exampleManagedDisk.id())
 *                 .build());
 * 
 *         
 * }
 *         var exampleDiskPoolManagedDiskAttachment = new DiskPoolManagedDiskAttachment(&#34;exampleDiskPoolManagedDiskAttachment&#34;, DiskPoolManagedDiskAttachmentArgs.builder()        
 *             .diskPoolId(exampleDiskPool.id())
 *             .managedDiskId(exampleManagedDisk.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAssignment)
 *                 .build());
 * 
 *         var exampleDiskPoolIscsiTarget = new DiskPoolIscsiTarget(&#34;exampleDiskPoolIscsiTarget&#34;, DiskPoolIscsiTargetArgs.builder()        
 *             .aclMode(&#34;Dynamic&#34;)
 *             .disksPoolId(exampleDiskPool.id())
 *             .targetIqn(&#34;iqn.2021-11.com.microsoft:test&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleDiskPoolManagedDiskAttachment)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * iSCSI Targets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StoragePool/diskPools/pool1/iscsiTargets/iscsiTarget1
 * ```
 * 
 */
@ResourceType(type="azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget")
public class DiskPoolIscsiTarget extends com.pulumi.resources.CustomResource {
    /**
     * Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Export(name="aclMode", refs={String.class}, tree="[0]")
    private Output<String> aclMode;

    /**
     * @return Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Output<String> aclMode() {
        return this.aclMode;
    }
    /**
     * The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Export(name="disksPoolId", refs={String.class}, tree="[0]")
    private Output<String> disksPoolId;

    /**
     * @return The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Output<String> disksPoolId() {
        return this.disksPoolId;
    }
    /**
     * List of private IPv4 addresses to connect to the iSCSI Target.
     * 
     */
    @Export(name="endpoints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> endpoints;

    /**
     * @return List of private IPv4 addresses to connect to the iSCSI Target.
     * 
     */
    public Output<List<String>> endpoints() {
        return this.endpoints;
    }
    /**
     * The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The port used by iSCSI Target portal group.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port used by iSCSI Target portal group.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     * 
     */
    @Export(name="targetIqn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetIqn;

    /**
     * @return ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.&lt;abc&gt;.&lt;pqr&gt;[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     * 
     */
    public Output<Optional<String>> targetIqn() {
        return Codegen.optional(this.targetIqn);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskPoolIscsiTarget(String name) {
        this(name, DiskPoolIscsiTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskPoolIscsiTarget(String name, DiskPoolIscsiTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskPoolIscsiTarget(String name, DiskPoolIscsiTargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, args == null ? DiskPoolIscsiTargetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskPoolIscsiTarget(String name, Output<String> id, @Nullable DiskPoolIscsiTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget", name, state, makeResourceOptions(options, id));
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
    public static DiskPoolIscsiTarget get(String name, Output<String> id, @Nullable DiskPoolIscsiTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskPoolIscsiTarget(name, id, state, options);
    }
}
