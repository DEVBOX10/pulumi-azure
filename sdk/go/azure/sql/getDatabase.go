// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sql

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to access information about an existing SQL Azure Database.
//
// > **Note:** The `sql.Database` data source is deprecated in version 3.0 of the AzureRM provider and will be removed in version 4.0. Please use the `mssql.Database` data source instead.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/sql"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := sql.LookupDatabase(ctx, &sql.LookupDatabaseArgs{
//				Name:              "example_db",
//				ServerName:        "example_db_server",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("sqlDatabaseId", example.Id)
//			return nil
//		})
//	}
//
// ```
func LookupDatabase(ctx *pulumi.Context, args *LookupDatabaseArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseResult
	err := ctx.Invoke("azure:sql/getDatabase:getDatabase", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabase.
type LookupDatabaseArgs struct {
	// The name of the SQL Database.
	Name string `pulumi:"name"`
	// Specifies the name of the Resource Group where the Azure SQL Database exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the SQL Server.
	ServerName string `pulumi:"serverName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getDatabase.
type LookupDatabaseResult struct {
	// The name of the collation.
	Collation string `pulumi:"collation"`
	// The default secondary location of the SQL Database.
	DefaultSecondaryLocation string `pulumi:"defaultSecondaryLocation"`
	// The edition of the database.
	Edition string `pulumi:"edition"`
	// The name of the elastic database pool the database belongs to.
	ElasticPoolName string `pulumi:"elasticPoolName"`
	// The ID of the failover group the database belongs to.
	FailoverGroupId string `pulumi:"failoverGroupId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The location of the Resource Group in which the SQL Server exists.
	Location string `pulumi:"location"`
	// The name of the database.
	Name string `pulumi:"name"`
	// Indicate if read-only connections will be redirected to a high-available replica.
	ReadScale bool `pulumi:"readScale"`
	// The name of the resource group in which the database resides. This will always be the same resource group as the Database Server.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the SQL Server on which to create the database.
	ServerName string `pulumi:"serverName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func LookupDatabaseOutput(ctx *pulumi.Context, args LookupDatabaseOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseResult, error) {
			args := v.(LookupDatabaseArgs)
			r, err := LookupDatabase(ctx, &args, opts...)
			var s LookupDatabaseResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseResultOutput)
}

// A collection of arguments for invoking getDatabase.
type LookupDatabaseOutputArgs struct {
	// The name of the SQL Database.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the name of the Resource Group where the Azure SQL Database exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// The name of the SQL Server.
	ServerName pulumi.StringInput `pulumi:"serverName"`
	// A mapping of tags assigned to the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupDatabaseOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseArgs)(nil)).Elem()
}

// A collection of values returned by getDatabase.
type LookupDatabaseResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseResult)(nil)).Elem()
}

func (o LookupDatabaseResultOutput) ToLookupDatabaseResultOutput() LookupDatabaseResultOutput {
	return o
}

func (o LookupDatabaseResultOutput) ToLookupDatabaseResultOutputWithContext(ctx context.Context) LookupDatabaseResultOutput {
	return o
}

func (o LookupDatabaseResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupDatabaseResult] {
	return pulumix.Output[LookupDatabaseResult]{
		OutputState: o.OutputState,
	}
}

// The name of the collation.
func (o LookupDatabaseResultOutput) Collation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Collation }).(pulumi.StringOutput)
}

// The default secondary location of the SQL Database.
func (o LookupDatabaseResultOutput) DefaultSecondaryLocation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.DefaultSecondaryLocation }).(pulumi.StringOutput)
}

// The edition of the database.
func (o LookupDatabaseResultOutput) Edition() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Edition }).(pulumi.StringOutput)
}

// The name of the elastic database pool the database belongs to.
func (o LookupDatabaseResultOutput) ElasticPoolName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.ElasticPoolName }).(pulumi.StringOutput)
}

// The ID of the failover group the database belongs to.
func (o LookupDatabaseResultOutput) FailoverGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.FailoverGroupId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Id }).(pulumi.StringOutput)
}

// The location of the Resource Group in which the SQL Server exists.
func (o LookupDatabaseResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Location }).(pulumi.StringOutput)
}

// The name of the database.
func (o LookupDatabaseResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.Name }).(pulumi.StringOutput)
}

// Indicate if read-only connections will be redirected to a high-available replica.
func (o LookupDatabaseResultOutput) ReadScale() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseResult) bool { return v.ReadScale }).(pulumi.BoolOutput)
}

// The name of the resource group in which the database resides. This will always be the same resource group as the Database Server.
func (o LookupDatabaseResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The name of the SQL Server on which to create the database.
func (o LookupDatabaseResultOutput) ServerName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseResult) string { return v.ServerName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupDatabaseResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDatabaseResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseResultOutput{})
}
