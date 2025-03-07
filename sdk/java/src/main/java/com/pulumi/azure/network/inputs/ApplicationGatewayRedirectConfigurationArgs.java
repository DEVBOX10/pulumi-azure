// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayRedirectConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRedirectConfigurationArgs Empty = new ApplicationGatewayRedirectConfigurationArgs();

    /**
     * The ID of the Rewrite Rule Set
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Whether to include the path in the redirected URL. Defaults to `false`
     * 
     */
    @Import(name="includePath")
    private @Nullable Output<Boolean> includePath;

    /**
     * @return Whether to include the path in the redirected URL. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> includePath() {
        return Optional.ofNullable(this.includePath);
    }

    /**
     * Whether to include the query string in the redirected URL. Default to `false`
     * 
     */
    @Import(name="includeQueryString")
    private @Nullable Output<Boolean> includeQueryString;

    /**
     * @return Whether to include the query string in the redirected URL. Default to `false`
     * 
     */
    public Optional<Output<Boolean>> includeQueryString() {
        return Optional.ofNullable(this.includeQueryString);
    }

    /**
     * Unique name of the redirect configuration block
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Unique name of the redirect configuration block
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of redirect. Possible values are `Permanent`, `Temporary`, `Found` and `SeeOther`
     * 
     */
    @Import(name="redirectType", required=true)
    private Output<String> redirectType;

    /**
     * @return The type of redirect. Possible values are `Permanent`, `Temporary`, `Found` and `SeeOther`
     * 
     */
    public Output<String> redirectType() {
        return this.redirectType;
    }

    @Import(name="targetListenerId")
    private @Nullable Output<String> targetListenerId;

    public Optional<Output<String>> targetListenerId() {
        return Optional.ofNullable(this.targetListenerId);
    }

    /**
     * The name of the listener to redirect to. Cannot be set if `target_url` is set.
     * 
     */
    @Import(name="targetListenerName")
    private @Nullable Output<String> targetListenerName;

    /**
     * @return The name of the listener to redirect to. Cannot be set if `target_url` is set.
     * 
     */
    public Optional<Output<String>> targetListenerName() {
        return Optional.ofNullable(this.targetListenerName);
    }

    /**
     * The URL to redirect the request to. Cannot be set if `target_listener_name` is set.
     * 
     */
    @Import(name="targetUrl")
    private @Nullable Output<String> targetUrl;

    /**
     * @return The URL to redirect the request to. Cannot be set if `target_listener_name` is set.
     * 
     */
    public Optional<Output<String>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    private ApplicationGatewayRedirectConfigurationArgs() {}

    private ApplicationGatewayRedirectConfigurationArgs(ApplicationGatewayRedirectConfigurationArgs $) {
        this.id = $.id;
        this.includePath = $.includePath;
        this.includeQueryString = $.includeQueryString;
        this.name = $.name;
        this.redirectType = $.redirectType;
        this.targetListenerId = $.targetListenerId;
        this.targetListenerName = $.targetListenerName;
        this.targetUrl = $.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayRedirectConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayRedirectConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayRedirectConfigurationArgs();
        }

        public Builder(ApplicationGatewayRedirectConfigurationArgs defaults) {
            $ = new ApplicationGatewayRedirectConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param includePath Whether to include the path in the redirected URL. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder includePath(@Nullable Output<Boolean> includePath) {
            $.includePath = includePath;
            return this;
        }

        /**
         * @param includePath Whether to include the path in the redirected URL. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder includePath(Boolean includePath) {
            return includePath(Output.of(includePath));
        }

        /**
         * @param includeQueryString Whether to include the query string in the redirected URL. Default to `false`
         * 
         * @return builder
         * 
         */
        public Builder includeQueryString(@Nullable Output<Boolean> includeQueryString) {
            $.includeQueryString = includeQueryString;
            return this;
        }

        /**
         * @param includeQueryString Whether to include the query string in the redirected URL. Default to `false`
         * 
         * @return builder
         * 
         */
        public Builder includeQueryString(Boolean includeQueryString) {
            return includeQueryString(Output.of(includeQueryString));
        }

        /**
         * @param name Unique name of the redirect configuration block
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the redirect configuration block
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectType The type of redirect. Possible values are `Permanent`, `Temporary`, `Found` and `SeeOther`
         * 
         * @return builder
         * 
         */
        public Builder redirectType(Output<String> redirectType) {
            $.redirectType = redirectType;
            return this;
        }

        /**
         * @param redirectType The type of redirect. Possible values are `Permanent`, `Temporary`, `Found` and `SeeOther`
         * 
         * @return builder
         * 
         */
        public Builder redirectType(String redirectType) {
            return redirectType(Output.of(redirectType));
        }

        public Builder targetListenerId(@Nullable Output<String> targetListenerId) {
            $.targetListenerId = targetListenerId;
            return this;
        }

        public Builder targetListenerId(String targetListenerId) {
            return targetListenerId(Output.of(targetListenerId));
        }

        /**
         * @param targetListenerName The name of the listener to redirect to. Cannot be set if `target_url` is set.
         * 
         * @return builder
         * 
         */
        public Builder targetListenerName(@Nullable Output<String> targetListenerName) {
            $.targetListenerName = targetListenerName;
            return this;
        }

        /**
         * @param targetListenerName The name of the listener to redirect to. Cannot be set if `target_url` is set.
         * 
         * @return builder
         * 
         */
        public Builder targetListenerName(String targetListenerName) {
            return targetListenerName(Output.of(targetListenerName));
        }

        /**
         * @param targetUrl The URL to redirect the request to. Cannot be set if `target_listener_name` is set.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(@Nullable Output<String> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        /**
         * @param targetUrl The URL to redirect the request to. Cannot be set if `target_listener_name` is set.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(String targetUrl) {
            return targetUrl(Output.of(targetUrl));
        }

        public ApplicationGatewayRedirectConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.redirectType = Objects.requireNonNull($.redirectType, "expected parameter 'redirectType' to be non-null");
            return $;
        }
    }

}
