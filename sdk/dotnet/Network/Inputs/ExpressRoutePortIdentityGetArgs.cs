// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class ExpressRoutePortIdentityGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityIds", required: true)]
        private InputList<string>? _identityIds;

        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Express Route Port.
        /// </summary>
        public InputList<string> IdentityIds
        {
            get => _identityIds ?? (_identityIds = new InputList<string>());
            set => _identityIds = value;
        }

        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this Express Route Port. Only possible value is `UserAssigned`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ExpressRoutePortIdentityGetArgs()
        {
        }
        public static new ExpressRoutePortIdentityGetArgs Empty => new ExpressRoutePortIdentityGetArgs();
    }
}
