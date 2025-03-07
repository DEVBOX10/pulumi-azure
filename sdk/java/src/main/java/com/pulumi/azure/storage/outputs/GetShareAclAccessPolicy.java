// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetShareAclAccessPolicy {
    /**
     * @return The time at which this Access Policy should be valid until, in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     * 
     */
    private String expiry;
    /**
     * @return The permissions which should be associated with this Shared Identifier. Possible value is combination of `r` (read), `w` (write), `d` (delete), and `l` (list).
     * 
     */
    private String permissions;
    /**
     * @return The time at which this Access Policy should be valid from, in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     * 
     */
    private String start;

    private GetShareAclAccessPolicy() {}
    /**
     * @return The time at which this Access Policy should be valid until, in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     * 
     */
    public String expiry() {
        return this.expiry;
    }
    /**
     * @return The permissions which should be associated with this Shared Identifier. Possible value is combination of `r` (read), `w` (write), `d` (delete), and `l` (list).
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return The time at which this Access Policy should be valid from, in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) format.
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareAclAccessPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expiry;
        private String permissions;
        private String start;
        public Builder() {}
        public Builder(GetShareAclAccessPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.permissions = defaults.permissions;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder expiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public GetShareAclAccessPolicy build() {
            final var _resultValue = new GetShareAclAccessPolicy();
            _resultValue.expiry = expiry;
            _resultValue.permissions = permissions;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
