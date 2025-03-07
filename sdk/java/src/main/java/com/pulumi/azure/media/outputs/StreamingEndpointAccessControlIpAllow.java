// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingEndpointAccessControlIpAllow {
    /**
     * @return The IP address to allow.
     * 
     */
    private @Nullable String address;
    /**
     * @return The friendly name for the IP address range.
     * 
     */
    private @Nullable String name;
    /**
     * @return The subnet mask prefix length (see CIDR notation).
     * 
     */
    private @Nullable Integer subnetPrefixLength;

    private StreamingEndpointAccessControlIpAllow() {}
    /**
     * @return The IP address to allow.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The friendly name for the IP address range.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The subnet mask prefix length (see CIDR notation).
     * 
     */
    public Optional<Integer> subnetPrefixLength() {
        return Optional.ofNullable(this.subnetPrefixLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingEndpointAccessControlIpAllow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String name;
        private @Nullable Integer subnetPrefixLength;
        public Builder() {}
        public Builder(StreamingEndpointAccessControlIpAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.subnetPrefixLength = defaults.subnetPrefixLength;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder subnetPrefixLength(@Nullable Integer subnetPrefixLength) {
            this.subnetPrefixLength = subnetPrefixLength;
            return this;
        }
        public StreamingEndpointAccessControlIpAllow build() {
            final var _resultValue = new StreamingEndpointAccessControlIpAllow();
            _resultValue.address = address;
            _resultValue.name = name;
            _resultValue.subnetPrefixLength = subnetPrefixLength;
            return _resultValue;
        }
    }
}
