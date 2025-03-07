// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleDeviceCondition {
    /**
     * @return Valid values are `Desktop` and `Mobile`.
     * 
     */
    private List<String> matchValues;
    /**
     * @return Defaults to `false`.
     * 
     */
    private @Nullable Boolean negateCondition;
    /**
     * @return Valid values are `Equal`.
     * 
     */
    private @Nullable String operator;

    private EndpointDeliveryRuleDeviceCondition() {}
    /**
     * @return Valid values are `Desktop` and `Mobile`.
     * 
     */
    public List<String> matchValues() {
        return this.matchValues;
    }
    /**
     * @return Defaults to `false`.
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return Valid values are `Equal`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleDeviceCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private @Nullable String operator;
        public Builder() {}
        public Builder(EndpointDeliveryRuleDeviceCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
        }

        @CustomType.Setter
        public Builder matchValues(List<String> matchValues) {
            this.matchValues = Objects.requireNonNull(matchValues);
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        @CustomType.Setter
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public EndpointDeliveryRuleDeviceCondition build() {
            final var _resultValue = new EndpointDeliveryRuleDeviceCondition();
            _resultValue.matchValues = matchValues;
            _resultValue.negateCondition = negateCondition;
            _resultValue.operator = operator;
            return _resultValue;
        }
    }
}
