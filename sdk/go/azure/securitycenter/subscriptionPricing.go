// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securitycenter

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages the Pricing Tier for Azure Security Center in the current subscription.
//
// > **NOTE:** Deletion of this resource will reset the pricing tier to `Free`
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewSubscriptionPricing(ctx, "example", &securitycenter.SubscriptionPricingArgs{
//				ResourceType: pulumi.String("VirtualMachines"),
//				Tier:         pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Using Extensions with Defender CSPM
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/securitycenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := securitycenter.NewSubscriptionPricing(ctx, "example1", &securitycenter.SubscriptionPricingArgs{
//				Extensions: securitycenter.SubscriptionPricingExtensionArray{
//					&securitycenter.SubscriptionPricingExtensionArgs{
//						Name: pulumi.String("ContainerRegistriesVulnerabilityAssessments"),
//					},
//					&securitycenter.SubscriptionPricingExtensionArgs{
//						AdditionalExtensionProperties: pulumi.StringMap{
//							"ExclusionTags": pulumi.String("[]"),
//						},
//						Name: pulumi.String("AgentlessVmScanning"),
//					},
//					&securitycenter.SubscriptionPricingExtensionArgs{
//						Name: pulumi.String("AgentlessDiscoveryForKubernetes"),
//					},
//					&securitycenter.SubscriptionPricingExtensionArgs{
//						Name: pulumi.String("SensitiveDataDiscovery"),
//					},
//				},
//				ResourceType: pulumi.String("CloudPosture"),
//				Tier:         pulumi.String("Standard"),
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
// The pricing tier can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:securitycenter/subscriptionPricing:SubscriptionPricing example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Security/pricings/<resource_type>
//
// ```
type SubscriptionPricing struct {
	pulumi.CustomResourceState

	// One or more `extension` blocks as defined below.
	Extensions SubscriptionPricingExtensionArrayOutput `pulumi:"extensions"`
	// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
	ResourceType pulumi.StringPtrOutput `pulumi:"resourceType"`
	// Resource type pricing subplan. Contact your MSFT representative for possible values.
	Subplan pulumi.StringPtrOutput `pulumi:"subplan"`
	// The pricing tier to use. Possible values are `Free` and `Standard`.
	Tier pulumi.StringOutput `pulumi:"tier"`
}

// NewSubscriptionPricing registers a new resource with the given unique name, arguments, and options.
func NewSubscriptionPricing(ctx *pulumi.Context,
	name string, args *SubscriptionPricingArgs, opts ...pulumi.ResourceOption) (*SubscriptionPricing, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Tier == nil {
		return nil, errors.New("invalid value for required argument 'Tier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubscriptionPricing
	err := ctx.RegisterResource("azure:securitycenter/subscriptionPricing:SubscriptionPricing", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscriptionPricing gets an existing SubscriptionPricing resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscriptionPricing(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionPricingState, opts ...pulumi.ResourceOption) (*SubscriptionPricing, error) {
	var resource SubscriptionPricing
	err := ctx.ReadResource("azure:securitycenter/subscriptionPricing:SubscriptionPricing", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubscriptionPricing resources.
type subscriptionPricingState struct {
	// One or more `extension` blocks as defined below.
	Extensions []SubscriptionPricingExtension `pulumi:"extensions"`
	// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
	ResourceType *string `pulumi:"resourceType"`
	// Resource type pricing subplan. Contact your MSFT representative for possible values.
	Subplan *string `pulumi:"subplan"`
	// The pricing tier to use. Possible values are `Free` and `Standard`.
	Tier *string `pulumi:"tier"`
}

type SubscriptionPricingState struct {
	// One or more `extension` blocks as defined below.
	Extensions SubscriptionPricingExtensionArrayInput
	// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
	ResourceType pulumi.StringPtrInput
	// Resource type pricing subplan. Contact your MSFT representative for possible values.
	Subplan pulumi.StringPtrInput
	// The pricing tier to use. Possible values are `Free` and `Standard`.
	Tier pulumi.StringPtrInput
}

func (SubscriptionPricingState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionPricingState)(nil)).Elem()
}

type subscriptionPricingArgs struct {
	// One or more `extension` blocks as defined below.
	Extensions []SubscriptionPricingExtension `pulumi:"extensions"`
	// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
	ResourceType *string `pulumi:"resourceType"`
	// Resource type pricing subplan. Contact your MSFT representative for possible values.
	Subplan *string `pulumi:"subplan"`
	// The pricing tier to use. Possible values are `Free` and `Standard`.
	Tier string `pulumi:"tier"`
}

// The set of arguments for constructing a SubscriptionPricing resource.
type SubscriptionPricingArgs struct {
	// One or more `extension` blocks as defined below.
	Extensions SubscriptionPricingExtensionArrayInput
	// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
	ResourceType pulumi.StringPtrInput
	// Resource type pricing subplan. Contact your MSFT representative for possible values.
	Subplan pulumi.StringPtrInput
	// The pricing tier to use. Possible values are `Free` and `Standard`.
	Tier pulumi.StringInput
}

func (SubscriptionPricingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionPricingArgs)(nil)).Elem()
}

type SubscriptionPricingInput interface {
	pulumi.Input

	ToSubscriptionPricingOutput() SubscriptionPricingOutput
	ToSubscriptionPricingOutputWithContext(ctx context.Context) SubscriptionPricingOutput
}

func (*SubscriptionPricing) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionPricing)(nil)).Elem()
}

func (i *SubscriptionPricing) ToSubscriptionPricingOutput() SubscriptionPricingOutput {
	return i.ToSubscriptionPricingOutputWithContext(context.Background())
}

func (i *SubscriptionPricing) ToSubscriptionPricingOutputWithContext(ctx context.Context) SubscriptionPricingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionPricingOutput)
}

func (i *SubscriptionPricing) ToOutput(ctx context.Context) pulumix.Output[*SubscriptionPricing] {
	return pulumix.Output[*SubscriptionPricing]{
		OutputState: i.ToSubscriptionPricingOutputWithContext(ctx).OutputState,
	}
}

// SubscriptionPricingArrayInput is an input type that accepts SubscriptionPricingArray and SubscriptionPricingArrayOutput values.
// You can construct a concrete instance of `SubscriptionPricingArrayInput` via:
//
//	SubscriptionPricingArray{ SubscriptionPricingArgs{...} }
type SubscriptionPricingArrayInput interface {
	pulumi.Input

	ToSubscriptionPricingArrayOutput() SubscriptionPricingArrayOutput
	ToSubscriptionPricingArrayOutputWithContext(context.Context) SubscriptionPricingArrayOutput
}

type SubscriptionPricingArray []SubscriptionPricingInput

func (SubscriptionPricingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionPricing)(nil)).Elem()
}

func (i SubscriptionPricingArray) ToSubscriptionPricingArrayOutput() SubscriptionPricingArrayOutput {
	return i.ToSubscriptionPricingArrayOutputWithContext(context.Background())
}

func (i SubscriptionPricingArray) ToSubscriptionPricingArrayOutputWithContext(ctx context.Context) SubscriptionPricingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionPricingArrayOutput)
}

func (i SubscriptionPricingArray) ToOutput(ctx context.Context) pulumix.Output[[]*SubscriptionPricing] {
	return pulumix.Output[[]*SubscriptionPricing]{
		OutputState: i.ToSubscriptionPricingArrayOutputWithContext(ctx).OutputState,
	}
}

// SubscriptionPricingMapInput is an input type that accepts SubscriptionPricingMap and SubscriptionPricingMapOutput values.
// You can construct a concrete instance of `SubscriptionPricingMapInput` via:
//
//	SubscriptionPricingMap{ "key": SubscriptionPricingArgs{...} }
type SubscriptionPricingMapInput interface {
	pulumi.Input

	ToSubscriptionPricingMapOutput() SubscriptionPricingMapOutput
	ToSubscriptionPricingMapOutputWithContext(context.Context) SubscriptionPricingMapOutput
}

type SubscriptionPricingMap map[string]SubscriptionPricingInput

func (SubscriptionPricingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionPricing)(nil)).Elem()
}

func (i SubscriptionPricingMap) ToSubscriptionPricingMapOutput() SubscriptionPricingMapOutput {
	return i.ToSubscriptionPricingMapOutputWithContext(context.Background())
}

func (i SubscriptionPricingMap) ToSubscriptionPricingMapOutputWithContext(ctx context.Context) SubscriptionPricingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubscriptionPricingMapOutput)
}

func (i SubscriptionPricingMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubscriptionPricing] {
	return pulumix.Output[map[string]*SubscriptionPricing]{
		OutputState: i.ToSubscriptionPricingMapOutputWithContext(ctx).OutputState,
	}
}

type SubscriptionPricingOutput struct{ *pulumi.OutputState }

func (SubscriptionPricingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubscriptionPricing)(nil)).Elem()
}

func (o SubscriptionPricingOutput) ToSubscriptionPricingOutput() SubscriptionPricingOutput {
	return o
}

func (o SubscriptionPricingOutput) ToSubscriptionPricingOutputWithContext(ctx context.Context) SubscriptionPricingOutput {
	return o
}

func (o SubscriptionPricingOutput) ToOutput(ctx context.Context) pulumix.Output[*SubscriptionPricing] {
	return pulumix.Output[*SubscriptionPricing]{
		OutputState: o.OutputState,
	}
}

// One or more `extension` blocks as defined below.
func (o SubscriptionPricingOutput) Extensions() SubscriptionPricingExtensionArrayOutput {
	return o.ApplyT(func(v *SubscriptionPricing) SubscriptionPricingExtensionArrayOutput { return v.Extensions }).(SubscriptionPricingExtensionArrayOutput)
}

// The resource type this setting affects. Possible values are `Api`, `AppServices`, `ContainerRegistry`, `KeyVaults`, `KubernetesService`, `SqlServers`, `SqlServerVirtualMachines`, `StorageAccounts`, `VirtualMachines`, `Arm`, `Dns`, `OpenSourceRelationalDatabases`, `Containers`, `CosmosDbs` and `CloudPosture`. Defaults to `VirtualMachines`
func (o SubscriptionPricingOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubscriptionPricing) pulumi.StringPtrOutput { return v.ResourceType }).(pulumi.StringPtrOutput)
}

// Resource type pricing subplan. Contact your MSFT representative for possible values.
func (o SubscriptionPricingOutput) Subplan() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubscriptionPricing) pulumi.StringPtrOutput { return v.Subplan }).(pulumi.StringPtrOutput)
}

// The pricing tier to use. Possible values are `Free` and `Standard`.
func (o SubscriptionPricingOutput) Tier() pulumi.StringOutput {
	return o.ApplyT(func(v *SubscriptionPricing) pulumi.StringOutput { return v.Tier }).(pulumi.StringOutput)
}

type SubscriptionPricingArrayOutput struct{ *pulumi.OutputState }

func (SubscriptionPricingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubscriptionPricing)(nil)).Elem()
}

func (o SubscriptionPricingArrayOutput) ToSubscriptionPricingArrayOutput() SubscriptionPricingArrayOutput {
	return o
}

func (o SubscriptionPricingArrayOutput) ToSubscriptionPricingArrayOutputWithContext(ctx context.Context) SubscriptionPricingArrayOutput {
	return o
}

func (o SubscriptionPricingArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SubscriptionPricing] {
	return pulumix.Output[[]*SubscriptionPricing]{
		OutputState: o.OutputState,
	}
}

func (o SubscriptionPricingArrayOutput) Index(i pulumi.IntInput) SubscriptionPricingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubscriptionPricing {
		return vs[0].([]*SubscriptionPricing)[vs[1].(int)]
	}).(SubscriptionPricingOutput)
}

type SubscriptionPricingMapOutput struct{ *pulumi.OutputState }

func (SubscriptionPricingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubscriptionPricing)(nil)).Elem()
}

func (o SubscriptionPricingMapOutput) ToSubscriptionPricingMapOutput() SubscriptionPricingMapOutput {
	return o
}

func (o SubscriptionPricingMapOutput) ToSubscriptionPricingMapOutputWithContext(ctx context.Context) SubscriptionPricingMapOutput {
	return o
}

func (o SubscriptionPricingMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubscriptionPricing] {
	return pulumix.Output[map[string]*SubscriptionPricing]{
		OutputState: o.OutputState,
	}
}

func (o SubscriptionPricingMapOutput) MapIndex(k pulumi.StringInput) SubscriptionPricingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubscriptionPricing {
		return vs[0].(map[string]*SubscriptionPricing)[vs[1].(string)]
	}).(SubscriptionPricingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionPricingInput)(nil)).Elem(), &SubscriptionPricing{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionPricingArrayInput)(nil)).Elem(), SubscriptionPricingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubscriptionPricingMapInput)(nil)).Elem(), SubscriptionPricingMap{})
	pulumi.RegisterOutputType(SubscriptionPricingOutput{})
	pulumi.RegisterOutputType(SubscriptionPricingArrayOutput{})
	pulumi.RegisterOutputType(SubscriptionPricingMapOutput{})
}
