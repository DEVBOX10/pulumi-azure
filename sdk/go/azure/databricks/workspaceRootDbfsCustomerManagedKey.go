// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// Databricks Workspace Root DBFS Customer Managed Key can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey workspace1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Databricks/workspaces/workspace1
//
// ```
type WorkspaceRootDbfsCustomerManagedKey struct {
	pulumi.CustomResourceState

	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringOutput `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewWorkspaceRootDbfsCustomerManagedKey registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceRootDbfsCustomerManagedKey(ctx *pulumi.Context,
	name string, args *WorkspaceRootDbfsCustomerManagedKeyArgs, opts ...pulumi.ResourceOption) (*WorkspaceRootDbfsCustomerManagedKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KeyVaultKeyId == nil {
		return nil, errors.New("invalid value for required argument 'KeyVaultKeyId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkspaceRootDbfsCustomerManagedKey
	err := ctx.RegisterResource("azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceRootDbfsCustomerManagedKey gets an existing WorkspaceRootDbfsCustomerManagedKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceRootDbfsCustomerManagedKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceRootDbfsCustomerManagedKeyState, opts ...pulumi.ResourceOption) (*WorkspaceRootDbfsCustomerManagedKey, error) {
	var resource WorkspaceRootDbfsCustomerManagedKey
	err := ctx.ReadResource("azure:databricks/workspaceRootDbfsCustomerManagedKey:WorkspaceRootDbfsCustomerManagedKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceRootDbfsCustomerManagedKey resources.
type workspaceRootDbfsCustomerManagedKeyState struct {
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId *string `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type WorkspaceRootDbfsCustomerManagedKeyState struct {
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringPtrInput
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringPtrInput
}

func (WorkspaceRootDbfsCustomerManagedKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceRootDbfsCustomerManagedKeyState)(nil)).Elem()
}

type workspaceRootDbfsCustomerManagedKeyArgs struct {
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	// The resource ID of the Databricks Workspace.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a WorkspaceRootDbfsCustomerManagedKey resource.
type WorkspaceRootDbfsCustomerManagedKeyArgs struct {
	// The resource ID of the Key Vault Key to be used.
	KeyVaultKeyId pulumi.StringInput
	// The resource ID of the Databricks Workspace.
	WorkspaceId pulumi.StringInput
}

func (WorkspaceRootDbfsCustomerManagedKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceRootDbfsCustomerManagedKeyArgs)(nil)).Elem()
}

type WorkspaceRootDbfsCustomerManagedKeyInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput
	ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput
}

func (*WorkspaceRootDbfsCustomerManagedKey) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i *WorkspaceRootDbfsCustomerManagedKey) ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(context.Background())
}

func (i *WorkspaceRootDbfsCustomerManagedKey) ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

func (i *WorkspaceRootDbfsCustomerManagedKey) ToOutput(ctx context.Context) pulumix.Output[*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: i.ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx).OutputState,
	}
}

// WorkspaceRootDbfsCustomerManagedKeyArrayInput is an input type that accepts WorkspaceRootDbfsCustomerManagedKeyArray and WorkspaceRootDbfsCustomerManagedKeyArrayOutput values.
// You can construct a concrete instance of `WorkspaceRootDbfsCustomerManagedKeyArrayInput` via:
//
//	WorkspaceRootDbfsCustomerManagedKeyArray{ WorkspaceRootDbfsCustomerManagedKeyArgs{...} }
type WorkspaceRootDbfsCustomerManagedKeyArrayInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput
	ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput
}

type WorkspaceRootDbfsCustomerManagedKeyArray []WorkspaceRootDbfsCustomerManagedKeyInput

func (WorkspaceRootDbfsCustomerManagedKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i WorkspaceRootDbfsCustomerManagedKeyArray) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(context.Background())
}

func (i WorkspaceRootDbfsCustomerManagedKeyArray) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyArrayOutput)
}

func (i WorkspaceRootDbfsCustomerManagedKeyArray) ToOutput(ctx context.Context) pulumix.Output[[]*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[[]*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: i.ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(ctx).OutputState,
	}
}

// WorkspaceRootDbfsCustomerManagedKeyMapInput is an input type that accepts WorkspaceRootDbfsCustomerManagedKeyMap and WorkspaceRootDbfsCustomerManagedKeyMapOutput values.
// You can construct a concrete instance of `WorkspaceRootDbfsCustomerManagedKeyMapInput` via:
//
//	WorkspaceRootDbfsCustomerManagedKeyMap{ "key": WorkspaceRootDbfsCustomerManagedKeyArgs{...} }
type WorkspaceRootDbfsCustomerManagedKeyMapInput interface {
	pulumi.Input

	ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput
	ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput
}

type WorkspaceRootDbfsCustomerManagedKeyMap map[string]WorkspaceRootDbfsCustomerManagedKeyInput

func (WorkspaceRootDbfsCustomerManagedKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (i WorkspaceRootDbfsCustomerManagedKeyMap) ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return i.ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(context.Background())
}

func (i WorkspaceRootDbfsCustomerManagedKeyMap) ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceRootDbfsCustomerManagedKeyMapOutput)
}

func (i WorkspaceRootDbfsCustomerManagedKeyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[map[string]*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: i.ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(ctx).OutputState,
	}
}

type WorkspaceRootDbfsCustomerManagedKeyOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) ToWorkspaceRootDbfsCustomerManagedKeyOutput() WorkspaceRootDbfsCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) ToWorkspaceRootDbfsCustomerManagedKeyOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyOutput) ToOutput(ctx context.Context) pulumix.Output[*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: o.OutputState,
	}
}

// The resource ID of the Key Vault Key to be used.
func (o WorkspaceRootDbfsCustomerManagedKeyOutput) KeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceRootDbfsCustomerManagedKey) pulumi.StringOutput { return v.KeyVaultKeyId }).(pulumi.StringOutput)
}

// The resource ID of the Databricks Workspace.
func (o WorkspaceRootDbfsCustomerManagedKeyOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceRootDbfsCustomerManagedKey) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type WorkspaceRootDbfsCustomerManagedKeyArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutput() WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ToWorkspaceRootDbfsCustomerManagedKeyArrayOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyArrayOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[[]*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: o.OutputState,
	}
}

func (o WorkspaceRootDbfsCustomerManagedKeyArrayOutput) Index(i pulumi.IntInput) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkspaceRootDbfsCustomerManagedKey {
		return vs[0].([]*WorkspaceRootDbfsCustomerManagedKey)[vs[1].(int)]
	}).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

type WorkspaceRootDbfsCustomerManagedKeyMapOutput struct{ *pulumi.OutputState }

func (WorkspaceRootDbfsCustomerManagedKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceRootDbfsCustomerManagedKey)(nil)).Elem()
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) ToWorkspaceRootDbfsCustomerManagedKeyMapOutput() WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) ToWorkspaceRootDbfsCustomerManagedKeyMapOutputWithContext(ctx context.Context) WorkspaceRootDbfsCustomerManagedKeyMapOutput {
	return o
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*WorkspaceRootDbfsCustomerManagedKey] {
	return pulumix.Output[map[string]*WorkspaceRootDbfsCustomerManagedKey]{
		OutputState: o.OutputState,
	}
}

func (o WorkspaceRootDbfsCustomerManagedKeyMapOutput) MapIndex(k pulumi.StringInput) WorkspaceRootDbfsCustomerManagedKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkspaceRootDbfsCustomerManagedKey {
		return vs[0].(map[string]*WorkspaceRootDbfsCustomerManagedKey)[vs[1].(string)]
	}).(WorkspaceRootDbfsCustomerManagedKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyInput)(nil)).Elem(), &WorkspaceRootDbfsCustomerManagedKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyArrayInput)(nil)).Elem(), WorkspaceRootDbfsCustomerManagedKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceRootDbfsCustomerManagedKeyMapInput)(nil)).Elem(), WorkspaceRootDbfsCustomerManagedKeyMap{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyOutput{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceRootDbfsCustomerManagedKeyMapOutput{})
}
