// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionJavascriptUdaInput {
    /**
     * @return Is this input parameter a configuration parameter? Defaults to `false`.
     * 
     */
    private @Nullable Boolean configurationParameter;
    /**
     * @return The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    private String type;

    private FunctionJavascriptUdaInput() {}
    /**
     * @return Is this input parameter a configuration parameter? Defaults to `false`.
     * 
     */
    public Optional<Boolean> configurationParameter() {
        return Optional.ofNullable(this.configurationParameter);
    }
    /**
     * @return The input data type of this JavaScript Function. Possible values include `any`, `array`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionJavascriptUdaInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean configurationParameter;
        private String type;
        public Builder() {}
        public Builder(FunctionJavascriptUdaInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationParameter = defaults.configurationParameter;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder configurationParameter(@Nullable Boolean configurationParameter) {
            this.configurationParameter = configurationParameter;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FunctionJavascriptUdaInput build() {
            final var _resultValue = new FunctionJavascriptUdaInput();
            _resultValue.configurationParameter = configurationParameter;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
