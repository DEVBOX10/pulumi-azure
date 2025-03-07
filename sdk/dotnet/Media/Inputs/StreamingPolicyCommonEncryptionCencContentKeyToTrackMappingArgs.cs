// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the content key when creating a Streaming Locator. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The policy used by the default key. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        [Input("policyName")]
        public Input<string>? PolicyName { get; set; }

        [Input("tracks", required: true)]
        private InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs>? _tracks;

        /// <summary>
        /// One or more `track` blocks as defined below. Changing this forces a new Streaming Policy to be created.
        /// </summary>
        public InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs> Tracks
        {
            get => _tracks ?? (_tracks = new InputList<Inputs.StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingTrackArgs>());
            set => _tracks = value;
        }

        public StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingArgs()
        {
        }
        public static new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingArgs Empty => new StreamingPolicyCommonEncryptionCencContentKeyToTrackMappingArgs();
    }
}
