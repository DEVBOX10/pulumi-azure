// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineIdentityArgs Empty = new VirtualMachineIdentityArgs();

    /**
     * Specifies a list of User Assigned Managed Identity IDs to be assigned to this Virtual Machine.
     * 
     * &gt; **NOTE:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Virtual Machine.
     * 
     * &gt; **NOTE:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this Virtual Machine. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     * &gt; **NOTE:** Managed Service Identity previously required the installation of a VM Extension, but this information [is now available via the Azure Instance Metadata Service](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview#how-does-it-work).
     * 
     * &gt; **NOTE:** When `type` is set to `SystemAssigned`, identity the Principal ID can be retrieved after the virtual machine has been created. More details are available below. See [documentation](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview) for additional information.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Virtual Machine. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     * &gt; **NOTE:** Managed Service Identity previously required the installation of a VM Extension, but this information [is now available via the Azure Instance Metadata Service](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview#how-does-it-work).
     * 
     * &gt; **NOTE:** When `type` is set to `SystemAssigned`, identity the Principal ID can be retrieved after the virtual machine has been created. More details are available below. See [documentation](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview) for additional information.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private VirtualMachineIdentityArgs() {}

    private VirtualMachineIdentityArgs(VirtualMachineIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineIdentityArgs $;

        public Builder() {
            $ = new VirtualMachineIdentityArgs();
        }

        public Builder(VirtualMachineIdentityArgs defaults) {
            $ = new VirtualMachineIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Virtual Machine.
         * 
         * &gt; **NOTE:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Virtual Machine.
         * 
         * &gt; **NOTE:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Virtual Machine.
         * 
         * &gt; **NOTE:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Virtual Machine. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * &gt; **NOTE:** Managed Service Identity previously required the installation of a VM Extension, but this information [is now available via the Azure Instance Metadata Service](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview#how-does-it-work).
         * 
         * &gt; **NOTE:** When `type` is set to `SystemAssigned`, identity the Principal ID can be retrieved after the virtual machine has been created. More details are available below. See [documentation](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview) for additional information.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Virtual Machine. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * &gt; **NOTE:** Managed Service Identity previously required the installation of a VM Extension, but this information [is now available via the Azure Instance Metadata Service](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview#how-does-it-work).
         * 
         * &gt; **NOTE:** When `type` is set to `SystemAssigned`, identity the Principal ID can be retrieved after the virtual machine has been created. More details are available below. See [documentation](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview) for additional information.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VirtualMachineIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
