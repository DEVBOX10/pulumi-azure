// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePlanDefaultAutoShutdown {
    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    private @Nullable String disconnectDelay;
    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    private @Nullable String idleDelay;
    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    private @Nullable String noConnectDelay;
    /**
     * @return Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
     * 
     * &gt; **NOTE:** This property is `None` when it isn&#39;t specified. No need to set `idle_delay` when `shutdown_on_idle` isn&#39;t specified.
     * 
     */
    private @Nullable String shutdownOnIdle;

    private ServicePlanDefaultAutoShutdown() {}
    /**
     * @return The amount of time a VM will stay running after a user disconnects if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<String> disconnectDelay() {
        return Optional.ofNullable(this.disconnectDelay);
    }
    /**
     * @return The amount of time a VM will idle before it is shutdown if this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<String> idleDelay() {
        return Optional.ofNullable(this.idleDelay);
    }
    /**
     * @return The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled. This value must be formatted as an ISO 8601 string.
     * 
     */
    public Optional<String> noConnectDelay() {
        return Optional.ofNullable(this.noConnectDelay);
    }
    /**
     * @return Will a VM get shutdown when it has idled for a period of time? Possible values are `LowUsage` and `UserAbsence`.
     * 
     * &gt; **NOTE:** This property is `None` when it isn&#39;t specified. No need to set `idle_delay` when `shutdown_on_idle` isn&#39;t specified.
     * 
     */
    public Optional<String> shutdownOnIdle() {
        return Optional.ofNullable(this.shutdownOnIdle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlanDefaultAutoShutdown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String disconnectDelay;
        private @Nullable String idleDelay;
        private @Nullable String noConnectDelay;
        private @Nullable String shutdownOnIdle;
        public Builder() {}
        public Builder(ServicePlanDefaultAutoShutdown defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
        }

        @CustomType.Setter
        public Builder disconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }
        @CustomType.Setter
        public Builder idleDelay(@Nullable String idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }
        @CustomType.Setter
        public Builder noConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }
        @CustomType.Setter
        public Builder shutdownOnIdle(@Nullable String shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }
        public ServicePlanDefaultAutoShutdown build() {
            final var _resultValue = new ServicePlanDefaultAutoShutdown();
            _resultValue.disconnectDelay = disconnectDelay;
            _resultValue.idleDelay = idleDelay;
            _resultValue.noConnectDelay = noConnectDelay;
            _resultValue.shutdownOnIdle = shutdownOnIdle;
            return _resultValue;
        }
    }
}
