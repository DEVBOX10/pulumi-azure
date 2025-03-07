// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dashboard

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

var _ = internal.GetEnvOrDefault

type GrafanaAzureMonitorWorkspaceIntegration struct {
	// Specifies the resource ID of the connected Azure Monitor Workspace.
	ResourceId string `pulumi:"resourceId"`
}

// GrafanaAzureMonitorWorkspaceIntegrationInput is an input type that accepts GrafanaAzureMonitorWorkspaceIntegrationArgs and GrafanaAzureMonitorWorkspaceIntegrationOutput values.
// You can construct a concrete instance of `GrafanaAzureMonitorWorkspaceIntegrationInput` via:
//
//	GrafanaAzureMonitorWorkspaceIntegrationArgs{...}
type GrafanaAzureMonitorWorkspaceIntegrationInput interface {
	pulumi.Input

	ToGrafanaAzureMonitorWorkspaceIntegrationOutput() GrafanaAzureMonitorWorkspaceIntegrationOutput
	ToGrafanaAzureMonitorWorkspaceIntegrationOutputWithContext(context.Context) GrafanaAzureMonitorWorkspaceIntegrationOutput
}

type GrafanaAzureMonitorWorkspaceIntegrationArgs struct {
	// Specifies the resource ID of the connected Azure Monitor Workspace.
	ResourceId pulumi.StringInput `pulumi:"resourceId"`
}

func (GrafanaAzureMonitorWorkspaceIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GrafanaAzureMonitorWorkspaceIntegration)(nil)).Elem()
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArgs) ToGrafanaAzureMonitorWorkspaceIntegrationOutput() GrafanaAzureMonitorWorkspaceIntegrationOutput {
	return i.ToGrafanaAzureMonitorWorkspaceIntegrationOutputWithContext(context.Background())
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArgs) ToGrafanaAzureMonitorWorkspaceIntegrationOutputWithContext(ctx context.Context) GrafanaAzureMonitorWorkspaceIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaAzureMonitorWorkspaceIntegrationOutput)
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArgs) ToOutput(ctx context.Context) pulumix.Output[GrafanaAzureMonitorWorkspaceIntegration] {
	return pulumix.Output[GrafanaAzureMonitorWorkspaceIntegration]{
		OutputState: i.ToGrafanaAzureMonitorWorkspaceIntegrationOutputWithContext(ctx).OutputState,
	}
}

// GrafanaAzureMonitorWorkspaceIntegrationArrayInput is an input type that accepts GrafanaAzureMonitorWorkspaceIntegrationArray and GrafanaAzureMonitorWorkspaceIntegrationArrayOutput values.
// You can construct a concrete instance of `GrafanaAzureMonitorWorkspaceIntegrationArrayInput` via:
//
//	GrafanaAzureMonitorWorkspaceIntegrationArray{ GrafanaAzureMonitorWorkspaceIntegrationArgs{...} }
type GrafanaAzureMonitorWorkspaceIntegrationArrayInput interface {
	pulumi.Input

	ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutput() GrafanaAzureMonitorWorkspaceIntegrationArrayOutput
	ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutputWithContext(context.Context) GrafanaAzureMonitorWorkspaceIntegrationArrayOutput
}

type GrafanaAzureMonitorWorkspaceIntegrationArray []GrafanaAzureMonitorWorkspaceIntegrationInput

func (GrafanaAzureMonitorWorkspaceIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GrafanaAzureMonitorWorkspaceIntegration)(nil)).Elem()
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArray) ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutput() GrafanaAzureMonitorWorkspaceIntegrationArrayOutput {
	return i.ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutputWithContext(context.Background())
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArray) ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutputWithContext(ctx context.Context) GrafanaAzureMonitorWorkspaceIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaAzureMonitorWorkspaceIntegrationArrayOutput)
}

func (i GrafanaAzureMonitorWorkspaceIntegrationArray) ToOutput(ctx context.Context) pulumix.Output[[]GrafanaAzureMonitorWorkspaceIntegration] {
	return pulumix.Output[[]GrafanaAzureMonitorWorkspaceIntegration]{
		OutputState: i.ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutputWithContext(ctx).OutputState,
	}
}

type GrafanaAzureMonitorWorkspaceIntegrationOutput struct{ *pulumi.OutputState }

func (GrafanaAzureMonitorWorkspaceIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GrafanaAzureMonitorWorkspaceIntegration)(nil)).Elem()
}

func (o GrafanaAzureMonitorWorkspaceIntegrationOutput) ToGrafanaAzureMonitorWorkspaceIntegrationOutput() GrafanaAzureMonitorWorkspaceIntegrationOutput {
	return o
}

func (o GrafanaAzureMonitorWorkspaceIntegrationOutput) ToGrafanaAzureMonitorWorkspaceIntegrationOutputWithContext(ctx context.Context) GrafanaAzureMonitorWorkspaceIntegrationOutput {
	return o
}

func (o GrafanaAzureMonitorWorkspaceIntegrationOutput) ToOutput(ctx context.Context) pulumix.Output[GrafanaAzureMonitorWorkspaceIntegration] {
	return pulumix.Output[GrafanaAzureMonitorWorkspaceIntegration]{
		OutputState: o.OutputState,
	}
}

// Specifies the resource ID of the connected Azure Monitor Workspace.
func (o GrafanaAzureMonitorWorkspaceIntegrationOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v GrafanaAzureMonitorWorkspaceIntegration) string { return v.ResourceId }).(pulumi.StringOutput)
}

type GrafanaAzureMonitorWorkspaceIntegrationArrayOutput struct{ *pulumi.OutputState }

func (GrafanaAzureMonitorWorkspaceIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GrafanaAzureMonitorWorkspaceIntegration)(nil)).Elem()
}

func (o GrafanaAzureMonitorWorkspaceIntegrationArrayOutput) ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutput() GrafanaAzureMonitorWorkspaceIntegrationArrayOutput {
	return o
}

func (o GrafanaAzureMonitorWorkspaceIntegrationArrayOutput) ToGrafanaAzureMonitorWorkspaceIntegrationArrayOutputWithContext(ctx context.Context) GrafanaAzureMonitorWorkspaceIntegrationArrayOutput {
	return o
}

func (o GrafanaAzureMonitorWorkspaceIntegrationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]GrafanaAzureMonitorWorkspaceIntegration] {
	return pulumix.Output[[]GrafanaAzureMonitorWorkspaceIntegration]{
		OutputState: o.OutputState,
	}
}

func (o GrafanaAzureMonitorWorkspaceIntegrationArrayOutput) Index(i pulumi.IntInput) GrafanaAzureMonitorWorkspaceIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GrafanaAzureMonitorWorkspaceIntegration {
		return vs[0].([]GrafanaAzureMonitorWorkspaceIntegration)[vs[1].(int)]
	}).(GrafanaAzureMonitorWorkspaceIntegrationOutput)
}

type GrafanaIdentity struct {
	// Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Dashboard Grafana.
	IdentityIds []string `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId *string `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId *string `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`. Changing this forces a new resource to be created.
	Type string `pulumi:"type"`
}

// GrafanaIdentityInput is an input type that accepts GrafanaIdentityArgs and GrafanaIdentityOutput values.
// You can construct a concrete instance of `GrafanaIdentityInput` via:
//
//	GrafanaIdentityArgs{...}
type GrafanaIdentityInput interface {
	pulumi.Input

	ToGrafanaIdentityOutput() GrafanaIdentityOutput
	ToGrafanaIdentityOutputWithContext(context.Context) GrafanaIdentityOutput
}

type GrafanaIdentityArgs struct {
	// Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Dashboard Grafana.
	IdentityIds pulumi.StringArrayInput `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId pulumi.StringPtrInput `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId pulumi.StringPtrInput `pulumi:"tenantId"`
	// Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`. Changing this forces a new resource to be created.
	Type pulumi.StringInput `pulumi:"type"`
}

func (GrafanaIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GrafanaIdentity)(nil)).Elem()
}

func (i GrafanaIdentityArgs) ToGrafanaIdentityOutput() GrafanaIdentityOutput {
	return i.ToGrafanaIdentityOutputWithContext(context.Background())
}

func (i GrafanaIdentityArgs) ToGrafanaIdentityOutputWithContext(ctx context.Context) GrafanaIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaIdentityOutput)
}

func (i GrafanaIdentityArgs) ToOutput(ctx context.Context) pulumix.Output[GrafanaIdentity] {
	return pulumix.Output[GrafanaIdentity]{
		OutputState: i.ToGrafanaIdentityOutputWithContext(ctx).OutputState,
	}
}

func (i GrafanaIdentityArgs) ToGrafanaIdentityPtrOutput() GrafanaIdentityPtrOutput {
	return i.ToGrafanaIdentityPtrOutputWithContext(context.Background())
}

func (i GrafanaIdentityArgs) ToGrafanaIdentityPtrOutputWithContext(ctx context.Context) GrafanaIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaIdentityOutput).ToGrafanaIdentityPtrOutputWithContext(ctx)
}

// GrafanaIdentityPtrInput is an input type that accepts GrafanaIdentityArgs, GrafanaIdentityPtr and GrafanaIdentityPtrOutput values.
// You can construct a concrete instance of `GrafanaIdentityPtrInput` via:
//
//	        GrafanaIdentityArgs{...}
//
//	or:
//
//	        nil
type GrafanaIdentityPtrInput interface {
	pulumi.Input

	ToGrafanaIdentityPtrOutput() GrafanaIdentityPtrOutput
	ToGrafanaIdentityPtrOutputWithContext(context.Context) GrafanaIdentityPtrOutput
}

type grafanaIdentityPtrType GrafanaIdentityArgs

func GrafanaIdentityPtr(v *GrafanaIdentityArgs) GrafanaIdentityPtrInput {
	return (*grafanaIdentityPtrType)(v)
}

func (*grafanaIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**GrafanaIdentity)(nil)).Elem()
}

func (i *grafanaIdentityPtrType) ToGrafanaIdentityPtrOutput() GrafanaIdentityPtrOutput {
	return i.ToGrafanaIdentityPtrOutputWithContext(context.Background())
}

func (i *grafanaIdentityPtrType) ToGrafanaIdentityPtrOutputWithContext(ctx context.Context) GrafanaIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrafanaIdentityPtrOutput)
}

func (i *grafanaIdentityPtrType) ToOutput(ctx context.Context) pulumix.Output[*GrafanaIdentity] {
	return pulumix.Output[*GrafanaIdentity]{
		OutputState: i.ToGrafanaIdentityPtrOutputWithContext(ctx).OutputState,
	}
}

type GrafanaIdentityOutput struct{ *pulumi.OutputState }

func (GrafanaIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GrafanaIdentity)(nil)).Elem()
}

func (o GrafanaIdentityOutput) ToGrafanaIdentityOutput() GrafanaIdentityOutput {
	return o
}

func (o GrafanaIdentityOutput) ToGrafanaIdentityOutputWithContext(ctx context.Context) GrafanaIdentityOutput {
	return o
}

func (o GrafanaIdentityOutput) ToGrafanaIdentityPtrOutput() GrafanaIdentityPtrOutput {
	return o.ToGrafanaIdentityPtrOutputWithContext(context.Background())
}

func (o GrafanaIdentityOutput) ToGrafanaIdentityPtrOutputWithContext(ctx context.Context) GrafanaIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v GrafanaIdentity) *GrafanaIdentity {
		return &v
	}).(GrafanaIdentityPtrOutput)
}

func (o GrafanaIdentityOutput) ToOutput(ctx context.Context) pulumix.Output[GrafanaIdentity] {
	return pulumix.Output[GrafanaIdentity]{
		OutputState: o.OutputState,
	}
}

// Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Dashboard Grafana.
func (o GrafanaIdentityOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GrafanaIdentity) []string { return v.IdentityIds }).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o GrafanaIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GrafanaIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o GrafanaIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GrafanaIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`. Changing this forces a new resource to be created.
func (o GrafanaIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GrafanaIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type GrafanaIdentityPtrOutput struct{ *pulumi.OutputState }

func (GrafanaIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrafanaIdentity)(nil)).Elem()
}

func (o GrafanaIdentityPtrOutput) ToGrafanaIdentityPtrOutput() GrafanaIdentityPtrOutput {
	return o
}

func (o GrafanaIdentityPtrOutput) ToGrafanaIdentityPtrOutputWithContext(ctx context.Context) GrafanaIdentityPtrOutput {
	return o
}

func (o GrafanaIdentityPtrOutput) ToOutput(ctx context.Context) pulumix.Output[*GrafanaIdentity] {
	return pulumix.Output[*GrafanaIdentity]{
		OutputState: o.OutputState,
	}
}

func (o GrafanaIdentityPtrOutput) Elem() GrafanaIdentityOutput {
	return o.ApplyT(func(v *GrafanaIdentity) GrafanaIdentity {
		if v != nil {
			return *v
		}
		var ret GrafanaIdentity
		return ret
	}).(GrafanaIdentityOutput)
}

// Specifies the list of User Assigned Managed Service Identity IDs which should be assigned to this Dashboard Grafana.
func (o GrafanaIdentityPtrOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GrafanaIdentity) []string {
		if v == nil {
			return nil
		}
		return v.IdentityIds
	}).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o GrafanaIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o GrafanaIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

// Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`. Changing this forces a new resource to be created.
func (o GrafanaIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrafanaIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaAzureMonitorWorkspaceIntegrationInput)(nil)).Elem(), GrafanaAzureMonitorWorkspaceIntegrationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaAzureMonitorWorkspaceIntegrationArrayInput)(nil)).Elem(), GrafanaAzureMonitorWorkspaceIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaIdentityInput)(nil)).Elem(), GrafanaIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrafanaIdentityPtrInput)(nil)).Elem(), GrafanaIdentityArgs{})
	pulumi.RegisterOutputType(GrafanaAzureMonitorWorkspaceIntegrationOutput{})
	pulumi.RegisterOutputType(GrafanaAzureMonitorWorkspaceIntegrationArrayOutput{})
	pulumi.RegisterOutputType(GrafanaIdentityOutput{})
	pulumi.RegisterOutputType(GrafanaIdentityPtrOutput{})
}
