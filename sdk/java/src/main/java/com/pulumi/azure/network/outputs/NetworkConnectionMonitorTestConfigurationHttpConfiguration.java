// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkConnectionMonitorTestConfigurationHttpConfiguration {
    /**
     * @return The HTTP method for the HTTP request. Possible values are `Get` and `Post`. Defaults to `Get`.
     * 
     */
    private @Nullable String method;
    /**
     * @return The path component of the URI. It only accepts the absolute path.
     * 
     */
    private @Nullable String path;
    /**
     * @return The port for the HTTP connection.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Should HTTPS be preferred over HTTP in cases where the choice is not explicit? Defaults to `false`.
     * 
     */
    private @Nullable Boolean preferHttps;
    /**
     * @return A `request_header` block as defined below.
     * 
     */
    private @Nullable List<NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader> requestHeaders;
    /**
     * @return The HTTP status codes to consider successful. For instance, `2xx`, `301-304` and `418`.
     * 
     */
    private @Nullable List<String> validStatusCodeRanges;

    private NetworkConnectionMonitorTestConfigurationHttpConfiguration() {}
    /**
     * @return The HTTP method for the HTTP request. Possible values are `Get` and `Post`. Defaults to `Get`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The path component of the URI. It only accepts the absolute path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port for the HTTP connection.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Should HTTPS be preferred over HTTP in cases where the choice is not explicit? Defaults to `false`.
     * 
     */
    public Optional<Boolean> preferHttps() {
        return Optional.ofNullable(this.preferHttps);
    }
    /**
     * @return A `request_header` block as defined below.
     * 
     */
    public List<NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader> requestHeaders() {
        return this.requestHeaders == null ? List.of() : this.requestHeaders;
    }
    /**
     * @return The HTTP status codes to consider successful. For instance, `2xx`, `301-304` and `418`.
     * 
     */
    public List<String> validStatusCodeRanges() {
        return this.validStatusCodeRanges == null ? List.of() : this.validStatusCodeRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConnectionMonitorTestConfigurationHttpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String method;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable Boolean preferHttps;
        private @Nullable List<NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader> requestHeaders;
        private @Nullable List<String> validStatusCodeRanges;
        public Builder() {}
        public Builder(NetworkConnectionMonitorTestConfigurationHttpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.preferHttps = defaults.preferHttps;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.validStatusCodeRanges = defaults.validStatusCodeRanges;
        }

        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder preferHttps(@Nullable Boolean preferHttps) {
            this.preferHttps = preferHttps;
            return this;
        }
        @CustomType.Setter
        public Builder requestHeaders(@Nullable List<NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(NetworkConnectionMonitorTestConfigurationHttpConfigurationRequestHeader... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }
        @CustomType.Setter
        public Builder validStatusCodeRanges(@Nullable List<String> validStatusCodeRanges) {
            this.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }
        public Builder validStatusCodeRanges(String... validStatusCodeRanges) {
            return validStatusCodeRanges(List.of(validStatusCodeRanges));
        }
        public NetworkConnectionMonitorTestConfigurationHttpConfiguration build() {
            final var _resultValue = new NetworkConnectionMonitorTestConfigurationHttpConfiguration();
            _resultValue.method = method;
            _resultValue.path = path;
            _resultValue.port = port;
            _resultValue.preferHttps = preferHttps;
            _resultValue.requestHeaders = requestHeaders;
            _resultValue.validStatusCodeRanges = validStatusCodeRanges;
            return _resultValue;
        }
    }
}
