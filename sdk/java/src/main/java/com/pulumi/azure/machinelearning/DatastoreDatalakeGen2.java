// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.machinelearning.DatastoreDatalakeGen2Args;
import com.pulumi.azure.machinelearning.inputs.DatastoreDatalakeGen2State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Machine Learning Data Lake Gen2 DataStore.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.appinsights.Insights;
 * import com.pulumi.azure.appinsights.InsightsArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.machinelearning.Workspace;
 * import com.pulumi.azure.machinelearning.WorkspaceArgs;
 * import com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azure.machinelearning.DatastoreDatalakeGen2;
 * import com.pulumi.azure.machinelearning.DatastoreDatalakeGen2Args;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleInsights = new Insights(&#34;exampleInsights&#34;, InsightsArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .applicationType(&#34;web&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .skuName(&#34;premium&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;GRS&#34;)
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .applicationInsightsId(exampleInsights.id())
 *             .keyVaultId(exampleKeyVault.id())
 *             .storageAccountId(exampleAccount.id())
 *             .identity(WorkspaceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.name())
 *             .containerAccessType(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleDatastoreDatalakeGen2 = new DatastoreDatalakeGen2(&#34;exampleDatastoreDatalakeGen2&#34;, DatastoreDatalakeGen2Args.builder()        
 *             .workspaceId(exampleWorkspace.id())
 *             .storageContainerId(exampleContainer.resourceManagerId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Machine Learning DataStores can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:machinelearning/datastoreDatalakeGen2:DatastoreDatalakeGen2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.MachineLearningServices/workspaces/mlw1/dataStores/datastore1
 * ```
 * 
 */
@ResourceType(type="azure:machinelearning/datastoreDatalakeGen2:DatastoreDatalakeGen2")
public class DatastoreDatalakeGen2 extends com.pulumi.resources.CustomResource {
    /**
     * An URL used for authentication.
     * 
     */
    @Export(name="authorityUrl", refs={String.class}, tree="[0]")
    private Output<String> authorityUrl;

    /**
     * @return An URL used for authentication.
     * 
     */
    public Output<String> authorityUrl() {
        return this.authorityUrl;
    }
    /**
     * The object ID of the Service Principal.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientId;

    /**
     * @return The object ID of the Service Principal.
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * The secret of the Service Principal.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The secret of the Service Principal.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicates whether this Machines Learning DataStore is the default for the Workspace.
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDefault;

    /**
     * @return Indicates whether this Machines Learning DataStore is the default for the Workspace.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
     * 
     */
    @Export(name="serviceDataIdentity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceDataIdentity;

    /**
     * @return Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
     * 
     */
    public Output<Optional<String>> serviceDataIdentity() {
        return Codegen.optional(this.serviceDataIdentity);
    }
    /**
     * The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Export(name="storageContainerId", refs={String.class}, tree="[0]")
    private Output<String> storageContainerId;

    /**
     * @return The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<String> storageContainerId() {
        return this.storageContainerId;
    }
    /**
     * A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the Tenant which the Service Principal belongs to.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The ID of the Tenant which the Service Principal belongs to.
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatastoreDatalakeGen2(String name) {
        this(name, DatastoreDatalakeGen2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatastoreDatalakeGen2(String name, DatastoreDatalakeGen2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatastoreDatalakeGen2(String name, DatastoreDatalakeGen2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:machinelearning/datastoreDatalakeGen2:DatastoreDatalakeGen2", name, args == null ? DatastoreDatalakeGen2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatastoreDatalakeGen2(String name, Output<String> id, @Nullable DatastoreDatalakeGen2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:machinelearning/datastoreDatalakeGen2:DatastoreDatalakeGen2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret"
            ))
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
    public static DatastoreDatalakeGen2 get(String name, Output<String> id, @Nullable DatastoreDatalakeGen2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatastoreDatalakeGen2(name, id, state, options);
    }
}
