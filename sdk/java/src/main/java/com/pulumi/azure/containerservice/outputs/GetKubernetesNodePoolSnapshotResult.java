// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKubernetesNodePoolSnapshotResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String resourceGroupName;
    /**
     * @return The ID of the source Node Pool.
     * 
     */
    private String sourceNodePoolId;
    private Map<String,String> tags;

    private GetKubernetesNodePoolSnapshotResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The ID of the source Node Pool.
     * 
     */
    public String sourceNodePoolId() {
        return this.sourceNodePoolId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesNodePoolSnapshotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String resourceGroupName;
        private String sourceNodePoolId;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetKubernetesNodePoolSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceNodePoolId = defaults.sourceNodePoolId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder sourceNodePoolId(String sourceNodePoolId) {
            this.sourceNodePoolId = Objects.requireNonNull(sourceNodePoolId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetKubernetesNodePoolSnapshotResult build() {
            final var _resultValue = new GetKubernetesNodePoolSnapshotResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.sourceNodePoolId = sourceNodePoolId;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
