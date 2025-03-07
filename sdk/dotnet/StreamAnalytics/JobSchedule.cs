// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics
{
    /// <summary>
    /// Manages a Stream Analytics Job Schedule.
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
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleContainer = new Azure.Storage.Container("exampleContainer", new()
    ///     {
    ///         StorageAccountName = exampleAccount.Name,
    ///         ContainerAccessType = "private",
    ///     });
    /// 
    ///     var exampleBlob = new Azure.Storage.Blob("exampleBlob", new()
    ///     {
    ///         StorageAccountName = exampleAccount.Name,
    ///         StorageContainerName = exampleContainer.Name,
    ///         Type = "Block",
    ///         Source = new FileAsset("example.csv"),
    ///     });
    /// 
    ///     var exampleJob = new Azure.StreamAnalytics.Job("exampleJob", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         CompatibilityLevel = "1.2",
    ///         DataLocale = "en-GB",
    ///         EventsLateArrivalMaxDelayInSeconds = 60,
    ///         EventsOutOfOrderMaxDelayInSeconds = 50,
    ///         EventsOutOfOrderPolicy = "Adjust",
    ///         OutputErrorPolicy = "Drop",
    ///         StreamingUnits = 3,
    ///         Tags = 
    ///         {
    ///             { "environment", "Example" },
    ///         },
    ///         TransformationQuery = @"    SELECT *
    ///     INTO [exampleoutput]
    ///     FROM [exampleinput]
    /// ",
    ///     });
    /// 
    ///     var exampleStreamInputBlob = new Azure.StreamAnalytics.StreamInputBlob("exampleStreamInputBlob", new()
    ///     {
    ///         StreamAnalyticsJobName = exampleJob.Name,
    ///         ResourceGroupName = exampleJob.ResourceGroupName,
    ///         StorageAccountName = exampleAccount.Name,
    ///         StorageAccountKey = exampleAccount.PrimaryAccessKey,
    ///         StorageContainerName = exampleContainer.Name,
    ///         PathPattern = "",
    ///         DateFormat = "yyyy/MM/dd",
    ///         TimeFormat = "HH",
    ///         Serialization = new Azure.StreamAnalytics.Inputs.StreamInputBlobSerializationArgs
    ///         {
    ///             Type = "Csv",
    ///             Encoding = "UTF8",
    ///             FieldDelimiter = ",",
    ///         },
    ///     });
    /// 
    ///     var exampleOutputBlob = new Azure.StreamAnalytics.OutputBlob("exampleOutputBlob", new()
    ///     {
    ///         StreamAnalyticsJobName = exampleJob.Name,
    ///         ResourceGroupName = exampleJob.ResourceGroupName,
    ///         StorageAccountName = exampleAccount.Name,
    ///         StorageAccountKey = exampleAccount.PrimaryAccessKey,
    ///         StorageContainerName = exampleContainer.Name,
    ///         PathPattern = "example-{date}-{time}",
    ///         DateFormat = "yyyy-MM-dd",
    ///         TimeFormat = "HH",
    ///         Serialization = new Azure.StreamAnalytics.Inputs.OutputBlobSerializationArgs
    ///         {
    ///             Type = "Avro",
    ///         },
    ///     });
    /// 
    ///     var exampleJobSchedule = new Azure.StreamAnalytics.JobSchedule("exampleJobSchedule", new()
    ///     {
    ///         StreamAnalyticsJobId = exampleJob.Id,
    ///         StartMode = "CustomTime",
    ///         StartTime = "2022-09-21T00:00:00Z",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             exampleJob,
    ///             exampleStreamInputBlob,
    ///             exampleOutputBlob,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Stream Analytics Job's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:streamanalytics/jobSchedule:JobSchedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/schedule/default
    /// ```
    /// </summary>
    [AzureResourceType("azure:streamanalytics/jobSchedule:JobSchedule")]
    public partial class JobSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time at which the Stream Analytics job last produced an output.
        /// </summary>
        [Output("lastOutputTime")]
        public Output<string> LastOutputTime { get; private set; } = null!;

        /// <summary>
        /// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
        /// 
        /// &gt; **Note:** Setting `start_mode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
        /// </summary>
        [Output("startMode")]
        public Output<string> StartMode { get; private set; } = null!;

        /// <summary>
        /// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
        /// </summary>
        [Output("startTime")]
        public Output<string> StartTime { get; private set; } = null!;

        /// <summary>
        /// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
        /// </summary>
        [Output("streamAnalyticsJobId")]
        public Output<string> StreamAnalyticsJobId { get; private set; } = null!;


        /// <summary>
        /// Create a JobSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public JobSchedule(string name, JobScheduleArgs args, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/jobSchedule:JobSchedule", name, args ?? new JobScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private JobSchedule(string name, Input<string> id, JobScheduleState? state = null, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/jobSchedule:JobSchedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing JobSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static JobSchedule Get(string name, Input<string> id, JobScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new JobSchedule(name, id, state, options);
        }
    }

    public sealed class JobScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
        /// 
        /// &gt; **Note:** Setting `start_mode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
        /// </summary>
        [Input("startMode", required: true)]
        public Input<string> StartMode { get; set; } = null!;

        /// <summary>
        /// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobId", required: true)]
        public Input<string> StreamAnalyticsJobId { get; set; } = null!;

        public JobScheduleArgs()
        {
        }
        public static new JobScheduleArgs Empty => new JobScheduleArgs();
    }

    public sealed class JobScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time at which the Stream Analytics job last produced an output.
        /// </summary>
        [Input("lastOutputTime")]
        public Input<string>? LastOutputTime { get; set; }

        /// <summary>
        /// The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
        /// 
        /// &gt; **Note:** Setting `start_mode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
        /// </summary>
        [Input("startMode")]
        public Input<string>? StartMode { get; set; }

        /// <summary>
        /// The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `start_mode` is set to `CustomTime`
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobId")]
        public Input<string>? StreamAnalyticsJobId { get; set; }

        public JobScheduleState()
        {
        }
        public static new JobScheduleState Empty => new JobScheduleState();
    }
}
