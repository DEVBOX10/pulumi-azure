// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceTagsResult {
    /**
     * @return List of address prefixes for the service type (and optionally a specific region).
     * 
     */
    private List<String> addressPrefixes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of IPv4 addresses for the service type (and optionally a specific region)
     * 
     */
    private List<String> ipv4Cidrs;
    /**
     * @return List of IPv6 addresses for the service type (and optionally a specific region)
     * 
     */
    private List<String> ipv6Cidrs;
    private String location;
    private @Nullable String locationFilter;
    /**
     * @return The name of this Service Tags block.
     * 
     */
    private String name;
    private String service;

    private GetServiceTagsResult() {}
    /**
     * @return List of address prefixes for the service type (and optionally a specific region).
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of IPv4 addresses for the service type (and optionally a specific region)
     * 
     */
    public List<String> ipv4Cidrs() {
        return this.ipv4Cidrs;
    }
    /**
     * @return List of IPv6 addresses for the service type (and optionally a specific region)
     * 
     */
    public List<String> ipv6Cidrs() {
        return this.ipv6Cidrs;
    }
    public String location() {
        return this.location;
    }
    public Optional<String> locationFilter() {
        return Optional.ofNullable(this.locationFilter);
    }
    /**
     * @return The name of this Service Tags block.
     * 
     */
    public String name() {
        return this.name;
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addressPrefixes;
        private String id;
        private List<String> ipv4Cidrs;
        private List<String> ipv6Cidrs;
        private String location;
        private @Nullable String locationFilter;
        private String name;
        private String service;
        public Builder() {}
        public Builder(GetServiceTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.id = defaults.id;
    	      this.ipv4Cidrs = defaults.ipv4Cidrs;
    	      this.ipv6Cidrs = defaults.ipv6Cidrs;
    	      this.location = defaults.location;
    	      this.locationFilter = defaults.locationFilter;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder addressPrefixes(List<String> addressPrefixes) {
            this.addressPrefixes = Objects.requireNonNull(addressPrefixes);
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Cidrs(List<String> ipv4Cidrs) {
            this.ipv4Cidrs = Objects.requireNonNull(ipv4Cidrs);
            return this;
        }
        public Builder ipv4Cidrs(String... ipv4Cidrs) {
            return ipv4Cidrs(List.of(ipv4Cidrs));
        }
        @CustomType.Setter
        public Builder ipv6Cidrs(List<String> ipv6Cidrs) {
            this.ipv6Cidrs = Objects.requireNonNull(ipv6Cidrs);
            return this;
        }
        public Builder ipv6Cidrs(String... ipv6Cidrs) {
            return ipv6Cidrs(List.of(ipv6Cidrs));
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder locationFilter(@Nullable String locationFilter) {
            this.locationFilter = locationFilter;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GetServiceTagsResult build() {
            final var _resultValue = new GetServiceTagsResult();
            _resultValue.addressPrefixes = addressPrefixes;
            _resultValue.id = id;
            _resultValue.ipv4Cidrs = ipv4Cidrs;
            _resultValue.ipv6Cidrs = ipv6Cidrs;
            _resultValue.location = location;
            _resultValue.locationFilter = locationFilter;
            _resultValue.name = name;
            _resultValue.service = service;
            return _resultValue;
        }
    }
}
