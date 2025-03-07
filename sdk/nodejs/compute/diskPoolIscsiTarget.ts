// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an iSCSI Target.
 *
 * !> **Note:** Azure are officially [halting](https://learn.microsoft.com/en-us/azure/azure-vmware/attach-disk-pools-to-azure-vmware-solution-hosts?tabs=azure-cli) the preview of Azure Disk Pools, and it **will not** be made generally available. New customers will not be able to register the Microsoft.StoragePool resource provider on their subscription and deploy new Disk Pools. Existing subscriptions registered with Microsoft.StoragePool may continue to deploy and manage disk pools for the time being.
 *
 * !> **Note:** Each Disk Pool can have a maximum of 1 iSCSI Target.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as azuread from "@pulumi/azuread";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     addressSpaces: ["10.0.0.0/16"],
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.0.0/24"],
 *     delegations: [{
 *         name: "diskspool",
 *         serviceDelegation: {
 *             actions: ["Microsoft.Network/virtualNetworks/read"],
 *             name: "Microsoft.StoragePool/diskPools",
 *         },
 *     }],
 * });
 * const exampleDiskPool = new azure.compute.DiskPool("exampleDiskPool", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     subnetId: exampleSubnet.id,
 *     zones: ["1"],
 *     skuName: "Basic_B1",
 * });
 * const exampleManagedDisk = new azure.compute.ManagedDisk("exampleManagedDisk", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     createOption: "Empty",
 *     storageAccountType: "Premium_LRS",
 *     diskSizeGb: 4,
 *     maxShares: 2,
 *     zone: "1",
 * });
 * const exampleServicePrincipal = azuread.getServicePrincipal({
 *     displayName: "StoragePool Resource Provider",
 * });
 * const roles = [
 *     "Disk Pool Operator",
 *     "Virtual Machine Contributor",
 * ];
 * const exampleAssignment: azure.authorization.Assignment[] = [];
 * for (const range = {value: 0}; range.value < roles.length; range.value++) {
 *     exampleAssignment.push(new azure.authorization.Assignment(`exampleAssignment-${range.value}`, {
 *         principalId: exampleServicePrincipal.then(exampleServicePrincipal => exampleServicePrincipal.id),
 *         roleDefinitionName: roles[range.value],
 *         scope: exampleManagedDisk.id,
 *     }));
 * }
 * const exampleDiskPoolManagedDiskAttachment = new azure.compute.DiskPoolManagedDiskAttachment("exampleDiskPoolManagedDiskAttachment", {
 *     diskPoolId: exampleDiskPool.id,
 *     managedDiskId: exampleManagedDisk.id,
 * }, {
 *     dependsOn: [exampleAssignment],
 * });
 * const exampleDiskPoolIscsiTarget = new azure.compute.DiskPoolIscsiTarget("exampleDiskPoolIscsiTarget", {
 *     aclMode: "Dynamic",
 *     disksPoolId: exampleDiskPool.id,
 *     targetIqn: "iqn.2021-11.com.microsoft:test",
 * }, {
 *     dependsOn: [exampleDiskPoolManagedDiskAttachment],
 * });
 * ```
 *
 * ## Import
 *
 * iSCSI Targets can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.StoragePool/diskPools/pool1/iscsiTargets/iscsiTarget1
 * ```
 */
export class DiskPoolIscsiTarget extends pulumi.CustomResource {
    /**
     * Get an existing DiskPoolIscsiTarget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskPoolIscsiTargetState, opts?: pulumi.CustomResourceOptions): DiskPoolIscsiTarget {
        return new DiskPoolIscsiTarget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget';

    /**
     * Returns true if the given object is an instance of DiskPoolIscsiTarget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DiskPoolIscsiTarget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DiskPoolIscsiTarget.__pulumiType;
    }

    /**
     * Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     */
    public readonly aclMode!: pulumi.Output<string>;
    /**
     * The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     */
    public readonly disksPoolId!: pulumi.Output<string>;
    /**
     * List of private IPv4 addresses to connect to the iSCSI Target.
     */
    public /*out*/ readonly endpoints!: pulumi.Output<string[]>;
    /**
     * The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The port used by iSCSI Target portal group.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     */
    public readonly targetIqn!: pulumi.Output<string | undefined>;

    /**
     * Create a DiskPoolIscsiTarget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiskPoolIscsiTargetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DiskPoolIscsiTargetArgs | DiskPoolIscsiTargetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DiskPoolIscsiTargetState | undefined;
            resourceInputs["aclMode"] = state ? state.aclMode : undefined;
            resourceInputs["disksPoolId"] = state ? state.disksPoolId : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["targetIqn"] = state ? state.targetIqn : undefined;
        } else {
            const args = argsOrState as DiskPoolIscsiTargetArgs | undefined;
            if ((!args || args.aclMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aclMode'");
            }
            if ((!args || args.disksPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'disksPoolId'");
            }
            resourceInputs["aclMode"] = args ? args.aclMode : undefined;
            resourceInputs["disksPoolId"] = args ? args.disksPoolId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["targetIqn"] = args ? args.targetIqn : undefined;
            resourceInputs["endpoints"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DiskPoolIscsiTarget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DiskPoolIscsiTarget resources.
 */
export interface DiskPoolIscsiTargetState {
    /**
     * Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     */
    aclMode?: pulumi.Input<string>;
    /**
     * The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     */
    disksPoolId?: pulumi.Input<string>;
    /**
     * List of private IPv4 addresses to connect to the iSCSI Target.
     */
    endpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The port used by iSCSI Target portal group.
     */
    port?: pulumi.Input<number>;
    /**
     * ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     */
    targetIqn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DiskPoolIscsiTarget resource.
 */
export interface DiskPoolIscsiTargetArgs {
    /**
     * Mode for Target connectivity. The only supported value is `Dynamic` for now. Changing this forces a new iSCSI Target to be created.
     */
    aclMode: pulumi.Input<string>;
    /**
     * The ID of the Disk Pool. Changing this forces a new iSCSI Target to be created.
     */
    disksPoolId: pulumi.Input<string>;
    /**
     * The name of the iSCSI Target. The name can only contain lowercase letters, numbers, periods, or hyphens, and length should between [5-223]. Changing this forces a new iSCSI Target to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * ISCSI Target IQN (iSCSI Qualified Name); example: `iqn.2005-03.org.iscsi:server`. IQN should follow the format `iqn.yyyy-mm.<abc>.<pqr>[:xyz]`; supported characters include alphanumeric characters in lower case, hyphen, dot and colon, and the length should between `4` and `223`. Changing this forces a new iSCSI Target to be created.
     */
    targetIqn?: pulumi.Input<string>;
}
