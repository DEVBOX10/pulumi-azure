// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FirewallApplicationRuleCollectionRuleProtocolArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallApplicationRuleCollectionRuleProtocolArgs Empty = new FirewallApplicationRuleCollectionRuleProtocolArgs();

    /**
     * Specify a port for the connection.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return Specify a port for the connection.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Specifies the type of connection. Possible values are `Http`, `Https` and `Mssql`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of connection. Possible values are `Http`, `Https` and `Mssql`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FirewallApplicationRuleCollectionRuleProtocolArgs() {}

    private FirewallApplicationRuleCollectionRuleProtocolArgs(FirewallApplicationRuleCollectionRuleProtocolArgs $) {
        this.port = $.port;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallApplicationRuleCollectionRuleProtocolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallApplicationRuleCollectionRuleProtocolArgs $;

        public Builder() {
            $ = new FirewallApplicationRuleCollectionRuleProtocolArgs();
        }

        public Builder(FirewallApplicationRuleCollectionRuleProtocolArgs defaults) {
            $ = new FirewallApplicationRuleCollectionRuleProtocolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port Specify a port for the connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Specify a port for the connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param type Specifies the type of connection. Possible values are `Http`, `Https` and `Mssql`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of connection. Possible values are `Http`, `Https` and `Mssql`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FirewallApplicationRuleCollectionRuleProtocolArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
