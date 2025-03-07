// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudCustomizedAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudCustomizedAcceleratorArgs Empty = new SpringCloudCustomizedAcceleratorArgs();

    /**
     * Specifies a list of accelerator tags.
     * 
     */
    @Import(name="acceleratorTags")
    private @Nullable Output<List<String>> acceleratorTags;

    /**
     * @return Specifies a list of accelerator tags.
     * 
     */
    public Optional<Output<List<String>>> acceleratorTags() {
        return Optional.ofNullable(this.acceleratorTags);
    }

    /**
     * Specifies the description of the Spring Cloud Customized Accelerator.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies the description of the Spring Cloud Customized Accelerator.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the display name of the Spring Cloud Customized Accelerator..
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the display name of the Spring Cloud Customized Accelerator..
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * A `git_repository` block as defined below.
     * 
     */
    @Import(name="gitRepository", required=true)
    private Output<SpringCloudCustomizedAcceleratorGitRepositoryArgs> gitRepository;

    /**
     * @return A `git_repository` block as defined below.
     * 
     */
    public Output<SpringCloudCustomizedAcceleratorGitRepositoryArgs> gitRepository() {
        return this.gitRepository;
    }

    /**
     * Specifies the icon URL of the Spring Cloud Customized Accelerator..
     * 
     */
    @Import(name="iconUrl")
    private @Nullable Output<String> iconUrl;

    /**
     * @return Specifies the icon URL of the Spring Cloud Customized Accelerator..
     * 
     */
    public Optional<Output<String>> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }

    /**
     * The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    @Import(name="springCloudAcceleratorId", required=true)
    private Output<String> springCloudAcceleratorId;

    /**
     * @return The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * 
     */
    public Output<String> springCloudAcceleratorId() {
        return this.springCloudAcceleratorId;
    }

    private SpringCloudCustomizedAcceleratorArgs() {}

    private SpringCloudCustomizedAcceleratorArgs(SpringCloudCustomizedAcceleratorArgs $) {
        this.acceleratorTags = $.acceleratorTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.gitRepository = $.gitRepository;
        this.iconUrl = $.iconUrl;
        this.name = $.name;
        this.springCloudAcceleratorId = $.springCloudAcceleratorId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudCustomizedAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudCustomizedAcceleratorArgs $;

        public Builder() {
            $ = new SpringCloudCustomizedAcceleratorArgs();
        }

        public Builder(SpringCloudCustomizedAcceleratorArgs defaults) {
            $ = new SpringCloudCustomizedAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorTags Specifies a list of accelerator tags.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorTags(@Nullable Output<List<String>> acceleratorTags) {
            $.acceleratorTags = acceleratorTags;
            return this;
        }

        /**
         * @param acceleratorTags Specifies a list of accelerator tags.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorTags(List<String> acceleratorTags) {
            return acceleratorTags(Output.of(acceleratorTags));
        }

        /**
         * @param acceleratorTags Specifies a list of accelerator tags.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorTags(String... acceleratorTags) {
            return acceleratorTags(List.of(acceleratorTags));
        }

        /**
         * @param description Specifies the description of the Spring Cloud Customized Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies the description of the Spring Cloud Customized Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Specifies the display name of the Spring Cloud Customized Accelerator..
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the Spring Cloud Customized Accelerator..
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gitRepository A `git_repository` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gitRepository(Output<SpringCloudCustomizedAcceleratorGitRepositoryArgs> gitRepository) {
            $.gitRepository = gitRepository;
            return this;
        }

        /**
         * @param gitRepository A `git_repository` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gitRepository(SpringCloudCustomizedAcceleratorGitRepositoryArgs gitRepository) {
            return gitRepository(Output.of(gitRepository));
        }

        /**
         * @param iconUrl Specifies the icon URL of the Spring Cloud Customized Accelerator..
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(@Nullable Output<String> iconUrl) {
            $.iconUrl = iconUrl;
            return this;
        }

        /**
         * @param iconUrl Specifies the icon URL of the Spring Cloud Customized Accelerator..
         * 
         * @return builder
         * 
         */
        public Builder iconUrl(String iconUrl) {
            return iconUrl(Output.of(iconUrl));
        }

        /**
         * @param name The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param springCloudAcceleratorId The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAcceleratorId(Output<String> springCloudAcceleratorId) {
            $.springCloudAcceleratorId = springCloudAcceleratorId;
            return this;
        }

        /**
         * @param springCloudAcceleratorId The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudAcceleratorId(String springCloudAcceleratorId) {
            return springCloudAcceleratorId(Output.of(springCloudAcceleratorId));
        }

        public SpringCloudCustomizedAcceleratorArgs build() {
            $.gitRepository = Objects.requireNonNull($.gitRepository, "expected parameter 'gitRepository' to be non-null");
            $.springCloudAcceleratorId = Objects.requireNonNull($.springCloudAcceleratorId, "expected parameter 'springCloudAcceleratorId' to be non-null");
            return $;
        }
    }

}
