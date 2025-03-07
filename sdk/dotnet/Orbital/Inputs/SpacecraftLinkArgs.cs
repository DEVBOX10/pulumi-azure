// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Orbital.Inputs
{

    public sealed class SpacecraftLinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bandwidth in Mhz.
        /// </summary>
        [Input("bandwidthMhz", required: true)]
        public Input<double> BandwidthMhz { get; set; } = null!;

        /// <summary>
        /// Center frequency in Mhz.
        /// </summary>
        [Input("centerFrequencyMhz", required: true)]
        public Input<double> CenterFrequencyMhz { get; set; } = null!;

        /// <summary>
        /// Direction if the communication. Possible values are `Uplink` and `Downlink`.
        /// </summary>
        [Input("direction", required: true)]
        public Input<string> Direction { get; set; } = null!;

        /// <summary>
        /// Name of the link.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Polarization. Possible values are `RHCP`, `LHCP`, `linearVertical` and `linearHorizontal`.
        /// </summary>
        [Input("polarization", required: true)]
        public Input<string> Polarization { get; set; } = null!;

        public SpacecraftLinkArgs()
        {
        }
        public static new SpacecraftLinkArgs Empty => new SpacecraftLinkArgs();
    }
}
