// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResolverForwardingRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverForwardingRulePlainArgs Empty = new GetResolverForwardingRulePlainArgs();

    /**
     * ID of the Private DNS Resolver Forwarding Ruleset.
     * 
     */
    @Import(name="dnsForwardingRulesetId", required=true)
    private String dnsForwardingRulesetId;

    /**
     * @return ID of the Private DNS Resolver Forwarding Ruleset.
     * 
     */
    public String dnsForwardingRulesetId() {
        return this.dnsForwardingRulesetId;
    }

    /**
     * Name of the Private DNS Resolver Forwarding Rule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the Private DNS Resolver Forwarding Rule.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetResolverForwardingRulePlainArgs() {}

    private GetResolverForwardingRulePlainArgs(GetResolverForwardingRulePlainArgs $) {
        this.dnsForwardingRulesetId = $.dnsForwardingRulesetId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverForwardingRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverForwardingRulePlainArgs $;

        public Builder() {
            $ = new GetResolverForwardingRulePlainArgs();
        }

        public Builder(GetResolverForwardingRulePlainArgs defaults) {
            $ = new GetResolverForwardingRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsForwardingRulesetId ID of the Private DNS Resolver Forwarding Ruleset.
         * 
         * @return builder
         * 
         */
        public Builder dnsForwardingRulesetId(String dnsForwardingRulesetId) {
            $.dnsForwardingRulesetId = dnsForwardingRulesetId;
            return this;
        }

        /**
         * @param name Name of the Private DNS Resolver Forwarding Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetResolverForwardingRulePlainArgs build() {
            $.dnsForwardingRulesetId = Objects.requireNonNull($.dnsForwardingRulesetId, "expected parameter 'dnsForwardingRulesetId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
