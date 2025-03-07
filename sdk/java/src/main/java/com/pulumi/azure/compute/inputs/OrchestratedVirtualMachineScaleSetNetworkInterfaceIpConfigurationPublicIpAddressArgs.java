// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs Empty = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs();

    /**
     * The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine. Valid values must be between `1` and `26` characters long, start with a lower case letter, end with a lower case letter or number and contains only `a-z`, `0-9` and `hyphens`.
     * 
     */
    @Import(name="domainNameLabel")
    private @Nullable Output<String> domainNameLabel;

    /**
     * @return The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine. Valid values must be between `1` and `26` characters long, start with a lower case letter, end with a lower case letter or number and contains only `a-z`, `0-9` and `hyphens`.
     * 
     */
    public Optional<Output<String>> domainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }

    /**
     * The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="ipTags")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>> ipTags;

    /**
     * @return One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>>> ipTags() {
        return Optional.ofNullable(this.ipTags);
    }

    /**
     * The Name of the Public IP Address Configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name of the Public IP Address Configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publicIpPrefixId")
    private @Nullable Output<String> publicIpPrefixId;

    /**
     * @return The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> publicIpPrefixId() {
        return Optional.ofNullable(this.publicIpPrefixId);
    }

    /**
     * Specifies what Public IP Address SKU the Public IP Address should be provisioned as. Possible vaules include `Basic_Regional`, `Basic_Global`, `Standard_Regional` or `Standard_Global`. For more information about Public IP Address SKU&#39;s and their capabilities, please see the [product documentation](https://docs.microsoft.com/azure/virtual-network/ip-services/public-ip-addresses#sku). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return Specifies what Public IP Address SKU the Public IP Address should be provisioned as. Possible vaules include `Basic_Regional`, `Basic_Global`, `Standard_Regional` or `Standard_Global`. For more information about Public IP Address SKU&#39;s and their capabilities, please see the [product documentation](https://docs.microsoft.com/azure/virtual-network/ip-services/public-ip-addresses#sku). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The Internet Protocol Version which should be used for this public IP address. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Internet Protocol Version which should be used for this public IP address. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs() {}

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs $) {
        this.domainNameLabel = $.domainNameLabel;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.ipTags = $.ipTags;
        this.name = $.name;
        this.publicIpPrefixId = $.publicIpPrefixId;
        this.skuName = $.skuName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNameLabel The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine. Valid values must be between `1` and `26` characters long, start with a lower case letter, end with a lower case letter or number and contains only `a-z`, `0-9` and `hyphens`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameLabel(@Nullable Output<String> domainNameLabel) {
            $.domainNameLabel = domainNameLabel;
            return this;
        }

        /**
         * @param domainNameLabel The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine. Valid values must be between `1` and `26` characters long, start with a lower case letter, end with a lower case letter or number and contains only `a-z`, `0-9` and `hyphens`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameLabel(String domainNameLabel) {
            return domainNameLabel(Output.of(domainNameLabel));
        }

        /**
         * @param idleTimeoutInMinutes The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param ipTags One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipTags(@Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>> ipTags) {
            $.ipTags = ipTags;
            return this;
        }

        /**
         * @param ipTags One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipTags(List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs> ipTags) {
            return ipTags(Output.of(ipTags));
        }

        /**
         * @param ipTags One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder ipTags(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs... ipTags) {
            return ipTags(List.of(ipTags));
        }

        /**
         * @param name The Name of the Public IP Address Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the Public IP Address Configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicIpPrefixId The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixId(@Nullable Output<String> publicIpPrefixId) {
            $.publicIpPrefixId = publicIpPrefixId;
            return this;
        }

        /**
         * @param publicIpPrefixId The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpPrefixId(String publicIpPrefixId) {
            return publicIpPrefixId(Output.of(publicIpPrefixId));
        }

        /**
         * @param skuName Specifies what Public IP Address SKU the Public IP Address should be provisioned as. Possible vaules include `Basic_Regional`, `Basic_Global`, `Standard_Regional` or `Standard_Global`. For more information about Public IP Address SKU&#39;s and their capabilities, please see the [product documentation](https://docs.microsoft.com/azure/virtual-network/ip-services/public-ip-addresses#sku). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName Specifies what Public IP Address SKU the Public IP Address should be provisioned as. Possible vaules include `Basic_Regional`, `Basic_Global`, `Standard_Regional` or `Standard_Global`. For more information about Public IP Address SKU&#39;s and their capabilities, please see the [product documentation](https://docs.microsoft.com/azure/virtual-network/ip-services/public-ip-addresses#sku). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param version The Internet Protocol Version which should be used for this public IP address. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Internet Protocol Version which should be used for this public IP address. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
