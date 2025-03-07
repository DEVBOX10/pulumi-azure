// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelWebChatSite {
    /**
     * @return Is the endpoint parameters enabled for this site?
     * 
     */
    private @Nullable Boolean endpointParametersEnabled;
    /**
     * @return The name of the site.
     * 
     */
    private String name;
    /**
     * @return Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    private @Nullable Boolean storageEnabled;
    /**
     * @return Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    private @Nullable Boolean userUploadEnabled;

    private ChannelWebChatSite() {}
    /**
     * @return Is the endpoint parameters enabled for this site?
     * 
     */
    public Optional<Boolean> endpointParametersEnabled() {
        return Optional.ofNullable(this.endpointParametersEnabled);
    }
    /**
     * @return The name of the site.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Is the storage site enabled for detailed logging? Defaults to `true`.
     * 
     */
    public Optional<Boolean> storageEnabled() {
        return Optional.ofNullable(this.storageEnabled);
    }
    /**
     * @return Is the user upload enabled for this site? Defaults to `true`.
     * 
     */
    public Optional<Boolean> userUploadEnabled() {
        return Optional.ofNullable(this.userUploadEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelWebChatSite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean endpointParametersEnabled;
        private String name;
        private @Nullable Boolean storageEnabled;
        private @Nullable Boolean userUploadEnabled;
        public Builder() {}
        public Builder(ChannelWebChatSite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointParametersEnabled = defaults.endpointParametersEnabled;
    	      this.name = defaults.name;
    	      this.storageEnabled = defaults.storageEnabled;
    	      this.userUploadEnabled = defaults.userUploadEnabled;
        }

        @CustomType.Setter
        public Builder endpointParametersEnabled(@Nullable Boolean endpointParametersEnabled) {
            this.endpointParametersEnabled = endpointParametersEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder storageEnabled(@Nullable Boolean storageEnabled) {
            this.storageEnabled = storageEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder userUploadEnabled(@Nullable Boolean userUploadEnabled) {
            this.userUploadEnabled = userUploadEnabled;
            return this;
        }
        public ChannelWebChatSite build() {
            final var _resultValue = new ChannelWebChatSite();
            _resultValue.endpointParametersEnabled = endpointParametersEnabled;
            _resultValue.name = name;
            _resultValue.storageEnabled = storageEnabled;
            _resultValue.userUploadEnabled = userUploadEnabled;
            return _resultValue;
        }
    }
}
