// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccountEncryption extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountEncryption Empty = new GetAccountEncryption();

    /**
     * The full URL path of the Key Vault Key used to encrypt data for this Batch account.
     * 
     */
    @Import(name="keyVaultKeyId", required=true)
    private String keyVaultKeyId;

    /**
     * @return The full URL path of the Key Vault Key used to encrypt data for this Batch account.
     * 
     */
    public String keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    private GetAccountEncryption() {}

    private GetAccountEncryption(GetAccountEncryption $) {
        this.keyVaultKeyId = $.keyVaultKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountEncryption $;

        public Builder() {
            $ = new GetAccountEncryption();
        }

        public Builder(GetAccountEncryption defaults) {
            $ = new GetAccountEncryption(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultKeyId The full URL path of the Key Vault Key used to encrypt data for this Batch account.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        public GetAccountEncryption build() {
            $.keyVaultKeyId = Objects.requireNonNull($.keyVaultKeyId, "expected parameter 'keyVaultKeyId' to be non-null");
            return $;
        }
    }

}
