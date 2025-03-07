// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kusto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a Kusto (also known as Azure Data Explorer) Event Grid Data Connection
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/eventgrid"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/eventhub"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/kusto"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleCluster, err := kusto.NewCluster(ctx, "exampleCluster", &kusto.ClusterArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku: &kusto.ClusterSkuArgs{
//					Name:     pulumi.String("Standard_D13_v2"),
//					Capacity: pulumi.Int(2),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleDatabase, err := kusto.NewDatabase(ctx, "exampleDatabase", &kusto.DatabaseArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				ClusterName:       exampleCluster.Name,
//				HotCachePeriod:    pulumi.String("P7D"),
//				SoftDeletePeriod:  pulumi.String("P31D"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "exampleAccount", &storage.AccountArgs{
//				ResourceGroupName:      exampleResourceGroup.Name,
//				Location:               exampleResourceGroup.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("GRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventHubNamespace, err := eventhub.NewEventHubNamespace(ctx, "exampleEventHubNamespace", &eventhub.EventHubNamespaceArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku:               pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventHub, err := eventhub.NewEventHub(ctx, "exampleEventHub", &eventhub.EventHubArgs{
//				NamespaceName:     exampleEventHubNamespace.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//				PartitionCount:    pulumi.Int(1),
//				MessageRetention:  pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			exampleConsumerGroup, err := eventhub.NewConsumerGroup(ctx, "exampleConsumerGroup", &eventhub.ConsumerGroupArgs{
//				NamespaceName:     exampleEventHubNamespace.Name,
//				EventhubName:      exampleEventHub.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleEventSubscription, err := eventgrid.NewEventSubscription(ctx, "exampleEventSubscription", &eventgrid.EventSubscriptionArgs{
//				Scope:               exampleAccount.ID(),
//				EventhubEndpointId:  exampleEventHub.ID(),
//				EventDeliverySchema: pulumi.String("EventGridSchema"),
//				IncludedEventTypes: pulumi.StringArray{
//					pulumi.String("Microsoft.Storage.BlobCreated"),
//					pulumi.String("Microsoft.Storage.BlobRenamed"),
//				},
//				RetryPolicy: &eventgrid.EventSubscriptionRetryPolicyArgs{
//					EventTimeToLive:     pulumi.Int(144),
//					MaxDeliveryAttempts: pulumi.Int(10),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = kusto.NewEventGridDataConnection(ctx, "exampleEventGridDataConnection", &kusto.EventGridDataConnectionArgs{
//				ResourceGroupName:         exampleResourceGroup.Name,
//				Location:                  exampleResourceGroup.Location,
//				ClusterName:               exampleCluster.Name,
//				DatabaseName:              exampleDatabase.Name,
//				StorageAccountId:          exampleAccount.ID(),
//				EventhubId:                exampleEventHub.ID(),
//				EventhubConsumerGroupName: exampleConsumerGroup.Name,
//				TableName:                 pulumi.String("my-table"),
//				MappingRuleName:           pulumi.String("my-table-mapping"),
//				DataFormat:                pulumi.String("JSON"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleEventSubscription,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Kusto Event Grid Data Connections can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:kusto/eventGridDataConnection:EventGridDataConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/clusters/cluster1/databases/database1/dataConnections/dataConnection1
//
// ```
type EventGridDataConnection struct {
	pulumi.CustomResourceState

	// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
	BlobStorageEventType pulumi.StringPtrOutput `pulumi:"blobStorageEventType"`
	// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
	DataFormat pulumi.StringPtrOutput `pulumi:"dataFormat"`
	// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
	DatabaseRoutingType pulumi.StringPtrOutput `pulumi:"databaseRoutingType"`
	// The resource ID of the event grid that is subscribed to the storage account events.
	EventgridResourceId pulumi.StringPtrOutput `pulumi:"eventgridResourceId"`
	// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubConsumerGroupName pulumi.StringOutput `pulumi:"eventhubConsumerGroupName"`
	// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubId pulumi.StringOutput `pulumi:"eventhubId"`
	// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
	ManagedIdentityResourceId pulumi.StringPtrOutput `pulumi:"managedIdentityResourceId"`
	// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
	MappingRuleName pulumi.StringPtrOutput `pulumi:"mappingRuleName"`
	// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// is the first record of every file ignored? Defaults to `false`.
	SkipFirstRecord pulumi.BoolPtrOutput `pulumi:"skipFirstRecord"`
	// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringOutput `pulumi:"storageAccountId"`
	// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
	TableName pulumi.StringPtrOutput `pulumi:"tableName"`
}

// NewEventGridDataConnection registers a new resource with the given unique name, arguments, and options.
func NewEventGridDataConnection(ctx *pulumi.Context,
	name string, args *EventGridDataConnectionArgs, opts ...pulumi.ResourceOption) (*EventGridDataConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.EventhubConsumerGroupName == nil {
		return nil, errors.New("invalid value for required argument 'EventhubConsumerGroupName'")
	}
	if args.EventhubId == nil {
		return nil, errors.New("invalid value for required argument 'EventhubId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.StorageAccountId == nil {
		return nil, errors.New("invalid value for required argument 'StorageAccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EventGridDataConnection
	err := ctx.RegisterResource("azure:kusto/eventGridDataConnection:EventGridDataConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventGridDataConnection gets an existing EventGridDataConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventGridDataConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventGridDataConnectionState, opts ...pulumi.ResourceOption) (*EventGridDataConnection, error) {
	var resource EventGridDataConnection
	err := ctx.ReadResource("azure:kusto/eventGridDataConnection:EventGridDataConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventGridDataConnection resources.
type eventGridDataConnectionState struct {
	// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
	BlobStorageEventType *string `pulumi:"blobStorageEventType"`
	// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
	ClusterName *string `pulumi:"clusterName"`
	// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
	DataFormat *string `pulumi:"dataFormat"`
	// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
	DatabaseName *string `pulumi:"databaseName"`
	// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
	DatabaseRoutingType *string `pulumi:"databaseRoutingType"`
	// The resource ID of the event grid that is subscribed to the storage account events.
	EventgridResourceId *string `pulumi:"eventgridResourceId"`
	// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubConsumerGroupName *string `pulumi:"eventhubConsumerGroupName"`
	// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubId *string `pulumi:"eventhubId"`
	// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
	ManagedIdentityResourceId *string `pulumi:"managedIdentityResourceId"`
	// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
	MappingRuleName *string `pulumi:"mappingRuleName"`
	// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// is the first record of every file ignored? Defaults to `false`.
	SkipFirstRecord *bool `pulumi:"skipFirstRecord"`
	// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
	StorageAccountId *string `pulumi:"storageAccountId"`
	// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
	TableName *string `pulumi:"tableName"`
}

type EventGridDataConnectionState struct {
	// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
	BlobStorageEventType pulumi.StringPtrInput
	// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
	ClusterName pulumi.StringPtrInput
	// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
	DataFormat pulumi.StringPtrInput
	// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringPtrInput
	// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
	DatabaseRoutingType pulumi.StringPtrInput
	// The resource ID of the event grid that is subscribed to the storage account events.
	EventgridResourceId pulumi.StringPtrInput
	// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubConsumerGroupName pulumi.StringPtrInput
	// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubId pulumi.StringPtrInput
	// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
	ManagedIdentityResourceId pulumi.StringPtrInput
	// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
	MappingRuleName pulumi.StringPtrInput
	// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// is the first record of every file ignored? Defaults to `false`.
	SkipFirstRecord pulumi.BoolPtrInput
	// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringPtrInput
	// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
	TableName pulumi.StringPtrInput
}

func (EventGridDataConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventGridDataConnectionState)(nil)).Elem()
}

type eventGridDataConnectionArgs struct {
	// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
	BlobStorageEventType *string `pulumi:"blobStorageEventType"`
	// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
	ClusterName string `pulumi:"clusterName"`
	// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
	DataFormat *string `pulumi:"dataFormat"`
	// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
	DatabaseName string `pulumi:"databaseName"`
	// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
	DatabaseRoutingType *string `pulumi:"databaseRoutingType"`
	// The resource ID of the event grid that is subscribed to the storage account events.
	EventgridResourceId *string `pulumi:"eventgridResourceId"`
	// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubConsumerGroupName string `pulumi:"eventhubConsumerGroupName"`
	// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubId string `pulumi:"eventhubId"`
	// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
	ManagedIdentityResourceId *string `pulumi:"managedIdentityResourceId"`
	// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
	MappingRuleName *string `pulumi:"mappingRuleName"`
	// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// is the first record of every file ignored? Defaults to `false`.
	SkipFirstRecord *bool `pulumi:"skipFirstRecord"`
	// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
	StorageAccountId string `pulumi:"storageAccountId"`
	// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
	TableName *string `pulumi:"tableName"`
}

// The set of arguments for constructing a EventGridDataConnection resource.
type EventGridDataConnectionArgs struct {
	// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
	BlobStorageEventType pulumi.StringPtrInput
	// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
	ClusterName pulumi.StringInput
	// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
	DataFormat pulumi.StringPtrInput
	// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
	DatabaseName pulumi.StringInput
	// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
	DatabaseRoutingType pulumi.StringPtrInput
	// The resource ID of the event grid that is subscribed to the storage account events.
	EventgridResourceId pulumi.StringPtrInput
	// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubConsumerGroupName pulumi.StringInput
	// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
	EventhubId pulumi.StringInput
	// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
	ManagedIdentityResourceId pulumi.StringPtrInput
	// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
	MappingRuleName pulumi.StringPtrInput
	// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// is the first record of every file ignored? Defaults to `false`.
	SkipFirstRecord pulumi.BoolPtrInput
	// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
	StorageAccountId pulumi.StringInput
	// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
	TableName pulumi.StringPtrInput
}

func (EventGridDataConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventGridDataConnectionArgs)(nil)).Elem()
}

type EventGridDataConnectionInput interface {
	pulumi.Input

	ToEventGridDataConnectionOutput() EventGridDataConnectionOutput
	ToEventGridDataConnectionOutputWithContext(ctx context.Context) EventGridDataConnectionOutput
}

func (*EventGridDataConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**EventGridDataConnection)(nil)).Elem()
}

func (i *EventGridDataConnection) ToEventGridDataConnectionOutput() EventGridDataConnectionOutput {
	return i.ToEventGridDataConnectionOutputWithContext(context.Background())
}

func (i *EventGridDataConnection) ToEventGridDataConnectionOutputWithContext(ctx context.Context) EventGridDataConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventGridDataConnectionOutput)
}

func (i *EventGridDataConnection) ToOutput(ctx context.Context) pulumix.Output[*EventGridDataConnection] {
	return pulumix.Output[*EventGridDataConnection]{
		OutputState: i.ToEventGridDataConnectionOutputWithContext(ctx).OutputState,
	}
}

// EventGridDataConnectionArrayInput is an input type that accepts EventGridDataConnectionArray and EventGridDataConnectionArrayOutput values.
// You can construct a concrete instance of `EventGridDataConnectionArrayInput` via:
//
//	EventGridDataConnectionArray{ EventGridDataConnectionArgs{...} }
type EventGridDataConnectionArrayInput interface {
	pulumi.Input

	ToEventGridDataConnectionArrayOutput() EventGridDataConnectionArrayOutput
	ToEventGridDataConnectionArrayOutputWithContext(context.Context) EventGridDataConnectionArrayOutput
}

type EventGridDataConnectionArray []EventGridDataConnectionInput

func (EventGridDataConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventGridDataConnection)(nil)).Elem()
}

func (i EventGridDataConnectionArray) ToEventGridDataConnectionArrayOutput() EventGridDataConnectionArrayOutput {
	return i.ToEventGridDataConnectionArrayOutputWithContext(context.Background())
}

func (i EventGridDataConnectionArray) ToEventGridDataConnectionArrayOutputWithContext(ctx context.Context) EventGridDataConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventGridDataConnectionArrayOutput)
}

func (i EventGridDataConnectionArray) ToOutput(ctx context.Context) pulumix.Output[[]*EventGridDataConnection] {
	return pulumix.Output[[]*EventGridDataConnection]{
		OutputState: i.ToEventGridDataConnectionArrayOutputWithContext(ctx).OutputState,
	}
}

// EventGridDataConnectionMapInput is an input type that accepts EventGridDataConnectionMap and EventGridDataConnectionMapOutput values.
// You can construct a concrete instance of `EventGridDataConnectionMapInput` via:
//
//	EventGridDataConnectionMap{ "key": EventGridDataConnectionArgs{...} }
type EventGridDataConnectionMapInput interface {
	pulumi.Input

	ToEventGridDataConnectionMapOutput() EventGridDataConnectionMapOutput
	ToEventGridDataConnectionMapOutputWithContext(context.Context) EventGridDataConnectionMapOutput
}

type EventGridDataConnectionMap map[string]EventGridDataConnectionInput

func (EventGridDataConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventGridDataConnection)(nil)).Elem()
}

func (i EventGridDataConnectionMap) ToEventGridDataConnectionMapOutput() EventGridDataConnectionMapOutput {
	return i.ToEventGridDataConnectionMapOutputWithContext(context.Background())
}

func (i EventGridDataConnectionMap) ToEventGridDataConnectionMapOutputWithContext(ctx context.Context) EventGridDataConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventGridDataConnectionMapOutput)
}

func (i EventGridDataConnectionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EventGridDataConnection] {
	return pulumix.Output[map[string]*EventGridDataConnection]{
		OutputState: i.ToEventGridDataConnectionMapOutputWithContext(ctx).OutputState,
	}
}

type EventGridDataConnectionOutput struct{ *pulumi.OutputState }

func (EventGridDataConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventGridDataConnection)(nil)).Elem()
}

func (o EventGridDataConnectionOutput) ToEventGridDataConnectionOutput() EventGridDataConnectionOutput {
	return o
}

func (o EventGridDataConnectionOutput) ToEventGridDataConnectionOutputWithContext(ctx context.Context) EventGridDataConnectionOutput {
	return o
}

func (o EventGridDataConnectionOutput) ToOutput(ctx context.Context) pulumix.Output[*EventGridDataConnection] {
	return pulumix.Output[*EventGridDataConnection]{
		OutputState: o.OutputState,
	}
}

// Specifies the blob storage event type that needs to be processed. Possible Values are `Microsoft.Storage.BlobCreated` and `Microsoft.Storage.BlobRenamed`. Defaults to `Microsoft.Storage.BlobCreated`.
func (o EventGridDataConnectionOutput) BlobStorageEventType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.BlobStorageEventType }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Kusto Cluster this data connection will be added to. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Specifies the data format of the EventHub messages. Allowed values: `APACHEAVRO`, `AVRO`, `CSV`, `JSON`, `MULTIJSON`, `ORC`, `PARQUET`, `PSV`, `RAW`, `SCSV`, `SINGLEJSON`, `SOHSV`, `TSV`, `TSVE`, `TXT` and `W3CLOGFILE`.
func (o EventGridDataConnectionOutput) DataFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.DataFormat }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Kusto Database this data connection will be added to. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// Indication for database routing information from the data connection, by default only database routing information is allowed. Allowed values: `Single`, `Multi`. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) DatabaseRoutingType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.DatabaseRoutingType }).(pulumi.StringPtrOutput)
}

// The resource ID of the event grid that is subscribed to the storage account events.
func (o EventGridDataConnectionOutput) EventgridResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.EventgridResourceId }).(pulumi.StringPtrOutput)
}

// Specifies the Event Hub consumer group this data connection will use for ingestion. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) EventhubConsumerGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.EventhubConsumerGroupName }).(pulumi.StringOutput)
}

// Specifies the resource id of the Event Hub this data connection will use for ingestion. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) EventhubId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.EventhubId }).(pulumi.StringOutput)
}

// The location where the Kusto Database should be created. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Empty for non-managed identity based data connection. For system assigned identity, provide cluster resource Id. For user assigned identity (UAI) provide the UAI resource Id.
func (o EventGridDataConnectionOutput) ManagedIdentityResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.ManagedIdentityResourceId }).(pulumi.StringPtrOutput)
}

// Specifies the mapping rule used for the message ingestion. Mapping rule must exist before resource is created.
func (o EventGridDataConnectionOutput) MappingRuleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.MappingRuleName }).(pulumi.StringPtrOutput)
}

// The name of the Kusto Event Grid Data Connection to create. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// is the first record of every file ignored? Defaults to `false`.
func (o EventGridDataConnectionOutput) SkipFirstRecord() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.BoolPtrOutput { return v.SkipFirstRecord }).(pulumi.BoolPtrOutput)
}

// Specifies the resource id of the Storage Account this data connection will use for ingestion. Changing this forces a new resource to be created.
func (o EventGridDataConnectionOutput) StorageAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringOutput { return v.StorageAccountId }).(pulumi.StringOutput)
}

// Specifies the target table name used for the message ingestion. Table must exist before resource is created.
func (o EventGridDataConnectionOutput) TableName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EventGridDataConnection) pulumi.StringPtrOutput { return v.TableName }).(pulumi.StringPtrOutput)
}

type EventGridDataConnectionArrayOutput struct{ *pulumi.OutputState }

func (EventGridDataConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventGridDataConnection)(nil)).Elem()
}

func (o EventGridDataConnectionArrayOutput) ToEventGridDataConnectionArrayOutput() EventGridDataConnectionArrayOutput {
	return o
}

func (o EventGridDataConnectionArrayOutput) ToEventGridDataConnectionArrayOutputWithContext(ctx context.Context) EventGridDataConnectionArrayOutput {
	return o
}

func (o EventGridDataConnectionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EventGridDataConnection] {
	return pulumix.Output[[]*EventGridDataConnection]{
		OutputState: o.OutputState,
	}
}

func (o EventGridDataConnectionArrayOutput) Index(i pulumi.IntInput) EventGridDataConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventGridDataConnection {
		return vs[0].([]*EventGridDataConnection)[vs[1].(int)]
	}).(EventGridDataConnectionOutput)
}

type EventGridDataConnectionMapOutput struct{ *pulumi.OutputState }

func (EventGridDataConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventGridDataConnection)(nil)).Elem()
}

func (o EventGridDataConnectionMapOutput) ToEventGridDataConnectionMapOutput() EventGridDataConnectionMapOutput {
	return o
}

func (o EventGridDataConnectionMapOutput) ToEventGridDataConnectionMapOutputWithContext(ctx context.Context) EventGridDataConnectionMapOutput {
	return o
}

func (o EventGridDataConnectionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EventGridDataConnection] {
	return pulumix.Output[map[string]*EventGridDataConnection]{
		OutputState: o.OutputState,
	}
}

func (o EventGridDataConnectionMapOutput) MapIndex(k pulumi.StringInput) EventGridDataConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventGridDataConnection {
		return vs[0].(map[string]*EventGridDataConnection)[vs[1].(string)]
	}).(EventGridDataConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventGridDataConnectionInput)(nil)).Elem(), &EventGridDataConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventGridDataConnectionArrayInput)(nil)).Elem(), EventGridDataConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventGridDataConnectionMapInput)(nil)).Elem(), EventGridDataConnectionMap{})
	pulumi.RegisterOutputType(EventGridDataConnectionOutput{})
	pulumi.RegisterOutputType(EventGridDataConnectionArrayOutput{})
	pulumi.RegisterOutputType(EventGridDataConnectionMapOutput{})
}
