// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTxtRecordRecord {
    /**
     * @return The value of the record. Max length: 1024 characters
     * 
     */
    private String value;

    private GetTxtRecordRecord() {}
    /**
     * @return The value of the record. Max length: 1024 characters
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTxtRecordRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(GetTxtRecordRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetTxtRecordRecord build() {
            final var _resultValue = new GetTxtRecordRecord();
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
