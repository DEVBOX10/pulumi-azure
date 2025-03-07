// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection
{
    /// <summary>
    /// Manages a Backup Vault.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleBackupVault = new Azure.DataProtection.BackupVault("exampleBackupVault", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         DatastoreType = "VaultStore",
    ///         Redundancy = "LocallyRedundant",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Backup Vaults can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:dataprotection/backupVault:BackupVault example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1
    /// ```
    /// </summary>
    [AzureResourceType("azure:dataprotection/backupVault:BackupVault")]
    public partial class BackupVault : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("datastoreType")]
        public Output<string> DatastoreType { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.BackupVaultIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Output("redundancy")]
        public Output<string> Redundancy { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Backup Vault.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a BackupVault resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupVault(string name, BackupVaultArgs args, CustomResourceOptions? options = null)
            : base("azure:dataprotection/backupVault:BackupVault", name, args ?? new BackupVaultArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupVault(string name, Input<string> id, BackupVaultState? state = null, CustomResourceOptions? options = null)
            : base("azure:dataprotection/backupVault:BackupVault", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing BackupVault resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackupVault Get(string name, Input<string> id, BackupVaultState? state = null, CustomResourceOptions? options = null)
        {
            return new BackupVault(name, id, state, options);
        }
    }

    public sealed class BackupVaultArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("datastoreType", required: true)]
        public Input<string> DatastoreType { get; set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.BackupVaultIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("redundancy", required: true)]
        public Input<string> Redundancy { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Backup Vault.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public BackupVaultArgs()
        {
        }
        public static new BackupVaultArgs Empty => new BackupVaultArgs();
    }

    public sealed class BackupVaultState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("datastoreType")]
        public Input<string>? DatastoreType { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.BackupVaultIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("redundancy")]
        public Input<string>? Redundancy { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Backup Vault.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public BackupVaultState()
        {
        }
        public static new BackupVaultState Empty => new BackupVaultState();
    }
}
