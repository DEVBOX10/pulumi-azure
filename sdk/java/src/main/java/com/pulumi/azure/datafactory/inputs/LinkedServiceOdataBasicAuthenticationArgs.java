// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LinkedServiceOdataBasicAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceOdataBasicAuthenticationArgs Empty = new LinkedServiceOdataBasicAuthenticationArgs();

    /**
     * The password associated with the username, which can be used to authenticate to the OData endpoint.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password associated with the username, which can be used to authenticate to the OData endpoint.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The username which can be used to authenticate to the OData endpoint.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username which can be used to authenticate to the OData endpoint.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private LinkedServiceOdataBasicAuthenticationArgs() {}

    private LinkedServiceOdataBasicAuthenticationArgs(LinkedServiceOdataBasicAuthenticationArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceOdataBasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceOdataBasicAuthenticationArgs $;

        public Builder() {
            $ = new LinkedServiceOdataBasicAuthenticationArgs();
        }

        public Builder(LinkedServiceOdataBasicAuthenticationArgs defaults) {
            $ = new LinkedServiceOdataBasicAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password associated with the username, which can be used to authenticate to the OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password associated with the username, which can be used to authenticate to the OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The username which can be used to authenticate to the OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username which can be used to authenticate to the OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public LinkedServiceOdataBasicAuthenticationArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
