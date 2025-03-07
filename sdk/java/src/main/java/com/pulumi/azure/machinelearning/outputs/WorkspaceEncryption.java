// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkspaceEncryption {
    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     */
    private String keyId;
    /**
     * @return The ID of the keyVault where the customer owned encryption key is present.
     * 
     */
    private String keyVaultId;
    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     * &gt; **Note**: `user_assigned_identity_id` must set when`identity.type` is `UserAssigned` or service won&#39;t be able to find the assigned permissions.
     * 
     */
    private @Nullable String userAssignedIdentityId;

    private WorkspaceEncryption() {}
    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return The ID of the keyVault where the customer owned encryption key is present.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     * &gt; **Note**: `user_assigned_identity_id` must set when`identity.type` is `UserAssigned` or service won&#39;t be able to find the assigned permissions.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyId;
        private String keyVaultId;
        private @Nullable String userAssignedIdentityId;
        public Builder() {}
        public Builder(WorkspaceEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
        }

        @CustomType.Setter
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {
            this.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }
        public WorkspaceEncryption build() {
            final var _resultValue = new WorkspaceEncryption();
            _resultValue.keyId = keyId;
            _resultValue.keyVaultId = keyVaultId;
            _resultValue.userAssignedIdentityId = userAssignedIdentityId;
            return _resultValue;
        }
    }
}
