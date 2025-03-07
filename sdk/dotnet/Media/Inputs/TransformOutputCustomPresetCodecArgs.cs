// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetCodecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `aac_audio` block as defined above.
        /// </summary>
        [Input("aacAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecAacAudioArgs>? AacAudio { get; set; }

        /// <summary>
        /// A `copy_audio` block as defined below.
        /// </summary>
        [Input("copyAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecCopyAudioArgs>? CopyAudio { get; set; }

        /// <summary>
        /// A `copy_video` block as defined below.
        /// </summary>
        [Input("copyVideo")]
        public Input<Inputs.TransformOutputCustomPresetCodecCopyVideoArgs>? CopyVideo { get; set; }

        /// <summary>
        /// A `dd_audio` block as defined below.
        /// </summary>
        [Input("ddAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecDdAudioArgs>? DdAudio { get; set; }

        /// <summary>
        /// A `h264_video` block as defined below.
        /// </summary>
        [Input("h264Video")]
        public Input<Inputs.TransformOutputCustomPresetCodecH264VideoArgs>? H264Video { get; set; }

        /// <summary>
        /// A `h265_video` block as defined below.
        /// </summary>
        [Input("h265Video")]
        public Input<Inputs.TransformOutputCustomPresetCodecH265VideoArgs>? H265Video { get; set; }

        /// <summary>
        /// A `jpg_image` block as defined below.
        /// </summary>
        [Input("jpgImage")]
        public Input<Inputs.TransformOutputCustomPresetCodecJpgImageArgs>? JpgImage { get; set; }

        /// <summary>
        /// A `png_image` block as defined below.
        /// 
        /// &gt; **NOTE:** Each codec can only have one type: `aac_audio`, `copy_audio`, `copy_video`, `dd_audio`, `h264_video`, `h265_video`, `jpg_image` or `png_image`. If you need to apply different codec you must create one codec for each one.
        /// </summary>
        [Input("pngImage")]
        public Input<Inputs.TransformOutputCustomPresetCodecPngImageArgs>? PngImage { get; set; }

        public TransformOutputCustomPresetCodecArgs()
        {
        }
        public static new TransformOutputCustomPresetCodecArgs Empty => new TransformOutputCustomPresetCodecArgs();
    }
}
