// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledQueryRulesAlertArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScheduledQueryRulesAlertArgs Empty = new GetScheduledQueryRulesAlertArgs();

    /**
     * Specifies the name of the scheduled query rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the scheduled query rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group where the scheduled query rule is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group where the scheduled query rule is located.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetScheduledQueryRulesAlertArgs() {}

    private GetScheduledQueryRulesAlertArgs(GetScheduledQueryRulesAlertArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScheduledQueryRulesAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScheduledQueryRulesAlertArgs $;

        public Builder() {
            $ = new GetScheduledQueryRulesAlertArgs();
        }

        public Builder(GetScheduledQueryRulesAlertArgs defaults) {
            $ = new GetScheduledQueryRulesAlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the scheduled query rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the scheduled query rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group where the scheduled query rule is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group where the scheduled query rule is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetScheduledQueryRulesAlertArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
