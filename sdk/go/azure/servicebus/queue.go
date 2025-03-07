// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicebus

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a ServiceBus Queue.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/servicebus"
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
//			exampleNamespace, err := servicebus.NewNamespace(ctx, "exampleNamespace", &servicebus.NamespaceArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Sku:               pulumi.String("Standard"),
//				Tags: pulumi.StringMap{
//					"source": pulumi.String("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = servicebus.NewQueue(ctx, "exampleQueue", &servicebus.QueueArgs{
//				NamespaceId:        exampleNamespace.ID(),
//				EnablePartitioning: pulumi.Bool(true),
//			})
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
// Service Bus Queue can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:servicebus/queue:Queue example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ServiceBus/namespaces/sbns1/queues/snqueue1
//
// ```
type Queue struct {
	pulumi.CustomResourceState

	// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
	AutoDeleteOnIdle pulumi.StringOutput `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrOutput `pulumi:"deadLetteringOnMessageExpiration"`
	// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
	DefaultMessageTtl pulumi.StringOutput `pulumi:"defaultMessageTtl"`
	// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
	DuplicateDetectionHistoryTimeWindow pulumi.StringOutput `pulumi:"duplicateDetectionHistoryTimeWindow"`
	// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
	EnableBatchedOperations pulumi.BoolPtrOutput `pulumi:"enableBatchedOperations"`
	// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
	//
	// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
	EnableExpress pulumi.BoolPtrOutput `pulumi:"enableExpress"`
	// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
	//
	// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
	EnablePartitioning pulumi.BoolPtrOutput `pulumi:"enablePartitioning"`
	// The name of a Queue or Topic to automatically forward dead lettered messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrOutput `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
	ForwardTo pulumi.StringPtrOutput `pulumi:"forwardTo"`
	// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
	LockDuration pulumi.StringOutput `pulumi:"lockDuration"`
	// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
	MaxDeliveryCount pulumi.IntPtrOutput `pulumi:"maxDeliveryCount"`
	// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
	MaxMessageSizeInKilobytes pulumi.IntOutput `pulumi:"maxMessageSizeInKilobytes"`
	// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
	MaxSizeInMegabytes pulumi.IntOutput `pulumi:"maxSizeInMegabytes"`
	// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
	NamespaceId   pulumi.StringOutput `pulumi:"namespaceId"`
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresDuplicateDetection pulumi.BoolPtrOutput `pulumi:"requiresDuplicateDetection"`
	// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresSession   pulumi.BoolPtrOutput `pulumi:"requiresSession"`
	ResourceGroupName pulumi.StringOutput  `pulumi:"resourceGroupName"`
	// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
	Status pulumi.StringPtrOutput `pulumi:"status"`
}

// NewQueue registers a new resource with the given unique name, arguments, and options.
func NewQueue(ctx *pulumi.Context,
	name string, args *QueueArgs, opts ...pulumi.ResourceOption) (*Queue, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("azure:eventhub/queue:Queue"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Queue
	err := ctx.RegisterResource("azure:servicebus/queue:Queue", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetQueue gets an existing Queue resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetQueue(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *QueueState, opts ...pulumi.ResourceOption) (*Queue, error) {
	var resource Queue
	err := ctx.ReadResource("azure:servicebus/queue:Queue", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Queue resources.
type queueState struct {
	// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
	AutoDeleteOnIdle *string `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
	DeadLetteringOnMessageExpiration *bool `pulumi:"deadLetteringOnMessageExpiration"`
	// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
	DefaultMessageTtl *string `pulumi:"defaultMessageTtl"`
	// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
	DuplicateDetectionHistoryTimeWindow *string `pulumi:"duplicateDetectionHistoryTimeWindow"`
	// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
	EnableBatchedOperations *bool `pulumi:"enableBatchedOperations"`
	// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
	//
	// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
	EnableExpress *bool `pulumi:"enableExpress"`
	// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
	//
	// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
	EnablePartitioning *bool `pulumi:"enablePartitioning"`
	// The name of a Queue or Topic to automatically forward dead lettered messages to.
	ForwardDeadLetteredMessagesTo *string `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
	ForwardTo *string `pulumi:"forwardTo"`
	// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
	LockDuration *string `pulumi:"lockDuration"`
	// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
	MaxDeliveryCount *int `pulumi:"maxDeliveryCount"`
	// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
	MaxMessageSizeInKilobytes *int `pulumi:"maxMessageSizeInKilobytes"`
	// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
	MaxSizeInMegabytes *int `pulumi:"maxSizeInMegabytes"`
	// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
	NamespaceId   *string `pulumi:"namespaceId"`
	NamespaceName *string `pulumi:"namespaceName"`
	// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresDuplicateDetection *bool `pulumi:"requiresDuplicateDetection"`
	// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresSession   *bool   `pulumi:"requiresSession"`
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
	Status *string `pulumi:"status"`
}

type QueueState struct {
	// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
	AutoDeleteOnIdle pulumi.StringPtrInput
	// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrInput
	// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
	DefaultMessageTtl pulumi.StringPtrInput
	// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
	DuplicateDetectionHistoryTimeWindow pulumi.StringPtrInput
	// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
	EnableBatchedOperations pulumi.BoolPtrInput
	// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
	//
	// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
	EnableExpress pulumi.BoolPtrInput
	// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
	//
	// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
	EnablePartitioning pulumi.BoolPtrInput
	// The name of a Queue or Topic to automatically forward dead lettered messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
	ForwardTo pulumi.StringPtrInput
	// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
	LockDuration pulumi.StringPtrInput
	// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
	MaxDeliveryCount pulumi.IntPtrInput
	// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
	MaxMessageSizeInKilobytes pulumi.IntPtrInput
	// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
	MaxSizeInMegabytes pulumi.IntPtrInput
	// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
	NamespaceId   pulumi.StringPtrInput
	NamespaceName pulumi.StringPtrInput
	// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresDuplicateDetection pulumi.BoolPtrInput
	// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresSession   pulumi.BoolPtrInput
	ResourceGroupName pulumi.StringPtrInput
	// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
	Status pulumi.StringPtrInput
}

func (QueueState) ElementType() reflect.Type {
	return reflect.TypeOf((*queueState)(nil)).Elem()
}

type queueArgs struct {
	// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
	AutoDeleteOnIdle *string `pulumi:"autoDeleteOnIdle"`
	// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
	DeadLetteringOnMessageExpiration *bool `pulumi:"deadLetteringOnMessageExpiration"`
	// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
	DefaultMessageTtl *string `pulumi:"defaultMessageTtl"`
	// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
	DuplicateDetectionHistoryTimeWindow *string `pulumi:"duplicateDetectionHistoryTimeWindow"`
	// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
	EnableBatchedOperations *bool `pulumi:"enableBatchedOperations"`
	// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
	//
	// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
	EnableExpress *bool `pulumi:"enableExpress"`
	// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
	//
	// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
	EnablePartitioning *bool `pulumi:"enablePartitioning"`
	// The name of a Queue or Topic to automatically forward dead lettered messages to.
	ForwardDeadLetteredMessagesTo *string `pulumi:"forwardDeadLetteredMessagesTo"`
	// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
	ForwardTo *string `pulumi:"forwardTo"`
	// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
	LockDuration *string `pulumi:"lockDuration"`
	// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
	MaxDeliveryCount *int `pulumi:"maxDeliveryCount"`
	// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
	MaxMessageSizeInKilobytes *int `pulumi:"maxMessageSizeInKilobytes"`
	// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
	MaxSizeInMegabytes *int `pulumi:"maxSizeInMegabytes"`
	// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
	NamespaceId string `pulumi:"namespaceId"`
	// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresDuplicateDetection *bool `pulumi:"requiresDuplicateDetection"`
	// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresSession *bool `pulumi:"requiresSession"`
	// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a Queue resource.
type QueueArgs struct {
	// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
	AutoDeleteOnIdle pulumi.StringPtrInput
	// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
	DeadLetteringOnMessageExpiration pulumi.BoolPtrInput
	// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
	DefaultMessageTtl pulumi.StringPtrInput
	// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
	DuplicateDetectionHistoryTimeWindow pulumi.StringPtrInput
	// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
	EnableBatchedOperations pulumi.BoolPtrInput
	// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
	//
	// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
	EnableExpress pulumi.BoolPtrInput
	// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
	//
	// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
	EnablePartitioning pulumi.BoolPtrInput
	// The name of a Queue or Topic to automatically forward dead lettered messages to.
	ForwardDeadLetteredMessagesTo pulumi.StringPtrInput
	// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
	ForwardTo pulumi.StringPtrInput
	// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
	LockDuration pulumi.StringPtrInput
	// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
	MaxDeliveryCount pulumi.IntPtrInput
	// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
	MaxMessageSizeInKilobytes pulumi.IntPtrInput
	// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
	MaxSizeInMegabytes pulumi.IntPtrInput
	// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
	NamespaceId pulumi.StringInput
	// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresDuplicateDetection pulumi.BoolPtrInput
	// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
	RequiresSession pulumi.BoolPtrInput
	// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
	Status pulumi.StringPtrInput
}

func (QueueArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*queueArgs)(nil)).Elem()
}

type QueueInput interface {
	pulumi.Input

	ToQueueOutput() QueueOutput
	ToQueueOutputWithContext(ctx context.Context) QueueOutput
}

func (*Queue) ElementType() reflect.Type {
	return reflect.TypeOf((**Queue)(nil)).Elem()
}

func (i *Queue) ToQueueOutput() QueueOutput {
	return i.ToQueueOutputWithContext(context.Background())
}

func (i *Queue) ToQueueOutputWithContext(ctx context.Context) QueueOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueOutput)
}

func (i *Queue) ToOutput(ctx context.Context) pulumix.Output[*Queue] {
	return pulumix.Output[*Queue]{
		OutputState: i.ToQueueOutputWithContext(ctx).OutputState,
	}
}

// QueueArrayInput is an input type that accepts QueueArray and QueueArrayOutput values.
// You can construct a concrete instance of `QueueArrayInput` via:
//
//	QueueArray{ QueueArgs{...} }
type QueueArrayInput interface {
	pulumi.Input

	ToQueueArrayOutput() QueueArrayOutput
	ToQueueArrayOutputWithContext(context.Context) QueueArrayOutput
}

type QueueArray []QueueInput

func (QueueArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Queue)(nil)).Elem()
}

func (i QueueArray) ToQueueArrayOutput() QueueArrayOutput {
	return i.ToQueueArrayOutputWithContext(context.Background())
}

func (i QueueArray) ToQueueArrayOutputWithContext(ctx context.Context) QueueArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueArrayOutput)
}

func (i QueueArray) ToOutput(ctx context.Context) pulumix.Output[[]*Queue] {
	return pulumix.Output[[]*Queue]{
		OutputState: i.ToQueueArrayOutputWithContext(ctx).OutputState,
	}
}

// QueueMapInput is an input type that accepts QueueMap and QueueMapOutput values.
// You can construct a concrete instance of `QueueMapInput` via:
//
//	QueueMap{ "key": QueueArgs{...} }
type QueueMapInput interface {
	pulumi.Input

	ToQueueMapOutput() QueueMapOutput
	ToQueueMapOutputWithContext(context.Context) QueueMapOutput
}

type QueueMap map[string]QueueInput

func (QueueMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Queue)(nil)).Elem()
}

func (i QueueMap) ToQueueMapOutput() QueueMapOutput {
	return i.ToQueueMapOutputWithContext(context.Background())
}

func (i QueueMap) ToQueueMapOutputWithContext(ctx context.Context) QueueMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueueMapOutput)
}

func (i QueueMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Queue] {
	return pulumix.Output[map[string]*Queue]{
		OutputState: i.ToQueueMapOutputWithContext(ctx).OutputState,
	}
}

type QueueOutput struct{ *pulumi.OutputState }

func (QueueOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Queue)(nil)).Elem()
}

func (o QueueOutput) ToQueueOutput() QueueOutput {
	return o
}

func (o QueueOutput) ToQueueOutputWithContext(ctx context.Context) QueueOutput {
	return o
}

func (o QueueOutput) ToOutput(ctx context.Context) pulumix.Output[*Queue] {
	return pulumix.Output[*Queue]{
		OutputState: o.OutputState,
	}
}

// The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
func (o QueueOutput) AutoDeleteOnIdle() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.AutoDeleteOnIdle }).(pulumi.StringOutput)
}

// Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
func (o QueueOutput) DeadLetteringOnMessageExpiration() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.DeadLetteringOnMessageExpiration }).(pulumi.BoolPtrOutput)
}

// The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
func (o QueueOutput) DefaultMessageTtl() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.DefaultMessageTtl }).(pulumi.StringOutput)
}

// The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
func (o QueueOutput) DuplicateDetectionHistoryTimeWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.DuplicateDetectionHistoryTimeWindow }).(pulumi.StringOutput)
}

// Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
func (o QueueOutput) EnableBatchedOperations() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.EnableBatchedOperations }).(pulumi.BoolPtrOutput)
}

// Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
//
// > **NOTE:** Service Bus Premium namespaces do not support Express Entities, so `enableExpress` MUST be set to `false`.
func (o QueueOutput) EnableExpress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.EnableExpress }).(pulumi.BoolPtrOutput)
}

// Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard.
//
// > **NOTE:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
func (o QueueOutput) EnablePartitioning() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.EnablePartitioning }).(pulumi.BoolPtrOutput)
}

// The name of a Queue or Topic to automatically forward dead lettered messages to.
func (o QueueOutput) ForwardDeadLetteredMessagesTo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringPtrOutput { return v.ForwardDeadLetteredMessagesTo }).(pulumi.StringPtrOutput)
}

// The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
func (o QueueOutput) ForwardTo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringPtrOutput { return v.ForwardTo }).(pulumi.StringPtrOutput)
}

// The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
func (o QueueOutput) LockDuration() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.LockDuration }).(pulumi.StringOutput)
}

// Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
func (o QueueOutput) MaxDeliveryCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.IntPtrOutput { return v.MaxDeliveryCount }).(pulumi.IntPtrOutput)
}

// Integer value which controls the maximum size of a message allowed on the queue for Premium SKU. For supported values see the "Large messages support" section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
func (o QueueOutput) MaxMessageSizeInKilobytes() pulumi.IntOutput {
	return o.ApplyT(func(v *Queue) pulumi.IntOutput { return v.MaxMessageSizeInKilobytes }).(pulumi.IntOutput)
}

// Integer value which controls the size of memory allocated for the queue. For supported values see the "Queue or topic size" section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
func (o QueueOutput) MaxSizeInMegabytes() pulumi.IntOutput {
	return o.ApplyT(func(v *Queue) pulumi.IntOutput { return v.MaxSizeInMegabytes }).(pulumi.IntOutput)
}

// Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
func (o QueueOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
func (o QueueOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

func (o QueueOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
func (o QueueOutput) RequiresDuplicateDetection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.RequiresDuplicateDetection }).(pulumi.BoolPtrOutput)
}

// Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
func (o QueueOutput) RequiresSession() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.BoolPtrOutput { return v.RequiresSession }).(pulumi.BoolPtrOutput)
}

func (o QueueOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
func (o QueueOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Queue) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

type QueueArrayOutput struct{ *pulumi.OutputState }

func (QueueArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Queue)(nil)).Elem()
}

func (o QueueArrayOutput) ToQueueArrayOutput() QueueArrayOutput {
	return o
}

func (o QueueArrayOutput) ToQueueArrayOutputWithContext(ctx context.Context) QueueArrayOutput {
	return o
}

func (o QueueArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Queue] {
	return pulumix.Output[[]*Queue]{
		OutputState: o.OutputState,
	}
}

func (o QueueArrayOutput) Index(i pulumi.IntInput) QueueOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Queue {
		return vs[0].([]*Queue)[vs[1].(int)]
	}).(QueueOutput)
}

type QueueMapOutput struct{ *pulumi.OutputState }

func (QueueMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Queue)(nil)).Elem()
}

func (o QueueMapOutput) ToQueueMapOutput() QueueMapOutput {
	return o
}

func (o QueueMapOutput) ToQueueMapOutputWithContext(ctx context.Context) QueueMapOutput {
	return o
}

func (o QueueMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Queue] {
	return pulumix.Output[map[string]*Queue]{
		OutputState: o.OutputState,
	}
}

func (o QueueMapOutput) MapIndex(k pulumi.StringInput) QueueOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Queue {
		return vs[0].(map[string]*Queue)[vs[1].(string)]
	}).(QueueOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*QueueInput)(nil)).Elem(), &Queue{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueueArrayInput)(nil)).Elem(), QueueArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueueMapInput)(nil)).Elem(), QueueMap{})
	pulumi.RegisterOutputType(QueueOutput{})
	pulumi.RegisterOutputType(QueueArrayOutput{})
	pulumi.RegisterOutputType(QueueMapOutput{})
}
