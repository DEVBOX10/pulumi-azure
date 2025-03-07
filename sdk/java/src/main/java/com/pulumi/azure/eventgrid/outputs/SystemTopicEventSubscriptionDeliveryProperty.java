// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SystemTopicEventSubscriptionDeliveryProperty {
    /**
     * @return The name of the header to send on to the destination.
     * 
     */
    private String headerName;
    /**
     * @return Set to `true` if the `value` is a secret and should be protected, otherwise `false`. If `true` then this value won&#39;t be returned from Azure API calls.
     * 
     */
    private @Nullable Boolean secret;
    /**
     * @return If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
     * 
     */
    private @Nullable String sourceField;
    /**
     * @return Either `Static` or `Dynamic`.
     * 
     */
    private String type;
    /**
     * @return If the `type` is `Static`, then provide the value to use.
     * 
     */
    private @Nullable String value;

    private SystemTopicEventSubscriptionDeliveryProperty() {}
    /**
     * @return The name of the header to send on to the destination.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return Set to `true` if the `value` is a secret and should be protected, otherwise `false`. If `true` then this value won&#39;t be returned from Azure API calls.
     * 
     */
    public Optional<Boolean> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * @return If the `type` is `Dynamic`, then provide the payload field to be used as the value. Valid source fields differ by subscription type.
     * 
     */
    public Optional<String> sourceField() {
        return Optional.ofNullable(this.sourceField);
    }
    /**
     * @return Either `Static` or `Dynamic`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return If the `type` is `Static`, then provide the value to use.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemTopicEventSubscriptionDeliveryProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerName;
        private @Nullable Boolean secret;
        private @Nullable String sourceField;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(SystemTopicEventSubscriptionDeliveryProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.secret = defaults.secret;
    	      this.sourceField = defaults.sourceField;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable Boolean secret) {
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder sourceField(@Nullable String sourceField) {
            this.sourceField = sourceField;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public SystemTopicEventSubscriptionDeliveryProperty build() {
            final var _resultValue = new SystemTopicEventSubscriptionDeliveryProperty();
            _resultValue.headerName = headerName;
            _resultValue.secret = secret;
            _resultValue.sourceField = sourceField;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
