// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MxRecordRecord {
    /**
     * @return The mail server responsible for the domain covered by the MX record.
     * 
     */
    private String exchange;
    /**
     * @return String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
     * 
     */
    private String preference;

    private MxRecordRecord() {}
    /**
     * @return The mail server responsible for the domain covered by the MX record.
     * 
     */
    public String exchange() {
        return this.exchange;
    }
    /**
     * @return String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
     * 
     */
    public String preference() {
        return this.preference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String exchange;
        private String preference;
        public Builder() {}
        public Builder(MxRecordRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        @CustomType.Setter
        public Builder exchange(String exchange) {
            this.exchange = Objects.requireNonNull(exchange);
            return this;
        }
        @CustomType.Setter
        public Builder preference(String preference) {
            this.preference = Objects.requireNonNull(preference);
            return this;
        }
        public MxRecordRecord build() {
            final var _resultValue = new MxRecordRecord();
            _resultValue.exchange = exchange;
            _resultValue.preference = preference;
            return _resultValue;
        }
    }
}
