// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class GetAppIngressResult
    {
        /// <summary>
        /// Should this ingress allow insecure connections?
        /// </summary>
        public readonly bool AllowInsecureConnections;
        /// <summary>
        /// One or more `custom_domain` block as detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppIngressCustomDomainResult> CustomDomains;
        public readonly int ExposedPort;
        /// <summary>
        /// Is this an external Ingress.
        /// </summary>
        public readonly bool ExternalEnabled;
        /// <summary>
        /// The FQDN of the ingress.
        /// </summary>
        public readonly string Fqdn;
        /// <summary>
        /// The target port on the container for the Ingress traffic.
        /// </summary>
        public readonly int TargetPort;
        /// <summary>
        /// A `traffic_weight` block as detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppIngressTrafficWeightResult> TrafficWeights;
        /// <summary>
        /// The transport method for the Ingress. Possible values include `auto`, `http`, and `http2`. Defaults to `auto`
        /// </summary>
        public readonly string Transport;

        [OutputConstructor]
        private GetAppIngressResult(
            bool allowInsecureConnections,

            ImmutableArray<Outputs.GetAppIngressCustomDomainResult> customDomains,

            int exposedPort,

            bool externalEnabled,

            string fqdn,

            int targetPort,

            ImmutableArray<Outputs.GetAppIngressTrafficWeightResult> trafficWeights,

            string transport)
        {
            AllowInsecureConnections = allowInsecureConnections;
            CustomDomains = customDomains;
            ExposedPort = exposedPort;
            ExternalEnabled = externalEnabled;
            Fqdn = fqdn;
            TargetPort = targetPort;
            TrafficWeights = trafficWeights;
            Transport = transport;
        }
    }
}
