// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnGatewayConnectionVpnLinkCustomBgpAddress {
    /**
     * @return The custom bgp ip address which belongs to the IP Configuration.
     * 
     */
    private String ipAddress;
    /**
     * @return The ID of the IP Configuration which belongs to the VPN Gateway.
     * 
     */
    private String ipConfigurationId;

    private VpnGatewayConnectionVpnLinkCustomBgpAddress() {}
    /**
     * @return The custom bgp ip address which belongs to the IP Configuration.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The ID of the IP Configuration which belongs to the VPN Gateway.
     * 
     */
    public String ipConfigurationId() {
        return this.ipConfigurationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayConnectionVpnLinkCustomBgpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private String ipConfigurationId;
        public Builder() {}
        public Builder(VpnGatewayConnectionVpnLinkCustomBgpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurationId(String ipConfigurationId) {
            this.ipConfigurationId = Objects.requireNonNull(ipConfigurationId);
            return this;
        }
        public VpnGatewayConnectionVpnLinkCustomBgpAddress build() {
            final var _resultValue = new VpnGatewayConnectionVpnLinkCustomBgpAddress();
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipConfigurationId = ipConfigurationId;
            return _resultValue;
        }
    }
}
