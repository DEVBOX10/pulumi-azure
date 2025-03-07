// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `audio_analyzer_preset` block as defined above.
        /// </summary>
        [Input("audioAnalyzerPreset")]
        public Input<Inputs.TransformOutputAudioAnalyzerPresetArgs>? AudioAnalyzerPreset { get; set; }

        /// <summary>
        /// A `builtin_preset` block as defined above.
        /// </summary>
        [Input("builtinPreset")]
        public Input<Inputs.TransformOutputBuiltinPresetArgs>? BuiltinPreset { get; set; }

        /// <summary>
        /// A `custom_preset` block as defined above.
        /// </summary>
        [Input("customPreset")]
        public Input<Inputs.TransformOutputCustomPresetArgs>? CustomPreset { get; set; }

        /// <summary>
        /// A `face_detector_preset` block as defined above.
        /// </summary>
        [Input("faceDetectorPreset")]
        public Input<Inputs.TransformOutputFaceDetectorPresetArgs>? FaceDetectorPreset { get; set; }

        /// <summary>
        /// A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with `ContinueJob`. Possible values are `StopProcessingJob` or `ContinueJob`. The default is `StopProcessingJob`.
        /// </summary>
        [Input("onErrorAction")]
        public Input<string>? OnErrorAction { get; set; }

        /// <summary>
        /// Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing Transform Outputs. Possible values are `High`, `Normal` or `Low`. Defaults to `Normal`.
        /// </summary>
        [Input("relativePriority")]
        public Input<string>? RelativePriority { get; set; }

        /// <summary>
        /// A `video_analyzer_preset` block as defined below.
        /// 
        /// &gt; **NOTE:** Each output can only have one type of preset: `builtin_preset`, `audio_analyzer_preset`, `custom_preset`, `face_detector_preset` or `video_analyzer_preset`. If you need to apply different presets you must create one output for each one.
        /// </summary>
        [Input("videoAnalyzerPreset")]
        public Input<Inputs.TransformOutputVideoAnalyzerPresetArgs>? VideoAnalyzerPreset { get; set; }

        public TransformOutputArgs()
        {
        }
        public static new TransformOutputArgs Empty => new TransformOutputArgs();
    }
}
