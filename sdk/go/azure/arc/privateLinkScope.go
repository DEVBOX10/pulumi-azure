// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages an Azure Arc Private Link Scope.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/arc"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("west europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = arc.NewPrivateLinkScope(ctx, "examplePrivateLinkScope", &arc.PrivateLinkScopeArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
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
// Azure Arc Private Link Scope can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:arc/privateLinkScope:PrivateLinkScope example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.HybridCompute/privateLinkScopes/privateLinkScope1
//
// ```
type PrivateLinkScope struct {
	pulumi.CustomResourceState

	// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewPrivateLinkScope registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkScope(ctx *pulumi.Context,
	name string, args *PrivateLinkScopeArgs, opts ...pulumi.ResourceOption) (*PrivateLinkScope, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateLinkScope
	err := ctx.RegisterResource("azure:arc/privateLinkScope:PrivateLinkScope", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkScope gets an existing PrivateLinkScope resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkScope(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkScopeState, opts ...pulumi.ResourceOption) (*PrivateLinkScope, error) {
	var resource PrivateLinkScope
	err := ctx.ReadResource("azure:arc/privateLinkScope:PrivateLinkScope", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkScope resources.
type privateLinkScopeState struct {
	// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
	Name *string `pulumi:"name"`
	// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
	Tags map[string]string `pulumi:"tags"`
}

type PrivateLinkScopeState struct {
	// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
	Name pulumi.StringPtrInput
	// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
	Tags pulumi.StringMapInput
}

func (PrivateLinkScopeState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkScopeState)(nil)).Elem()
}

type privateLinkScopeArgs struct {
	// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
	Name *string `pulumi:"name"`
	// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a PrivateLinkScope resource.
type PrivateLinkScopeArgs struct {
	// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
	Name pulumi.StringPtrInput
	// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
	Tags pulumi.StringMapInput
}

func (PrivateLinkScopeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkScopeArgs)(nil)).Elem()
}

type PrivateLinkScopeInput interface {
	pulumi.Input

	ToPrivateLinkScopeOutput() PrivateLinkScopeOutput
	ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput
}

func (*PrivateLinkScope) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkScope)(nil)).Elem()
}

func (i *PrivateLinkScope) ToPrivateLinkScopeOutput() PrivateLinkScopeOutput {
	return i.ToPrivateLinkScopeOutputWithContext(context.Background())
}

func (i *PrivateLinkScope) ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeOutput)
}

func (i *PrivateLinkScope) ToOutput(ctx context.Context) pulumix.Output[*PrivateLinkScope] {
	return pulumix.Output[*PrivateLinkScope]{
		OutputState: i.ToPrivateLinkScopeOutputWithContext(ctx).OutputState,
	}
}

// PrivateLinkScopeArrayInput is an input type that accepts PrivateLinkScopeArray and PrivateLinkScopeArrayOutput values.
// You can construct a concrete instance of `PrivateLinkScopeArrayInput` via:
//
//	PrivateLinkScopeArray{ PrivateLinkScopeArgs{...} }
type PrivateLinkScopeArrayInput interface {
	pulumi.Input

	ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput
	ToPrivateLinkScopeArrayOutputWithContext(context.Context) PrivateLinkScopeArrayOutput
}

type PrivateLinkScopeArray []PrivateLinkScopeInput

func (PrivateLinkScopeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkScope)(nil)).Elem()
}

func (i PrivateLinkScopeArray) ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput {
	return i.ToPrivateLinkScopeArrayOutputWithContext(context.Background())
}

func (i PrivateLinkScopeArray) ToPrivateLinkScopeArrayOutputWithContext(ctx context.Context) PrivateLinkScopeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeArrayOutput)
}

func (i PrivateLinkScopeArray) ToOutput(ctx context.Context) pulumix.Output[[]*PrivateLinkScope] {
	return pulumix.Output[[]*PrivateLinkScope]{
		OutputState: i.ToPrivateLinkScopeArrayOutputWithContext(ctx).OutputState,
	}
}

// PrivateLinkScopeMapInput is an input type that accepts PrivateLinkScopeMap and PrivateLinkScopeMapOutput values.
// You can construct a concrete instance of `PrivateLinkScopeMapInput` via:
//
//	PrivateLinkScopeMap{ "key": PrivateLinkScopeArgs{...} }
type PrivateLinkScopeMapInput interface {
	pulumi.Input

	ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput
	ToPrivateLinkScopeMapOutputWithContext(context.Context) PrivateLinkScopeMapOutput
}

type PrivateLinkScopeMap map[string]PrivateLinkScopeInput

func (PrivateLinkScopeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkScope)(nil)).Elem()
}

func (i PrivateLinkScopeMap) ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput {
	return i.ToPrivateLinkScopeMapOutputWithContext(context.Background())
}

func (i PrivateLinkScopeMap) ToPrivateLinkScopeMapOutputWithContext(ctx context.Context) PrivateLinkScopeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkScopeMapOutput)
}

func (i PrivateLinkScopeMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PrivateLinkScope] {
	return pulumix.Output[map[string]*PrivateLinkScope]{
		OutputState: i.ToPrivateLinkScopeMapOutputWithContext(ctx).OutputState,
	}
}

type PrivateLinkScopeOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeOutput) ToPrivateLinkScopeOutput() PrivateLinkScopeOutput {
	return o
}

func (o PrivateLinkScopeOutput) ToPrivateLinkScopeOutputWithContext(ctx context.Context) PrivateLinkScopeOutput {
	return o
}

func (o PrivateLinkScopeOutput) ToOutput(ctx context.Context) pulumix.Output[*PrivateLinkScope] {
	return pulumix.Output[*PrivateLinkScope]{
		OutputState: o.OutputState,
	}
}

// The Azure Region where the Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
func (o PrivateLinkScopeOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for the Azure Arc Private Link Scope. Changing this forces a new Azure Arc Private Link Scope to be created.
func (o PrivateLinkScopeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates whether machines associated with the private link scope can also use public Azure Arc service endpoints. Defaults to `false`. Possible values are `true` and `false`.
func (o PrivateLinkScopeOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.BoolPtrOutput { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

// The name of the Resource Group where the Azure Arc Private Link Scope should exist. Changing this forces a new Azure Arc Private Link Scope to be created.
func (o PrivateLinkScopeOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Azure Arc Private Link Scope.
func (o PrivateLinkScopeOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PrivateLinkScope) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type PrivateLinkScopeArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeArrayOutput) ToPrivateLinkScopeArrayOutput() PrivateLinkScopeArrayOutput {
	return o
}

func (o PrivateLinkScopeArrayOutput) ToPrivateLinkScopeArrayOutputWithContext(ctx context.Context) PrivateLinkScopeArrayOutput {
	return o
}

func (o PrivateLinkScopeArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PrivateLinkScope] {
	return pulumix.Output[[]*PrivateLinkScope]{
		OutputState: o.OutputState,
	}
}

func (o PrivateLinkScopeArrayOutput) Index(i pulumi.IntInput) PrivateLinkScopeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateLinkScope {
		return vs[0].([]*PrivateLinkScope)[vs[1].(int)]
	}).(PrivateLinkScopeOutput)
}

type PrivateLinkScopeMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkScopeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkScope)(nil)).Elem()
}

func (o PrivateLinkScopeMapOutput) ToPrivateLinkScopeMapOutput() PrivateLinkScopeMapOutput {
	return o
}

func (o PrivateLinkScopeMapOutput) ToPrivateLinkScopeMapOutputWithContext(ctx context.Context) PrivateLinkScopeMapOutput {
	return o
}

func (o PrivateLinkScopeMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PrivateLinkScope] {
	return pulumix.Output[map[string]*PrivateLinkScope]{
		OutputState: o.OutputState,
	}
}

func (o PrivateLinkScopeMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkScopeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateLinkScope {
		return vs[0].(map[string]*PrivateLinkScope)[vs[1].(string)]
	}).(PrivateLinkScopeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeInput)(nil)).Elem(), &PrivateLinkScope{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeArrayInput)(nil)).Elem(), PrivateLinkScopeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkScopeMapInput)(nil)).Elem(), PrivateLinkScopeMap{})
	pulumi.RegisterOutputType(PrivateLinkScopeOutput{})
	pulumi.RegisterOutputType(PrivateLinkScopeArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkScopeMapOutput{})
}
