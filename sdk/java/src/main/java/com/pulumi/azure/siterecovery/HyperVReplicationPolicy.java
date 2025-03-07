// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs;
import com.pulumi.azure.siterecovery.inputs.HyperVReplicationPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Azure Site Recovery replication policy for HyperV within a Recovery Vault. Replication policies define the frequency at which recovery points are created and how long they are stored.
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
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicy;
 * import com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs;
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
 *         var example = new ResourceGroup(&#34;example&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var vault = new Vault(&#34;vault&#34;, VaultArgs.builder()        
 *             .location(example.location())
 *             .resourceGroupName(example.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var policy = new HyperVReplicationPolicy(&#34;policy&#34;, HyperVReplicationPolicyArgs.builder()        
 *             .recoveryVaultId(vault.id())
 *             .recoveryPointRetentionInHours(2)
 *             .applicationConsistentSnapshotFrequencyInHours(1)
 *             .replicationIntervalInSeconds(300)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Site Recovery Replication Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationPolicies/policy-name
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy")
public class HyperVReplicationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the frequency at which to create application consistent recovery points.
     * 
     */
    @Export(name="applicationConsistentSnapshotFrequencyInHours", refs={Integer.class}, tree="[0]")
    private Output<Integer> applicationConsistentSnapshotFrequencyInHours;

    /**
     * @return Specifies the frequency at which to create application consistent recovery points.
     * 
     */
    public Output<Integer> applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }
    /**
     * The name of the replication policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the replication policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The duration in hours for which the recovery points need to be stored.
     * 
     */
    @Export(name="recoveryPointRetentionInHours", refs={Integer.class}, tree="[0]")
    private Output<Integer> recoveryPointRetentionInHours;

    /**
     * @return The duration in hours for which the recovery points need to be stored.
     * 
     */
    public Output<Integer> recoveryPointRetentionInHours() {
        return this.recoveryPointRetentionInHours;
    }
    @Export(name="recoveryVaultId", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultId;

    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }
    /**
     * Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
     * 
     */
    @Export(name="replicationIntervalInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> replicationIntervalInSeconds;

    /**
     * @return Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
     * 
     */
    public Output<Integer> replicationIntervalInSeconds() {
        return this.replicationIntervalInSeconds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperVReplicationPolicy(String name) {
        this(name, HyperVReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperVReplicationPolicy(String name, HyperVReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperVReplicationPolicy(String name, HyperVReplicationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy", name, args == null ? HyperVReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HyperVReplicationPolicy(String name, Output<String> id, @Nullable HyperVReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy", name, state, makeResourceOptions(options, id));
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
    public static HyperVReplicationPolicy get(String name, Output<String> id, @Nullable HyperVReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HyperVReplicationPolicy(name, id, state, options);
    }
}
