// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CertificateCertificatePolicyLifetimeActionActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificatePolicyLifetimeActionActionArgs Empty = new CertificateCertificatePolicyLifetimeActionActionArgs();

    /**
     * The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    private CertificateCertificatePolicyLifetimeActionActionArgs() {}

    private CertificateCertificatePolicyLifetimeActionActionArgs(CertificateCertificatePolicyLifetimeActionActionArgs $) {
        this.actionType = $.actionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificatePolicyLifetimeActionActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificatePolicyLifetimeActionActionArgs $;

        public Builder() {
            $ = new CertificateCertificatePolicyLifetimeActionActionArgs();
        }

        public Builder(CertificateCertificatePolicyLifetimeActionActionArgs defaults) {
            $ = new CertificateCertificatePolicyLifetimeActionActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        public CertificateCertificatePolicyLifetimeActionActionArgs build() {
            $.actionType = Objects.requireNonNull($.actionType, "expected parameter 'actionType' to be non-null");
            return $;
        }
    }

}
