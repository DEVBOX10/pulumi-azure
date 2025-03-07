// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.NetworkConnectionMonitorEndpointFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkConnectionMonitorEndpoint {
    /**
     * @return The IP address or domain name of the Network Connection Monitor endpoint.
     * 
     */
    private @Nullable String address;
    /**
     * @return The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
     * 
     */
    private @Nullable String coverageLevel;
    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
     * 
     */
    private @Nullable List<String> excludedIpAddresses;
    /**
     * @return A `filter` block as defined below.
     * 
     */
    private @Nullable NetworkConnectionMonitorEndpointFilter filter;
    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
     * 
     */
    private @Nullable List<String> includedIpAddresses;
    /**
     * @return The name of the endpoint for the Network Connection Monitor .
     * 
     */
    private String name;
    /**
     * @return The resource ID which is used as the endpoint by the Network Connection Monitor.
     * 
     */
    private @Nullable String targetResourceId;
    /**
     * @return The endpoint type of the Network Connection Monitor. Possible values are `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
     * 
     */
    private @Nullable String targetResourceType;

    private NetworkConnectionMonitorEndpoint() {}
    /**
     * @return The IP address or domain name of the Network Connection Monitor endpoint.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The test coverage for the Network Connection Monitor endpoint. Possible values are `AboveAverage`, `Average`, `BelowAverage`, `Default`, `Full` and `Low`.
     * 
     */
    public Optional<String> coverageLevel() {
        return Optional.ofNullable(this.coverageLevel);
    }
    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be excluded to the Network Connection Monitor endpoint.
     * 
     */
    public List<String> excludedIpAddresses() {
        return this.excludedIpAddresses == null ? List.of() : this.excludedIpAddresses;
    }
    /**
     * @return A `filter` block as defined below.
     * 
     */
    public Optional<NetworkConnectionMonitorEndpointFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return A list of IPv4/IPv6 subnet masks or IPv4/IPv6 IP addresses to be included to the Network Connection Monitor endpoint.
     * 
     */
    public List<String> includedIpAddresses() {
        return this.includedIpAddresses == null ? List.of() : this.includedIpAddresses;
    }
    /**
     * @return The name of the endpoint for the Network Connection Monitor .
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource ID which is used as the endpoint by the Network Connection Monitor.
     * 
     */
    public Optional<String> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }
    /**
     * @return The endpoint type of the Network Connection Monitor. Possible values are `AzureSubnet`, `AzureVM`, `AzureVNet`, `ExternalAddress`, `MMAWorkspaceMachine` and `MMAWorkspaceNetwork`.
     * 
     */
    public Optional<String> targetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConnectionMonitorEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String coverageLevel;
        private @Nullable List<String> excludedIpAddresses;
        private @Nullable NetworkConnectionMonitorEndpointFilter filter;
        private @Nullable List<String> includedIpAddresses;
        private String name;
        private @Nullable String targetResourceId;
        private @Nullable String targetResourceType;
        public Builder() {}
        public Builder(NetworkConnectionMonitorEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.coverageLevel = defaults.coverageLevel;
    	      this.excludedIpAddresses = defaults.excludedIpAddresses;
    	      this.filter = defaults.filter;
    	      this.includedIpAddresses = defaults.includedIpAddresses;
    	      this.name = defaults.name;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder coverageLevel(@Nullable String coverageLevel) {
            this.coverageLevel = coverageLevel;
            return this;
        }
        @CustomType.Setter
        public Builder excludedIpAddresses(@Nullable List<String> excludedIpAddresses) {
            this.excludedIpAddresses = excludedIpAddresses;
            return this;
        }
        public Builder excludedIpAddresses(String... excludedIpAddresses) {
            return excludedIpAddresses(List.of(excludedIpAddresses));
        }
        @CustomType.Setter
        public Builder filter(@Nullable NetworkConnectionMonitorEndpointFilter filter) {
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder includedIpAddresses(@Nullable List<String> includedIpAddresses) {
            this.includedIpAddresses = includedIpAddresses;
            return this;
        }
        public Builder includedIpAddresses(String... includedIpAddresses) {
            return includedIpAddresses(List.of(includedIpAddresses));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceType(@Nullable String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public NetworkConnectionMonitorEndpoint build() {
            final var _resultValue = new NetworkConnectionMonitorEndpoint();
            _resultValue.address = address;
            _resultValue.coverageLevel = coverageLevel;
            _resultValue.excludedIpAddresses = excludedIpAddresses;
            _resultValue.filter = filter;
            _resultValue.includedIpAddresses = includedIpAddresses;
            _resultValue.name = name;
            _resultValue.targetResourceId = targetResourceId;
            _resultValue.targetResourceType = targetResourceType;
            return _resultValue;
        }
    }
}
