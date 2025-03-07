// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExpressRouteCircuitPeering {
    /**
     * @return The Either a 16-bit or a 32-bit ASN for Azure.
     * 
     */
    private Integer azureAsn;
    /**
     * @return The Either a 16-bit or a 32-bit ASN. Can either be public or private.
     * 
     */
    private Integer peerAsn;
    /**
     * @return The type of the ExpressRoute Circuit Peering. Acceptable values include `AzurePrivatePeering`, `AzurePublicPeering` and `MicrosoftPeering`. Changing this forces a new resource to be created.
     * 
     */
    private String peeringType;
    /**
     * @return A `/30` subnet for the primary link.
     * 
     */
    private String primaryPeerAddressPrefix;
    /**
     * @return A `/30` subnet for the secondary link.
     * 
     */
    private String secondaryPeerAddressPrefix;
    /**
     * @return The shared key. Can be a maximum of 25 characters.
     * 
     */
    private String sharedKey;
    /**
     * @return A valid VLAN ID to establish this peering on.
     * 
     */
    private Integer vlanId;

    private GetExpressRouteCircuitPeering() {}
    /**
     * @return The Either a 16-bit or a 32-bit ASN for Azure.
     * 
     */
    public Integer azureAsn() {
        return this.azureAsn;
    }
    /**
     * @return The Either a 16-bit or a 32-bit ASN. Can either be public or private.
     * 
     */
    public Integer peerAsn() {
        return this.peerAsn;
    }
    /**
     * @return The type of the ExpressRoute Circuit Peering. Acceptable values include `AzurePrivatePeering`, `AzurePublicPeering` and `MicrosoftPeering`. Changing this forces a new resource to be created.
     * 
     */
    public String peeringType() {
        return this.peeringType;
    }
    /**
     * @return A `/30` subnet for the primary link.
     * 
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }
    /**
     * @return A `/30` subnet for the secondary link.
     * 
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }
    /**
     * @return The shared key. Can be a maximum of 25 characters.
     * 
     */
    public String sharedKey() {
        return this.sharedKey;
    }
    /**
     * @return A valid VLAN ID to establish this peering on.
     * 
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCircuitPeering defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer azureAsn;
        private Integer peerAsn;
        private String peeringType;
        private String primaryPeerAddressPrefix;
        private String secondaryPeerAddressPrefix;
        private String sharedKey;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetExpressRouteCircuitPeering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureAsn = defaults.azureAsn;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder azureAsn(Integer azureAsn) {
            this.azureAsn = Objects.requireNonNull(azureAsn);
            return this;
        }
        @CustomType.Setter
        public Builder peerAsn(Integer peerAsn) {
            this.peerAsn = Objects.requireNonNull(peerAsn);
            return this;
        }
        @CustomType.Setter
        public Builder peeringType(String peeringType) {
            this.peeringType = Objects.requireNonNull(peeringType);
            return this;
        }
        @CustomType.Setter
        public Builder primaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = Objects.requireNonNull(primaryPeerAddressPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = Objects.requireNonNull(secondaryPeerAddressPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder sharedKey(String sharedKey) {
            this.sharedKey = Objects.requireNonNull(sharedKey);
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }
        public GetExpressRouteCircuitPeering build() {
            final var _resultValue = new GetExpressRouteCircuitPeering();
            _resultValue.azureAsn = azureAsn;
            _resultValue.peerAsn = peerAsn;
            _resultValue.peeringType = peeringType;
            _resultValue.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            _resultValue.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            _resultValue.sharedKey = sharedKey;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
