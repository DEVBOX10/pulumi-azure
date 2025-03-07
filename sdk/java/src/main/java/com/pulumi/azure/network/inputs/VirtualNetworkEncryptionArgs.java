// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNetworkEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkEncryptionArgs Empty = new VirtualNetworkEncryptionArgs();

    /**
     * Specifies if the encrypted Virtual Network allows VM that does not support encryption. Possible values are `DropUnencrypted` and `AllowUnencrypted`.
     * 
     */
    @Import(name="enforcement", required=true)
    private Output<String> enforcement;

    /**
     * @return Specifies if the encrypted Virtual Network allows VM that does not support encryption. Possible values are `DropUnencrypted` and `AllowUnencrypted`.
     * 
     */
    public Output<String> enforcement() {
        return this.enforcement;
    }

    private VirtualNetworkEncryptionArgs() {}

    private VirtualNetworkEncryptionArgs(VirtualNetworkEncryptionArgs $) {
        this.enforcement = $.enforcement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkEncryptionArgs $;

        public Builder() {
            $ = new VirtualNetworkEncryptionArgs();
        }

        public Builder(VirtualNetworkEncryptionArgs defaults) {
            $ = new VirtualNetworkEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforcement Specifies if the encrypted Virtual Network allows VM that does not support encryption. Possible values are `DropUnencrypted` and `AllowUnencrypted`.
         * 
         * @return builder
         * 
         */
        public Builder enforcement(Output<String> enforcement) {
            $.enforcement = enforcement;
            return this;
        }

        /**
         * @param enforcement Specifies if the encrypted Virtual Network allows VM that does not support encryption. Possible values are `DropUnencrypted` and `AllowUnencrypted`.
         * 
         * @return builder
         * 
         */
        public Builder enforcement(String enforcement) {
            return enforcement(Output.of(enforcement));
        }

        public VirtualNetworkEncryptionArgs build() {
            $.enforcement = Objects.requireNonNull($.enforcement, "expected parameter 'enforcement' to be non-null");
            return $;
        }
    }

}
