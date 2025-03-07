// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.AlertProcessingRuleSuppressionScheduleRecurrence;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertProcessingRuleSuppressionSchedule {
    /**
     * @return Specifies the Alert Processing Rule effective start time (Y-m-d&#39;T&#39;H:M:S).
     * 
     */
    private @Nullable String effectiveFrom;
    /**
     * @return Specifies the Alert Processing Rule effective end time (Y-m-d&#39;T&#39;H:M:S).
     * 
     */
    private @Nullable String effectiveUntil;
    /**
     * @return A `recurrence` block as defined above.
     * 
     */
    private @Nullable AlertProcessingRuleSuppressionScheduleRecurrence recurrence;
    /**
     * @return The time zone (e.g. Pacific Standard time, Eastern Standard Time). Defaults to `UTC`. [possible values are defined here](&lt;https://docs.microsoft.com/en-us/previous-versions/windows/embedded/ms912391(v=winembedded.11)&gt;).
     * 
     */
    private @Nullable String timeZone;

    private AlertProcessingRuleSuppressionSchedule() {}
    /**
     * @return Specifies the Alert Processing Rule effective start time (Y-m-d&#39;T&#39;H:M:S).
     * 
     */
    public Optional<String> effectiveFrom() {
        return Optional.ofNullable(this.effectiveFrom);
    }
    /**
     * @return Specifies the Alert Processing Rule effective end time (Y-m-d&#39;T&#39;H:M:S).
     * 
     */
    public Optional<String> effectiveUntil() {
        return Optional.ofNullable(this.effectiveUntil);
    }
    /**
     * @return A `recurrence` block as defined above.
     * 
     */
    public Optional<AlertProcessingRuleSuppressionScheduleRecurrence> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }
    /**
     * @return The time zone (e.g. Pacific Standard time, Eastern Standard Time). Defaults to `UTC`. [possible values are defined here](&lt;https://docs.microsoft.com/en-us/previous-versions/windows/embedded/ms912391(v=winembedded.11)&gt;).
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertProcessingRuleSuppressionSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effectiveFrom;
        private @Nullable String effectiveUntil;
        private @Nullable AlertProcessingRuleSuppressionScheduleRecurrence recurrence;
        private @Nullable String timeZone;
        public Builder() {}
        public Builder(AlertProcessingRuleSuppressionSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveFrom = defaults.effectiveFrom;
    	      this.effectiveUntil = defaults.effectiveUntil;
    	      this.recurrence = defaults.recurrence;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder effectiveFrom(@Nullable String effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveUntil(@Nullable String effectiveUntil) {
            this.effectiveUntil = effectiveUntil;
            return this;
        }
        @CustomType.Setter
        public Builder recurrence(@Nullable AlertProcessingRuleSuppressionScheduleRecurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public AlertProcessingRuleSuppressionSchedule build() {
            final var _resultValue = new AlertProcessingRuleSuppressionSchedule();
            _resultValue.effectiveFrom = effectiveFrom;
            _resultValue.effectiveUntil = effectiveUntil;
            _resultValue.recurrence = recurrence;
            _resultValue.timeZone = timeZone;
            return _resultValue;
        }
    }
}
