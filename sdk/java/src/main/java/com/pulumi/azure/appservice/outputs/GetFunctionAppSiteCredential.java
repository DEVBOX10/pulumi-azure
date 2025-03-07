// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppSiteCredential {
    /**
     * @return The password associated with the username, which can be used to publish to this App Service.
     * 
     */
    private String password;
    /**
     * @return The username which can be used to publish to this App Service
     * 
     */
    private String username;

    private GetFunctionAppSiteCredential() {}
    /**
     * @return The password associated with the username, which can be used to publish to this App Service.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The username which can be used to publish to this App Service
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppSiteCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(GetFunctionAppSiteCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetFunctionAppSiteCredential build() {
            final var _resultValue = new GetFunctionAppSiteCredential();
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
