// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.billing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnrollmentAccountScopePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnrollmentAccountScopePlainArgs Empty = new GetEnrollmentAccountScopePlainArgs();

    /**
     * The Billing Account Name of the Enterprise Account.
     * 
     */
    @Import(name="billingAccountName", required=true)
    private String billingAccountName;

    /**
     * @return The Billing Account Name of the Enterprise Account.
     * 
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * The Enrollment Account Name in the above Enterprise Account.
     * 
     */
    @Import(name="enrollmentAccountName", required=true)
    private String enrollmentAccountName;

    /**
     * @return The Enrollment Account Name in the above Enterprise Account.
     * 
     */
    public String enrollmentAccountName() {
        return this.enrollmentAccountName;
    }

    private GetEnrollmentAccountScopePlainArgs() {}

    private GetEnrollmentAccountScopePlainArgs(GetEnrollmentAccountScopePlainArgs $) {
        this.billingAccountName = $.billingAccountName;
        this.enrollmentAccountName = $.enrollmentAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnrollmentAccountScopePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnrollmentAccountScopePlainArgs $;

        public Builder() {
            $ = new GetEnrollmentAccountScopePlainArgs();
        }

        public Builder(GetEnrollmentAccountScopePlainArgs defaults) {
            $ = new GetEnrollmentAccountScopePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountName The Billing Account Name of the Enterprise Account.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountName(String billingAccountName) {
            $.billingAccountName = billingAccountName;
            return this;
        }

        /**
         * @param enrollmentAccountName The Enrollment Account Name in the above Enterprise Account.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentAccountName(String enrollmentAccountName) {
            $.enrollmentAccountName = enrollmentAccountName;
            return this;
        }

        public GetEnrollmentAccountScopePlainArgs build() {
            $.billingAccountName = Objects.requireNonNull($.billingAccountName, "expected parameter 'billingAccountName' to be non-null");
            $.enrollmentAccountName = Objects.requireNonNull($.enrollmentAccountName, "expected parameter 'enrollmentAccountName' to be non-null");
            return $;
        }
    }

}
