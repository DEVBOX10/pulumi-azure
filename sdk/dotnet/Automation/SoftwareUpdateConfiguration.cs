// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation
{
    /// <summary>
    /// Manages an Automation Software Update Configuraion.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Automation.Account("exampleAccount", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         SkuName = "Basic",
    ///     });
    /// 
    ///     var exampleRunBook = new Azure.Automation.RunBook("exampleRunBook", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         AutomationAccountName = exampleAccount.Name,
    ///         LogVerbose = true,
    ///         LogProgress = true,
    ///         Description = "This is a example runbook for terraform acceptance example",
    ///         RunbookType = "Python3",
    ///         Content = @"# Some example content
    /// # for Terraform acceptance example
    /// ",
    ///         Tags = 
    ///         {
    ///             { "ENV", "runbook_test" },
    ///         },
    ///     });
    /// 
    ///     var exampleSoftwareUpdateConfiguration = new Azure.Automation.SoftwareUpdateConfiguration("exampleSoftwareUpdateConfiguration", new()
    ///     {
    ///         AutomationAccountId = exampleAccount.Id,
    ///         OperatingSystem = "Linux",
    ///         Linuxes = new[]
    ///         {
    ///             new Azure.Automation.Inputs.SoftwareUpdateConfigurationLinuxArgs
    ///             {
    ///                 ClassificationIncluded = "Security",
    ///                 ExcludedPackages = new[]
    ///                 {
    ///                     "apt",
    ///                 },
    ///                 IncludedPackages = new[]
    ///                 {
    ///                     "vim",
    ///                 },
    ///                 Reboot = "IfRequired",
    ///             },
    ///         },
    ///         PreTasks = new[]
    ///         {
    ///             new Azure.Automation.Inputs.SoftwareUpdateConfigurationPreTaskArgs
    ///             {
    ///                 Source = exampleRunBook.Name,
    ///                 Parameters = 
    ///                 {
    ///                     { "COMPUTER_NAME", "Foo" },
    ///                 },
    ///             },
    ///         },
    ///         Duration = "PT2H2M2S",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Automations Software Update Configuration can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/softwareUpdateConfigurations/suc1
    /// ```
    /// </summary>
    [AzureResourceType("azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration")]
    public partial class SoftwareUpdateConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        /// </summary>
        [Output("automationAccountId")]
        public Output<string> AutomationAccountId { get; private set; } = null!;

        /// <summary>
        /// Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601. Defaults to `PT2H`.
        /// </summary>
        [Output("duration")]
        public Output<string?> Duration { get; private set; } = null!;

        /// <summary>
        /// The Error code when failed.
        /// </summary>
        [Output("errorCode")]
        public Output<string> ErrorCode { get; private set; } = null!;

        /// <summary>
        /// The Error message indicating why the operation failed.
        /// </summary>
        [Output("errorMeesage")]
        public Output<string> ErrorMeesage { get; private set; } = null!;

        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// A `linux` block as defined below.
        /// </summary>
        [Output("linuxes")]
        public Output<ImmutableArray<Outputs.SoftwareUpdateConfigurationLinux>> Linuxes { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Automation. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of names of non-Azure machines for the software update configuration.
        /// </summary>
        [Output("nonAzureComputerNames")]
        public Output<ImmutableArray<string>> NonAzureComputerNames { get; private set; } = null!;

        [Output("operatingSystem")]
        public Output<string> OperatingSystem { get; private set; } = null!;

        /// <summary>
        /// A `post_task` blocks as defined below.
        /// </summary>
        [Output("postTasks")]
        public Output<ImmutableArray<Outputs.SoftwareUpdateConfigurationPostTask>> PostTasks { get; private set; } = null!;

        /// <summary>
        /// A `pre_task` blocks as defined below.
        /// </summary>
        [Output("preTasks")]
        public Output<ImmutableArray<Outputs.SoftwareUpdateConfigurationPreTask>> PreTasks { get; private set; } = null!;

        /// <summary>
        /// A `schedule` blocks as defined below.
        /// </summary>
        [Output("schedules")]
        public Output<ImmutableArray<Outputs.SoftwareUpdateConfigurationSchedule>> Schedules { get; private set; } = null!;

        /// <summary>
        /// A `target` blocks as defined below.
        /// </summary>
        [Output("target")]
        public Output<Outputs.SoftwareUpdateConfigurationTarget?> Target { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of Azure Resource IDs of azure virtual machines.
        /// </summary>
        [Output("virtualMachineIds")]
        public Output<ImmutableArray<string>> VirtualMachineIds { get; private set; } = null!;

        /// <summary>
        /// A `windows` block as defined below.
        /// 
        /// &gt; **NOTE:** One of `linux` or `windows` must be specified.
        /// </summary>
        [Output("windows")]
        public Output<Outputs.SoftwareUpdateConfigurationWindows?> Windows { get; private set; } = null!;


        /// <summary>
        /// Create a SoftwareUpdateConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SoftwareUpdateConfiguration(string name, SoftwareUpdateConfigurationArgs args, CustomResourceOptions? options = null)
            : base("azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration", name, args ?? new SoftwareUpdateConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SoftwareUpdateConfiguration(string name, Input<string> id, SoftwareUpdateConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("azure:automation/softwareUpdateConfiguration:SoftwareUpdateConfiguration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SoftwareUpdateConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SoftwareUpdateConfiguration Get(string name, Input<string> id, SoftwareUpdateConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new SoftwareUpdateConfiguration(name, id, state, options);
        }
    }

    public sealed class SoftwareUpdateConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        /// </summary>
        [Input("automationAccountId", required: true)]
        public Input<string> AutomationAccountId { get; set; } = null!;

        /// <summary>
        /// Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601. Defaults to `PT2H`.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        [Input("linuxes")]
        private InputList<Inputs.SoftwareUpdateConfigurationLinuxArgs>? _linuxes;

        /// <summary>
        /// A `linux` block as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationLinuxArgs> Linuxes
        {
            get => _linuxes ?? (_linuxes = new InputList<Inputs.SoftwareUpdateConfigurationLinuxArgs>());
            set => _linuxes = value;
        }

        /// <summary>
        /// The name which should be used for this Automation. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nonAzureComputerNames")]
        private InputList<string>? _nonAzureComputerNames;

        /// <summary>
        /// Specifies a list of names of non-Azure machines for the software update configuration.
        /// </summary>
        public InputList<string> NonAzureComputerNames
        {
            get => _nonAzureComputerNames ?? (_nonAzureComputerNames = new InputList<string>());
            set => _nonAzureComputerNames = value;
        }

        [Input("operatingSystem")]
        public Input<string>? OperatingSystem { get; set; }

        [Input("postTasks")]
        private InputList<Inputs.SoftwareUpdateConfigurationPostTaskArgs>? _postTasks;

        /// <summary>
        /// A `post_task` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationPostTaskArgs> PostTasks
        {
            get => _postTasks ?? (_postTasks = new InputList<Inputs.SoftwareUpdateConfigurationPostTaskArgs>());
            set => _postTasks = value;
        }

        [Input("preTasks")]
        private InputList<Inputs.SoftwareUpdateConfigurationPreTaskArgs>? _preTasks;

        /// <summary>
        /// A `pre_task` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationPreTaskArgs> PreTasks
        {
            get => _preTasks ?? (_preTasks = new InputList<Inputs.SoftwareUpdateConfigurationPreTaskArgs>());
            set => _preTasks = value;
        }

        [Input("schedules", required: true)]
        private InputList<Inputs.SoftwareUpdateConfigurationScheduleArgs>? _schedules;

        /// <summary>
        /// A `schedule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationScheduleArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.SoftwareUpdateConfigurationScheduleArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// A `target` blocks as defined below.
        /// </summary>
        [Input("target")]
        public Input<Inputs.SoftwareUpdateConfigurationTargetArgs>? Target { get; set; }

        [Input("virtualMachineIds")]
        private InputList<string>? _virtualMachineIds;

        /// <summary>
        /// Specifies a list of Azure Resource IDs of azure virtual machines.
        /// </summary>
        public InputList<string> VirtualMachineIds
        {
            get => _virtualMachineIds ?? (_virtualMachineIds = new InputList<string>());
            set => _virtualMachineIds = value;
        }

        /// <summary>
        /// A `windows` block as defined below.
        /// 
        /// &gt; **NOTE:** One of `linux` or `windows` must be specified.
        /// </summary>
        [Input("windows")]
        public Input<Inputs.SoftwareUpdateConfigurationWindowsArgs>? Windows { get; set; }

        public SoftwareUpdateConfigurationArgs()
        {
        }
        public static new SoftwareUpdateConfigurationArgs Empty => new SoftwareUpdateConfigurationArgs();
    }

    public sealed class SoftwareUpdateConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        /// </summary>
        [Input("automationAccountId")]
        public Input<string>? AutomationAccountId { get; set; }

        /// <summary>
        /// Maximum time allowed for the software update configuration run. using format `PT[n]H[n]M[n]S` as per ISO8601. Defaults to `PT2H`.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// The Error code when failed.
        /// </summary>
        [Input("errorCode")]
        public Input<string>? ErrorCode { get; set; }

        /// <summary>
        /// The Error message indicating why the operation failed.
        /// </summary>
        [Input("errorMeesage")]
        public Input<string>? ErrorMeesage { get; set; }

        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("linuxes")]
        private InputList<Inputs.SoftwareUpdateConfigurationLinuxGetArgs>? _linuxes;

        /// <summary>
        /// A `linux` block as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationLinuxGetArgs> Linuxes
        {
            get => _linuxes ?? (_linuxes = new InputList<Inputs.SoftwareUpdateConfigurationLinuxGetArgs>());
            set => _linuxes = value;
        }

        /// <summary>
        /// The name which should be used for this Automation. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nonAzureComputerNames")]
        private InputList<string>? _nonAzureComputerNames;

        /// <summary>
        /// Specifies a list of names of non-Azure machines for the software update configuration.
        /// </summary>
        public InputList<string> NonAzureComputerNames
        {
            get => _nonAzureComputerNames ?? (_nonAzureComputerNames = new InputList<string>());
            set => _nonAzureComputerNames = value;
        }

        [Input("operatingSystem")]
        public Input<string>? OperatingSystem { get; set; }

        [Input("postTasks")]
        private InputList<Inputs.SoftwareUpdateConfigurationPostTaskGetArgs>? _postTasks;

        /// <summary>
        /// A `post_task` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationPostTaskGetArgs> PostTasks
        {
            get => _postTasks ?? (_postTasks = new InputList<Inputs.SoftwareUpdateConfigurationPostTaskGetArgs>());
            set => _postTasks = value;
        }

        [Input("preTasks")]
        private InputList<Inputs.SoftwareUpdateConfigurationPreTaskGetArgs>? _preTasks;

        /// <summary>
        /// A `pre_task` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationPreTaskGetArgs> PreTasks
        {
            get => _preTasks ?? (_preTasks = new InputList<Inputs.SoftwareUpdateConfigurationPreTaskGetArgs>());
            set => _preTasks = value;
        }

        [Input("schedules")]
        private InputList<Inputs.SoftwareUpdateConfigurationScheduleGetArgs>? _schedules;

        /// <summary>
        /// A `schedule` blocks as defined below.
        /// </summary>
        public InputList<Inputs.SoftwareUpdateConfigurationScheduleGetArgs> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<Inputs.SoftwareUpdateConfigurationScheduleGetArgs>());
            set => _schedules = value;
        }

        /// <summary>
        /// A `target` blocks as defined below.
        /// </summary>
        [Input("target")]
        public Input<Inputs.SoftwareUpdateConfigurationTargetGetArgs>? Target { get; set; }

        [Input("virtualMachineIds")]
        private InputList<string>? _virtualMachineIds;

        /// <summary>
        /// Specifies a list of Azure Resource IDs of azure virtual machines.
        /// </summary>
        public InputList<string> VirtualMachineIds
        {
            get => _virtualMachineIds ?? (_virtualMachineIds = new InputList<string>());
            set => _virtualMachineIds = value;
        }

        /// <summary>
        /// A `windows` block as defined below.
        /// 
        /// &gt; **NOTE:** One of `linux` or `windows` must be specified.
        /// </summary>
        [Input("windows")]
        public Input<Inputs.SoftwareUpdateConfigurationWindowsGetArgs>? Windows { get; set; }

        public SoftwareUpdateConfigurationState()
        {
        }
        public static new SoftwareUpdateConfigurationState Empty => new SoftwareUpdateConfigurationState();
    }
}
