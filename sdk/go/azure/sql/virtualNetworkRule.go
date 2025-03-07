// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sql

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Allows you to add, update, or remove an Azure SQL server to a subnet of a virtual network.
//
// > **Note:** The `sql.VirtualNetworkRule` resource is deprecated in version 3.0 of the AzureRM provider and will be removed in version 4.0. Please use the `mssql.VirtualNetworkRule` resource instead.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/sql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			vnet, err := network.NewVirtualNetwork(ctx, "vnet", &network.VirtualNetworkArgs{
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.7.29.0/29"),
//				},
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			subnet, err := network.NewSubnet(ctx, "subnet", &network.SubnetArgs{
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: vnet.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.7.29.0/29"),
//				},
//				ServiceEndpoints: pulumi.StringArray{
//					pulumi.String("Microsoft.Sql"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			sqlserver, err := sql.NewSqlServer(ctx, "sqlserver", &sql.SqlServerArgs{
//				ResourceGroupName:          example.Name,
//				Location:                   example.Location,
//				Version:                    pulumi.String("12.0"),
//				AdministratorLogin:         pulumi.String("4dm1n157r470r"),
//				AdministratorLoginPassword: pulumi.String("4-v3ry-53cr37-p455w0rd"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = sql.NewVirtualNetworkRule(ctx, "sqlvnetrule", &sql.VirtualNetworkRuleArgs{
//				ResourceGroupName: example.Name,
//				ServerName:        sqlserver.Name,
//				SubnetId:          subnet.ID(),
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
// SQL Virtual Network Rules can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:sql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver/virtualNetworkRules/vnetrulename
//
// ```
type VirtualNetworkRule struct {
	pulumi.CustomResourceState

	// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
	//
	// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
	IgnoreMissingVnetServiceEndpoint pulumi.BoolPtrOutput `pulumi:"ignoreMissingVnetServiceEndpoint"`
	// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
	//
	// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
	//
	// 1. Contains only alphanumeric and hyphen characters
	// 2. Cannot start with a number or hyphen
	// 3. Cannot end with a hyphen
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
	ServerName pulumi.StringOutput `pulumi:"serverName"`
	// The ID of the subnet that the SQL server will be connected to.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
}

// NewVirtualNetworkRule registers a new resource with the given unique name, arguments, and options.
func NewVirtualNetworkRule(ctx *pulumi.Context,
	name string, args *VirtualNetworkRuleArgs, opts ...pulumi.ResourceOption) (*VirtualNetworkRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.ServerName == nil {
		return nil, errors.New("invalid value for required argument 'ServerName'")
	}
	if args.SubnetId == nil {
		return nil, errors.New("invalid value for required argument 'SubnetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualNetworkRule
	err := ctx.RegisterResource("azure:sql/virtualNetworkRule:VirtualNetworkRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualNetworkRule gets an existing VirtualNetworkRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualNetworkRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualNetworkRuleState, opts ...pulumi.ResourceOption) (*VirtualNetworkRule, error) {
	var resource VirtualNetworkRule
	err := ctx.ReadResource("azure:sql/virtualNetworkRule:VirtualNetworkRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualNetworkRule resources.
type virtualNetworkRuleState struct {
	// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
	//
	// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
	IgnoreMissingVnetServiceEndpoint *bool `pulumi:"ignoreMissingVnetServiceEndpoint"`
	// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
	//
	// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
	//
	// 1. Contains only alphanumeric and hyphen characters
	// 2. Cannot start with a number or hyphen
	// 3. Cannot end with a hyphen
	Name *string `pulumi:"name"`
	// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
	ServerName *string `pulumi:"serverName"`
	// The ID of the subnet that the SQL server will be connected to.
	SubnetId *string `pulumi:"subnetId"`
}

type VirtualNetworkRuleState struct {
	// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
	//
	// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
	IgnoreMissingVnetServiceEndpoint pulumi.BoolPtrInput
	// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
	//
	// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
	//
	// 1. Contains only alphanumeric and hyphen characters
	// 2. Cannot start with a number or hyphen
	// 3. Cannot end with a hyphen
	Name pulumi.StringPtrInput
	// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
	ServerName pulumi.StringPtrInput
	// The ID of the subnet that the SQL server will be connected to.
	SubnetId pulumi.StringPtrInput
}

func (VirtualNetworkRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkRuleState)(nil)).Elem()
}

type virtualNetworkRuleArgs struct {
	// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
	//
	// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
	IgnoreMissingVnetServiceEndpoint *bool `pulumi:"ignoreMissingVnetServiceEndpoint"`
	// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
	//
	// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
	//
	// 1. Contains only alphanumeric and hyphen characters
	// 2. Cannot start with a number or hyphen
	// 3. Cannot end with a hyphen
	Name *string `pulumi:"name"`
	// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
	ServerName string `pulumi:"serverName"`
	// The ID of the subnet that the SQL server will be connected to.
	SubnetId string `pulumi:"subnetId"`
}

// The set of arguments for constructing a VirtualNetworkRule resource.
type VirtualNetworkRuleArgs struct {
	// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
	//
	// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
	IgnoreMissingVnetServiceEndpoint pulumi.BoolPtrInput
	// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
	//
	// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
	//
	// 1. Contains only alphanumeric and hyphen characters
	// 2. Cannot start with a number or hyphen
	// 3. Cannot end with a hyphen
	Name pulumi.StringPtrInput
	// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
	ServerName pulumi.StringInput
	// The ID of the subnet that the SQL server will be connected to.
	SubnetId pulumi.StringInput
}

func (VirtualNetworkRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkRuleArgs)(nil)).Elem()
}

type VirtualNetworkRuleInput interface {
	pulumi.Input

	ToVirtualNetworkRuleOutput() VirtualNetworkRuleOutput
	ToVirtualNetworkRuleOutputWithContext(ctx context.Context) VirtualNetworkRuleOutput
}

func (*VirtualNetworkRule) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkRule)(nil)).Elem()
}

func (i *VirtualNetworkRule) ToVirtualNetworkRuleOutput() VirtualNetworkRuleOutput {
	return i.ToVirtualNetworkRuleOutputWithContext(context.Background())
}

func (i *VirtualNetworkRule) ToVirtualNetworkRuleOutputWithContext(ctx context.Context) VirtualNetworkRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkRuleOutput)
}

func (i *VirtualNetworkRule) ToOutput(ctx context.Context) pulumix.Output[*VirtualNetworkRule] {
	return pulumix.Output[*VirtualNetworkRule]{
		OutputState: i.ToVirtualNetworkRuleOutputWithContext(ctx).OutputState,
	}
}

// VirtualNetworkRuleArrayInput is an input type that accepts VirtualNetworkRuleArray and VirtualNetworkRuleArrayOutput values.
// You can construct a concrete instance of `VirtualNetworkRuleArrayInput` via:
//
//	VirtualNetworkRuleArray{ VirtualNetworkRuleArgs{...} }
type VirtualNetworkRuleArrayInput interface {
	pulumi.Input

	ToVirtualNetworkRuleArrayOutput() VirtualNetworkRuleArrayOutput
	ToVirtualNetworkRuleArrayOutputWithContext(context.Context) VirtualNetworkRuleArrayOutput
}

type VirtualNetworkRuleArray []VirtualNetworkRuleInput

func (VirtualNetworkRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkRule)(nil)).Elem()
}

func (i VirtualNetworkRuleArray) ToVirtualNetworkRuleArrayOutput() VirtualNetworkRuleArrayOutput {
	return i.ToVirtualNetworkRuleArrayOutputWithContext(context.Background())
}

func (i VirtualNetworkRuleArray) ToVirtualNetworkRuleArrayOutputWithContext(ctx context.Context) VirtualNetworkRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkRuleArrayOutput)
}

func (i VirtualNetworkRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*VirtualNetworkRule] {
	return pulumix.Output[[]*VirtualNetworkRule]{
		OutputState: i.ToVirtualNetworkRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// VirtualNetworkRuleMapInput is an input type that accepts VirtualNetworkRuleMap and VirtualNetworkRuleMapOutput values.
// You can construct a concrete instance of `VirtualNetworkRuleMapInput` via:
//
//	VirtualNetworkRuleMap{ "key": VirtualNetworkRuleArgs{...} }
type VirtualNetworkRuleMapInput interface {
	pulumi.Input

	ToVirtualNetworkRuleMapOutput() VirtualNetworkRuleMapOutput
	ToVirtualNetworkRuleMapOutputWithContext(context.Context) VirtualNetworkRuleMapOutput
}

type VirtualNetworkRuleMap map[string]VirtualNetworkRuleInput

func (VirtualNetworkRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkRule)(nil)).Elem()
}

func (i VirtualNetworkRuleMap) ToVirtualNetworkRuleMapOutput() VirtualNetworkRuleMapOutput {
	return i.ToVirtualNetworkRuleMapOutputWithContext(context.Background())
}

func (i VirtualNetworkRuleMap) ToVirtualNetworkRuleMapOutputWithContext(ctx context.Context) VirtualNetworkRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkRuleMapOutput)
}

func (i VirtualNetworkRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*VirtualNetworkRule] {
	return pulumix.Output[map[string]*VirtualNetworkRule]{
		OutputState: i.ToVirtualNetworkRuleMapOutputWithContext(ctx).OutputState,
	}
}

type VirtualNetworkRuleOutput struct{ *pulumi.OutputState }

func (VirtualNetworkRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkRule)(nil)).Elem()
}

func (o VirtualNetworkRuleOutput) ToVirtualNetworkRuleOutput() VirtualNetworkRuleOutput {
	return o
}

func (o VirtualNetworkRuleOutput) ToVirtualNetworkRuleOutputWithContext(ctx context.Context) VirtualNetworkRuleOutput {
	return o
}

func (o VirtualNetworkRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*VirtualNetworkRule] {
	return pulumix.Output[*VirtualNetworkRule]{
		OutputState: o.OutputState,
	}
}

// Create the virtual network rule before the subnet has the virtual network service endpoint enabled. The default value is false.
//
// > **NOTE:** If `ignoreMissingVnetServiceEndpoint` is false, and the target subnet does not contain the `Microsoft.SQL` endpoint in the `serviceEndpoints` array, the deployment will fail when it tries to create the SQL virtual network rule.
func (o VirtualNetworkRuleOutput) IgnoreMissingVnetServiceEndpoint() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualNetworkRule) pulumi.BoolPtrOutput { return v.IgnoreMissingVnetServiceEndpoint }).(pulumi.BoolPtrOutput)
}

// The name of the SQL virtual network rule. Changing this forces a new resource to be created. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen.
//
// > **NOTE:** `name` must be between 1-64 characters long and must satisfy all of the requirements below:
//
// 1. Contains only alphanumeric and hyphen characters
// 2. Cannot start with a number or hyphen
// 3. Cannot end with a hyphen
func (o VirtualNetworkRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group where the SQL server resides. Changing this forces a new resource to be created.
func (o VirtualNetworkRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The name of the SQL Server to which this SQL virtual network rule will be applied to. Changing this forces a new resource to be created.
func (o VirtualNetworkRuleOutput) ServerName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkRule) pulumi.StringOutput { return v.ServerName }).(pulumi.StringOutput)
}

// The ID of the subnet that the SQL server will be connected to.
func (o VirtualNetworkRuleOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkRule) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

type VirtualNetworkRuleArrayOutput struct{ *pulumi.OutputState }

func (VirtualNetworkRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkRule)(nil)).Elem()
}

func (o VirtualNetworkRuleArrayOutput) ToVirtualNetworkRuleArrayOutput() VirtualNetworkRuleArrayOutput {
	return o
}

func (o VirtualNetworkRuleArrayOutput) ToVirtualNetworkRuleArrayOutputWithContext(ctx context.Context) VirtualNetworkRuleArrayOutput {
	return o
}

func (o VirtualNetworkRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*VirtualNetworkRule] {
	return pulumix.Output[[]*VirtualNetworkRule]{
		OutputState: o.OutputState,
	}
}

func (o VirtualNetworkRuleArrayOutput) Index(i pulumi.IntInput) VirtualNetworkRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualNetworkRule {
		return vs[0].([]*VirtualNetworkRule)[vs[1].(int)]
	}).(VirtualNetworkRuleOutput)
}

type VirtualNetworkRuleMapOutput struct{ *pulumi.OutputState }

func (VirtualNetworkRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkRule)(nil)).Elem()
}

func (o VirtualNetworkRuleMapOutput) ToVirtualNetworkRuleMapOutput() VirtualNetworkRuleMapOutput {
	return o
}

func (o VirtualNetworkRuleMapOutput) ToVirtualNetworkRuleMapOutputWithContext(ctx context.Context) VirtualNetworkRuleMapOutput {
	return o
}

func (o VirtualNetworkRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*VirtualNetworkRule] {
	return pulumix.Output[map[string]*VirtualNetworkRule]{
		OutputState: o.OutputState,
	}
}

func (o VirtualNetworkRuleMapOutput) MapIndex(k pulumi.StringInput) VirtualNetworkRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualNetworkRule {
		return vs[0].(map[string]*VirtualNetworkRule)[vs[1].(string)]
	}).(VirtualNetworkRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkRuleInput)(nil)).Elem(), &VirtualNetworkRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkRuleArrayInput)(nil)).Elem(), VirtualNetworkRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkRuleMapInput)(nil)).Elem(), VirtualNetworkRuleMap{})
	pulumi.RegisterOutputType(VirtualNetworkRuleOutput{})
	pulumi.RegisterOutputType(VirtualNetworkRuleArrayOutput{})
	pulumi.RegisterOutputType(VirtualNetworkRuleMapOutput{})
}
