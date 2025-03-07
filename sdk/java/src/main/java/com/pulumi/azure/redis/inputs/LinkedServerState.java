// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServerState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServerState Empty = new LinkedServerState();

    /**
     * The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="linkedRedisCacheId")
    private @Nullable Output<String> linkedRedisCacheId;

    /**
     * @return The ID of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Optional<Output<String>> linkedRedisCacheId() {
        return Optional.ofNullable(this.linkedRedisCacheId);
    }

    /**
     * The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="linkedRedisCacheLocation")
    private @Nullable Output<String> linkedRedisCacheLocation;

    /**
     * @return The location of the linked Redis cache. Changing this forces a new Redis to be created.
     * 
     */
    public Optional<Output<String>> linkedRedisCacheLocation() {
        return Optional.ofNullable(this.linkedRedisCacheLocation);
    }

    /**
     * The name of the linked server.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the linked server.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
     * 
     */
    @Import(name="serverRole")
    private @Nullable Output<String> serverRole;

    /**
     * @return The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
     * 
     */
    public Optional<Output<String>> serverRole() {
        return Optional.ofNullable(this.serverRole);
    }

    /**
     * The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    @Import(name="targetRedisCacheName")
    private @Nullable Output<String> targetRedisCacheName;

    /**
     * @return The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
     * 
     */
    public Optional<Output<String>> targetRedisCacheName() {
        return Optional.ofNullable(this.targetRedisCacheName);
    }

    private LinkedServerState() {}

    private LinkedServerState(LinkedServerState $) {
        this.linkedRedisCacheId = $.linkedRedisCacheId;
        this.linkedRedisCacheLocation = $.linkedRedisCacheLocation;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serverRole = $.serverRole;
        this.targetRedisCacheName = $.targetRedisCacheName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServerState $;

        public Builder() {
            $ = new LinkedServerState();
        }

        public Builder(LinkedServerState defaults) {
            $ = new LinkedServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedRedisCacheId The ID of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheId(@Nullable Output<String> linkedRedisCacheId) {
            $.linkedRedisCacheId = linkedRedisCacheId;
            return this;
        }

        /**
         * @param linkedRedisCacheId The ID of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheId(String linkedRedisCacheId) {
            return linkedRedisCacheId(Output.of(linkedRedisCacheId));
        }

        /**
         * @param linkedRedisCacheLocation The location of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheLocation(@Nullable Output<String> linkedRedisCacheLocation) {
            $.linkedRedisCacheLocation = linkedRedisCacheLocation;
            return this;
        }

        /**
         * @param linkedRedisCacheLocation The location of the linked Redis cache. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedRedisCacheLocation(String linkedRedisCacheLocation) {
            return linkedRedisCacheLocation(Output.of(linkedRedisCacheLocation));
        }

        /**
         * @param name The name of the linked server.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the linked server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis caches exists. Changing this forces a new Redis to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverRole The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder serverRole(@Nullable Output<String> serverRole) {
            $.serverRole = serverRole;
            return this;
        }

        /**
         * @param serverRole The role of the linked Redis cache (eg &#34;Secondary&#34;). Changing this forces a new Redis to be created. Possible values are `Primary` and `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder serverRole(String serverRole) {
            return serverRole(Output.of(serverRole));
        }

        /**
         * @param targetRedisCacheName The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
         * 
         * @return builder
         * 
         */
        public Builder targetRedisCacheName(@Nullable Output<String> targetRedisCacheName) {
            $.targetRedisCacheName = targetRedisCacheName;
            return this;
        }

        /**
         * @param targetRedisCacheName The name of Redis cache to link with. Changing this forces a new Redis to be created. (eg The primary role)
         * 
         * @return builder
         * 
         */
        public Builder targetRedisCacheName(String targetRedisCacheName) {
            return targetRedisCacheName(Output.of(targetRedisCacheName));
        }

        public LinkedServerState build() {
            return $;
        }
    }

}
