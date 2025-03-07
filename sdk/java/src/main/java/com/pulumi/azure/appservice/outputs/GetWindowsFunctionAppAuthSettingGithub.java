// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsFunctionAppAuthSettingGithub {
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    private String clientId;
    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    private String clientSecret;
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    private String clientSecretSettingName;
    /**
     * @return A list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * 
     */
    private List<String> oauthScopes;

    private GetWindowsFunctionAppAuthSettingGithub() {}
    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the app used for authentication.
     * 
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }
    /**
     * @return A list of OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsFunctionAppAuthSettingGithub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private String clientSecretSettingName;
        private List<String> oauthScopes;
        public Builder() {}
        public Builder(GetWindowsFunctionAppAuthSettingGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.oauthScopes = defaults.oauthScopes;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            this.clientSecretSettingName = Objects.requireNonNull(clientSecretSettingName);
            return this;
        }
        @CustomType.Setter
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public GetWindowsFunctionAppAuthSettingGithub build() {
            final var _resultValue = new GetWindowsFunctionAppAuthSettingGithub();
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.clientSecretSettingName = clientSecretSettingName;
            _resultValue.oauthScopes = oauthScopes;
            return _resultValue;
        }
    }
}
