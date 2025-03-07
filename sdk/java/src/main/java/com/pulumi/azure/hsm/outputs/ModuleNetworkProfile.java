// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hsm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ModuleNetworkProfile {
    /**
     * @return The private IPv4 address of the network interface. Changing this forces a new Dedicated Hardware Security Module to be created.
     * 
     */
    private List<String> networkInterfacePrivateIpAddresses;
    /**
     * @return The ID of the subnet. Changing this forces a new Dedicated Hardware Security Module to be created.
     * 
     */
    private String subnetId;

    private ModuleNetworkProfile() {}
    /**
     * @return The private IPv4 address of the network interface. Changing this forces a new Dedicated Hardware Security Module to be created.
     * 
     */
    public List<String> networkInterfacePrivateIpAddresses() {
        return this.networkInterfacePrivateIpAddresses;
    }
    /**
     * @return The ID of the subnet. Changing this forces a new Dedicated Hardware Security Module to be created.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleNetworkProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> networkInterfacePrivateIpAddresses;
        private String subnetId;
        public Builder() {}
        public Builder(ModuleNetworkProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfacePrivateIpAddresses = defaults.networkInterfacePrivateIpAddresses;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder networkInterfacePrivateIpAddresses(List<String> networkInterfacePrivateIpAddresses) {
            this.networkInterfacePrivateIpAddresses = Objects.requireNonNull(networkInterfacePrivateIpAddresses);
            return this;
        }
        public Builder networkInterfacePrivateIpAddresses(String... networkInterfacePrivateIpAddresses) {
            return networkInterfacePrivateIpAddresses(List.of(networkInterfacePrivateIpAddresses));
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public ModuleNetworkProfile build() {
            final var _resultValue = new ModuleNetworkProfile();
            _resultValue.networkInterfacePrivateIpAddresses = networkInterfacePrivateIpAddresses;
            _resultValue.subnetId = subnetId;
            return _resultValue;
        }
    }
}
