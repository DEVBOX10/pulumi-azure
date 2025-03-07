// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApplicationGatewayIdentity {
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Application Gateway.
     * 
     */
    private List<String> identityIds;
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Application Gateway. Only possible value is `UserAssigned`.
     * 
     */
    private String type;

    private ApplicationGatewayIdentity() {}
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Application Gateway.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Application Gateway. Only possible value is `UserAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String type;
        public Builder() {}
        public Builder(ApplicationGatewayIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayIdentity build() {
            final var _resultValue = new ApplicationGatewayIdentity();
            _resultValue.identityIds = identityIds;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
