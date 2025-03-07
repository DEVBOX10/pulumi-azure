// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTopicArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicArgs Empty = new GetTopicArgs();

    /**
     * The name of the EventGrid Topic resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the EventGrid Topic resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group in which the EventGrid Topic exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Topic exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetTopicArgs() {}

    private GetTopicArgs(GetTopicArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicArgs $;

        public Builder() {
            $ = new GetTopicArgs();
        }

        public Builder(GetTopicArgs defaults) {
            $ = new GetTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the EventGrid Topic resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the EventGrid Topic resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Topic exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Topic exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetTopicArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
