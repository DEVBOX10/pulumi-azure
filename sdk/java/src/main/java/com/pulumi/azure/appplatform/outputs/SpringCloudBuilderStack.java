// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpringCloudBuilderStack {
    /**
     * @return Specifies the ID of the ClusterStack.
     * 
     */
    private String id;
    /**
     * @return Specifies the version of the ClusterStack
     * 
     */
    private String version;

    private SpringCloudBuilderStack() {}
    /**
     * @return Specifies the ID of the ClusterStack.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the version of the ClusterStack
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudBuilderStack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String version;
        public Builder() {}
        public Builder(SpringCloudBuilderStack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SpringCloudBuilderStack build() {
            final var _resultValue = new SpringCloudBuilderStack();
            _resultValue.id = id;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
