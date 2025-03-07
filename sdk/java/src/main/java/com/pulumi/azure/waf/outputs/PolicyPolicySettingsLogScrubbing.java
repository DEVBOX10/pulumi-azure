// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.outputs;

import com.pulumi.azure.waf.outputs.PolicyPolicySettingsLogScrubbingRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPolicySettingsLogScrubbing {
    /**
     * @return Whether the log scrubbing is enabled or disabled. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return One or more `scrubbing_rule` as define below.
     * 
     */
    private @Nullable List<PolicyPolicySettingsLogScrubbingRule> rules;

    private PolicyPolicySettingsLogScrubbing() {}
    /**
     * @return Whether the log scrubbing is enabled or disabled. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return One or more `scrubbing_rule` as define below.
     * 
     */
    public List<PolicyPolicySettingsLogScrubbingRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPolicySettingsLogScrubbing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<PolicyPolicySettingsLogScrubbingRule> rules;
        public Builder() {}
        public Builder(PolicyPolicySettingsLogScrubbing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<PolicyPolicySettingsLogScrubbingRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(PolicyPolicySettingsLogScrubbingRule... rules) {
            return rules(List.of(rules));
        }
        public PolicyPolicySettingsLogScrubbing build() {
            final var _resultValue = new PolicyPolicySettingsLogScrubbing();
            _resultValue.enabled = enabled;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
