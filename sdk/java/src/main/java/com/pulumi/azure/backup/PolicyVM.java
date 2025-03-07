// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.backup.PolicyVMArgs;
import com.pulumi.azure.backup.inputs.PolicyVMState;
import com.pulumi.azure.backup.outputs.PolicyVMBackup;
import com.pulumi.azure.backup.outputs.PolicyVMInstantRestoreResourceGroup;
import com.pulumi.azure.backup.outputs.PolicyVMRetentionDaily;
import com.pulumi.azure.backup.outputs.PolicyVMRetentionMonthly;
import com.pulumi.azure.backup.outputs.PolicyVMRetentionWeekly;
import com.pulumi.azure.backup.outputs.PolicyVMRetentionYearly;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Backup VM Backup Policy.
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
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.backup.PolicyVM;
 * import com.pulumi.azure.backup.PolicyVMArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMBackupArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMRetentionDailyArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMRetentionWeeklyArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMRetentionMonthlyArgs;
 * import com.pulumi.azure.backup.inputs.PolicyVMRetentionYearlyArgs;
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
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var examplePolicyVM = new PolicyVM(&#34;examplePolicyVM&#34;, PolicyVMArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .recoveryVaultName(exampleVault.name())
 *             .timezone(&#34;UTC&#34;)
 *             .backup(PolicyVMBackupArgs.builder()
 *                 .frequency(&#34;Daily&#34;)
 *                 .time(&#34;23:00&#34;)
 *                 .build())
 *             .retentionDaily(PolicyVMRetentionDailyArgs.builder()
 *                 .count(10)
 *                 .build())
 *             .retentionWeekly(PolicyVMRetentionWeeklyArgs.builder()
 *                 .count(42)
 *                 .weekdays(                
 *                     &#34;Sunday&#34;,
 *                     &#34;Wednesday&#34;,
 *                     &#34;Friday&#34;,
 *                     &#34;Saturday&#34;)
 *                 .build())
 *             .retentionMonthly(PolicyVMRetentionMonthlyArgs.builder()
 *                 .count(7)
 *                 .weekdays(                
 *                     &#34;Sunday&#34;,
 *                     &#34;Wednesday&#34;)
 *                 .weeks(                
 *                     &#34;First&#34;,
 *                     &#34;Last&#34;)
 *                 .build())
 *             .retentionYearly(PolicyVMRetentionYearlyArgs.builder()
 *                 .count(77)
 *                 .weekdays(&#34;Sunday&#34;)
 *                 .weeks(&#34;Last&#34;)
 *                 .months(&#34;January&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VM Backup Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:backup/policyVM:PolicyVM policy1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/example-recovery-vault/backupPolicies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:backup/policyVM:PolicyVM")
public class PolicyVM extends com.pulumi.resources.CustomResource {
    /**
     * Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * 
     */
    @Export(name="backup", refs={PolicyVMBackup.class}, tree="[0]")
    private Output<PolicyVMBackup> backup;

    /**
     * @return Configures the Policy backup frequency, times &amp; days as documented in the `backup` block below.
     * 
     */
    public Output<PolicyVMBackup> backup() {
        return this.backup;
    }
    /**
     * Specifies the instant restore resource group name as documented in the `instant_restore_resource_group` block below.
     * 
     */
    @Export(name="instantRestoreResourceGroup", refs={PolicyVMInstantRestoreResourceGroup.class}, tree="[0]")
    private Output</* @Nullable */ PolicyVMInstantRestoreResourceGroup> instantRestoreResourceGroup;

    /**
     * @return Specifies the instant restore resource group name as documented in the `instant_restore_resource_group` block below.
     * 
     */
    public Output<Optional<PolicyVMInstantRestoreResourceGroup>> instantRestoreResourceGroup() {
        return Codegen.optional(this.instantRestoreResourceGroup);
    }
    /**
     * Specifies the instant restore retention range in days. Possible values are between `1` and `5` when `policy_type` is `V1`, and `1` to `30` when `policy_type` is `V2`.
     * 
     */
    @Export(name="instantRestoreRetentionDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> instantRestoreRetentionDays;

    /**
     * @return Specifies the instant restore retention range in days. Possible values are between `1` and `5` when `policy_type` is `V1`, and `1` to `30` when `policy_type` is `V2`.
     * 
     */
    public Output<Integer> instantRestoreRetentionDays() {
        return this.instantRestoreRetentionDays;
    }
    /**
     * Specifies the name of the Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Backup Policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of the Backup Policy. Possible values are `V1` and `V2` where `V2` stands for the Enhanced Policy. Defaults to `V1`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="policyType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyType;

    /**
     * @return Type of the Backup Policy. Possible values are `V1` and `V2` where `V2` stands for the Enhanced Policy. Defaults to `V1`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> policyType() {
        return Codegen.optional(this.policyType);
    }
    /**
     * Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="recoveryVaultName", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultName;

    /**
     * @return Specifies the name of the Recovery Services Vault to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> recoveryVaultName() {
        return this.recoveryVaultName;
    }
    /**
     * The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Configures the policy daily retention as documented in the `retention_daily` block below. Required when backup frequency is `Daily`.
     * 
     */
    @Export(name="retentionDaily", refs={PolicyVMRetentionDaily.class}, tree="[0]")
    private Output</* @Nullable */ PolicyVMRetentionDaily> retentionDaily;

    /**
     * @return Configures the policy daily retention as documented in the `retention_daily` block below. Required when backup frequency is `Daily`.
     * 
     */
    public Output<Optional<PolicyVMRetentionDaily>> retentionDaily() {
        return Codegen.optional(this.retentionDaily);
    }
    /**
     * Configures the policy monthly retention as documented in the `retention_monthly` block below.
     * 
     */
    @Export(name="retentionMonthly", refs={PolicyVMRetentionMonthly.class}, tree="[0]")
    private Output</* @Nullable */ PolicyVMRetentionMonthly> retentionMonthly;

    /**
     * @return Configures the policy monthly retention as documented in the `retention_monthly` block below.
     * 
     */
    public Output<Optional<PolicyVMRetentionMonthly>> retentionMonthly() {
        return Codegen.optional(this.retentionMonthly);
    }
    /**
     * Configures the policy weekly retention as documented in the `retention_weekly` block below. Required when backup frequency is `Weekly`.
     * 
     */
    @Export(name="retentionWeekly", refs={PolicyVMRetentionWeekly.class}, tree="[0]")
    private Output</* @Nullable */ PolicyVMRetentionWeekly> retentionWeekly;

    /**
     * @return Configures the policy weekly retention as documented in the `retention_weekly` block below. Required when backup frequency is `Weekly`.
     * 
     */
    public Output<Optional<PolicyVMRetentionWeekly>> retentionWeekly() {
        return Codegen.optional(this.retentionWeekly);
    }
    /**
     * Configures the policy yearly retention as documented in the `retention_yearly` block below.
     * 
     */
    @Export(name="retentionYearly", refs={PolicyVMRetentionYearly.class}, tree="[0]")
    private Output</* @Nullable */ PolicyVMRetentionYearly> retentionYearly;

    /**
     * @return Configures the policy yearly retention as documented in the `retention_yearly` block below.
     * 
     */
    public Output<Optional<PolicyVMRetentionYearly>> retentionYearly() {
        return Codegen.optional(this.retentionYearly);
    }
    /**
     * Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    /**
     * @return Specifies the timezone. [the possible values are defined here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/). Defaults to `UTC`
     * 
     */
    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyVM(String name) {
        this(name, PolicyVMArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyVM(String name, PolicyVMArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyVM(String name, PolicyVMArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/policyVM:PolicyVM", name, args == null ? PolicyVMArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyVM(String name, Output<String> id, @Nullable PolicyVMState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:backup/policyVM:PolicyVM", name, state, makeResourceOptions(options, id));
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
    public static PolicyVM get(String name, Output<String> id, @Nullable PolicyVMState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyVM(name, id, state, options);
    }
}
