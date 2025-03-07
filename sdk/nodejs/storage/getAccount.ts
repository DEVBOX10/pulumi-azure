// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Storage Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.storage.getAccount({
 *     name: "packerimages",
 *     resourceGroupName: "packer-storage",
 * });
 * export const storageAccountTier = example.then(example => example.accountTier);
 * ```
 */
export function getAccount(args: GetAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:storage/getAccount:getAccount", {
        "minTlsVersion": args.minTlsVersion,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountArgs {
    /**
     * The minimum supported TLS version for this storage account.
     */
    minTlsVersion?: string;
    /**
     * Specifies the name of the Storage Account
     */
    name: string;
    /**
     * Specifies the name of the resource group the Storage Account is located in.
     */
    resourceGroupName?: string;
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * The access tier for `BlobStorage` accounts.
     */
    readonly accessTier: string;
    /**
     * The Kind of account.
     */
    readonly accountKind: string;
    /**
     * The type of replication used for this storage account.
     */
    readonly accountReplicationType: string;
    /**
     * The Tier of this storage account.
     */
    readonly accountTier: string;
    /**
     * Can nested items in the storage account opt into allowing public access?
     */
    readonly allowNestedItemsToBePublic: boolean;
    /**
     * A `azureFilesAuthentication` block as documented below.
     */
    readonly azureFilesAuthentications: outputs.storage.GetAccountAzureFilesAuthentication[];
    /**
     * supports the following:
     */
    readonly customDomains: outputs.storage.GetAccountCustomDomain[];
    /**
     * Is traffic only allowed via HTTPS? See [here](https://docs.microsoft.com/azure/storage/storage-require-secure-transfer/)
     * for more information.
     */
    readonly enableHttpsTrafficOnly: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * An `identity` block as documented below.
     */
    readonly identities: outputs.storage.GetAccountIdentity[];
    /**
     * Is infrastructure encryption enabled? See [here](https://docs.microsoft.com/azure/storage/common/infrastructure-encryption-enable/)
     * for more information.
     */
    readonly infrastructureEncryptionEnabled: boolean;
    /**
     * Is Hierarchical Namespace enabled?
     */
    readonly isHnsEnabled: boolean;
    /**
     * The Azure location where the Storage Account exists
     */
    readonly location: string;
    /**
     * The minimum supported TLS version for this storage account.
     */
    readonly minTlsVersion?: string;
    /**
     * The Custom Domain Name used for the Storage Account.
     */
    readonly name: string;
    /**
     * Is NFSv3 protocol enabled?
     */
    readonly nfsv3Enabled: boolean;
    /**
     * The primary access key for the Storage Account.
     */
    readonly primaryAccessKey: string;
    /**
     * The connection string associated with the primary blob location
     */
    readonly primaryBlobConnectionString: string;
    /**
     * The endpoint URL for blob storage in the primary location.
     */
    readonly primaryBlobEndpoint: string;
    /**
     * The hostname with port if applicable for blob storage in the primary location.
     */
    readonly primaryBlobHost: string;
    /**
     * The connection string associated with the primary location
     */
    readonly primaryConnectionString: string;
    /**
     * The endpoint URL for DFS storage in the primary location.
     */
    readonly primaryDfsEndpoint: string;
    /**
     * The hostname with port if applicable for DFS storage in the primary location.
     */
    readonly primaryDfsHost: string;
    /**
     * The endpoint URL for file storage in the primary location.
     */
    readonly primaryFileEndpoint: string;
    /**
     * The hostname with port if applicable for file storage in the primary location.
     */
    readonly primaryFileHost: string;
    /**
     * The primary location of the Storage Account.
     */
    readonly primaryLocation: string;
    /**
     * The endpoint URL for queue storage in the primary location.
     */
    readonly primaryQueueEndpoint: string;
    /**
     * The hostname with port if applicable for queue storage in the primary location.
     */
    readonly primaryQueueHost: string;
    /**
     * The endpoint URL for table storage in the primary location.
     */
    readonly primaryTableEndpoint: string;
    /**
     * The hostname with port if applicable for table storage in the primary location.
     */
    readonly primaryTableHost: string;
    /**
     * The endpoint URL for web storage in the primary location.
     */
    readonly primaryWebEndpoint: string;
    /**
     * The hostname with port if applicable for web storage in the primary location.
     */
    readonly primaryWebHost: string;
    /**
     * The encryption key type of the queue.
     */
    readonly queueEncryptionKeyType: string;
    readonly resourceGroupName?: string;
    /**
     * The secondary access key for the Storage Account.
     */
    readonly secondaryAccessKey: string;
    /**
     * The connection string associated with the secondary blob location
     */
    readonly secondaryBlobConnectionString: string;
    /**
     * The endpoint URL for blob storage in the secondary location.
     */
    readonly secondaryBlobEndpoint: string;
    /**
     * The hostname with port if applicable for blob storage in the secondary location.
     */
    readonly secondaryBlobHost: string;
    /**
     * The connection string associated with the secondary location
     */
    readonly secondaryConnectionString: string;
    /**
     * The endpoint URL for DFS storage in the secondary location.
     */
    readonly secondaryDfsEndpoint: string;
    /**
     * The hostname with port if applicable for DFS storage in the secondary location.
     */
    readonly secondaryDfsHost: string;
    /**
     * The endpoint URL for file storage in the secondary location.
     */
    readonly secondaryFileEndpoint: string;
    /**
     * The hostname with port if applicable for file storage in the secondary location.
     */
    readonly secondaryFileHost: string;
    /**
     * The secondary location of the Storage Account.
     */
    readonly secondaryLocation: string;
    /**
     * The endpoint URL for queue storage in the secondary location.
     */
    readonly secondaryQueueEndpoint: string;
    /**
     * The hostname with port if applicable for queue storage in the secondary location.
     */
    readonly secondaryQueueHost: string;
    /**
     * The endpoint URL for table storage in the secondary location.
     */
    readonly secondaryTableEndpoint: string;
    /**
     * The hostname with port if applicable for table storage in the secondary location.
     */
    readonly secondaryTableHost: string;
    /**
     * The endpoint URL for web storage in the secondary location.
     */
    readonly secondaryWebEndpoint: string;
    /**
     * The hostname with port if applicable for web storage in the secondary location.
     */
    readonly secondaryWebHost: string;
    /**
     * The encryption key type of the table.
     */
    readonly tableEncryptionKeyType: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Storage Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.storage.getAccount({
 *     name: "packerimages",
 *     resourceGroupName: "packer-storage",
 * });
 * export const storageAccountTier = example.then(example => example.accountTier);
 * ```
 */
export function getAccountOutput(args: GetAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountResult> {
    return pulumi.output(args).apply((a: any) => getAccount(a, opts))
}

/**
 * A collection of arguments for invoking getAccount.
 */
export interface GetAccountOutputArgs {
    /**
     * The minimum supported TLS version for this storage account.
     */
    minTlsVersion?: pulumi.Input<string>;
    /**
     * Specifies the name of the Storage Account
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group the Storage Account is located in.
     */
    resourceGroupName?: pulumi.Input<string>;
}
