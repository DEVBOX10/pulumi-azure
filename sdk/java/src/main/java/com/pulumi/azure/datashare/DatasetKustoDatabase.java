// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datashare.DatasetKustoDatabaseArgs;
import com.pulumi.azure.datashare.inputs.DatasetKustoDatabaseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Data Share Kusto Database Dataset.
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
 * import com.pulumi.azure.datashare.Account;
 * import com.pulumi.azure.datashare.AccountArgs;
 * import com.pulumi.azure.datashare.inputs.AccountIdentityArgs;
 * import com.pulumi.azure.datashare.Share;
 * import com.pulumi.azure.datashare.ShareArgs;
 * import com.pulumi.azure.kusto.Cluster;
 * import com.pulumi.azure.kusto.ClusterArgs;
 * import com.pulumi.azure.kusto.inputs.ClusterSkuArgs;
 * import com.pulumi.azure.kusto.Database;
 * import com.pulumi.azure.kusto.DatabaseArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.datashare.DatasetKustoDatabase;
 * import com.pulumi.azure.datashare.DatasetKustoDatabaseArgs;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .identity(AccountIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleShare = new Share(&#34;exampleShare&#34;, ShareArgs.builder()        
 *             .accountId(exampleAccount.id())
 *             .kind(&#34;InPlace&#34;)
 *             .build());
 * 
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(ClusterSkuArgs.builder()
 *                 .name(&#34;Dev(No SLA)_Standard_D11_v2&#34;)
 *                 .capacity(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .clusterName(exampleCluster.name())
 *             .build());
 * 
 *         var exampleAssignment = new Assignment(&#34;exampleAssignment&#34;, AssignmentArgs.builder()        
 *             .scope(exampleCluster.id())
 *             .roleDefinitionName(&#34;Contributor&#34;)
 *             .principalId(exampleAccount.identity().applyValue(identity -&gt; identity.principalId()))
 *             .build());
 * 
 *         var exampleDatasetKustoDatabase = new DatasetKustoDatabase(&#34;exampleDatasetKustoDatabase&#34;, DatasetKustoDatabaseArgs.builder()        
 *             .shareId(exampleShare.id())
 *             .kustoDatabaseId(exampleDatabase.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAssignment)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Share Kusto Database Datasets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datashare/datasetKustoDatabase:DatasetKustoDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
 * ```
 * 
 */
@ResourceType(type="azure:datashare/datasetKustoDatabase:DatasetKustoDatabase")
public class DatasetKustoDatabase extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Data Share Dataset.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Data Share Dataset.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The location of the Kusto Cluster.
     * 
     */
    @Export(name="kustoClusterLocation", refs={String.class}, tree="[0]")
    private Output<String> kustoClusterLocation;

    /**
     * @return The location of the Kusto Cluster.
     * 
     */
    public Output<String> kustoClusterLocation() {
        return this.kustoClusterLocation;
    }
    /**
     * The resource ID of the Kusto Cluster Database to be shared with the receiver. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    @Export(name="kustoDatabaseId", refs={String.class}, tree="[0]")
    private Output<String> kustoDatabaseId;

    /**
     * @return The resource ID of the Kusto Cluster Database to be shared with the receiver. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    public Output<String> kustoDatabaseId() {
        return this.kustoDatabaseId;
    }
    /**
     * The name which should be used for this Data Share Kusto Database Dataset. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Data Share Kusto Database Dataset. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    @Export(name="shareId", refs={String.class}, tree="[0]")
    private Output<String> shareId;

    /**
     * @return The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created. Changing this forces a new Data Share Kusto Database Dataset to be created.
     * 
     */
    public Output<String> shareId() {
        return this.shareId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetKustoDatabase(String name) {
        this(name, DatasetKustoDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetKustoDatabase(String name, DatasetKustoDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetKustoDatabase(String name, DatasetKustoDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datashare/datasetKustoDatabase:DatasetKustoDatabase", name, args == null ? DatasetKustoDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatasetKustoDatabase(String name, Output<String> id, @Nullable DatasetKustoDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datashare/datasetKustoDatabase:DatasetKustoDatabase", name, state, makeResourceOptions(options, id));
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
    public static DatasetKustoDatabase get(String name, Output<String> id, @Nullable DatasetKustoDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatasetKustoDatabase(name, id, state, options);
    }
}
