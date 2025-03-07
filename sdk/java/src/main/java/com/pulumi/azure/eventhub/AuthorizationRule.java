// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.AuthorizationRuleArgs;
import com.pulumi.azure.eventhub.inputs.AuthorizationRuleState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Event Hubs authorization Rule within an Event Hub.
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
 * import com.pulumi.azure.eventhub.EventHubNamespace;
 * import com.pulumi.azure.eventhub.EventHubNamespaceArgs;
 * import com.pulumi.azure.eventhub.EventHub;
 * import com.pulumi.azure.eventhub.EventHubArgs;
 * import com.pulumi.azure.eventhub.AuthorizationRule;
 * import com.pulumi.azure.eventhub.AuthorizationRuleArgs;
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
 *         var exampleEventHubNamespace = new EventHubNamespace(&#34;exampleEventHubNamespace&#34;, EventHubNamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Basic&#34;)
 *             .capacity(2)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         var exampleEventHub = new EventHub(&#34;exampleEventHub&#34;, EventHubArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .partitionCount(2)
 *             .messageRetention(2)
 *             .build());
 * 
 *         var exampleAuthorizationRule = new AuthorizationRule(&#34;exampleAuthorizationRule&#34;, AuthorizationRuleArgs.builder()        
 *             .namespaceName(exampleEventHubNamespace.name())
 *             .eventhubName(exampleEventHub.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .listen(true)
 *             .send(false)
 *             .manage(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EventHub Authorization Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/authorizationRule:AuthorizationRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/eventhubs/eventhub1/authorizationRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:eventhub/authorizationRule:AuthorizationRule")
public class AuthorizationRule extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubName", refs={String.class}, tree="[0]")
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }
    /**
     * Does this Authorization Rule have permissions to Listen to the Event Hub? Defaults to `false`.
     * 
     */
    @Export(name="listen", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> listen;

    /**
     * @return Does this Authorization Rule have permissions to Listen to the Event Hub? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> listen() {
        return Codegen.optional(this.listen);
    }
    /**
     * Does this Authorization Rule have permissions to Manage to the Event Hub? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    @Export(name="manage", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> manage;

    /**
     * @return Does this Authorization Rule have permissions to Manage to the Event Hub? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> manage() {
        return Codegen.optional(this.manage);
    }
    /**
     * Specifies the name of the EventHub Authorization Rule resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the EventHub Authorization Rule resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    @Export(name="primaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> primaryConnectionString;

    /**
     * @return The Primary Connection String for the Event Hubs authorization Rule.
     * 
     */
    public Output<String> primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * The alias of the Primary Connection String for the Event Hubs authorization Rule, which is generated when disaster recovery is enabled.
     * 
     */
    @Export(name="primaryConnectionStringAlias", refs={String.class}, tree="[0]")
    private Output<String> primaryConnectionStringAlias;

    /**
     * @return The alias of the Primary Connection String for the Event Hubs authorization Rule, which is generated when disaster recovery is enabled.
     * 
     */
    public Output<String> primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    /**
     * The Primary Key for the Event Hubs authorization Rule.
     * 
     */
    @Export(name="primaryKey", refs={String.class}, tree="[0]")
    private Output<String> primaryKey;

    /**
     * @return The Primary Key for the Event Hubs authorization Rule.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }
    /**
     * The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** At least one of the 3 permissions below needs to be set.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Namespace exists. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** At least one of the 3 permissions below needs to be set.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    @Export(name="secondaryConnectionString", refs={String.class}, tree="[0]")
    private Output<String> secondaryConnectionString;

    /**
     * @return The Secondary Connection String for the Event Hubs Authorization Rule.
     * 
     */
    public Output<String> secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * The alias of the Secondary Connection String for the Event Hubs Authorization Rule, which is generated when disaster recovery is enabled.
     * 
     */
    @Export(name="secondaryConnectionStringAlias", refs={String.class}, tree="[0]")
    private Output<String> secondaryConnectionStringAlias;

    /**
     * @return The alias of the Secondary Connection String for the Event Hubs Authorization Rule, which is generated when disaster recovery is enabled.
     * 
     */
    public Output<String> secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }
    /**
     * The Secondary Key for the Event Hubs Authorization Rule.
     * 
     */
    @Export(name="secondaryKey", refs={String.class}, tree="[0]")
    private Output<String> secondaryKey;

    /**
     * @return The Secondary Key for the Event Hubs Authorization Rule.
     * 
     */
    public Output<String> secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * Does this Authorization Rule have permissions to Send to the Event Hub? Defaults to `false`.
     * 
     */
    @Export(name="send", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> send;

    /**
     * @return Does this Authorization Rule have permissions to Send to the Event Hub? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> send() {
        return Codegen.optional(this.send);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationRule(String name) {
        this(name, AuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationRule(String name, AuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationRule(String name, AuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/authorizationRule:AuthorizationRule", name, args == null ? AuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthorizationRule(String name, Output<String> id, @Nullable AuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/authorizationRule:AuthorizationRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:eventhub/eventHubAuthorizationRule:EventHubAuthorizationRule").build())
            ))
            .additionalSecretOutputs(List.of(
                "primaryConnectionString",
                "primaryConnectionStringAlias",
                "primaryKey",
                "secondaryConnectionString",
                "secondaryConnectionStringAlias",
                "secondaryKey"
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
    public static AuthorizationRule get(String name, Output<String> id, @Nullable AuthorizationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationRule(name, id, state, options);
    }
}
