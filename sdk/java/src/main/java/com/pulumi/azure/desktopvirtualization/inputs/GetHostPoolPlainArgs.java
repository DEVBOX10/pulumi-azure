// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHostPoolPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostPoolPlainArgs Empty = new GetHostPoolPlainArgs();

    /**
     * The name of the Virtual Desktop Host Pool to retrieve.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Virtual Desktop Host Pool to retrieve.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group where the Virtual Desktop Host Pool exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the Virtual Desktop Host Pool exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetHostPoolPlainArgs() {}

    private GetHostPoolPlainArgs(GetHostPoolPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostPoolPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostPoolPlainArgs $;

        public Builder() {
            $ = new GetHostPoolPlainArgs();
        }

        public Builder(GetHostPoolPlainArgs defaults) {
            $ = new GetHostPoolPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Virtual Desktop Host Pool to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Virtual Desktop Host Pool exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHostPoolPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
