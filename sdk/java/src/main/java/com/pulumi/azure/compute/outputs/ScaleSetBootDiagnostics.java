// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetBootDiagnostics {
    /**
     * @return Whether to enable boot diagnostics for the virtual machine. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Blob endpoint for the storage account to hold the virtual machine&#39;s diagnostic files. This must be the root of a storage account, and not a storage container.
     * 
     */
    private String storageUri;

    private ScaleSetBootDiagnostics() {}
    /**
     * @return Whether to enable boot diagnostics for the virtual machine. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Blob endpoint for the storage account to hold the virtual machine&#39;s diagnostic files. This must be the root of a storage account, and not a storage container.
     * 
     */
    public String storageUri() {
        return this.storageUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetBootDiagnostics defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String storageUri;
        public Builder() {}
        public Builder(ScaleSetBootDiagnostics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder storageUri(String storageUri) {
            this.storageUri = Objects.requireNonNull(storageUri);
            return this;
        }
        public ScaleSetBootDiagnostics build() {
            final var _resultValue = new ScaleSetBootDiagnostics();
            _resultValue.enabled = enabled;
            _resultValue.storageUri = storageUri;
            return _resultValue;
        }
    }
}
