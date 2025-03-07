// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccountQueuePropertiesLogging {
    /**
     * @return Indicates whether all delete requests should be logged.
     * 
     */
    private Boolean delete;
    /**
     * @return Indicates whether all read requests should be logged.
     * 
     */
    private Boolean read;
    /**
     * @return Specifies the number of days that logs will be retained.
     * 
     */
    private @Nullable Integer retentionPolicyDays;
    /**
     * @return The version of storage analytics to configure.
     * 
     */
    private String version;
    /**
     * @return Indicates whether all write requests should be logged.
     * 
     */
    private Boolean write;

    private AccountQueuePropertiesLogging() {}
    /**
     * @return Indicates whether all delete requests should be logged.
     * 
     */
    public Boolean delete() {
        return this.delete;
    }
    /**
     * @return Indicates whether all read requests should be logged.
     * 
     */
    public Boolean read() {
        return this.read;
    }
    /**
     * @return Specifies the number of days that logs will be retained.
     * 
     */
    public Optional<Integer> retentionPolicyDays() {
        return Optional.ofNullable(this.retentionPolicyDays);
    }
    /**
     * @return The version of storage analytics to configure.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return Indicates whether all write requests should be logged.
     * 
     */
    public Boolean write() {
        return this.write;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountQueuePropertiesLogging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean delete;
        private Boolean read;
        private @Nullable Integer retentionPolicyDays;
        private String version;
        private Boolean write;
        public Builder() {}
        public Builder(AccountQueuePropertiesLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.read = defaults.read;
    	      this.retentionPolicyDays = defaults.retentionPolicyDays;
    	      this.version = defaults.version;
    	      this.write = defaults.write;
        }

        @CustomType.Setter
        public Builder delete(Boolean delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }
        @CustomType.Setter
        public Builder read(Boolean read) {
            this.read = Objects.requireNonNull(read);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPolicyDays(@Nullable Integer retentionPolicyDays) {
            this.retentionPolicyDays = retentionPolicyDays;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder write(Boolean write) {
            this.write = Objects.requireNonNull(write);
            return this;
        }
        public AccountQueuePropertiesLogging build() {
            final var _resultValue = new AccountQueuePropertiesLogging();
            _resultValue.delete = delete;
            _resultValue.read = read;
            _resultValue.retentionPolicyDays = retentionPolicyDays;
            _resultValue.version = version;
            _resultValue.write = write;
            return _resultValue;
        }
    }
}
