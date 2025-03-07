// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetPacketCaptureFilter {
    /**
     * @return The local IP Address to be filtered on. Specify `127.0.0.1` for a single address entry, `127.0.0.1-127.0.0.255` for a range and `127.0.0.1;127.0.0.5` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String localIpAddress;
    /**
     * @return The local port to be filtered on. Specify `80` for single port entry, `80-85` for a range and `80;443;` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String localPort;
    /**
     * @return The Protocol to be filtered on. Possible values include `Any`, `TCP` and `UDP`. Changing this forces a new resource to be created.
     * 
     */
    private String protocol;
    /**
     * @return The remote IP Address to be filtered on. Specify `127.0.0.1` for a single address entry, `127.0.0.1-127.0.0.255` for a range and `127.0.0.1;127.0.0.5` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String remoteIpAddress;
    /**
     * @return The remote port to be filtered on. Specify `80` for single port entry, `80-85` for a range and `80;443;` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String remotePort;

    private ScaleSetPacketCaptureFilter() {}
    /**
     * @return The local IP Address to be filtered on. Specify `127.0.0.1` for a single address entry, `127.0.0.1-127.0.0.255` for a range and `127.0.0.1;127.0.0.5` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> localIpAddress() {
        return Optional.ofNullable(this.localIpAddress);
    }
    /**
     * @return The local port to be filtered on. Specify `80` for single port entry, `80-85` for a range and `80;443;` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> localPort() {
        return Optional.ofNullable(this.localPort);
    }
    /**
     * @return The Protocol to be filtered on. Possible values include `Any`, `TCP` and `UDP`. Changing this forces a new resource to be created.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The remote IP Address to be filtered on. Specify `127.0.0.1` for a single address entry, `127.0.0.1-127.0.0.255` for a range and `127.0.0.1;127.0.0.5` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> remoteIpAddress() {
        return Optional.ofNullable(this.remoteIpAddress);
    }
    /**
     * @return The remote port to be filtered on. Specify `80` for single port entry, `80-85` for a range and `80;443;` for multiple entries. Multiple ranges and mixing ranges with multiple entries are currently not supported. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> remotePort() {
        return Optional.ofNullable(this.remotePort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetPacketCaptureFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String localIpAddress;
        private @Nullable String localPort;
        private String protocol;
        private @Nullable String remoteIpAddress;
        private @Nullable String remotePort;
        public Builder() {}
        public Builder(ScaleSetPacketCaptureFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localIpAddress = defaults.localIpAddress;
    	      this.localPort = defaults.localPort;
    	      this.protocol = defaults.protocol;
    	      this.remoteIpAddress = defaults.remoteIpAddress;
    	      this.remotePort = defaults.remotePort;
        }

        @CustomType.Setter
        public Builder localIpAddress(@Nullable String localIpAddress) {
            this.localIpAddress = localIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder localPort(@Nullable String localPort) {
            this.localPort = localPort;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder remoteIpAddress(@Nullable String remoteIpAddress) {
            this.remoteIpAddress = remoteIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder remotePort(@Nullable String remotePort) {
            this.remotePort = remotePort;
            return this;
        }
        public ScaleSetPacketCaptureFilter build() {
            final var _resultValue = new ScaleSetPacketCaptureFilter();
            _resultValue.localIpAddress = localIpAddress;
            _resultValue.localPort = localPort;
            _resultValue.protocol = protocol;
            _resultValue.remoteIpAddress = remoteIpAddress;
            _resultValue.remotePort = remotePort;
            return _resultValue;
        }
    }
}
