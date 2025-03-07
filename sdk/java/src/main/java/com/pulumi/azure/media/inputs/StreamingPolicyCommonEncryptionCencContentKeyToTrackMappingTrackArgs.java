// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.azure.media.inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs Empty = new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs();

    /**
     * One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="conditions", required=true)
    private Output<List<StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs>> conditions;

    /**
     * @return One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Output<List<StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs>> conditions() {
        return this.conditions;
    }

    private StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs() {}

    private StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs(StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs $;

        public Builder() {
            $ = new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs();
        }

        public Builder(StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs defaults) {
            $ = new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder conditions(Output<List<StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions One or more `condition` blocks as defined below. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder conditions(StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
