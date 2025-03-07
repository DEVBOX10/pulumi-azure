// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sql
{
    /// <summary>
    /// Manages a SQL Azure Managed Database.
    /// 
    /// &gt; **Note:** The `azure.sql.ManagedDatabase` resource is deprecated in version 3.0 of the AzureRM provider and will be removed in version 4.0. Please use the `azure.mssql.ManagedDatabase` resource instead.
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
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new()
    ///     {
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("exampleSubnet", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleManagedInstance = new Azure.Sql.ManagedInstance("exampleManagedInstance", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AdministratorLogin = "mradministrator",
    ///         AdministratorLoginPassword = "thisIsDog11",
    ///         LicenseType = "BasePrice",
    ///         SubnetId = exampleSubnet.Id,
    ///         SkuName = "GP_Gen5",
    ///         Vcores = 4,
    ///         StorageSizeInGb = 32,
    ///     });
    /// 
    ///     var exampleManagedDatabase = new Azure.Sql.ManagedDatabase("exampleManagedDatabase", new()
    ///     {
    ///         SqlManagedInstanceId = exampleManagedInstance.Id,
    ///         Location = exampleResourceGroup.Location,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SQL Managed Databases can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:sql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
    /// ```
    /// </summary>
    [AzureResourceType("azure:sql/managedDatabase:ManagedDatabase")]
    public partial class ManagedDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the SQL Managed Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sqlManagedInstanceId")]
        public Output<string> SqlManagedInstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabase(string name, ManagedDatabaseArgs args, CustomResourceOptions? options = null)
            : base("azure:sql/managedDatabase:ManagedDatabase", name, args ?? new ManagedDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabase(string name, Input<string> id, ManagedDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("azure:sql/managedDatabase:ManagedDatabase", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabase Get(string name, Input<string> id, ManagedDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabase(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the SQL Managed Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sqlManagedInstanceId", required: true)]
        public Input<string> SqlManagedInstanceId { get; set; } = null!;

        public ManagedDatabaseArgs()
        {
        }
        public static new ManagedDatabaseArgs Empty => new ManagedDatabaseArgs();
    }

    public sealed class ManagedDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the SQL Managed Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sqlManagedInstanceId")]
        public Input<string>? SqlManagedInstanceId { get; set; }

        public ManagedDatabaseState()
        {
        }
        public static new ManagedDatabaseState Empty => new ManagedDatabaseState();
    }
}
