// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetFormatTransportStreamOutputFileArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels", required: true)]
        private InputList<string>? _labels;

        /// <summary>
        /// The list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels `v1` and `v2`, and one audio layer with label `a1`, then an array like `["v1", "a1"]` tells the encoder to produce an output file with the video track represented by `v1` and the audio track represented by `a1`.
        /// </summary>
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        public TransformOutputCustomPresetFormatTransportStreamOutputFileArgs()
        {
        }
        public static new TransformOutputCustomPresetFormatTransportStreamOutputFileArgs Empty => new TransformOutputCustomPresetFormatTransportStreamOutputFileArgs();
    }
}
