// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a MariaDB Virtual Network Rule.
 *
 * > **NOTE:** MariaDB Virtual Network Rules [can only be used with SKU Tiers of `GeneralPurpose` or `MemoryOptimized`](https://docs.microsoft.com/azure/mariadb/concepts-data-access-security-vnet)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     addressSpaces: ["10.7.29.0/29"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const internal = new azure.network.Subnet("internal", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.7.29.0/29"],
 *     serviceEndpoints: ["Microsoft.Sql"],
 * });
 * const exampleServer = new azure.mariadb.Server("exampleServer", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     administratorLogin: "mariadbadminun",
 *     administratorLoginPassword: "H@Sh1CoR3!",
 *     version: "10.2",
 *     sslEnforcementEnabled: true,
 *     skuName: "GP_Gen5_2",
 * });
 * const exampleVirtualNetworkRule = new azure.mariadb.VirtualNetworkRule("exampleVirtualNetworkRule", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     serverName: exampleServer.name,
 *     subnetId: internal.id,
 * });
 * ```
 *
 * ## Import
 *
 * MariaDB Virtual Network Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mariadb/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DBforMariaDB/servers/myserver/virtualNetworkRules/vnetrulename
 * ```
 */
export class VirtualNetworkRule extends pulumi.CustomResource {
    /**
     * Get an existing VirtualNetworkRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions): VirtualNetworkRule {
        return new VirtualNetworkRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mariadb/virtualNetworkRule:VirtualNetworkRule';

    /**
     * Returns true if the given object is an instance of VirtualNetworkRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualNetworkRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualNetworkRule.__pulumiType;
    }

    /**
     * The name of the MariaDB Virtual Network Rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **NOTE:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group where the MariaDB server resides. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The name of the SQL Server to which this MariaDB virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    public readonly serverName!: pulumi.Output<string>;
    /**
     * The ID of the subnet that the MariaDB server will be connected to.
     *
     * > **NOTE:** Due to [a bug in the Azure API](https://github.com/Azure/azure-rest-api-specs/issues/3719) this resource currently doesn't expose the `ignoreMissingVnetServiceEndpoint` field and defaults this to `false`. This provider will check during the provisioning of the Virtual Network Rule that the Subnet contains the Service Rule to verify that the Virtual Network Rule can be created.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a VirtualNetworkRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualNetworkRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualNetworkRuleArgs | VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualNetworkRuleState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serverName"] = state ? state.serverName : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as VirtualNetworkRuleArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serverName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverName'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serverName"] = args ? args.serverName : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualNetworkRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualNetworkRule resources.
 */
export interface VirtualNetworkRuleState {
    /**
     * The name of the MariaDB Virtual Network Rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **NOTE:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the MariaDB server resides. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The name of the SQL Server to which this MariaDB virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    serverName?: pulumi.Input<string>;
    /**
     * The ID of the subnet that the MariaDB server will be connected to.
     *
     * > **NOTE:** Due to [a bug in the Azure API](https://github.com/Azure/azure-rest-api-specs/issues/3719) this resource currently doesn't expose the `ignoreMissingVnetServiceEndpoint` field and defaults this to `false`. This provider will check during the provisioning of the Virtual Network Rule that the Subnet contains the Service Rule to verify that the Virtual Network Rule can be created.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualNetworkRule resource.
 */
export interface VirtualNetworkRuleArgs {
    /**
     * The name of the MariaDB Virtual Network Rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **NOTE:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the MariaDB server resides. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The name of the SQL Server to which this MariaDB virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    serverName: pulumi.Input<string>;
    /**
     * The ID of the subnet that the MariaDB server will be connected to.
     *
     * > **NOTE:** Due to [a bug in the Azure API](https://github.com/Azure/azure-rest-api-specs/issues/3719) this resource currently doesn't expose the `ignoreMissingVnetServiceEndpoint` field and defaults this to `false`. This provider will check during the provisioning of the Virtual Network Rule that the Subnet contains the Service Rule to verify that the Virtual Network Rule can be created.
     */
    subnetId: pulumi.Input<string>;
}
