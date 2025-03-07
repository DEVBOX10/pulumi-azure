// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkspaceCustomParameters {
    /**
     * @return The ID of a Azure Machine Learning workspace to link with Databricks workspace. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String machineLearningWorkspaceId;
    /**
     * @return Name of the NAT gateway for Secure Cluster Connectivity (No Public IP) workspace subnets. Defaults to `nat-gateway`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String natGatewayName;
    /**
     * @return Are public IP Addresses not allowed? Possible values are `true` or `false`. Defaults to `false`.
     * 
     * &gt; **NOTE** Updating `no_public_ip` parameter is only allowed if the value is changing from `false` to `true` and and only for VNet-injected workspaces.
     * 
     */
    private @Nullable Boolean noPublicIp;
    /**
     * @return The name of the Private Subnet within the Virtual Network. Required if `virtual_network_id` is set. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String privateSubnetName;
    /**
     * @return The resource ID of the `azure.network.SubnetNetworkSecurityGroupAssociation` resource which is referred to by the `private_subnet_name` field. This is the same as the ID of the subnet referred to by the `private_subnet_name` field. Required if `virtual_network_id` is set.
     * 
     */
    private @Nullable String privateSubnetNetworkSecurityGroupAssociationId;
    /**
     * @return Name of the Public IP for No Public IP workspace with managed vNet. Defaults to `nat-gw-public-ip`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String publicIpName;
    /**
     * @return The name of the Public Subnet within the Virtual Network. Required if `virtual_network_id` is set. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String publicSubnetName;
    /**
     * @return The resource ID of the `azure.network.SubnetNetworkSecurityGroupAssociation` resource which is referred to by the `public_subnet_name` field. This is the same as the ID of the subnet referred to by the `public_subnet_name` field. Required if `virtual_network_id` is set.
     * 
     */
    private @Nullable String publicSubnetNetworkSecurityGroupAssociationId;
    /**
     * @return Default Databricks File Storage account name. Defaults to a randomized name(e.g. `dbstoragel6mfeghoe5kxu`). Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String storageAccountName;
    /**
     * @return Storage account SKU name. Possible values include `Standard_LRS`, `Standard_GRS`, `Standard_RAGRS`, `Standard_GZRS`, `Standard_RAGZRS`, `Standard_ZRS`, `Premium_LRS` or `Premium_ZRS`. Defaults to `Standard_GRS`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String storageAccountSkuName;
    /**
     * @return The ID of a Virtual Network where this Databricks Cluster should be created. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String virtualNetworkId;
    /**
     * @return Address prefix for Managed virtual network. Defaults to `10.139`. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** Databricks requires that a network security group is associated with the `public` and `private` subnets when a `virtual_network_id` has been defined. Both `public` and `private` subnets must be delegated to `Microsoft.Databricks/workspaces`. For more information about subnet delegation see the [product documentation](https://docs.microsoft.com/azure/virtual-network/subnet-delegation-overview).
     * 
     */
    private @Nullable String vnetAddressPrefix;

    private WorkspaceCustomParameters() {}
    /**
     * @return The ID of a Azure Machine Learning workspace to link with Databricks workspace. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> machineLearningWorkspaceId() {
        return Optional.ofNullable(this.machineLearningWorkspaceId);
    }
    /**
     * @return Name of the NAT gateway for Secure Cluster Connectivity (No Public IP) workspace subnets. Defaults to `nat-gateway`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> natGatewayName() {
        return Optional.ofNullable(this.natGatewayName);
    }
    /**
     * @return Are public IP Addresses not allowed? Possible values are `true` or `false`. Defaults to `false`.
     * 
     * &gt; **NOTE** Updating `no_public_ip` parameter is only allowed if the value is changing from `false` to `true` and and only for VNet-injected workspaces.
     * 
     */
    public Optional<Boolean> noPublicIp() {
        return Optional.ofNullable(this.noPublicIp);
    }
    /**
     * @return The name of the Private Subnet within the Virtual Network. Required if `virtual_network_id` is set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> privateSubnetName() {
        return Optional.ofNullable(this.privateSubnetName);
    }
    /**
     * @return The resource ID of the `azure.network.SubnetNetworkSecurityGroupAssociation` resource which is referred to by the `private_subnet_name` field. This is the same as the ID of the subnet referred to by the `private_subnet_name` field. Required if `virtual_network_id` is set.
     * 
     */
    public Optional<String> privateSubnetNetworkSecurityGroupAssociationId() {
        return Optional.ofNullable(this.privateSubnetNetworkSecurityGroupAssociationId);
    }
    /**
     * @return Name of the Public IP for No Public IP workspace with managed vNet. Defaults to `nat-gw-public-ip`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> publicIpName() {
        return Optional.ofNullable(this.publicIpName);
    }
    /**
     * @return The name of the Public Subnet within the Virtual Network. Required if `virtual_network_id` is set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> publicSubnetName() {
        return Optional.ofNullable(this.publicSubnetName);
    }
    /**
     * @return The resource ID of the `azure.network.SubnetNetworkSecurityGroupAssociation` resource which is referred to by the `public_subnet_name` field. This is the same as the ID of the subnet referred to by the `public_subnet_name` field. Required if `virtual_network_id` is set.
     * 
     */
    public Optional<String> publicSubnetNetworkSecurityGroupAssociationId() {
        return Optional.ofNullable(this.publicSubnetNetworkSecurityGroupAssociationId);
    }
    /**
     * @return Default Databricks File Storage account name. Defaults to a randomized name(e.g. `dbstoragel6mfeghoe5kxu`). Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * @return Storage account SKU name. Possible values include `Standard_LRS`, `Standard_GRS`, `Standard_RAGRS`, `Standard_GZRS`, `Standard_RAGZRS`, `Standard_ZRS`, `Premium_LRS` or `Premium_ZRS`. Defaults to `Standard_GRS`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> storageAccountSkuName() {
        return Optional.ofNullable(this.storageAccountSkuName);
    }
    /**
     * @return The ID of a Virtual Network where this Databricks Cluster should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }
    /**
     * @return Address prefix for Managed virtual network. Defaults to `10.139`. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** Databricks requires that a network security group is associated with the `public` and `private` subnets when a `virtual_network_id` has been defined. Both `public` and `private` subnets must be delegated to `Microsoft.Databricks/workspaces`. For more information about subnet delegation see the [product documentation](https://docs.microsoft.com/azure/virtual-network/subnet-delegation-overview).
     * 
     */
    public Optional<String> vnetAddressPrefix() {
        return Optional.ofNullable(this.vnetAddressPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String machineLearningWorkspaceId;
        private @Nullable String natGatewayName;
        private @Nullable Boolean noPublicIp;
        private @Nullable String privateSubnetName;
        private @Nullable String privateSubnetNetworkSecurityGroupAssociationId;
        private @Nullable String publicIpName;
        private @Nullable String publicSubnetName;
        private @Nullable String publicSubnetNetworkSecurityGroupAssociationId;
        private @Nullable String storageAccountName;
        private @Nullable String storageAccountSkuName;
        private @Nullable String virtualNetworkId;
        private @Nullable String vnetAddressPrefix;
        public Builder() {}
        public Builder(WorkspaceCustomParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineLearningWorkspaceId = defaults.machineLearningWorkspaceId;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.privateSubnetName = defaults.privateSubnetName;
    	      this.privateSubnetNetworkSecurityGroupAssociationId = defaults.privateSubnetNetworkSecurityGroupAssociationId;
    	      this.publicIpName = defaults.publicIpName;
    	      this.publicSubnetName = defaults.publicSubnetName;
    	      this.publicSubnetNetworkSecurityGroupAssociationId = defaults.publicSubnetNetworkSecurityGroupAssociationId;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageAccountSkuName = defaults.storageAccountSkuName;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
    	      this.vnetAddressPrefix = defaults.vnetAddressPrefix;
        }

        @CustomType.Setter
        public Builder machineLearningWorkspaceId(@Nullable String machineLearningWorkspaceId) {
            this.machineLearningWorkspaceId = machineLearningWorkspaceId;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayName(@Nullable String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        @CustomType.Setter
        public Builder noPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }
        @CustomType.Setter
        public Builder privateSubnetName(@Nullable String privateSubnetName) {
            this.privateSubnetName = privateSubnetName;
            return this;
        }
        @CustomType.Setter
        public Builder privateSubnetNetworkSecurityGroupAssociationId(@Nullable String privateSubnetNetworkSecurityGroupAssociationId) {
            this.privateSubnetNetworkSecurityGroupAssociationId = privateSubnetNetworkSecurityGroupAssociationId;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpName(@Nullable String publicIpName) {
            this.publicIpName = publicIpName;
            return this;
        }
        @CustomType.Setter
        public Builder publicSubnetName(@Nullable String publicSubnetName) {
            this.publicSubnetName = publicSubnetName;
            return this;
        }
        @CustomType.Setter
        public Builder publicSubnetNetworkSecurityGroupAssociationId(@Nullable String publicSubnetNetworkSecurityGroupAssociationId) {
            this.publicSubnetNetworkSecurityGroupAssociationId = publicSubnetNetworkSecurityGroupAssociationId;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountSkuName(@Nullable String storageAccountSkuName) {
            this.storageAccountSkuName = storageAccountSkuName;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder vnetAddressPrefix(@Nullable String vnetAddressPrefix) {
            this.vnetAddressPrefix = vnetAddressPrefix;
            return this;
        }
        public WorkspaceCustomParameters build() {
            final var _resultValue = new WorkspaceCustomParameters();
            _resultValue.machineLearningWorkspaceId = machineLearningWorkspaceId;
            _resultValue.natGatewayName = natGatewayName;
            _resultValue.noPublicIp = noPublicIp;
            _resultValue.privateSubnetName = privateSubnetName;
            _resultValue.privateSubnetNetworkSecurityGroupAssociationId = privateSubnetNetworkSecurityGroupAssociationId;
            _resultValue.publicIpName = publicIpName;
            _resultValue.publicSubnetName = publicSubnetName;
            _resultValue.publicSubnetNetworkSecurityGroupAssociationId = publicSubnetNetworkSecurityGroupAssociationId;
            _resultValue.storageAccountName = storageAccountName;
            _resultValue.storageAccountSkuName = storageAccountSkuName;
            _resultValue.virtualNetworkId = virtualNetworkId;
            _resultValue.vnetAddressPrefix = vnetAddressPrefix;
            return _resultValue;
        }
    }
}
