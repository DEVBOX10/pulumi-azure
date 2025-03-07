// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPoolContainerConfigurationContainerRegistry {
    /**
     * @return The password for the user account.
     * 
     */
    private String password;
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;.
     * 
     */
    private String registryServer;
    /**
     * @return The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password.
     * 
     */
    private String userAssignedIdentityId;
    /**
     * @return The user to use for authentication against the CIFS file system.
     * 
     */
    private String userName;

    private GetPoolContainerConfigurationContainerRegistry() {}
    /**
     * @return The password for the user account.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The container registry URL. The default is &#34;docker.io&#34;.
     * 
     */
    public String registryServer() {
        return this.registryServer;
    }
    /**
     * @return The reference to the user assigned identity to use to access an Azure Container Registry instead of username and password.
     * 
     */
    public String userAssignedIdentityId() {
        return this.userAssignedIdentityId;
    }
    /**
     * @return The user to use for authentication against the CIFS file system.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolContainerConfigurationContainerRegistry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String registryServer;
        private String userAssignedIdentityId;
        private String userName;
        public Builder() {}
        public Builder(GetPoolContainerConfigurationContainerRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.registryServer = defaults.registryServer;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder registryServer(String registryServer) {
            this.registryServer = Objects.requireNonNull(registryServer);
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            this.userAssignedIdentityId = Objects.requireNonNull(userAssignedIdentityId);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetPoolContainerConfigurationContainerRegistry build() {
            final var _resultValue = new GetPoolContainerConfigurationContainerRegistry();
            _resultValue.password = password;
            _resultValue.registryServer = registryServer;
            _resultValue.userAssignedIdentityId = userAssignedIdentityId;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
