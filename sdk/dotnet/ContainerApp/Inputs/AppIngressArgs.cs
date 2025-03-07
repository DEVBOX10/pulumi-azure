// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class AppIngressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Should this ingress allow insecure connections?
        /// </summary>
        [Input("allowInsecureConnections")]
        public Input<bool>? AllowInsecureConnections { get; set; }

        /// <summary>
        /// One or more `custom_domain` block as detailed below.
        /// </summary>
        [Input("customDomain")]
        public Input<Inputs.AppIngressCustomDomainArgs>? CustomDomain { get; set; }

        /// <summary>
        /// The exposed port on the container for the Ingress traffic.
        /// 
        /// &gt; **Note:** `exposed_port` can only be specified when `transport` is set to `tcp`.
        /// </summary>
        [Input("exposedPort")]
        public Input<int>? ExposedPort { get; set; }

        /// <summary>
        /// Are connections to this Ingress from outside the Container App Environment enabled? Defaults to `false`.
        /// </summary>
        [Input("externalEnabled")]
        public Input<bool>? ExternalEnabled { get; set; }

        /// <summary>
        /// The FQDN of the ingress.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        /// <summary>
        /// The target port on the container for the Ingress traffic.
        /// </summary>
        [Input("targetPort", required: true)]
        public Input<int> TargetPort { get; set; } = null!;

        [Input("trafficWeights", required: true)]
        private InputList<Inputs.AppIngressTrafficWeightArgs>? _trafficWeights;

        /// <summary>
        /// A `traffic_weight` block as detailed below.
        /// 
        /// &gt; **Note:** `traffic_weight` can only be specified when `revision_mode` is set to `Multiple`.
        /// </summary>
        public InputList<Inputs.AppIngressTrafficWeightArgs> TrafficWeights
        {
            get => _trafficWeights ?? (_trafficWeights = new InputList<Inputs.AppIngressTrafficWeightArgs>());
            set => _trafficWeights = value;
        }

        /// <summary>
        /// The transport method for the Ingress. Possible values include `auto`, `http`, `http2` and `tcp`. Defaults to `auto`
        /// </summary>
        [Input("transport")]
        public Input<string>? Transport { get; set; }

        public AppIngressArgs()
        {
        }
        public static new AppIngressArgs Empty => new AppIngressArgs();
    }
}
