// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Orbital.Outputs
{

    [OutputType]
    public sealed class SpacecraftLink
    {
        /// <summary>
        /// Bandwidth in Mhz.
        /// </summary>
        public readonly double BandwidthMhz;
        /// <summary>
        /// Center frequency in Mhz.
        /// </summary>
        public readonly double CenterFrequencyMhz;
        /// <summary>
        /// Direction if the communication. Possible values are `Uplink` and `Downlink`.
        /// </summary>
        public readonly string Direction;
        /// <summary>
        /// Name of the link.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Polarization. Possible values are `RHCP`, `LHCP`, `linearVertical` and `linearHorizontal`.
        /// </summary>
        public readonly string Polarization;

        [OutputConstructor]
        private SpacecraftLink(
            double bandwidthMhz,

            double centerFrequencyMhz,

            string direction,

            string name,

            string polarization)
        {
            BandwidthMhz = bandwidthMhz;
            CenterFrequencyMhz = centerFrequencyMhz;
            Direction = direction;
            Name = name;
            Polarization = polarization;
        }
    }
}
