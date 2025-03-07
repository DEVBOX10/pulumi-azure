// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class RegistryNetworkRuleSet
    {
        /// <summary>
        /// The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
        /// </summary>
        public readonly string? DefaultAction;
        /// <summary>
        /// One or more `ip_rule` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegistryNetworkRuleSetIpRule> IpRules;
        /// <summary>
        /// One or more `virtual_network` blocks as defined below.
        /// 
        /// &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
        /// 
        /// &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you'll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegistryNetworkRuleSetVirtualNetwork> VirtualNetworks;

        [OutputConstructor]
        private RegistryNetworkRuleSet(
            string? defaultAction,

            ImmutableArray<Outputs.RegistryNetworkRuleSetIpRule> ipRules,

            ImmutableArray<Outputs.RegistryNetworkRuleSetVirtualNetwork> virtualNetworks)
        {
            DefaultAction = defaultAction;
            IpRules = ipRules;
            VirtualNetworks = virtualNetworks;
        }
    }
}
