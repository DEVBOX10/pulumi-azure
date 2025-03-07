// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.RoleAssignmentArgs;
import com.pulumi.azure.synapse.inputs.RoleAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Synapse Role Assignment.
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
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.DataLakeGen2Filesystem;
 * import com.pulumi.azure.storage.DataLakeGen2FilesystemArgs;
 * import com.pulumi.azure.synapse.Workspace;
 * import com.pulumi.azure.synapse.WorkspaceArgs;
 * import com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs;
 * import com.pulumi.azure.synapse.FirewallRule;
 * import com.pulumi.azure.synapse.FirewallRuleArgs;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.synapse.RoleAssignment;
 * import com.pulumi.azure.synapse.RoleAssignmentArgs;
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
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .accountKind(&#34;StorageV2&#34;)
 *             .isHnsEnabled(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.id())
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.id())
 *             .sqlAdministratorLogin(&#34;sqladminuser&#34;)
 *             .sqlAdministratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .identity(WorkspaceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleFirewallRule = new FirewallRule(&#34;exampleFirewallRule&#34;, FirewallRuleArgs.builder()        
 *             .synapseWorkspaceId(exampleWorkspace.id())
 *             .startIpAddress(&#34;0.0.0.0&#34;)
 *             .endIpAddress(&#34;255.255.255.255&#34;)
 *             .build());
 * 
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleRoleAssignment = new RoleAssignment(&#34;exampleRoleAssignment&#34;, RoleAssignmentArgs.builder()        
 *             .synapseWorkspaceId(exampleWorkspace.id())
 *             .roleName(&#34;Synapse SQL Administrator&#34;)
 *             .principalId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleFirewallRule)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synapse Role Assignment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:synapse/roleAssignment:RoleAssignment example &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1|000000000000&#34;
 * ```
 * 
 */
@ResourceType(type="azure:synapse/roleAssignment:RoleAssignment")
public class RoleAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="principalId", refs={String.class}, tree="[0]")
    private Output<String> principalId;

    /**
     * @return The ID of the Principal (User, Group or Service Principal) to assign the Synapse Role Definition to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Currently, the Synapse built-in roles are `Apache Spark Administrator`, `Synapse Administrator`, `Synapse Artifact Publisher`, `Synapse Artifact User`, `Synapse Compute Operator`, `Synapse Contributor`, `Synapse Credential User`, `Synapse Linked Data Manager`, `Synapse Monitoring Operator`, `Synapse SQL Administrator` and `Synapse User`.
     * 
     * &gt; **NOTE:** Old roles are still supported: `Workspace Admin`, `Apache Spark Admin`, `Sql Admin`. These values will be removed in the next Major Version 3.0.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The Role Name of the Synapse Built-In Role. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Currently, the Synapse built-in roles are `Apache Spark Administrator`, `Synapse Administrator`, `Synapse Artifact Publisher`, `Synapse Artifact User`, `Synapse Compute Operator`, `Synapse Contributor`, `Synapse Credential User`, `Synapse Linked Data Manager`, `Synapse Monitoring Operator`, `Synapse SQL Administrator` and `Synapse User`.
     * 
     * &gt; **NOTE:** Old roles are still supported: `Workspace Admin`, `Apache Spark Admin`, `Sql Admin`. These values will be removed in the next Major Version 3.0.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A Synapse firewall rule including local IP is needed to allow access. Only one of `synapse_workspace_id`, `synapse_spark_pool_id` must be set.
     * 
     */
    @Export(name="synapseSparkPoolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> synapseSparkPoolId;

    /**
     * @return The Synapse Spark Pool which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** A Synapse firewall rule including local IP is needed to allow access. Only one of `synapse_workspace_id`, `synapse_spark_pool_id` must be set.
     * 
     */
    public Output<Optional<String>> synapseSparkPoolId() {
        return Codegen.optional(this.synapseSparkPoolId);
    }
    /**
     * The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="synapseWorkspaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace which the Synapse Role Assignment applies to. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> synapseWorkspaceId() {
        return Codegen.optional(this.synapseWorkspaceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssignment(String name) {
        this(name, RoleAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssignment(String name, RoleAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/roleAssignment:RoleAssignment", name, args == null ? RoleAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleAssignment(String name, Output<String> id, @Nullable RoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/roleAssignment:RoleAssignment", name, state, makeResourceOptions(options, id));
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
    public static RoleAssignment get(String name, Output<String> id, @Nullable RoleAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssignment(name, id, state, options);
    }
}
