// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResolverForwardingRuleTargetDnsServer {
    /**
     * @return The DNS server IP address.
     * 
     */
    private String ipAddress;
    /**
     * @return The DNS server port.
     * 
     */
    private Integer port;

    private GetResolverForwardingRuleTargetDnsServer() {}
    /**
     * @return The DNS server IP address.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The DNS server port.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverForwardingRuleTargetDnsServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private Integer port;
        public Builder() {}
        public Builder(GetResolverForwardingRuleTargetDnsServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public GetResolverForwardingRuleTargetDnsServer build() {
            final var _resultValue = new GetResolverForwardingRuleTargetDnsServer();
            _resultValue.ipAddress = ipAddress;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
