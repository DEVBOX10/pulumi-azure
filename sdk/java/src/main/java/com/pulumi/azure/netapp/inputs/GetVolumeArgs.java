// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * The name of the NetApp account where the NetApp pool exists.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the NetApp account where the NetApp pool exists.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the NetApp Volume.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the NetApp Volume.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the NetApp pool where the NetApp volume exists.
     * 
     */
    @Import(name="poolName", required=true)
    private Output<String> poolName;

    /**
     * @return The name of the NetApp pool where the NetApp volume exists.
     * 
     */
    public Output<String> poolName() {
        return this.poolName;
    }

    /**
     * The Name of the Resource Group where the NetApp Volume exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the NetApp Volume exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Volume security style
     * 
     */
    @Import(name="securityStyle")
    private @Nullable Output<String> securityStyle;

    /**
     * @return Volume security style
     * 
     */
    public Optional<Output<String>> securityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }

    private GetVolumeArgs() {}

    private GetVolumeArgs(GetVolumeArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
        this.poolName = $.poolName;
        this.resourceGroupName = $.resourceGroupName;
        this.securityStyle = $.securityStyle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeArgs $;

        public Builder() {
            $ = new GetVolumeArgs();
        }

        public Builder(GetVolumeArgs defaults) {
            $ = new GetVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account where the NetApp pool exists.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the NetApp account where the NetApp pool exists.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param name The name of the NetApp Volume.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the NetApp Volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param poolName The name of the NetApp pool where the NetApp volume exists.
         * 
         * @return builder
         * 
         */
        public Builder poolName(Output<String> poolName) {
            $.poolName = poolName;
            return this;
        }

        /**
         * @param poolName The name of the NetApp pool where the NetApp volume exists.
         * 
         * @return builder
         * 
         */
        public Builder poolName(String poolName) {
            return poolName(Output.of(poolName));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the NetApp Volume exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the NetApp Volume exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityStyle Volume security style
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(@Nullable Output<String> securityStyle) {
            $.securityStyle = securityStyle;
            return this;
        }

        /**
         * @param securityStyle Volume security style
         * 
         * @return builder
         * 
         */
        public Builder securityStyle(String securityStyle) {
            return securityStyle(Output.of(securityStyle));
        }

        public GetVolumeArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.poolName = Objects.requireNonNull($.poolName, "expected parameter 'poolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
