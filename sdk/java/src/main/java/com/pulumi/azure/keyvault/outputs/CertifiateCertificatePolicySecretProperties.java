// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertifiateCertificatePolicySecretProperties {
    /**
     * @return The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM. Changing this forces a new resource to be created.
     * 
     */
    private String contentType;

    private CertifiateCertificatePolicySecretProperties() {}
    /**
     * @return The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM. Changing this forces a new resource to be created.
     * 
     */
    public String contentType() {
        return this.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicySecretProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentType;
        public Builder() {}
        public Builder(CertifiateCertificatePolicySecretProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
        }

        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public CertifiateCertificatePolicySecretProperties build() {
            final var _resultValue = new CertifiateCertificatePolicySecretProperties();
            _resultValue.contentType = contentType;
            return _resultValue;
        }
    }
}
