// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiagnosticSettingEnabledLogRetentionPolicy {
    /**
     * @return The number of days for which this Retention Policy should apply.
     * 
     * &gt; **NOTE:** Setting this to `0` will retain the events indefinitely.
     * 
     */
    private @Nullable Integer days;
    /**
     * @return Is this Retention Policy enabled?
     * 
     */
    private Boolean enabled;

    private DiagnosticSettingEnabledLogRetentionPolicy() {}
    /**
     * @return The number of days for which this Retention Policy should apply.
     * 
     * &gt; **NOTE:** Setting this to `0` will retain the events indefinitely.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return Is this Retention Policy enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticSettingEnabledLogRetentionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer days;
        private Boolean enabled;
        public Builder() {}
        public Builder(DiagnosticSettingEnabledLogRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public DiagnosticSettingEnabledLogRetentionPolicy build() {
            final var _resultValue = new DiagnosticSettingEnabledLogRetentionPolicy();
            _resultValue.days = days;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
