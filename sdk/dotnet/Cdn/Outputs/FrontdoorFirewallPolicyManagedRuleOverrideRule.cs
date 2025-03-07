// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class FrontdoorFirewallPolicyManagedRuleOverrideRule
    {
        /// <summary>
        /// The action to be applied when the managed rule matches or when the anomaly score is 5 or greater. Possible values for DRS `1.1` and below are `Allow`, `Log`, `Block`, and `Redirect`. For DRS `2.0` and above the possible values are `Log` or `AnomalyScoring`.
        /// 
        /// -&gt;**NOTE:** Please see the DRS [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-front-door-drs?tabs=drs20#anomaly-scoring-mode) for more information.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Is the managed rule override enabled or disabled. Defaults to `false`
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// One or more `exclusion` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion> Exclusions;
        /// <summary>
        /// Identifier for the managed rule.
        /// </summary>
        public readonly string RuleId;

        [OutputConstructor]
        private FrontdoorFirewallPolicyManagedRuleOverrideRule(
            string action,

            bool? enabled,

            ImmutableArray<Outputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion> exclusions,

            string ruleId)
        {
            Action = action;
            Enabled = enabled;
            Exclusions = exclusions;
            RuleId = ruleId;
        }
    }
}
