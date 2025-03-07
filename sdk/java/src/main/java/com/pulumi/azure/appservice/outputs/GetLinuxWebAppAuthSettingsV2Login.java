// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppAuthSettingsV2Login {
    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app.
     * 
     */
    private List<String> allowedExternalRedirectUrls;
    /**
     * @return The method by which cookies expire.
     * 
     */
    private String cookieExpirationConvention;
    /**
     * @return The time after the request is made when the session cookie should expire.
     * 
     */
    private String cookieExpirationTime;
    /**
     * @return The endpoint to which logout requests are made.
     * 
     */
    private String logoutEndpoint;
    /**
     * @return The time after the request is made when the nonce should expire.
     * 
     */
    private String nonceExpirationTime;
    /**
     * @return Are the fragments from the request preserved after the login request is made.
     * 
     */
    private Boolean preserveUrlFragmentsForLogins;
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API.
     * 
     */
    private Double tokenRefreshExtensionTime;
    /**
     * @return Is the Token Store configuration Enabled.
     * 
     */
    private Boolean tokenStoreEnabled;
    /**
     * @return The directory path in the App Filesystem in which the tokens are stored.
     * 
     */
    private String tokenStorePath;
    /**
     * @return The name of the app setting which contains the SAS URL of the blob storage containing the tokens.
     * 
     */
    private String tokenStoreSasSettingName;
    /**
     * @return Is the nonce validated while completing the login flow.
     * 
     */
    private Boolean validateNonce;

    private GetLinuxWebAppAuthSettingsV2Login() {}
    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app.
     * 
     */
    public List<String> allowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }
    /**
     * @return The method by which cookies expire.
     * 
     */
    public String cookieExpirationConvention() {
        return this.cookieExpirationConvention;
    }
    /**
     * @return The time after the request is made when the session cookie should expire.
     * 
     */
    public String cookieExpirationTime() {
        return this.cookieExpirationTime;
    }
    /**
     * @return The endpoint to which logout requests are made.
     * 
     */
    public String logoutEndpoint() {
        return this.logoutEndpoint;
    }
    /**
     * @return The time after the request is made when the nonce should expire.
     * 
     */
    public String nonceExpirationTime() {
        return this.nonceExpirationTime;
    }
    /**
     * @return Are the fragments from the request preserved after the login request is made.
     * 
     */
    public Boolean preserveUrlFragmentsForLogins() {
        return this.preserveUrlFragmentsForLogins;
    }
    /**
     * @return The number of hours after session token expiration that a session token can be used to call the token refresh API.
     * 
     */
    public Double tokenRefreshExtensionTime() {
        return this.tokenRefreshExtensionTime;
    }
    /**
     * @return Is the Token Store configuration Enabled.
     * 
     */
    public Boolean tokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }
    /**
     * @return The directory path in the App Filesystem in which the tokens are stored.
     * 
     */
    public String tokenStorePath() {
        return this.tokenStorePath;
    }
    /**
     * @return The name of the app setting which contains the SAS URL of the blob storage containing the tokens.
     * 
     */
    public String tokenStoreSasSettingName() {
        return this.tokenStoreSasSettingName;
    }
    /**
     * @return Is the nonce validated while completing the login flow.
     * 
     */
    public Boolean validateNonce() {
        return this.validateNonce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppAuthSettingsV2Login defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedExternalRedirectUrls;
        private String cookieExpirationConvention;
        private String cookieExpirationTime;
        private String logoutEndpoint;
        private String nonceExpirationTime;
        private Boolean preserveUrlFragmentsForLogins;
        private Double tokenRefreshExtensionTime;
        private Boolean tokenStoreEnabled;
        private String tokenStorePath;
        private String tokenStoreSasSettingName;
        private Boolean validateNonce;
        public Builder() {}
        public Builder(GetLinuxWebAppAuthSettingsV2Login defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExternalRedirectUrls = defaults.allowedExternalRedirectUrls;
    	      this.cookieExpirationConvention = defaults.cookieExpirationConvention;
    	      this.cookieExpirationTime = defaults.cookieExpirationTime;
    	      this.logoutEndpoint = defaults.logoutEndpoint;
    	      this.nonceExpirationTime = defaults.nonceExpirationTime;
    	      this.preserveUrlFragmentsForLogins = defaults.preserveUrlFragmentsForLogins;
    	      this.tokenRefreshExtensionTime = defaults.tokenRefreshExtensionTime;
    	      this.tokenStoreEnabled = defaults.tokenStoreEnabled;
    	      this.tokenStorePath = defaults.tokenStorePath;
    	      this.tokenStoreSasSettingName = defaults.tokenStoreSasSettingName;
    	      this.validateNonce = defaults.validateNonce;
        }

        @CustomType.Setter
        public Builder allowedExternalRedirectUrls(List<String> allowedExternalRedirectUrls) {
            this.allowedExternalRedirectUrls = Objects.requireNonNull(allowedExternalRedirectUrls);
            return this;
        }
        public Builder allowedExternalRedirectUrls(String... allowedExternalRedirectUrls) {
            return allowedExternalRedirectUrls(List.of(allowedExternalRedirectUrls));
        }
        @CustomType.Setter
        public Builder cookieExpirationConvention(String cookieExpirationConvention) {
            this.cookieExpirationConvention = Objects.requireNonNull(cookieExpirationConvention);
            return this;
        }
        @CustomType.Setter
        public Builder cookieExpirationTime(String cookieExpirationTime) {
            this.cookieExpirationTime = Objects.requireNonNull(cookieExpirationTime);
            return this;
        }
        @CustomType.Setter
        public Builder logoutEndpoint(String logoutEndpoint) {
            this.logoutEndpoint = Objects.requireNonNull(logoutEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder nonceExpirationTime(String nonceExpirationTime) {
            this.nonceExpirationTime = Objects.requireNonNull(nonceExpirationTime);
            return this;
        }
        @CustomType.Setter
        public Builder preserveUrlFragmentsForLogins(Boolean preserveUrlFragmentsForLogins) {
            this.preserveUrlFragmentsForLogins = Objects.requireNonNull(preserveUrlFragmentsForLogins);
            return this;
        }
        @CustomType.Setter
        public Builder tokenRefreshExtensionTime(Double tokenRefreshExtensionTime) {
            this.tokenRefreshExtensionTime = Objects.requireNonNull(tokenRefreshExtensionTime);
            return this;
        }
        @CustomType.Setter
        public Builder tokenStoreEnabled(Boolean tokenStoreEnabled) {
            this.tokenStoreEnabled = Objects.requireNonNull(tokenStoreEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder tokenStorePath(String tokenStorePath) {
            this.tokenStorePath = Objects.requireNonNull(tokenStorePath);
            return this;
        }
        @CustomType.Setter
        public Builder tokenStoreSasSettingName(String tokenStoreSasSettingName) {
            this.tokenStoreSasSettingName = Objects.requireNonNull(tokenStoreSasSettingName);
            return this;
        }
        @CustomType.Setter
        public Builder validateNonce(Boolean validateNonce) {
            this.validateNonce = Objects.requireNonNull(validateNonce);
            return this;
        }
        public GetLinuxWebAppAuthSettingsV2Login build() {
            final var _resultValue = new GetLinuxWebAppAuthSettingsV2Login();
            _resultValue.allowedExternalRedirectUrls = allowedExternalRedirectUrls;
            _resultValue.cookieExpirationConvention = cookieExpirationConvention;
            _resultValue.cookieExpirationTime = cookieExpirationTime;
            _resultValue.logoutEndpoint = logoutEndpoint;
            _resultValue.nonceExpirationTime = nonceExpirationTime;
            _resultValue.preserveUrlFragmentsForLogins = preserveUrlFragmentsForLogins;
            _resultValue.tokenRefreshExtensionTime = tokenRefreshExtensionTime;
            _resultValue.tokenStoreEnabled = tokenStoreEnabled;
            _resultValue.tokenStorePath = tokenStorePath;
            _resultValue.tokenStoreSasSettingName = tokenStoreSasSettingName;
            _resultValue.validateNonce = validateNonce;
            return _resultValue;
        }
    }
}
