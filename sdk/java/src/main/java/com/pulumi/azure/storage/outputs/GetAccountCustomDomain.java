// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountCustomDomain {
    /**
     * @return Specifies the name of the Storage Account
     * 
     */
    private String name;

    private GetAccountCustomDomain() {}
    /**
     * @return Specifies the name of the Storage Account
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountCustomDomain defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetAccountCustomDomain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAccountCustomDomain build() {
            final var _resultValue = new GetAccountCustomDomain();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
