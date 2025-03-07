// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupContainerGpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupContainerGpuArgs Empty = new GroupContainerGpuArgs();

    /**
     * The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    private GroupContainerGpuArgs() {}

    private GroupContainerGpuArgs(GroupContainerGpuArgs $) {
        this.count = $.count;
        this.sku = $.sku;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupContainerGpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupContainerGpuArgs $;

        public Builder() {
            $ = new GroupContainerGpuArgs();
        }

        public Builder(GroupContainerGpuArgs defaults) {
            $ = new GroupContainerGpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of GPUs which should be assigned to this container. Allowed values are `1`, `2`, or `4`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param sku The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU which should be used for the GPU. Possible values are `K80`, `P100`, or `V100`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        public GroupContainerGpuArgs build() {
            return $;
        }
    }

}
