// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppIdentity {
    /**
     * @return A list of one or more Resource IDs for User Assigned Managed identities to assign. Required when `type` is set to `UserAssigned`.
     * 
     */
    private List<String> identityIds;
    private String principalId;
    private String tenantId;
    /**
     * @return The type of managed identity to assign. Possible values are `UserAssigned` and `SystemAssigned`
     * 
     */
    private String type;

    private GetAppIdentity() {}
    /**
     * @return A list of one or more Resource IDs for User Assigned Managed identities to assign. Required when `type` is set to `UserAssigned`.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    public String principalId() {
        return this.principalId;
    }
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The type of managed identity to assign. Possible values are `UserAssigned` and `SystemAssigned`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String principalId;
        private String tenantId;
        private String type;
        public Builder() {}
        public Builder(GetAppIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
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
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAppIdentity build() {
            final var _resultValue = new GetAppIdentity();
            _resultValue.identityIds = identityIds;
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
