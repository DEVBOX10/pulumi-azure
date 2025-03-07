// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange {
    /**
     * @return The maximum port number.
     * 
     */
    private Integer maximum;
    /**
     * @return The minimum port number.
     * 
     */
    private Integer minimum;

    private GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange() {}
    /**
     * @return The maximum port number.
     * 
     */
    public Integer maximum() {
        return this.maximum;
    }
    /**
     * @return The minimum port number.
     * 
     */
    public Integer minimum() {
        return this.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maximum;
        private Integer minimum;
        public Builder() {}
        public Builder(GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        @CustomType.Setter
        public Builder maximum(Integer maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        @CustomType.Setter
        public Builder minimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange build() {
            final var _resultValue = new GetNetworkAttachedDataNetworkNetworkAddressPortTranslationPortRange();
            _resultValue.maximum = maximum;
            _resultValue.minimum = minimum;
            return _resultValue;
        }
    }
}
