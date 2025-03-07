// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificate {
    /**
     * @return The base64-encoded certificate contents.
     * 
     */
    private String contents;
    /**
     * @return The password associated with the certificate.
     * 
     * &gt; **NOTE:** A PEM certificate is already base64 encoded. To successfully import, the `contents` property should include a PEM encoded X509 certificate and a private_key in pkcs8 format. There should only be linux style `\n` line endings and the whole block should have the PEM begin/end blocks around the certificate data and the private key data.
     * 
     * To convert a private key to pkcs8 format with openssl use:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     * The PEM content should look something like:
     * 
     */
    private @Nullable String password;

    private CertifiateCertificate() {}
    /**
     * @return The base64-encoded certificate contents.
     * 
     */
    public String contents() {
        return this.contents;
    }
    /**
     * @return The password associated with the certificate.
     * 
     * &gt; **NOTE:** A PEM certificate is already base64 encoded. To successfully import, the `contents` property should include a PEM encoded X509 certificate and a private_key in pkcs8 format. There should only be linux style `\n` line endings and the whole block should have the PEM begin/end blocks around the certificate data and the private key data.
     * 
     * To convert a private key to pkcs8 format with openssl use:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     * The PEM content should look something like:
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contents;
        private @Nullable String password;
        public Builder() {}
        public Builder(CertifiateCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder contents(String contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public CertifiateCertificate build() {
            final var _resultValue = new CertifiateCertificate();
            _resultValue.contents = contents;
            _resultValue.password = password;
            return _resultValue;
        }
    }
}
