// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MySql
{
    /// <summary>
    /// Manages a MySQL Server.
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
    ///     var exampleServer = new Azure.MySql.Server("exampleServer", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         AdministratorLogin = "mysqladminun",
    ///         AdministratorLoginPassword = "H@Sh1CoR3!",
    ///         SkuName = "B_Gen5_2",
    ///         StorageMb = 5120,
    ///         Version = "5.7",
    ///         AutoGrowEnabled = true,
    ///         BackupRetentionDays = 7,
    ///         GeoRedundantBackupEnabled = false,
    ///         InfrastructureEncryptionEnabled = false,
    ///         PublicNetworkAccessEnabled = true,
    ///         SslEnforcementEnabled = true,
    ///         SslMinimalTlsVersionEnforced = "TLS1_2",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MySQL Server's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:mysql/server:Server server1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMySQL/servers/server1
    /// ```
    /// </summary>
    [AzureResourceType("azure:mysql/server:Server")]
    public partial class Server : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Administrator login for the MySQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("administratorLogin")]
        public Output<string> AdministratorLogin { get; private set; } = null!;

        /// <summary>
        /// The Password associated with the `administrator_login` for the MySQL Server. Required when `create_mode` is `Default`.
        /// </summary>
        [Output("administratorLoginPassword")]
        public Output<string?> AdministratorLoginPassword { get; private set; } = null!;

        /// <summary>
        /// Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
        /// </summary>
        [Output("autoGrowEnabled")]
        public Output<bool?> AutoGrowEnabled { get; private set; } = null!;

        /// <summary>
        /// Backup retention days for the server, supported values are between `7` and `35` days.
        /// </summary>
        [Output("backupRetentionDays")]
        public Output<int> BackupRetentionDays { get; private set; } = null!;

        /// <summary>
        /// The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default`.
        /// </summary>
        [Output("createMode")]
        public Output<string?> CreateMode { get; private set; } = null!;

        /// <summary>
        /// For creation modes other than `Default`, the source server ID to use.
        /// </summary>
        [Output("creationSourceServerId")]
        public Output<string?> CreationSourceServerId { get; private set; } = null!;

        /// <summary>
        /// The FQDN of the MySQL Server.
        /// </summary>
        [Output("fqdn")]
        public Output<string> Fqdn { get; private set; } = null!;

        /// <summary>
        /// Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not supported for the Basic tier.
        /// </summary>
        [Output("geoRedundantBackupEnabled")]
        public Output<bool> GeoRedundantBackupEnabled { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.ServerIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// Whether or not infrastructure is encrypted for this server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("infrastructureEncryptionEnabled")]
        public Output<bool?> InfrastructureEncryptionEnabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created. This needs to be globally unique within Azure.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Whether or not public network access is allowed for this server. Defaults to `true`.
        /// </summary>
        [Output("publicNetworkAccessEnabled")]
        public Output<bool?> PublicNetworkAccessEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// When `create_mode` is `PointInTimeRestore`, specifies the point in time to restore from `creation_source_server_id`. It should be provided in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) format, e.g. `2013-11-08T22:00:40Z`.
        /// </summary>
        [Output("restorePointInTime")]
        public Output<string?> RestorePointInTime { get; private set; } = null!;

        /// <summary>
        /// Specifies the SKU Name for this MySQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers). Possible values are `B_Gen4_1`, `B_Gen4_2`, `B_Gen5_1`, `B_Gen5_2`, `GP_Gen4_2`, `GP_Gen4_4`, `GP_Gen4_8`, `GP_Gen4_16`, `GP_Gen4_32`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_8`, `GP_Gen5_16`, `GP_Gen5_32`, `GP_Gen5_64`, `MO_Gen5_2`, `MO_Gen5_4`, `MO_Gen5_8`, `MO_Gen5_16` and `MO_Gen5_32`.
        /// </summary>
        [Output("skuName")]
        public Output<string> SkuName { get; private set; } = null!;

        /// <summary>
        /// Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
        /// </summary>
        [Output("sslEnforcementEnabled")]
        public Output<bool> SslEnforcementEnabled { get; private set; } = null!;

        /// <summary>
        /// The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLS1_2`.
        /// </summary>
        [Output("sslMinimalTlsVersionEnforced")]
        public Output<string?> SslMinimalTlsVersionEnforced { get; private set; } = null!;

        /// <summary>
        /// Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers).
        /// </summary>
        [Output("storageMb")]
        public Output<int> StorageMb { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
        /// </summary>
        [Output("threatDetectionPolicy")]
        public Output<Outputs.ServerThreatDetectionPolicy?> ThreatDetectionPolicy { get; private set; } = null!;

        /// <summary>
        /// Specifies the version of MySQL to use. Valid values are `5.7`, or `8.0`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Server resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Server(string name, ServerArgs args, CustomResourceOptions? options = null)
            : base("azure:mysql/server:Server", name, args ?? new ServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Server(string name, Input<string> id, ServerState? state = null, CustomResourceOptions? options = null)
            : base("azure:mysql/server:Server", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "administratorLoginPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Server resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Server Get(string name, Input<string> id, ServerState? state = null, CustomResourceOptions? options = null)
        {
            return new Server(name, id, state, options);
        }
    }

    public sealed class ServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Administrator login for the MySQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("administratorLogin")]
        public Input<string>? AdministratorLogin { get; set; }

        [Input("administratorLoginPassword")]
        private Input<string>? _administratorLoginPassword;

        /// <summary>
        /// The Password associated with the `administrator_login` for the MySQL Server. Required when `create_mode` is `Default`.
        /// </summary>
        public Input<string>? AdministratorLoginPassword
        {
            get => _administratorLoginPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _administratorLoginPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
        /// </summary>
        [Input("autoGrowEnabled")]
        public Input<bool>? AutoGrowEnabled { get; set; }

        /// <summary>
        /// Backup retention days for the server, supported values are between `7` and `35` days.
        /// </summary>
        [Input("backupRetentionDays")]
        public Input<int>? BackupRetentionDays { get; set; }

        /// <summary>
        /// The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default`.
        /// </summary>
        [Input("createMode")]
        public Input<string>? CreateMode { get; set; }

        /// <summary>
        /// For creation modes other than `Default`, the source server ID to use.
        /// </summary>
        [Input("creationSourceServerId")]
        public Input<string>? CreationSourceServerId { get; set; }

        /// <summary>
        /// Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not supported for the Basic tier.
        /// </summary>
        [Input("geoRedundantBackupEnabled")]
        public Input<bool>? GeoRedundantBackupEnabled { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ServerIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// Whether or not infrastructure is encrypted for this server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureEncryptionEnabled")]
        public Input<bool>? InfrastructureEncryptionEnabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created. This needs to be globally unique within Azure.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Whether or not public network access is allowed for this server. Defaults to `true`.
        /// </summary>
        [Input("publicNetworkAccessEnabled")]
        public Input<bool>? PublicNetworkAccessEnabled { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// When `create_mode` is `PointInTimeRestore`, specifies the point in time to restore from `creation_source_server_id`. It should be provided in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) format, e.g. `2013-11-08T22:00:40Z`.
        /// </summary>
        [Input("restorePointInTime")]
        public Input<string>? RestorePointInTime { get; set; }

        /// <summary>
        /// Specifies the SKU Name for this MySQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers). Possible values are `B_Gen4_1`, `B_Gen4_2`, `B_Gen5_1`, `B_Gen5_2`, `GP_Gen4_2`, `GP_Gen4_4`, `GP_Gen4_8`, `GP_Gen4_16`, `GP_Gen4_32`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_8`, `GP_Gen5_16`, `GP_Gen5_32`, `GP_Gen5_64`, `MO_Gen5_2`, `MO_Gen5_4`, `MO_Gen5_8`, `MO_Gen5_16` and `MO_Gen5_32`.
        /// </summary>
        [Input("skuName", required: true)]
        public Input<string> SkuName { get; set; } = null!;

        /// <summary>
        /// Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
        /// </summary>
        [Input("sslEnforcementEnabled", required: true)]
        public Input<bool> SslEnforcementEnabled { get; set; } = null!;

        /// <summary>
        /// The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLS1_2`.
        /// </summary>
        [Input("sslMinimalTlsVersionEnforced")]
        public Input<string>? SslMinimalTlsVersionEnforced { get; set; }

        /// <summary>
        /// Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers).
        /// </summary>
        [Input("storageMb")]
        public Input<int>? StorageMb { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
        /// </summary>
        [Input("threatDetectionPolicy")]
        public Input<Inputs.ServerThreatDetectionPolicyArgs>? ThreatDetectionPolicy { get; set; }

        /// <summary>
        /// Specifies the version of MySQL to use. Valid values are `5.7`, or `8.0`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public ServerArgs()
        {
        }
        public static new ServerArgs Empty => new ServerArgs();
    }

    public sealed class ServerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Administrator login for the MySQL Server. Required when `create_mode` is `Default`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("administratorLogin")]
        public Input<string>? AdministratorLogin { get; set; }

        [Input("administratorLoginPassword")]
        private Input<string>? _administratorLoginPassword;

        /// <summary>
        /// The Password associated with the `administrator_login` for the MySQL Server. Required when `create_mode` is `Default`.
        /// </summary>
        public Input<string>? AdministratorLoginPassword
        {
            get => _administratorLoginPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _administratorLoginPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Enable/Disable auto-growing of the storage. Storage auto-grow prevents your server from running out of storage and becoming read-only. If storage auto grow is enabled, the storage automatically grows without impacting the workload. The default value if not explicitly specified is `true`.
        /// </summary>
        [Input("autoGrowEnabled")]
        public Input<bool>? AutoGrowEnabled { get; set; }

        /// <summary>
        /// Backup retention days for the server, supported values are between `7` and `35` days.
        /// </summary>
        [Input("backupRetentionDays")]
        public Input<int>? BackupRetentionDays { get; set; }

        /// <summary>
        /// The creation mode. Can be used to restore or replicate existing servers. Possible values are `Default`, `Replica`, `GeoRestore`, and `PointInTimeRestore`. Defaults to `Default`.
        /// </summary>
        [Input("createMode")]
        public Input<string>? CreateMode { get; set; }

        /// <summary>
        /// For creation modes other than `Default`, the source server ID to use.
        /// </summary>
        [Input("creationSourceServerId")]
        public Input<string>? CreationSourceServerId { get; set; }

        /// <summary>
        /// The FQDN of the MySQL Server.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// Turn Geo-redundant server backups on/off. This allows you to choose between locally redundant or geo-redundant backup storage in the General Purpose and Memory Optimized tiers. When the backups are stored in geo-redundant backup storage, they are not only stored within the region in which your server is hosted, but are also replicated to a paired data center. This provides better protection and ability to restore your server in a different region in the event of a disaster. This is not supported for the Basic tier.
        /// </summary>
        [Input("geoRedundantBackupEnabled")]
        public Input<bool>? GeoRedundantBackupEnabled { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.ServerIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// Whether or not infrastructure is encrypted for this server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("infrastructureEncryptionEnabled")]
        public Input<bool>? InfrastructureEncryptionEnabled { get; set; }

        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the MySQL Server. Changing this forces a new resource to be created. This needs to be globally unique within Azure.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Whether or not public network access is allowed for this server. Defaults to `true`.
        /// </summary>
        [Input("publicNetworkAccessEnabled")]
        public Input<bool>? PublicNetworkAccessEnabled { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// When `create_mode` is `PointInTimeRestore`, specifies the point in time to restore from `creation_source_server_id`. It should be provided in [RFC3339](https://www.rfc-editor.org/rfc/rfc3339) format, e.g. `2013-11-08T22:00:40Z`.
        /// </summary>
        [Input("restorePointInTime")]
        public Input<string>? RestorePointInTime { get; set; }

        /// <summary>
        /// Specifies the SKU Name for this MySQL Server. The name of the SKU, follows the `tier` + `family` + `cores` pattern (e.g. `B_Gen4_1`, `GP_Gen5_8`). For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers). Possible values are `B_Gen4_1`, `B_Gen4_2`, `B_Gen5_1`, `B_Gen5_2`, `GP_Gen4_2`, `GP_Gen4_4`, `GP_Gen4_8`, `GP_Gen4_16`, `GP_Gen4_32`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_8`, `GP_Gen5_16`, `GP_Gen5_32`, `GP_Gen5_64`, `MO_Gen5_2`, `MO_Gen5_4`, `MO_Gen5_8`, `MO_Gen5_16` and `MO_Gen5_32`.
        /// </summary>
        [Input("skuName")]
        public Input<string>? SkuName { get; set; }

        /// <summary>
        /// Specifies if SSL should be enforced on connections. Possible values are `true` and `false`.
        /// </summary>
        [Input("sslEnforcementEnabled")]
        public Input<bool>? SslEnforcementEnabled { get; set; }

        /// <summary>
        /// The minimum TLS version to support on the sever. Possible values are `TLSEnforcementDisabled`, `TLS1_0`, `TLS1_1`, and `TLS1_2`. Defaults to `TLS1_2`.
        /// </summary>
        [Input("sslMinimalTlsVersionEnforced")]
        public Input<string>? SslMinimalTlsVersionEnforced { get; set; }

        /// <summary>
        /// Max storage allowed for a server. Possible values are between `5120` MB(5GB) and `1048576` MB(1TB) for the Basic SKU and between `5120` MB(5GB) and `16777216` MB(16TB) for General Purpose/Memory Optimized SKUs. For more information see the [product documentation](https://docs.microsoft.com/azure/mysql/concepts-pricing-tiers).
        /// </summary>
        [Input("storageMb")]
        public Input<int>? StorageMb { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threat_detection_policy` block supports fields documented below.
        /// </summary>
        [Input("threatDetectionPolicy")]
        public Input<Inputs.ServerThreatDetectionPolicyGetArgs>? ThreatDetectionPolicy { get; set; }

        /// <summary>
        /// Specifies the version of MySQL to use. Valid values are `5.7`, or `8.0`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ServerState()
        {
        }
        public static new ServerState Empty => new ServerState();
    }
}
