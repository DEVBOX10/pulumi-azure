// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolStartTaskUserIdentityAutoUser {
    /**
     * @return The elevation level of the user account. &#34;NonAdmin&#34; - The auto user is a standard user without elevated access. &#34;Admin&#34; - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    private String elevationLevel;
    /**
     * @return The scope of the user identity under which the start task runs.
     * 
     */
    private String scope;

    private GetPoolStartTaskUserIdentityAutoUser() {}
    /**
     * @return The elevation level of the user account. &#34;NonAdmin&#34; - The auto user is a standard user without elevated access. &#34;Admin&#34; - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    public String elevationLevel() {
        return this.elevationLevel;
    }
    /**
     * @return The scope of the user identity under which the start task runs.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolStartTaskUserIdentityAutoUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String elevationLevel;
        private String scope;
        public Builder() {}
        public Builder(GetPoolStartTaskUserIdentityAutoUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder elevationLevel(String elevationLevel) {
            this.elevationLevel = Objects.requireNonNull(elevationLevel);
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetPoolStartTaskUserIdentityAutoUser build() {
            final var _resultValue = new GetPoolStartTaskUserIdentityAutoUser();
            _resultValue.elevationLevel = elevationLevel;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
