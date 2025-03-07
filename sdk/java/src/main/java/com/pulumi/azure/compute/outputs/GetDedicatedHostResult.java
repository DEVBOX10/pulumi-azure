// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDedicatedHostResult {
    private String dedicatedHostGroupName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The location where the Dedicated Host exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Dedicated Host.
     * 
     */
    private Map<String,String> tags;

    private GetDedicatedHostResult() {}
    public String dedicatedHostGroupName() {
        return this.dedicatedHostGroupName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location where the Dedicated Host exists.
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
     * @return A mapping of tags assigned to the Dedicated Host.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dedicatedHostGroupName;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetDedicatedHostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedHostGroupName = defaults.dedicatedHostGroupName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
            this.dedicatedHostGroupName = Objects.requireNonNull(dedicatedHostGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public GetDedicatedHostResult build() {
            final var _resultValue = new GetDedicatedHostResult();
            _resultValue.dedicatedHostGroupName = dedicatedHostGroupName;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
