// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerIdentity {
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    private String principalId;
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    private String tenantId;
    /**
     * @return The identity type of this Managed Service Identity.
     * 
     */
    private String type;

    private GetServerIdentity() {}
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The identity type of this Managed Service Identity.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        public Builder() {}
        public Builder(GetServerIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
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
        public GetServerIdentity build() {
            final var _resultValue = new GetServerIdentity();
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
