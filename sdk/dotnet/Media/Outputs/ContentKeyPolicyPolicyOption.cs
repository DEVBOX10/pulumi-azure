// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Outputs
{

    [OutputType]
    public sealed class ContentKeyPolicyPolicyOption
    {
        /// <summary>
        /// Enable a configuration for non-DRM keys.
        /// </summary>
        public readonly bool? ClearKeyConfigurationEnabled;
        /// <summary>
        /// A `fairplay_configuration` block as defined above. Check license requirements here &lt;https://docs.microsoft.com/azure/media-services/latest/fairplay-license-overview&gt;.
        /// </summary>
        public readonly Outputs.ContentKeyPolicyPolicyOptionFairplayConfiguration? FairplayConfiguration;
        /// <summary>
        /// The name which should be used for this Policy Option.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Enable an open restriction. License or key will be delivered on every request.
        /// </summary>
        public readonly bool? OpenRestrictionEnabled;
        /// <summary>
        /// One or more `playready_configuration_license` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense> PlayreadyConfigurationLicenses;
        /// <summary>
        /// The custom response data of the PlayReady configuration. This only applies when `playready_configuration_license` is specified.
        /// </summary>
        public readonly string? PlayreadyResponseCustomData;
        /// <summary>
        /// A `token_restriction` block as defined below.
        /// </summary>
        public readonly Outputs.ContentKeyPolicyPolicyOptionTokenRestriction? TokenRestriction;
        /// <summary>
        /// The Widevine template.
        /// 
        /// &gt; **NOTE:** Each policy_option can only have one type of configuration: `fairplay_configuration`, `clear_key_configuration_enabled`, `playready_configuration_license` or `widevine_configuration_template`. And is possible to assign only one type of restriction: `open_restriction_enabled` or `token_restriction`.
        /// </summary>
        public readonly string? WidevineConfigurationTemplate;

        [OutputConstructor]
        private ContentKeyPolicyPolicyOption(
            bool? clearKeyConfigurationEnabled,

            Outputs.ContentKeyPolicyPolicyOptionFairplayConfiguration? fairplayConfiguration,

            string name,

            bool? openRestrictionEnabled,

            ImmutableArray<Outputs.ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicense> playreadyConfigurationLicenses,

            string? playreadyResponseCustomData,

            Outputs.ContentKeyPolicyPolicyOptionTokenRestriction? tokenRestriction,

            string? widevineConfigurationTemplate)
        {
            ClearKeyConfigurationEnabled = clearKeyConfigurationEnabled;
            FairplayConfiguration = fairplayConfiguration;
            Name = name;
            OpenRestrictionEnabled = openRestrictionEnabled;
            PlayreadyConfigurationLicenses = playreadyConfigurationLicenses;
            PlayreadyResponseCustomData = playreadyResponseCustomData;
            TokenRestriction = tokenRestriction;
            WidevineConfigurationTemplate = widevineConfigurationTemplate;
        }
    }
}
