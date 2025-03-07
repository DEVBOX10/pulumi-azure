// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetFilterOverlayVideoCropRectangleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The height of the rectangular region in pixels. This can be absolute pixel value (e.g `100`), or relative to the size of the video (For example, `50%`).
        /// </summary>
        [Input("height")]
        public Input<string>? Height { get; set; }

        /// <summary>
        /// The number of pixels from the left-margin. This can be absolute pixel value (e.g `100`), or relative to the size of the video (For example, `50%`).
        /// </summary>
        [Input("left")]
        public Input<string>? Left { get; set; }

        /// <summary>
        /// The number of pixels from the top-margin. This can be absolute pixel value (e.g `100`), or relative to the size of the video (For example, `50%`).
        /// </summary>
        [Input("top")]
        public Input<string>? Top { get; set; }

        /// <summary>
        /// The width of the rectangular region in pixels. This can be absolute pixel value (e.g` 100`), or relative to the size of the video (For example, `50%`).
        /// </summary>
        [Input("width")]
        public Input<string>? Width { get; set; }

        public TransformOutputCustomPresetFilterOverlayVideoCropRectangleGetArgs()
        {
        }
        public static new TransformOutputCustomPresetFilterOverlayVideoCropRectangleGetArgs Empty => new TransformOutputCustomPresetFilterOverlayVideoCropRectangleGetArgs();
    }
}
