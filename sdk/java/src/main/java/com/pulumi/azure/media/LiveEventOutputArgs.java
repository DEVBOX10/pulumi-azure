// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LiveEventOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final LiveEventOutputArgs Empty = new LiveEventOutputArgs();

    /**
     * `ISO 8601` time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use `PT1H30M` to indicate 1 hour and 30 minutes of archive window. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="archiveWindowDuration", required=true)
    private Output<String> archiveWindowDuration;

    /**
     * @return `ISO 8601` time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use `PT1H30M` to indicate 1 hour and 30 minutes of archive window. Changing this forces a new Live Output to be created.
     * 
     */
    public Output<String> archiveWindowDuration() {
        return this.archiveWindowDuration;
    }

    /**
     * The asset that the live output will write to. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="assetName", required=true)
    private Output<String> assetName;

    /**
     * @return The asset that the live output will write to. Changing this forces a new Live Output to be created.
     * 
     */
    public Output<String> assetName() {
        return this.assetName;
    }

    /**
     * The description of the live output. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the live output. Changing this forces a new Live Output to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="hlsFragmentsPerTsSegment")
    private @Nullable Output<Integer> hlsFragmentsPerTsSegment;

    /**
     * @return The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output. Changing this forces a new Live Output to be created.
     * 
     */
    public Optional<Output<Integer>> hlsFragmentsPerTsSegment() {
        return Optional.ofNullable(this.hlsFragmentsPerTsSegment);
    }

    /**
     * The id of the live event. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="liveEventId", required=true)
    private Output<String> liveEventId;

    /**
     * @return The id of the live event. Changing this forces a new Live Output to be created.
     * 
     */
    public Output<String> liveEventId() {
        return this.liveEventId;
    }

    /**
     * The manifest file name. If not provided, the service will generate one automatically. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="manifestName")
    private @Nullable Output<String> manifestName;

    /**
     * @return The manifest file name. If not provided, the service will generate one automatically. Changing this forces a new Live Output to be created.
     * 
     */
    public Optional<Output<String>> manifestName() {
        return Optional.ofNullable(this.manifestName);
    }

    /**
     * The name which should be used for this Live Event Output. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Live Event Output. Changing this forces a new Live Output to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The initial timestamp that the live output will start at, any content before this value will not be archived. Changing this forces a new Live Output to be created.
     * 
     */
    @Import(name="outputSnapTimeInSeconds")
    private @Nullable Output<Integer> outputSnapTimeInSeconds;

    /**
     * @return The initial timestamp that the live output will start at, any content before this value will not be archived. Changing this forces a new Live Output to be created.
     * 
     */
    public Optional<Output<Integer>> outputSnapTimeInSeconds() {
        return Optional.ofNullable(this.outputSnapTimeInSeconds);
    }

    @Import(name="rewindWindowDuration")
    private @Nullable Output<String> rewindWindowDuration;

    public Optional<Output<String>> rewindWindowDuration() {
        return Optional.ofNullable(this.rewindWindowDuration);
    }

    private LiveEventOutputArgs() {}

    private LiveEventOutputArgs(LiveEventOutputArgs $) {
        this.archiveWindowDuration = $.archiveWindowDuration;
        this.assetName = $.assetName;
        this.description = $.description;
        this.hlsFragmentsPerTsSegment = $.hlsFragmentsPerTsSegment;
        this.liveEventId = $.liveEventId;
        this.manifestName = $.manifestName;
        this.name = $.name;
        this.outputSnapTimeInSeconds = $.outputSnapTimeInSeconds;
        this.rewindWindowDuration = $.rewindWindowDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LiveEventOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LiveEventOutputArgs $;

        public Builder() {
            $ = new LiveEventOutputArgs();
        }

        public Builder(LiveEventOutputArgs defaults) {
            $ = new LiveEventOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveWindowDuration `ISO 8601` time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use `PT1H30M` to indicate 1 hour and 30 minutes of archive window. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder archiveWindowDuration(Output<String> archiveWindowDuration) {
            $.archiveWindowDuration = archiveWindowDuration;
            return this;
        }

        /**
         * @param archiveWindowDuration `ISO 8601` time between 1 minute to 25 hours to indicate the maximum content length that can be archived in the asset for this live output. This also sets the maximum content length for the rewind window. For example, use `PT1H30M` to indicate 1 hour and 30 minutes of archive window. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder archiveWindowDuration(String archiveWindowDuration) {
            return archiveWindowDuration(Output.of(archiveWindowDuration));
        }

        /**
         * @param assetName The asset that the live output will write to. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder assetName(Output<String> assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param assetName The asset that the live output will write to. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            return assetName(Output.of(assetName));
        }

        /**
         * @param description The description of the live output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the live output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hlsFragmentsPerTsSegment The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder hlsFragmentsPerTsSegment(@Nullable Output<Integer> hlsFragmentsPerTsSegment) {
            $.hlsFragmentsPerTsSegment = hlsFragmentsPerTsSegment;
            return this;
        }

        /**
         * @param hlsFragmentsPerTsSegment The number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder hlsFragmentsPerTsSegment(Integer hlsFragmentsPerTsSegment) {
            return hlsFragmentsPerTsSegment(Output.of(hlsFragmentsPerTsSegment));
        }

        /**
         * @param liveEventId The id of the live event. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder liveEventId(Output<String> liveEventId) {
            $.liveEventId = liveEventId;
            return this;
        }

        /**
         * @param liveEventId The id of the live event. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder liveEventId(String liveEventId) {
            return liveEventId(Output.of(liveEventId));
        }

        /**
         * @param manifestName The manifest file name. If not provided, the service will generate one automatically. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(@Nullable Output<String> manifestName) {
            $.manifestName = manifestName;
            return this;
        }

        /**
         * @param manifestName The manifest file name. If not provided, the service will generate one automatically. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder manifestName(String manifestName) {
            return manifestName(Output.of(manifestName));
        }

        /**
         * @param name The name which should be used for this Live Event Output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Live Event Output. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputSnapTimeInSeconds The initial timestamp that the live output will start at, any content before this value will not be archived. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder outputSnapTimeInSeconds(@Nullable Output<Integer> outputSnapTimeInSeconds) {
            $.outputSnapTimeInSeconds = outputSnapTimeInSeconds;
            return this;
        }

        /**
         * @param outputSnapTimeInSeconds The initial timestamp that the live output will start at, any content before this value will not be archived. Changing this forces a new Live Output to be created.
         * 
         * @return builder
         * 
         */
        public Builder outputSnapTimeInSeconds(Integer outputSnapTimeInSeconds) {
            return outputSnapTimeInSeconds(Output.of(outputSnapTimeInSeconds));
        }

        public Builder rewindWindowDuration(@Nullable Output<String> rewindWindowDuration) {
            $.rewindWindowDuration = rewindWindowDuration;
            return this;
        }

        public Builder rewindWindowDuration(String rewindWindowDuration) {
            return rewindWindowDuration(Output.of(rewindWindowDuration));
        }

        public LiveEventOutputArgs build() {
            $.archiveWindowDuration = Objects.requireNonNull($.archiveWindowDuration, "expected parameter 'archiveWindowDuration' to be non-null");
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.liveEventId = Objects.requireNonNull($.liveEventId, "expected parameter 'liveEventId' to be non-null");
            return $;
        }
    }

}
