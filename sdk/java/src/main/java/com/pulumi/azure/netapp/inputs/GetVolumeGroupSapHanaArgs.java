// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeGroupSapHanaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeGroupSapHanaArgs Empty = new GetVolumeGroupSapHanaArgs();

    /**
     * Name of the account where the application volume group belong to.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Name of the account where the application volume group belong to.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of this Application Volume Group for SAP HANA application.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Application Volume Group for SAP HANA application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Application Volume Group exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Application Volume Group exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVolumeGroupSapHanaArgs() {}

    private GetVolumeGroupSapHanaArgs(GetVolumeGroupSapHanaArgs $) {
        this.accountName = $.accountName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeGroupSapHanaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeGroupSapHanaArgs $;

        public Builder() {
            $ = new GetVolumeGroupSapHanaArgs();
        }

        public Builder(GetVolumeGroupSapHanaArgs defaults) {
            $ = new GetVolumeGroupSapHanaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Name of the account where the application volume group belong to.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Name of the account where the application volume group belong to.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param name The name of this Application Volume Group for SAP HANA application.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Application Volume Group for SAP HANA application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Application Volume Group exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Application Volume Group exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetVolumeGroupSapHanaArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
