// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFactoryGithubConfiguration {
    /**
     * @return The VSTS account name.
     * 
     */
    private String accountName;
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    private String branchName;
    /**
     * @return The GitHub Enterprise host name.
     * 
     */
    private String gitUrl;
    /**
     * @return The name of the git repository.
     * 
     */
    private String repositoryName;
    /**
     * @return The root folder within the repository.
     * 
     */
    private String rootFolder;

    private GetFactoryGithubConfiguration() {}
    /**
     * @return The VSTS account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The branch of the repository to get code from.
     * 
     */
    public String branchName() {
        return this.branchName;
    }
    /**
     * @return The GitHub Enterprise host name.
     * 
     */
    public String gitUrl() {
        return this.gitUrl;
    }
    /**
     * @return The name of the git repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }
    /**
     * @return The root folder within the repository.
     * 
     */
    public String rootFolder() {
        return this.rootFolder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryGithubConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String branchName;
        private String gitUrl;
        private String repositoryName;
        private String rootFolder;
        public Builder() {}
        public Builder(GetFactoryGithubConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.branchName = defaults.branchName;
    	      this.gitUrl = defaults.gitUrl;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder branchName(String branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }
        @CustomType.Setter
        public Builder gitUrl(String gitUrl) {
            this.gitUrl = Objects.requireNonNull(gitUrl);
            return this;
        }
        @CustomType.Setter
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        @CustomType.Setter
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        public GetFactoryGithubConfiguration build() {
            final var _resultValue = new GetFactoryGithubConfiguration();
            _resultValue.accountName = accountName;
            _resultValue.branchName = branchName;
            _resultValue.gitUrl = gitUrl;
            _resultValue.repositoryName = repositoryName;
            _resultValue.rootFolder = rootFolder;
            return _resultValue;
        }
    }
}
