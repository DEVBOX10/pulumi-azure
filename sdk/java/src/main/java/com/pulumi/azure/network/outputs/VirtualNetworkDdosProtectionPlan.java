// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkDdosProtectionPlan {
    /**
     * @return Enable/disable DDoS Protection Plan on Virtual Network.
     * 
     */
    private Boolean enable;
    /**
     * @return The ID of DDoS Protection Plan.
     * 
     */
    private String id;

    private VirtualNetworkDdosProtectionPlan() {}
    /**
     * @return Enable/disable DDoS Protection Plan on Virtual Network.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * @return The ID of DDoS Protection Plan.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkDdosProtectionPlan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        private String id;
        public Builder() {}
        public Builder(VirtualNetworkDdosProtectionPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public VirtualNetworkDdosProtectionPlan build() {
            final var _resultValue = new VirtualNetworkDdosProtectionPlan();
            _resultValue.enable = enable;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
