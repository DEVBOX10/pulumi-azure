// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateArgs Empty = new CertificateCertificateArgs();

    /**
     * The base64-encoded certificate contents.
     * 
     */
    @Import(name="contents", required=true)
    private Output<String> contents;

    /**
     * @return The base64-encoded certificate contents.
     * 
     */
    public Output<String> contents() {
        return this.contents;
    }

    /**
     * The password associated with the certificate.
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
    @Import(name="password")
    private @Nullable Output<String> password;

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
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private CertificateCertificateArgs() {}

    private CertificateCertificateArgs(CertificateCertificateArgs $) {
        this.contents = $.contents;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateArgs $;

        public Builder() {
            $ = new CertificateCertificateArgs();
        }

        public Builder(CertificateCertificateArgs defaults) {
            $ = new CertificateCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contents The base64-encoded certificate contents.
         * 
         * @return builder
         * 
         */
        public Builder contents(Output<String> contents) {
            $.contents = contents;
            return this;
        }

        /**
         * @param contents The base64-encoded certificate contents.
         * 
         * @return builder
         * 
         */
        public Builder contents(String contents) {
            return contents(Output.of(contents));
        }

        /**
         * @param password The password associated with the certificate.
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
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password associated with the certificate.
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
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public CertificateCertificateArgs build() {
            $.contents = Objects.requireNonNull($.contents, "expected parameter 'contents' to be non-null");
            return $;
        }
    }

}
