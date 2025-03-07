// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecretsSecret {
    /**
     * @return Whether this secret is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return The ID of this secret.
     * 
     */
    private String id;
    /**
     * @return The name of secret.
     * 
     */
    private String name;

    private GetSecretsSecret() {}
    /**
     * @return Whether this secret is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The ID of this secret.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of secret.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetSecretsSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetSecretsSecret build() {
            final var _resultValue = new GetSecretsSecret();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
