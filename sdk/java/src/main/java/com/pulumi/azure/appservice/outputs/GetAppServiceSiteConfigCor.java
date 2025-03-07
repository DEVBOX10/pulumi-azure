// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppServiceSiteConfigCor {
    /**
     * @return A list of origins which are able to make cross-origin calls.
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Are credentials supported?
     * 
     */
    private Boolean supportCredentials;

    private GetAppServiceSiteConfigCor() {}
    /**
     * @return A list of origins which are able to make cross-origin calls.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Are credentials supported?
     * 
     */
    public Boolean supportCredentials() {
        return this.supportCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceSiteConfigCor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedOrigins;
        private Boolean supportCredentials;
        public Builder() {}
        public Builder(GetAppServiceSiteConfigCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder supportCredentials(Boolean supportCredentials) {
            this.supportCredentials = Objects.requireNonNull(supportCredentials);
            return this;
        }
        public GetAppServiceSiteConfigCor build() {
            final var _resultValue = new GetAppServiceSiteConfigCor();
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.supportCredentials = supportCredentials;
            return _resultValue;
        }
    }
}
