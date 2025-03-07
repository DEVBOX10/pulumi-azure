// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Inputs
{

    public sealed class CertifiateCertificatePolicyLifetimeActionActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Type of action to be performed when the lifetime trigger is triggerec. Possible values include `AutoRenew` and `EmailContacts`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("actionType", required: true)]
        public Input<string> ActionType { get; set; } = null!;

        public CertifiateCertificatePolicyLifetimeActionActionArgs()
        {
        }
        public static new CertifiateCertificatePolicyLifetimeActionActionArgs Empty => new CertifiateCertificatePolicyLifetimeActionActionArgs();
    }
}
