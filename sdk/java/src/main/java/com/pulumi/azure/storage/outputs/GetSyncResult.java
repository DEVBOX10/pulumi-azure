// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSyncResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Incoming traffic policy.
     * 
     */
    private String incomingTrafficPolicy;
    /**
     * @return The Azure Region where the Storage Sync exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Storage Sync.
     * 
     */
    private Map<String,String> tags;

    private GetSyncResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Incoming traffic policy.
     * 
     */
    public String incomingTrafficPolicy() {
        return this.incomingTrafficPolicy;
    }
    /**
     * @return The Azure Region where the Storage Sync exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the Storage Sync.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String incomingTrafficPolicy;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetSyncResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.incomingTrafficPolicy = defaults.incomingTrafficPolicy;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder incomingTrafficPolicy(String incomingTrafficPolicy) {
            this.incomingTrafficPolicy = Objects.requireNonNull(incomingTrafficPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetSyncResult build() {
            final var _resultValue = new GetSyncResult();
            _resultValue.id = id;
            _resultValue.incomingTrafficPolicy = incomingTrafficPolicy;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
