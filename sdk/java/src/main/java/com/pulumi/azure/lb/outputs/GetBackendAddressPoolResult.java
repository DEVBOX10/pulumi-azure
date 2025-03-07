// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.outputs;

import com.pulumi.azure.lb.outputs.GetBackendAddressPoolBackendAddress;
import com.pulumi.azure.lb.outputs.GetBackendAddressPoolBackendIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendAddressPoolResult {
    /**
     * @return A list of `backend_address` block as defined below.
     * 
     */
    private List<GetBackendAddressPoolBackendAddress> backendAddresses;
    /**
     * @return A list of references to IP addresses defined in network interfaces.
     * 
     */
    private List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of the Load Balancing Inbound NAT Rules associated with this Backend Address Pool.
     * 
     */
    private List<String> inboundNatRules;
    /**
     * @return A list of the Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    private List<String> loadBalancingRules;
    private String loadbalancerId;
    /**
     * @return The name of the Backend Address.
     * 
     */
    private String name;
    /**
     * @return A list of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    private List<String> outboundRules;

    private GetBackendAddressPoolResult() {}
    /**
     * @return A list of `backend_address` block as defined below.
     * 
     */
    public List<GetBackendAddressPoolBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }
    /**
     * @return A list of references to IP addresses defined in network interfaces.
     * 
     */
    public List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of the Load Balancing Inbound NAT Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> inboundNatRules() {
        return this.inboundNatRules;
    }
    /**
     * @return A list of the Load Balancing Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> loadBalancingRules() {
        return this.loadBalancingRules;
    }
    public String loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * @return The name of the Backend Address.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of the Load Balancing Outbound Rules associated with this Backend Address Pool.
     * 
     */
    public List<String> outboundRules() {
        return this.outboundRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendAddressPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBackendAddressPoolBackendAddress> backendAddresses;
        private List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations;
        private String id;
        private List<String> inboundNatRules;
        private List<String> loadBalancingRules;
        private String loadbalancerId;
        private String name;
        private List<String> outboundRules;
        public Builder() {}
        public Builder(GetBackendAddressPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddresses = defaults.backendAddresses;
    	      this.backendIpConfigurations = defaults.backendIpConfigurations;
    	      this.id = defaults.id;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.loadbalancerId = defaults.loadbalancerId;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
        }

        @CustomType.Setter
        public Builder backendAddresses(List<GetBackendAddressPoolBackendAddress> backendAddresses) {
            this.backendAddresses = Objects.requireNonNull(backendAddresses);
            return this;
        }
        public Builder backendAddresses(GetBackendAddressPoolBackendAddress... backendAddresses) {
            return backendAddresses(List.of(backendAddresses));
        }
        @CustomType.Setter
        public Builder backendIpConfigurations(List<GetBackendAddressPoolBackendIpConfiguration> backendIpConfigurations) {
            this.backendIpConfigurations = Objects.requireNonNull(backendIpConfigurations);
            return this;
        }
        public Builder backendIpConfigurations(GetBackendAddressPoolBackendIpConfiguration... backendIpConfigurations) {
            return backendIpConfigurations(List.of(backendIpConfigurations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder inboundNatRules(List<String> inboundNatRules) {
            this.inboundNatRules = Objects.requireNonNull(inboundNatRules);
            return this;
        }
        public Builder inboundNatRules(String... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }
        @CustomType.Setter
        public Builder loadBalancingRules(List<String> loadBalancingRules) {
            this.loadBalancingRules = Objects.requireNonNull(loadBalancingRules);
            return this;
        }
        public Builder loadBalancingRules(String... loadBalancingRules) {
            return loadBalancingRules(List.of(loadBalancingRules));
        }
        @CustomType.Setter
        public Builder loadbalancerId(String loadbalancerId) {
            this.loadbalancerId = Objects.requireNonNull(loadbalancerId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outboundRules(List<String> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }
        public Builder outboundRules(String... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }
        public GetBackendAddressPoolResult build() {
            final var _resultValue = new GetBackendAddressPoolResult();
            _resultValue.backendAddresses = backendAddresses;
            _resultValue.backendIpConfigurations = backendIpConfigurations;
            _resultValue.id = id;
            _resultValue.inboundNatRules = inboundNatRules;
            _resultValue.loadBalancingRules = loadBalancingRules;
            _resultValue.loadbalancerId = loadbalancerId;
            _resultValue.name = name;
            _resultValue.outboundRules = outboundRules;
            return _resultValue;
        }
    }
}
