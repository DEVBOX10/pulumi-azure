// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing SQL database.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleServer = new azure.mssql.Server("exampleServer", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     version: "12.0",
 *     administratorLogin: "4dm1n157r470r",
 *     administratorLoginPassword: "4-v3ry-53cr37-p455w0rd",
 * });
 * const exampleDatabase = azure.mssql.getDatabaseOutput({
 *     name: "example-mssql-db",
 *     serverId: exampleServer.id,
 * });
 * export const databaseId = exampleDatabase.apply(exampleDatabase => exampleDatabase.id);
 * ```
 */
export function getDatabase(args: GetDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:mssql/getDatabase:getDatabase", {
        "name": args.name,
        "serverId": args.serverId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseArgs {
    /**
     * The name of the MS SQL Database.
     */
    name: string;
    /**
     * The id of the MS SQL Server on which to read the database.
     */
    serverId: string;
}

/**
 * A collection of values returned by getDatabase.
 */
export interface GetDatabaseResult {
    /**
     * The collation of the database.
     */
    readonly collation: string;
    /**
     * The id of the elastic pool containing this database.
     */
    readonly elasticPoolId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The license type to apply for this database.
     */
    readonly licenseType: string;
    /**
     * The max size of the database in gigabytes.
     */
    readonly maxSizeGb: number;
    readonly name: string;
    /**
     * The number of readonly secondary replicas associated with the database to which readonly application intent connections may be routed.
     */
    readonly readReplicaCount: number;
    /**
     * If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica.
     */
    readonly readScale: boolean;
    readonly serverId: string;
    /**
     * The name of the SKU of the database.
     */
    readonly skuName: string;
    /**
     * The storage account type used to store backups for this database.
     */
    readonly storageAccountType: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     */
    readonly zoneRedundant: boolean;
}
/**
 * Use this data source to access information about an existing SQL database.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleServer = new azure.mssql.Server("exampleServer", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     version: "12.0",
 *     administratorLogin: "4dm1n157r470r",
 *     administratorLoginPassword: "4-v3ry-53cr37-p455w0rd",
 * });
 * const exampleDatabase = azure.mssql.getDatabaseOutput({
 *     name: "example-mssql-db",
 *     serverId: exampleServer.id,
 * });
 * export const databaseId = exampleDatabase.apply(exampleDatabase => exampleDatabase.id);
 * ```
 */
export function getDatabaseOutput(args: GetDatabaseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseResult> {
    return pulumi.output(args).apply((a: any) => getDatabase(a, opts))
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseOutputArgs {
    /**
     * The name of the MS SQL Database.
     */
    name: pulumi.Input<string>;
    /**
     * The id of the MS SQL Server on which to read the database.
     */
    serverId: pulumi.Input<string>;
}
