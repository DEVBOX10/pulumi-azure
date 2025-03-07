// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MoverJobDefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final MoverJobDefinitionState Empty = new MoverJobDefinitionState();

    /**
     * Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
     * 
     */
    @Import(name="agentName")
    private @Nullable Output<String> agentName;

    /**
     * @return Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
     * 
     */
    public Optional<Output<String>> agentName() {
        return Optional.ofNullable(this.agentName);
    }

    /**
     * Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
     * 
     */
    @Import(name="copyMode")
    private @Nullable Output<String> copyMode;

    /**
     * @return Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
     * 
     */
    public Optional<Output<String>> copyMode() {
        return Optional.ofNullable(this.copyMode);
    }

    /**
     * Specifies a description for this Storage Mover Job Definition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies a description for this Storage Mover Job Definition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceName")
    private @Nullable Output<String> sourceName;

    /**
     * @return Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceName() {
        return Optional.ofNullable(this.sourceName);
    }

    /**
     * Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceSubPath")
    private @Nullable Output<String> sourceSubPath;

    /**
     * @return Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceSubPath() {
        return Optional.ofNullable(this.sourceSubPath);
    }

    /**
     * Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageMoverProjectId")
    private @Nullable Output<String> storageMoverProjectId;

    /**
     * @return Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageMoverProjectId() {
        return Optional.ofNullable(this.storageMoverProjectId);
    }

    /**
     * Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetName")
    private @Nullable Output<String> targetName;

    /**
     * @return Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> targetName() {
        return Optional.ofNullable(this.targetName);
    }

    /**
     * Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetSubPath")
    private @Nullable Output<String> targetSubPath;

    /**
     * @return Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> targetSubPath() {
        return Optional.ofNullable(this.targetSubPath);
    }

    private MoverJobDefinitionState() {}

    private MoverJobDefinitionState(MoverJobDefinitionState $) {
        this.agentName = $.agentName;
        this.copyMode = $.copyMode;
        this.description = $.description;
        this.name = $.name;
        this.sourceName = $.sourceName;
        this.sourceSubPath = $.sourceSubPath;
        this.storageMoverProjectId = $.storageMoverProjectId;
        this.targetName = $.targetName;
        this.targetSubPath = $.targetSubPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MoverJobDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoverJobDefinitionState $;

        public Builder() {
            $ = new MoverJobDefinitionState();
        }

        public Builder(MoverJobDefinitionState defaults) {
            $ = new MoverJobDefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentName Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
         * 
         * @return builder
         * 
         */
        public Builder agentName(@Nullable Output<String> agentName) {
            $.agentName = agentName;
            return this;
        }

        /**
         * @param agentName Specifies the name of the Storage Mover Agent to assign for new Job Runs of this Storage Mover Job Definition.
         * 
         * @return builder
         * 
         */
        public Builder agentName(String agentName) {
            return agentName(Output.of(agentName));
        }

        /**
         * @param copyMode Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
         * 
         * @return builder
         * 
         */
        public Builder copyMode(@Nullable Output<String> copyMode) {
            $.copyMode = copyMode;
            return this;
        }

        /**
         * @param copyMode Specifies the strategy to use for copy. Possible values are `Additive` and `Mirror`.
         * 
         * @return builder
         * 
         */
        public Builder copyMode(String copyMode) {
            return copyMode(Output.of(copyMode));
        }

        /**
         * @param description Specifies a description for this Storage Mover Job Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies a description for this Storage Mover Job Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Storage Mover Job Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceName Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceName(@Nullable Output<String> sourceName) {
            $.sourceName = sourceName;
            return this;
        }

        /**
         * @param sourceName Specifies the name of the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceName(String sourceName) {
            return sourceName(Output.of(sourceName));
        }

        /**
         * @param sourceSubPath Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceSubPath(@Nullable Output<String> sourceSubPath) {
            $.sourceSubPath = sourceSubPath;
            return this;
        }

        /**
         * @param sourceSubPath Specifies the sub path to use when reading from the Storage Mover Source Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceSubPath(String sourceSubPath) {
            return sourceSubPath(Output.of(sourceSubPath));
        }

        /**
         * @param storageMoverProjectId Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageMoverProjectId(@Nullable Output<String> storageMoverProjectId) {
            $.storageMoverProjectId = storageMoverProjectId;
            return this;
        }

        /**
         * @param storageMoverProjectId Specifies the ID of the Storage Mover Project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageMoverProjectId(String storageMoverProjectId) {
            return storageMoverProjectId(Output.of(storageMoverProjectId));
        }

        /**
         * @param targetName Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetName(@Nullable Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        /**
         * @param targetName Specifies the name of the Storage Mover target Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        /**
         * @param targetSubPath Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetSubPath(@Nullable Output<String> targetSubPath) {
            $.targetSubPath = targetSubPath;
            return this;
        }

        /**
         * @param targetSubPath Specifies the sub path to use when writing to the Storage Mover Target Endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetSubPath(String targetSubPath) {
            return targetSubPath(Output.of(targetSubPath));
        }

        public MoverJobDefinitionState build() {
            return $;
        }
    }

}
