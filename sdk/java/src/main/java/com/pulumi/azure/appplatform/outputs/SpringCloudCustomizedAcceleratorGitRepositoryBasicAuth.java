// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth {
    /**
     * @return Specifies the password of git repository basic auth.
     * 
     */
    private String password;
    /**
     * @return Specifies the username of git repository basic auth.
     * 
     */
    private String username;

    private SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth() {}
    /**
     * @return Specifies the password of git repository basic auth.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Specifies the username of git repository basic auth.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String username;
        public Builder() {}
        public Builder(SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth build() {
            final var _resultValue = new SpringCloudCustomizedAcceleratorGitRepositoryBasicAuth();
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
