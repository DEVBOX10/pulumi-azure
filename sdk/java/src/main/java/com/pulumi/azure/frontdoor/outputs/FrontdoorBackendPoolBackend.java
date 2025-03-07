// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorBackendPoolBackend {
    /**
     * @return Location of the backend (IP address or FQDN)
     * 
     */
    private String address;
    /**
     * @return Specifies if the backend is enabled or not. Valid options are `true` or `false`. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The value to use as the host header sent to the backend.
     * 
     */
    private String hostHeader;
    /**
     * @return The HTTP TCP port number. Possible values are between `1` - `65535`.
     * 
     */
    private Integer httpPort;
    /**
     * @return The HTTPS TCP port number. Possible values are between `1` - `65535`.
     * 
     */
    private Integer httpsPort;
    /**
     * @return Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy. Defaults to `1`.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return Weight of this endpoint for load balancing purposes. Defaults to `50`.
     * 
     */
    private @Nullable Integer weight;

    private FrontdoorBackendPoolBackend() {}
    /**
     * @return Location of the backend (IP address or FQDN)
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Specifies if the backend is enabled or not. Valid options are `true` or `false`. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The value to use as the host header sent to the backend.
     * 
     */
    public String hostHeader() {
        return this.hostHeader;
    }
    /**
     * @return The HTTP TCP port number. Possible values are between `1` - `65535`.
     * 
     */
    public Integer httpPort() {
        return this.httpPort;
    }
    /**
     * @return The HTTPS TCP port number. Possible values are between `1` - `65535`.
     * 
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }
    /**
     * @return Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy. Defaults to `1`.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return Weight of this endpoint for load balancing purposes. Defaults to `50`.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorBackendPoolBackend defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private @Nullable Boolean enabled;
        private String hostHeader;
        private Integer httpPort;
        private Integer httpsPort;
        private @Nullable Integer priority;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(FrontdoorBackendPoolBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.enabled = defaults.enabled;
    	      this.hostHeader = defaults.hostHeader;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder hostHeader(String hostHeader) {
            this.hostHeader = Objects.requireNonNull(hostHeader);
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(Integer httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }
        @CustomType.Setter
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public FrontdoorBackendPoolBackend build() {
            final var _resultValue = new FrontdoorBackendPoolBackend();
            _resultValue.address = address;
            _resultValue.enabled = enabled;
            _resultValue.hostHeader = hostHeader;
            _resultValue.httpPort = httpPort;
            _resultValue.httpsPort = httpsPort;
            _resultValue.priority = priority;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
