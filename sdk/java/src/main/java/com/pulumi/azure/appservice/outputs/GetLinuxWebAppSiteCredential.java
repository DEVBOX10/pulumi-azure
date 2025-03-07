// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppSiteCredential {
    /**
     * @return The name of this Linux Web App.
     * 
     */
    private String name;
    /**
     * @return The Site Credentials Password used for publishing.
     * 
     */
    private String password;

    private GetLinuxWebAppSiteCredential() {}
    /**
     * @return The name of this Linux Web App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Site Credentials Password used for publishing.
     * 
     */
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppSiteCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String password;
        public Builder() {}
        public Builder(GetLinuxWebAppSiteCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public GetLinuxWebAppSiteCredential build() {
            final var _resultValue = new GetLinuxWebAppSiteCredential();
            _resultValue.name = name;
            _resultValue.password = password;
            return _resultValue;
        }
    }
}
