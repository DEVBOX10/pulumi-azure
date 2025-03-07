// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a Front Door (standard/premium) Security Policy.
//
// ## Import
//
// Front Door Security Policies can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/policy1
//
// ```
type FrontdoorSecurityPolicy struct {
	pulumi.CustomResourceState

	// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
	CdnFrontdoorProfileId pulumi.StringOutput `pulumi:"cdnFrontdoorProfileId"`
	// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
	SecurityPolicies FrontdoorSecurityPolicySecurityPoliciesOutput `pulumi:"securityPolicies"`
}

// NewFrontdoorSecurityPolicy registers a new resource with the given unique name, arguments, and options.
func NewFrontdoorSecurityPolicy(ctx *pulumi.Context,
	name string, args *FrontdoorSecurityPolicyArgs, opts ...pulumi.ResourceOption) (*FrontdoorSecurityPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CdnFrontdoorProfileId == nil {
		return nil, errors.New("invalid value for required argument 'CdnFrontdoorProfileId'")
	}
	if args.SecurityPolicies == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicies'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FrontdoorSecurityPolicy
	err := ctx.RegisterResource("azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFrontdoorSecurityPolicy gets an existing FrontdoorSecurityPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFrontdoorSecurityPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FrontdoorSecurityPolicyState, opts ...pulumi.ResourceOption) (*FrontdoorSecurityPolicy, error) {
	var resource FrontdoorSecurityPolicy
	err := ctx.ReadResource("azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FrontdoorSecurityPolicy resources.
type frontdoorSecurityPolicyState struct {
	// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
	CdnFrontdoorProfileId *string `pulumi:"cdnFrontdoorProfileId"`
	// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
	Name *string `pulumi:"name"`
	// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
	SecurityPolicies *FrontdoorSecurityPolicySecurityPolicies `pulumi:"securityPolicies"`
}

type FrontdoorSecurityPolicyState struct {
	// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
	CdnFrontdoorProfileId pulumi.StringPtrInput
	// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
	Name pulumi.StringPtrInput
	// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
	SecurityPolicies FrontdoorSecurityPolicySecurityPoliciesPtrInput
}

func (FrontdoorSecurityPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorSecurityPolicyState)(nil)).Elem()
}

type frontdoorSecurityPolicyArgs struct {
	// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
	CdnFrontdoorProfileId string `pulumi:"cdnFrontdoorProfileId"`
	// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
	Name *string `pulumi:"name"`
	// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
	SecurityPolicies FrontdoorSecurityPolicySecurityPolicies `pulumi:"securityPolicies"`
}

// The set of arguments for constructing a FrontdoorSecurityPolicy resource.
type FrontdoorSecurityPolicyArgs struct {
	// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
	CdnFrontdoorProfileId pulumi.StringInput
	// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
	Name pulumi.StringPtrInput
	// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
	SecurityPolicies FrontdoorSecurityPolicySecurityPoliciesInput
}

func (FrontdoorSecurityPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*frontdoorSecurityPolicyArgs)(nil)).Elem()
}

type FrontdoorSecurityPolicyInput interface {
	pulumi.Input

	ToFrontdoorSecurityPolicyOutput() FrontdoorSecurityPolicyOutput
	ToFrontdoorSecurityPolicyOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyOutput
}

func (*FrontdoorSecurityPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorSecurityPolicy)(nil)).Elem()
}

func (i *FrontdoorSecurityPolicy) ToFrontdoorSecurityPolicyOutput() FrontdoorSecurityPolicyOutput {
	return i.ToFrontdoorSecurityPolicyOutputWithContext(context.Background())
}

func (i *FrontdoorSecurityPolicy) ToFrontdoorSecurityPolicyOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorSecurityPolicyOutput)
}

func (i *FrontdoorSecurityPolicy) ToOutput(ctx context.Context) pulumix.Output[*FrontdoorSecurityPolicy] {
	return pulumix.Output[*FrontdoorSecurityPolicy]{
		OutputState: i.ToFrontdoorSecurityPolicyOutputWithContext(ctx).OutputState,
	}
}

// FrontdoorSecurityPolicyArrayInput is an input type that accepts FrontdoorSecurityPolicyArray and FrontdoorSecurityPolicyArrayOutput values.
// You can construct a concrete instance of `FrontdoorSecurityPolicyArrayInput` via:
//
//	FrontdoorSecurityPolicyArray{ FrontdoorSecurityPolicyArgs{...} }
type FrontdoorSecurityPolicyArrayInput interface {
	pulumi.Input

	ToFrontdoorSecurityPolicyArrayOutput() FrontdoorSecurityPolicyArrayOutput
	ToFrontdoorSecurityPolicyArrayOutputWithContext(context.Context) FrontdoorSecurityPolicyArrayOutput
}

type FrontdoorSecurityPolicyArray []FrontdoorSecurityPolicyInput

func (FrontdoorSecurityPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorSecurityPolicy)(nil)).Elem()
}

func (i FrontdoorSecurityPolicyArray) ToFrontdoorSecurityPolicyArrayOutput() FrontdoorSecurityPolicyArrayOutput {
	return i.ToFrontdoorSecurityPolicyArrayOutputWithContext(context.Background())
}

func (i FrontdoorSecurityPolicyArray) ToFrontdoorSecurityPolicyArrayOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorSecurityPolicyArrayOutput)
}

func (i FrontdoorSecurityPolicyArray) ToOutput(ctx context.Context) pulumix.Output[[]*FrontdoorSecurityPolicy] {
	return pulumix.Output[[]*FrontdoorSecurityPolicy]{
		OutputState: i.ToFrontdoorSecurityPolicyArrayOutputWithContext(ctx).OutputState,
	}
}

// FrontdoorSecurityPolicyMapInput is an input type that accepts FrontdoorSecurityPolicyMap and FrontdoorSecurityPolicyMapOutput values.
// You can construct a concrete instance of `FrontdoorSecurityPolicyMapInput` via:
//
//	FrontdoorSecurityPolicyMap{ "key": FrontdoorSecurityPolicyArgs{...} }
type FrontdoorSecurityPolicyMapInput interface {
	pulumi.Input

	ToFrontdoorSecurityPolicyMapOutput() FrontdoorSecurityPolicyMapOutput
	ToFrontdoorSecurityPolicyMapOutputWithContext(context.Context) FrontdoorSecurityPolicyMapOutput
}

type FrontdoorSecurityPolicyMap map[string]FrontdoorSecurityPolicyInput

func (FrontdoorSecurityPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorSecurityPolicy)(nil)).Elem()
}

func (i FrontdoorSecurityPolicyMap) ToFrontdoorSecurityPolicyMapOutput() FrontdoorSecurityPolicyMapOutput {
	return i.ToFrontdoorSecurityPolicyMapOutputWithContext(context.Background())
}

func (i FrontdoorSecurityPolicyMap) ToFrontdoorSecurityPolicyMapOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrontdoorSecurityPolicyMapOutput)
}

func (i FrontdoorSecurityPolicyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*FrontdoorSecurityPolicy] {
	return pulumix.Output[map[string]*FrontdoorSecurityPolicy]{
		OutputState: i.ToFrontdoorSecurityPolicyMapOutputWithContext(ctx).OutputState,
	}
}

type FrontdoorSecurityPolicyOutput struct{ *pulumi.OutputState }

func (FrontdoorSecurityPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FrontdoorSecurityPolicy)(nil)).Elem()
}

func (o FrontdoorSecurityPolicyOutput) ToFrontdoorSecurityPolicyOutput() FrontdoorSecurityPolicyOutput {
	return o
}

func (o FrontdoorSecurityPolicyOutput) ToFrontdoorSecurityPolicyOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyOutput {
	return o
}

func (o FrontdoorSecurityPolicyOutput) ToOutput(ctx context.Context) pulumix.Output[*FrontdoorSecurityPolicy] {
	return pulumix.Output[*FrontdoorSecurityPolicy]{
		OutputState: o.OutputState,
	}
}

// The Front Door Profile Resource Id that is linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
func (o FrontdoorSecurityPolicyOutput) CdnFrontdoorProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorSecurityPolicy) pulumi.StringOutput { return v.CdnFrontdoorProfileId }).(pulumi.StringOutput)
}

// The name which should be used for this Front Door Security Policy. Possible values must not be an empty string. Changing this forces a new Front Door Security Policy to be created.
func (o FrontdoorSecurityPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FrontdoorSecurityPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An `securityPolicies` block as defined below. Changing this forces a new Front Door Security Policy to be created.
func (o FrontdoorSecurityPolicyOutput) SecurityPolicies() FrontdoorSecurityPolicySecurityPoliciesOutput {
	return o.ApplyT(func(v *FrontdoorSecurityPolicy) FrontdoorSecurityPolicySecurityPoliciesOutput {
		return v.SecurityPolicies
	}).(FrontdoorSecurityPolicySecurityPoliciesOutput)
}

type FrontdoorSecurityPolicyArrayOutput struct{ *pulumi.OutputState }

func (FrontdoorSecurityPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FrontdoorSecurityPolicy)(nil)).Elem()
}

func (o FrontdoorSecurityPolicyArrayOutput) ToFrontdoorSecurityPolicyArrayOutput() FrontdoorSecurityPolicyArrayOutput {
	return o
}

func (o FrontdoorSecurityPolicyArrayOutput) ToFrontdoorSecurityPolicyArrayOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyArrayOutput {
	return o
}

func (o FrontdoorSecurityPolicyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*FrontdoorSecurityPolicy] {
	return pulumix.Output[[]*FrontdoorSecurityPolicy]{
		OutputState: o.OutputState,
	}
}

func (o FrontdoorSecurityPolicyArrayOutput) Index(i pulumi.IntInput) FrontdoorSecurityPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FrontdoorSecurityPolicy {
		return vs[0].([]*FrontdoorSecurityPolicy)[vs[1].(int)]
	}).(FrontdoorSecurityPolicyOutput)
}

type FrontdoorSecurityPolicyMapOutput struct{ *pulumi.OutputState }

func (FrontdoorSecurityPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FrontdoorSecurityPolicy)(nil)).Elem()
}

func (o FrontdoorSecurityPolicyMapOutput) ToFrontdoorSecurityPolicyMapOutput() FrontdoorSecurityPolicyMapOutput {
	return o
}

func (o FrontdoorSecurityPolicyMapOutput) ToFrontdoorSecurityPolicyMapOutputWithContext(ctx context.Context) FrontdoorSecurityPolicyMapOutput {
	return o
}

func (o FrontdoorSecurityPolicyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*FrontdoorSecurityPolicy] {
	return pulumix.Output[map[string]*FrontdoorSecurityPolicy]{
		OutputState: o.OutputState,
	}
}

func (o FrontdoorSecurityPolicyMapOutput) MapIndex(k pulumi.StringInput) FrontdoorSecurityPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FrontdoorSecurityPolicy {
		return vs[0].(map[string]*FrontdoorSecurityPolicy)[vs[1].(string)]
	}).(FrontdoorSecurityPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorSecurityPolicyInput)(nil)).Elem(), &FrontdoorSecurityPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorSecurityPolicyArrayInput)(nil)).Elem(), FrontdoorSecurityPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrontdoorSecurityPolicyMapInput)(nil)).Elem(), FrontdoorSecurityPolicyMap{})
	pulumi.RegisterOutputType(FrontdoorSecurityPolicyOutput{})
	pulumi.RegisterOutputType(FrontdoorSecurityPolicyArrayOutput{})
	pulumi.RegisterOutputType(FrontdoorSecurityPolicyMapOutput{})
}
