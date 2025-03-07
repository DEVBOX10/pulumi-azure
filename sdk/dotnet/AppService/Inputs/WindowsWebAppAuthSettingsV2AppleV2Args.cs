// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsWebAppAuthSettingsV2AppleV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Client to use to authenticate with Azure Active Directory.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// The App Setting name that contains the client secret of the Client. Cannot be used with `client_secret`.
        /// </summary>
        [Input("clientSecretSettingName", required: true)]
        public Input<string> ClientSecretSettingName { get; set; } = null!;

        [Input("loginScopes")]
        private InputList<string>? _loginScopes;

        /// <summary>
        /// The list of Login scopes that should be requested as part of Microsoft Account authentication.
        /// </summary>
        public InputList<string> LoginScopes
        {
            get => _loginScopes ?? (_loginScopes = new InputList<string>());
            set => _loginScopes = value;
        }

        public WindowsWebAppAuthSettingsV2AppleV2Args()
        {
        }
        public static new WindowsWebAppAuthSettingsV2AppleV2Args Empty => new WindowsWebAppAuthSettingsV2AppleV2Args();
    }
}
