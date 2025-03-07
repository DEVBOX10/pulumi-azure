// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive.inputs;

import com.pulumi.azure.cognitive.inputs.DeploymentModelArgs;
import com.pulumi.azure.cognitive.inputs.DeploymentScaleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentState Empty = new DeploymentState();

    /**
     * The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="cognitiveAccountId")
    private @Nullable Output<String> cognitiveAccountId;

    /**
     * @return The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> cognitiveAccountId() {
        return Optional.ofNullable(this.cognitiveAccountId);
    }

    /**
     * A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="model")
    private @Nullable Output<DeploymentModelArgs> model;

    /**
     * @return A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<DeploymentModelArgs>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of RAI policy.
     * 
     */
    @Import(name="raiPolicyName")
    private @Nullable Output<String> raiPolicyName;

    /**
     * @return The name of RAI policy.
     * 
     */
    public Optional<Output<String>> raiPolicyName() {
        return Optional.ofNullable(this.raiPolicyName);
    }

    /**
     * A `scale` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scale")
    private @Nullable Output<DeploymentScaleArgs> scale;

    /**
     * @return A `scale` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<DeploymentScaleArgs>> scale() {
        return Optional.ofNullable(this.scale);
    }

    private DeploymentState() {}

    private DeploymentState(DeploymentState $) {
        this.cognitiveAccountId = $.cognitiveAccountId;
        this.model = $.model;
        this.name = $.name;
        this.raiPolicyName = $.raiPolicyName;
        this.scale = $.scale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentState $;

        public Builder() {
            $ = new DeploymentState();
        }

        public Builder(DeploymentState defaults) {
            $ = new DeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(@Nullable Output<String> cognitiveAccountId) {
            $.cognitiveAccountId = cognitiveAccountId;
            return this;
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(String cognitiveAccountId) {
            return cognitiveAccountId(Output.of(cognitiveAccountId));
        }

        /**
         * @param model A `model` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<DeploymentModelArgs> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model A `model` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder model(DeploymentModelArgs model) {
            return model(Output.of(model));
        }

        /**
         * @param name The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param raiPolicyName The name of RAI policy.
         * 
         * @return builder
         * 
         */
        public Builder raiPolicyName(@Nullable Output<String> raiPolicyName) {
            $.raiPolicyName = raiPolicyName;
            return this;
        }

        /**
         * @param raiPolicyName The name of RAI policy.
         * 
         * @return builder
         * 
         */
        public Builder raiPolicyName(String raiPolicyName) {
            return raiPolicyName(Output.of(raiPolicyName));
        }

        /**
         * @param scale A `scale` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scale(@Nullable Output<DeploymentScaleArgs> scale) {
            $.scale = scale;
            return this;
        }

        /**
         * @param scale A `scale` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scale(DeploymentScaleArgs scale) {
            return scale(Output.of(scale));
        }

        public DeploymentState build() {
            return $;
        }
    }

}
