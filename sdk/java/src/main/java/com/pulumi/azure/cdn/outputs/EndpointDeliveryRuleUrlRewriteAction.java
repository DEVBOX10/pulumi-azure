// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleUrlRewriteAction {
    /**
     * @return This value must start with a `/` and can&#39;t be longer than 260 characters.
     * 
     */
    private String destination;
    /**
     * @return Defaults to `true`.
     * 
     */
    private @Nullable Boolean preserveUnmatchedPath;
    /**
     * @return This value must start with a `/` and can&#39;t be longer than 260 characters.
     * 
     */
    private String sourcePattern;

    private EndpointDeliveryRuleUrlRewriteAction() {}
    /**
     * @return This value must start with a `/` and can&#39;t be longer than 260 characters.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return Defaults to `true`.
     * 
     */
    public Optional<Boolean> preserveUnmatchedPath() {
        return Optional.ofNullable(this.preserveUnmatchedPath);
    }
    /**
     * @return This value must start with a `/` and can&#39;t be longer than 260 characters.
     * 
     */
    public String sourcePattern() {
        return this.sourcePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleUrlRewriteAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        private @Nullable Boolean preserveUnmatchedPath;
        private String sourcePattern;
        public Builder() {}
        public Builder(EndpointDeliveryRuleUrlRewriteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.preserveUnmatchedPath = defaults.preserveUnmatchedPath;
    	      this.sourcePattern = defaults.sourcePattern;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder preserveUnmatchedPath(@Nullable Boolean preserveUnmatchedPath) {
            this.preserveUnmatchedPath = preserveUnmatchedPath;
            return this;
        }
        @CustomType.Setter
        public Builder sourcePattern(String sourcePattern) {
            this.sourcePattern = Objects.requireNonNull(sourcePattern);
            return this;
        }
        public EndpointDeliveryRuleUrlRewriteAction build() {
            final var _resultValue = new EndpointDeliveryRuleUrlRewriteAction();
            _resultValue.destination = destination;
            _resultValue.preserveUnmatchedPath = preserveUnmatchedPath;
            _resultValue.sourcePattern = sourcePattern;
            return _resultValue;
        }
    }
}
