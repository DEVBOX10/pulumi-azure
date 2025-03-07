// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Inputs
{

    public sealed class LabConnectionSettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The enabled access level for Client Access over RDP. Possible value is `Public`.
        /// 
        /// &gt; **NOTE:** This property is `None` when it isn't specified.
        /// </summary>
        [Input("clientRdpAccess")]
        public Input<string>? ClientRdpAccess { get; set; }

        /// <summary>
        /// The enabled access level for Client Access over SSH. Possible value is `Public`.
        /// 
        /// &gt; **NOTE:** This property is `None` when it isn't specified.
        /// </summary>
        [Input("clientSshAccess")]
        public Input<string>? ClientSshAccess { get; set; }

        public LabConnectionSettingArgs()
        {
        }
        public static new LabConnectionSettingArgs Empty => new LabConnectionSettingArgs();
    }
}
