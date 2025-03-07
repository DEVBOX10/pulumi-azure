// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig {
    private Integer port;
    private String publicIpAddressId;

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig() {}
    public Integer port() {
        return this.port;
    }
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String publicIpAddressId;
        public Builder() {}
        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig build() {
            final var _resultValue = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig();
            _resultValue.port = port;
            _resultValue.publicIpAddressId = publicIpAddressId;
            return _resultValue;
        }
    }
}
