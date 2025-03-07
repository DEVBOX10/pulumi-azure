// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMWareReplicationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMWareReplicationPolicyArgs Empty = new VMWareReplicationPolicyArgs();

    /**
     * Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
     * 
     */
    @Import(name="applicationConsistentSnapshotFrequencyInMinutes", required=true)
    private Output<Integer> applicationConsistentSnapshotFrequencyInMinutes;

    /**
     * @return Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
     * 
     */
    public Output<Integer> applicationConsistentSnapshotFrequencyInMinutes() {
        return this.applicationConsistentSnapshotFrequencyInMinutes;
    }

    /**
     * The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
     * 
     */
    @Import(name="recoveryPointRetentionInMinutes", required=true)
    private Output<Integer> recoveryPointRetentionInMinutes;

    /**
     * @return Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
     * 
     */
    public Output<Integer> recoveryPointRetentionInMinutes() {
        return this.recoveryPointRetentionInMinutes;
    }

    /**
     * ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
     * 
     */
    @Import(name="recoveryVaultId", required=true)
    private Output<String> recoveryVaultId;

    /**
     * @return ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }

    private VMWareReplicationPolicyArgs() {}

    private VMWareReplicationPolicyArgs(VMWareReplicationPolicyArgs $) {
        this.applicationConsistentSnapshotFrequencyInMinutes = $.applicationConsistentSnapshotFrequencyInMinutes;
        this.name = $.name;
        this.recoveryPointRetentionInMinutes = $.recoveryPointRetentionInMinutes;
        this.recoveryVaultId = $.recoveryVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMWareReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMWareReplicationPolicyArgs $;

        public Builder() {
            $ = new VMWareReplicationPolicyArgs();
        }

        public Builder(VMWareReplicationPolicyArgs defaults) {
            $ = new VMWareReplicationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationConsistentSnapshotFrequencyInMinutes Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
         * 
         * @return builder
         * 
         */
        public Builder applicationConsistentSnapshotFrequencyInMinutes(Output<Integer> applicationConsistentSnapshotFrequencyInMinutes) {
            $.applicationConsistentSnapshotFrequencyInMinutes = applicationConsistentSnapshotFrequencyInMinutes;
            return this;
        }

        /**
         * @param applicationConsistentSnapshotFrequencyInMinutes Specifies the frequency at which to create application consistent recovery points. Must between `0` to `720`.
         * 
         * @return builder
         * 
         */
        public Builder applicationConsistentSnapshotFrequencyInMinutes(Integer applicationConsistentSnapshotFrequencyInMinutes) {
            return applicationConsistentSnapshotFrequencyInMinutes(Output.of(applicationConsistentSnapshotFrequencyInMinutes));
        }

        /**
         * @param name The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Classic Replication Policy. Changing this forces a new Replication Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recoveryPointRetentionInMinutes Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointRetentionInMinutes(Output<Integer> recoveryPointRetentionInMinutes) {
            $.recoveryPointRetentionInMinutes = recoveryPointRetentionInMinutes;
            return this;
        }

        /**
         * @param recoveryPointRetentionInMinutes Specifies the period up to which the recovery points will be retained. Must between `0` to `21600`.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointRetentionInMinutes(Integer recoveryPointRetentionInMinutes) {
            return recoveryPointRetentionInMinutes(Output.of(recoveryPointRetentionInMinutes));
        }

        /**
         * @param recoveryVaultId ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(Output<String> recoveryVaultId) {
            $.recoveryVaultId = recoveryVaultId;
            return this;
        }

        /**
         * @param recoveryVaultId ID of the Recovery Services Vault. Changing this forces a new Replication Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder recoveryVaultId(String recoveryVaultId) {
            return recoveryVaultId(Output.of(recoveryVaultId));
        }

        public VMWareReplicationPolicyArgs build() {
            $.applicationConsistentSnapshotFrequencyInMinutes = Objects.requireNonNull($.applicationConsistentSnapshotFrequencyInMinutes, "expected parameter 'applicationConsistentSnapshotFrequencyInMinutes' to be non-null");
            $.recoveryPointRetentionInMinutes = Objects.requireNonNull($.recoveryPointRetentionInMinutes, "expected parameter 'recoveryPointRetentionInMinutes' to be non-null");
            $.recoveryVaultId = Objects.requireNonNull($.recoveryVaultId, "expected parameter 'recoveryVaultId' to be non-null");
            return $;
        }
    }

}
