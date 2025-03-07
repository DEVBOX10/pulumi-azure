// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.LogzSubAccountTagRuleArgs;
import com.pulumi.azure.monitoring.inputs.LogzSubAccountTagRuleState;
import com.pulumi.azure.monitoring.outputs.LogzSubAccountTagRuleTagFilter;
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
 * Manages a Logz Sub Account Tag Rule.
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
 * import com.pulumi.azure.monitoring.LogzMonitor;
 * import com.pulumi.azure.monitoring.LogzMonitorArgs;
 * import com.pulumi.azure.monitoring.inputs.LogzMonitorPlanArgs;
 * import com.pulumi.azure.monitoring.inputs.LogzMonitorUserArgs;
 * import com.pulumi.azure.monitoring.LogzSubAccount;
 * import com.pulumi.azure.monitoring.LogzSubAccountArgs;
 * import com.pulumi.azure.monitoring.inputs.LogzSubAccountUserArgs;
 * import com.pulumi.azure.monitoring.LogzSubAccountTagRule;
 * import com.pulumi.azure.monitoring.LogzSubAccountTagRuleArgs;
 * import com.pulumi.azure.monitoring.inputs.LogzSubAccountTagRuleTagFilterArgs;
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
 *         var exampleLogzMonitor = new LogzMonitor(&#34;exampleLogzMonitor&#34;, LogzMonitorArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .plan(LogzMonitorPlanArgs.builder()
 *                 .billingCycle(&#34;MONTHLY&#34;)
 *                 .effectiveDate(&#34;2022-06-06T00:00:00Z&#34;)
 *                 .usageType(&#34;COMMITTED&#34;)
 *                 .build())
 *             .user(LogzMonitorUserArgs.builder()
 *                 .email(&#34;user@example.com&#34;)
 *                 .firstName(&#34;Example&#34;)
 *                 .lastName(&#34;User&#34;)
 *                 .phoneNumber(&#34;+12313803556&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleLogzSubAccount = new LogzSubAccount(&#34;exampleLogzSubAccount&#34;, LogzSubAccountArgs.builder()        
 *             .logzMonitorId(exampleLogzMonitor.id())
 *             .user(LogzSubAccountUserArgs.builder()
 *                 .email(exampleLogzMonitor.user().applyValue(user -&gt; user.email()))
 *                 .firstName(exampleLogzMonitor.user().applyValue(user -&gt; user.firstName()))
 *                 .lastName(exampleLogzMonitor.user().applyValue(user -&gt; user.lastName()))
 *                 .phoneNumber(exampleLogzMonitor.user().applyValue(user -&gt; user.phoneNumber()))
 *                 .build())
 *             .build());
 * 
 *         var exampleLogzSubAccountTagRule = new LogzSubAccountTagRule(&#34;exampleLogzSubAccountTagRule&#34;, LogzSubAccountTagRuleArgs.builder()        
 *             .logzSubAccountId(exampleLogzSubAccount.id())
 *             .sendAadLogs(true)
 *             .sendActivityLogs(true)
 *             .sendSubscriptionLogs(true)
 *             .tagFilters(            
 *                 LogzSubAccountTagRuleTagFilterArgs.builder()
 *                     .name(&#34;name1&#34;)
 *                     .action(&#34;Include&#34;)
 *                     .value(&#34;value1&#34;)
 *                     .build(),
 *                 LogzSubAccountTagRuleTagFilterArgs.builder()
 *                     .name(&#34;name2&#34;)
 *                     .action(&#34;Exclude&#34;)
 *                     .value(&#34;value2&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Logz Sub Account Tag Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/accounts/subAccount1/tagRules/ruleSet1
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule")
public class LogzSubAccountTagRule extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
     * 
     */
    @Export(name="logzSubAccountId", refs={String.class}, tree="[0]")
    private Output<String> logzSubAccountId;

    /**
     * @return The ID of the Logz Sub Account. Changing this forces a new Logz Sub Account Tag Rule to be created.
     * 
     */
    public Output<String> logzSubAccountId() {
        return this.logzSubAccountId;
    }
    /**
     * Whether AAD logs should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendAadLogs", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendAadLogs;

    /**
     * @return Whether AAD logs should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendAadLogs() {
        return Codegen.optional(this.sendAadLogs);
    }
    /**
     * Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendActivityLogs", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendActivityLogs;

    /**
     * @return Whether activity logs from this Logz Sub Account Tag Rule should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendActivityLogs() {
        return Codegen.optional(this.sendActivityLogs);
    }
    /**
     * Whether subscription logs should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendSubscriptionLogs", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendSubscriptionLogs;

    /**
     * @return Whether subscription logs should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendSubscriptionLogs() {
        return Codegen.optional(this.sendSubscriptionLogs);
    }
    /**
     * One or more (up to 10) `tag_filter` blocks as defined below.
     * 
     */
    @Export(name="tagFilters", refs={List.class,LogzSubAccountTagRuleTagFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LogzSubAccountTagRuleTagFilter>> tagFilters;

    /**
     * @return One or more (up to 10) `tag_filter` blocks as defined below.
     * 
     */
    public Output<Optional<List<LogzSubAccountTagRuleTagFilter>>> tagFilters() {
        return Codegen.optional(this.tagFilters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogzSubAccountTagRule(String name) {
        this(name, LogzSubAccountTagRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogzSubAccountTagRule(String name, LogzSubAccountTagRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogzSubAccountTagRule(String name, LogzSubAccountTagRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule", name, args == null ? LogzSubAccountTagRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogzSubAccountTagRule(String name, Output<String> id, @Nullable LogzSubAccountTagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/logzSubAccountTagRule:LogzSubAccountTagRule", name, state, makeResourceOptions(options, id));
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
    public static LogzSubAccountTagRule get(String name, Output<String> id, @Nullable LogzSubAccountTagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogzSubAccountTagRule(name, id, state, options);
    }
}
