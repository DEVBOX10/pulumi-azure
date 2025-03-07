// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages an IotHub Enrichment
//
// > **NOTE:** Enrichment can be defined either directly on the `iot.IoTHub` resource, or using the `iot.Enrichment` resources - but the two cannot be used together. If both are used against the same IoTHub, spurious changes will occur.
//
// ## Import
//
// IoTHub Enrichment can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:iot/enrichment:Enrichment enrichment1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/iotHubs/hub1/enrichments/enrichment1
//
// ```
type Enrichment struct {
	pulumi.CustomResourceState

	// The list of endpoints which will be enriched.
	EndpointNames pulumi.StringArrayOutput `pulumi:"endpointNames"`
	// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
	IothubName pulumi.StringOutput `pulumi:"iothubName"`
	// The key of the enrichment. Changing this forces a new resource to be created.
	Key pulumi.StringOutput `pulumi:"key"`
	// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewEnrichment registers a new resource with the given unique name, arguments, and options.
func NewEnrichment(ctx *pulumi.Context,
	name string, args *EnrichmentArgs, opts ...pulumi.ResourceOption) (*Enrichment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointNames == nil {
		return nil, errors.New("invalid value for required argument 'EndpointNames'")
	}
	if args.IothubName == nil {
		return nil, errors.New("invalid value for required argument 'IothubName'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Enrichment
	err := ctx.RegisterResource("azure:iot/enrichment:Enrichment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnrichment gets an existing Enrichment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnrichment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnrichmentState, opts ...pulumi.ResourceOption) (*Enrichment, error) {
	var resource Enrichment
	err := ctx.ReadResource("azure:iot/enrichment:Enrichment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Enrichment resources.
type enrichmentState struct {
	// The list of endpoints which will be enriched.
	EndpointNames []string `pulumi:"endpointNames"`
	// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
	IothubName *string `pulumi:"iothubName"`
	// The key of the enrichment. Changing this forces a new resource to be created.
	Key *string `pulumi:"key"`
	// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
	Value *string `pulumi:"value"`
}

type EnrichmentState struct {
	// The list of endpoints which will be enriched.
	EndpointNames pulumi.StringArrayInput
	// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
	IothubName pulumi.StringPtrInput
	// The key of the enrichment. Changing this forces a new resource to be created.
	Key pulumi.StringPtrInput
	// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
	Value pulumi.StringPtrInput
}

func (EnrichmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*enrichmentState)(nil)).Elem()
}

type enrichmentArgs struct {
	// The list of endpoints which will be enriched.
	EndpointNames []string `pulumi:"endpointNames"`
	// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
	IothubName string `pulumi:"iothubName"`
	// The key of the enrichment. Changing this forces a new resource to be created.
	Key string `pulumi:"key"`
	// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a Enrichment resource.
type EnrichmentArgs struct {
	// The list of endpoints which will be enriched.
	EndpointNames pulumi.StringArrayInput
	// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
	IothubName pulumi.StringInput
	// The key of the enrichment. Changing this forces a new resource to be created.
	Key pulumi.StringInput
	// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
	Value pulumi.StringInput
}

func (EnrichmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*enrichmentArgs)(nil)).Elem()
}

type EnrichmentInput interface {
	pulumi.Input

	ToEnrichmentOutput() EnrichmentOutput
	ToEnrichmentOutputWithContext(ctx context.Context) EnrichmentOutput
}

func (*Enrichment) ElementType() reflect.Type {
	return reflect.TypeOf((**Enrichment)(nil)).Elem()
}

func (i *Enrichment) ToEnrichmentOutput() EnrichmentOutput {
	return i.ToEnrichmentOutputWithContext(context.Background())
}

func (i *Enrichment) ToEnrichmentOutputWithContext(ctx context.Context) EnrichmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnrichmentOutput)
}

func (i *Enrichment) ToOutput(ctx context.Context) pulumix.Output[*Enrichment] {
	return pulumix.Output[*Enrichment]{
		OutputState: i.ToEnrichmentOutputWithContext(ctx).OutputState,
	}
}

// EnrichmentArrayInput is an input type that accepts EnrichmentArray and EnrichmentArrayOutput values.
// You can construct a concrete instance of `EnrichmentArrayInput` via:
//
//	EnrichmentArray{ EnrichmentArgs{...} }
type EnrichmentArrayInput interface {
	pulumi.Input

	ToEnrichmentArrayOutput() EnrichmentArrayOutput
	ToEnrichmentArrayOutputWithContext(context.Context) EnrichmentArrayOutput
}

type EnrichmentArray []EnrichmentInput

func (EnrichmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Enrichment)(nil)).Elem()
}

func (i EnrichmentArray) ToEnrichmentArrayOutput() EnrichmentArrayOutput {
	return i.ToEnrichmentArrayOutputWithContext(context.Background())
}

func (i EnrichmentArray) ToEnrichmentArrayOutputWithContext(ctx context.Context) EnrichmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnrichmentArrayOutput)
}

func (i EnrichmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*Enrichment] {
	return pulumix.Output[[]*Enrichment]{
		OutputState: i.ToEnrichmentArrayOutputWithContext(ctx).OutputState,
	}
}

// EnrichmentMapInput is an input type that accepts EnrichmentMap and EnrichmentMapOutput values.
// You can construct a concrete instance of `EnrichmentMapInput` via:
//
//	EnrichmentMap{ "key": EnrichmentArgs{...} }
type EnrichmentMapInput interface {
	pulumi.Input

	ToEnrichmentMapOutput() EnrichmentMapOutput
	ToEnrichmentMapOutputWithContext(context.Context) EnrichmentMapOutput
}

type EnrichmentMap map[string]EnrichmentInput

func (EnrichmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Enrichment)(nil)).Elem()
}

func (i EnrichmentMap) ToEnrichmentMapOutput() EnrichmentMapOutput {
	return i.ToEnrichmentMapOutputWithContext(context.Background())
}

func (i EnrichmentMap) ToEnrichmentMapOutputWithContext(ctx context.Context) EnrichmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnrichmentMapOutput)
}

func (i EnrichmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Enrichment] {
	return pulumix.Output[map[string]*Enrichment]{
		OutputState: i.ToEnrichmentMapOutputWithContext(ctx).OutputState,
	}
}

type EnrichmentOutput struct{ *pulumi.OutputState }

func (EnrichmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Enrichment)(nil)).Elem()
}

func (o EnrichmentOutput) ToEnrichmentOutput() EnrichmentOutput {
	return o
}

func (o EnrichmentOutput) ToEnrichmentOutputWithContext(ctx context.Context) EnrichmentOutput {
	return o
}

func (o EnrichmentOutput) ToOutput(ctx context.Context) pulumix.Output[*Enrichment] {
	return pulumix.Output[*Enrichment]{
		OutputState: o.OutputState,
	}
}

// The list of endpoints which will be enriched.
func (o EnrichmentOutput) EndpointNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Enrichment) pulumi.StringArrayOutput { return v.EndpointNames }).(pulumi.StringArrayOutput)
}

// The IoTHub name of the enrichment. Changing this forces a new resource to be created.
func (o EnrichmentOutput) IothubName() pulumi.StringOutput {
	return o.ApplyT(func(v *Enrichment) pulumi.StringOutput { return v.IothubName }).(pulumi.StringOutput)
}

// The key of the enrichment. Changing this forces a new resource to be created.
func (o EnrichmentOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Enrichment) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The name of the resource group under which the IoTHub resource is created. Changing this forces a new resource to be created.
func (o EnrichmentOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Enrichment) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The value of the enrichment. Value can be any static string, the name of the IoT hub sending the message (use `$iothubname`) or information from the device twin (ex: `$twin.tags.latitude`)
func (o EnrichmentOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *Enrichment) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type EnrichmentArrayOutput struct{ *pulumi.OutputState }

func (EnrichmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Enrichment)(nil)).Elem()
}

func (o EnrichmentArrayOutput) ToEnrichmentArrayOutput() EnrichmentArrayOutput {
	return o
}

func (o EnrichmentArrayOutput) ToEnrichmentArrayOutputWithContext(ctx context.Context) EnrichmentArrayOutput {
	return o
}

func (o EnrichmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Enrichment] {
	return pulumix.Output[[]*Enrichment]{
		OutputState: o.OutputState,
	}
}

func (o EnrichmentArrayOutput) Index(i pulumi.IntInput) EnrichmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Enrichment {
		return vs[0].([]*Enrichment)[vs[1].(int)]
	}).(EnrichmentOutput)
}

type EnrichmentMapOutput struct{ *pulumi.OutputState }

func (EnrichmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Enrichment)(nil)).Elem()
}

func (o EnrichmentMapOutput) ToEnrichmentMapOutput() EnrichmentMapOutput {
	return o
}

func (o EnrichmentMapOutput) ToEnrichmentMapOutputWithContext(ctx context.Context) EnrichmentMapOutput {
	return o
}

func (o EnrichmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Enrichment] {
	return pulumix.Output[map[string]*Enrichment]{
		OutputState: o.OutputState,
	}
}

func (o EnrichmentMapOutput) MapIndex(k pulumi.StringInput) EnrichmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Enrichment {
		return vs[0].(map[string]*Enrichment)[vs[1].(string)]
	}).(EnrichmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnrichmentInput)(nil)).Elem(), &Enrichment{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnrichmentArrayInput)(nil)).Elem(), EnrichmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnrichmentMapInput)(nil)).Elem(), EnrichmentMap{})
	pulumi.RegisterOutputType(EnrichmentOutput{})
	pulumi.RegisterOutputType(EnrichmentArrayOutput{})
	pulumi.RegisterOutputType(EnrichmentMapOutput{})
}
