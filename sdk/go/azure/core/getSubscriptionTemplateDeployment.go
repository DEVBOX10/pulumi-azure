// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package core

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to access information about an existing Subscription Template Deployment.
func LookupSubscriptionTemplateDeployment(ctx *pulumi.Context, args *LookupSubscriptionTemplateDeploymentArgs, opts ...pulumi.InvokeOption) (*LookupSubscriptionTemplateDeploymentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSubscriptionTemplateDeploymentResult
	err := ctx.Invoke("azure:core/getSubscriptionTemplateDeployment:getSubscriptionTemplateDeployment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubscriptionTemplateDeployment.
type LookupSubscriptionTemplateDeploymentArgs struct {
	// The name of this Subscription Template Deployment.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSubscriptionTemplateDeployment.
type LookupSubscriptionTemplateDeploymentResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The JSON Content of the Outputs of the ARM Template Deployment.
	OutputContent string `pulumi:"outputContent"`
}

func LookupSubscriptionTemplateDeploymentOutput(ctx *pulumi.Context, args LookupSubscriptionTemplateDeploymentOutputArgs, opts ...pulumi.InvokeOption) LookupSubscriptionTemplateDeploymentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSubscriptionTemplateDeploymentResult, error) {
			args := v.(LookupSubscriptionTemplateDeploymentArgs)
			r, err := LookupSubscriptionTemplateDeployment(ctx, &args, opts...)
			var s LookupSubscriptionTemplateDeploymentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSubscriptionTemplateDeploymentResultOutput)
}

// A collection of arguments for invoking getSubscriptionTemplateDeployment.
type LookupSubscriptionTemplateDeploymentOutputArgs struct {
	// The name of this Subscription Template Deployment.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupSubscriptionTemplateDeploymentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubscriptionTemplateDeploymentArgs)(nil)).Elem()
}

// A collection of values returned by getSubscriptionTemplateDeployment.
type LookupSubscriptionTemplateDeploymentResultOutput struct{ *pulumi.OutputState }

func (LookupSubscriptionTemplateDeploymentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubscriptionTemplateDeploymentResult)(nil)).Elem()
}

func (o LookupSubscriptionTemplateDeploymentResultOutput) ToLookupSubscriptionTemplateDeploymentResultOutput() LookupSubscriptionTemplateDeploymentResultOutput {
	return o
}

func (o LookupSubscriptionTemplateDeploymentResultOutput) ToLookupSubscriptionTemplateDeploymentResultOutputWithContext(ctx context.Context) LookupSubscriptionTemplateDeploymentResultOutput {
	return o
}

func (o LookupSubscriptionTemplateDeploymentResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSubscriptionTemplateDeploymentResult] {
	return pulumix.Output[LookupSubscriptionTemplateDeploymentResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSubscriptionTemplateDeploymentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionTemplateDeploymentResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSubscriptionTemplateDeploymentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionTemplateDeploymentResult) string { return v.Name }).(pulumi.StringOutput)
}

// The JSON Content of the Outputs of the ARM Template Deployment.
func (o LookupSubscriptionTemplateDeploymentResultOutput) OutputContent() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionTemplateDeploymentResult) string { return v.OutputContent }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubscriptionTemplateDeploymentResultOutput{})
}
