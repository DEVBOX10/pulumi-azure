// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetNetworkInterfaceIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfaceResult {
    /**
     * @return List of DNS servers applied to the specified Network Interface.
     * 
     */
    private List<String> appliedDnsServers;
    /**
     * @return The list of DNS servers used by the specified Network Interface.
     * 
     */
    private List<String> dnsServers;
    /**
     * @return Indicates if accelerated networking is set on the specified Network Interface.
     * 
     */
    private Boolean enableAcceleratedNetworking;
    /**
     * @return Indicate if IP forwarding is set on the specified Network Interface.
     * 
     */
    private Boolean enableIpForwarding;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The internal DNS name label of the specified Network Interface.
     * 
     */
    private String internalDnsNameLabel;
    /**
     * @return One or more `ip_configuration` blocks as defined below.
     * 
     */
    private List<GetNetworkInterfaceIpConfiguration> ipConfigurations;
    /**
     * @return The location of the specified Network Interface.
     * 
     */
    private String location;
    /**
     * @return The MAC address used by the specified Network Interface.
     * 
     */
    private String macAddress;
    /**
     * @return The name of the IP Configuration.
     * 
     */
    private String name;
    /**
     * @return The ID of the network security group associated to the specified Network Interface.
     * 
     */
    private String networkSecurityGroupId;
    /**
     * @return The Private IP Address assigned to this Network Interface.
     * 
     */
    private String privateIpAddress;
    /**
     * @return The list of private IP addresses associates to the specified Network Interface.
     * 
     */
    private List<String> privateIpAddresses;
    private String resourceGroupName;
    /**
     * @return List the tags associated to the specified Network Interface.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The ID of the virtual machine that the specified Network Interface is attached to.
     * 
     */
    private String virtualMachineId;

    private GetNetworkInterfaceResult() {}
    /**
     * @return List of DNS servers applied to the specified Network Interface.
     * 
     */
    public List<String> appliedDnsServers() {
        return this.appliedDnsServers;
    }
    /**
     * @return The list of DNS servers used by the specified Network Interface.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }
    /**
     * @return Indicates if accelerated networking is set on the specified Network Interface.
     * 
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }
    /**
     * @return Indicate if IP forwarding is set on the specified Network Interface.
     * 
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The internal DNS name label of the specified Network Interface.
     * 
     */
    public String internalDnsNameLabel() {
        return this.internalDnsNameLabel;
    }
    /**
     * @return One or more `ip_configuration` blocks as defined below.
     * 
     */
    public List<GetNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return The location of the specified Network Interface.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The MAC address used by the specified Network Interface.
     * 
     */
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return The name of the IP Configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the network security group associated to the specified Network Interface.
     * 
     */
    public String networkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    /**
     * @return The Private IP Address assigned to this Network Interface.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The list of private IP addresses associates to the specified Network Interface.
     * 
     */
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return List the tags associated to the specified Network Interface.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the virtual machine that the specified Network Interface is attached to.
     * 
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> appliedDnsServers;
        private List<String> dnsServers;
        private Boolean enableAcceleratedNetworking;
        private Boolean enableIpForwarding;
        private String id;
        private String internalDnsNameLabel;
        private List<GetNetworkInterfaceIpConfiguration> ipConfigurations;
        private String location;
        private String macAddress;
        private String name;
        private String networkSecurityGroupId;
        private String privateIpAddress;
        private List<String> privateIpAddresses;
        private String resourceGroupName;
        private Map<String,String> tags;
        private String virtualMachineId;
        public Builder() {}
        public Builder(GetNetworkInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedDnsServers = defaults.appliedDnsServers;
    	      this.dnsServers = defaults.dnsServers;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableIpForwarding = defaults.enableIpForwarding;
    	      this.id = defaults.id;
    	      this.internalDnsNameLabel = defaults.internalDnsNameLabel;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupId = defaults.networkSecurityGroupId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualMachineId = defaults.virtualMachineId;
        }

        @CustomType.Setter
        public Builder appliedDnsServers(List<String> appliedDnsServers) {
            this.appliedDnsServers = Objects.requireNonNull(appliedDnsServers);
            return this;
        }
        public Builder appliedDnsServers(String... appliedDnsServers) {
            return appliedDnsServers(List.of(appliedDnsServers));
        }
        @CustomType.Setter
        public Builder dnsServers(List<String> dnsServers) {
            this.dnsServers = Objects.requireNonNull(dnsServers);
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        @CustomType.Setter
        public Builder enableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = Objects.requireNonNull(enableAcceleratedNetworking);
            return this;
        }
        @CustomType.Setter
        public Builder enableIpForwarding(Boolean enableIpForwarding) {
            this.enableIpForwarding = Objects.requireNonNull(enableIpForwarding);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder internalDnsNameLabel(String internalDnsNameLabel) {
            this.internalDnsNameLabel = Objects.requireNonNull(internalDnsNameLabel);
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurations(List<GetNetworkInterfaceIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(GetNetworkInterfaceIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = Objects.requireNonNull(networkSecurityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            this.privateIpAddresses = Objects.requireNonNull(privateIpAddresses);
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachineId(String virtualMachineId) {
            this.virtualMachineId = Objects.requireNonNull(virtualMachineId);
            return this;
        }
        public GetNetworkInterfaceResult build() {
            final var _resultValue = new GetNetworkInterfaceResult();
            _resultValue.appliedDnsServers = appliedDnsServers;
            _resultValue.dnsServers = dnsServers;
            _resultValue.enableAcceleratedNetworking = enableAcceleratedNetworking;
            _resultValue.enableIpForwarding = enableIpForwarding;
            _resultValue.id = id;
            _resultValue.internalDnsNameLabel = internalDnsNameLabel;
            _resultValue.ipConfigurations = ipConfigurations;
            _resultValue.location = location;
            _resultValue.macAddress = macAddress;
            _resultValue.name = name;
            _resultValue.networkSecurityGroupId = networkSecurityGroupId;
            _resultValue.privateIpAddress = privateIpAddress;
            _resultValue.privateIpAddresses = privateIpAddresses;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            _resultValue.virtualMachineId = virtualMachineId;
            return _resultValue;
        }
    }
}
