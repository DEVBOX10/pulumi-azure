// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cosmosdb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to access information about an existing CosmosDB (formally DocumentDB) Account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/cosmosdb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cosmosdb.LookupAccount(ctx, &cosmosdb.LookupAccountArgs{
//				Name:              "tfex-cosmosdb-account",
//				ResourceGroupName: "tfex-cosmosdb-account-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cosmosdbAccountEndpoint", example.Endpoint)
//			return nil
//		})
//	}
//
// ```
func LookupAccount(ctx *pulumi.Context, args *LookupAccountArgs, opts ...pulumi.InvokeOption) (*LookupAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountResult
	err := ctx.Invoke("azure:cosmosdb/getAccount:getAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccount.
type LookupAccountArgs struct {
	// Specifies the name of the CosmosDB Account.
	Name string `pulumi:"name"`
	// Specifies the name of the resource group in which the CosmosDB Account resides.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getAccount.
type LookupAccountResult struct {
	// Capabilities enabled on this Cosmos DB account.
	Capabilities        []GetAccountCapability        `pulumi:"capabilities"`
	ConsistencyPolicies []GetAccountConsistencyPolicy `pulumi:"consistencyPolicies"`
	// If automatic failover is enabled for this CosmosDB Account.
	EnableAutomaticFailover bool `pulumi:"enableAutomaticFailover"`
	// If Free Tier pricing option is enabled for this CosmosDB Account. You can have up to one free tier Azure Cosmos DB account per Azure subscription.
	EnableFreeTier bool `pulumi:"enableFreeTier"`
	// If multiple write locations are enabled for this Cosmos DB account.
	EnableMultipleWriteLocations bool `pulumi:"enableMultipleWriteLocations"`
	// The endpoint used to connect to the CosmosDB account.
	Endpoint     string                  `pulumi:"endpoint"`
	GeoLocations []GetAccountGeoLocation `pulumi:"geoLocations"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The current IP Filter for this CosmosDB account
	IpRangeFilter string `pulumi:"ipRangeFilter"`
	// If virtual network filtering is enabled for this Cosmos DB account.
	IsVirtualNetworkFilterEnabled bool `pulumi:"isVirtualNetworkFilterEnabled"`
	// The Key Vault key URI for CMK encryption.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	// The Kind of the CosmosDB account.
	Kind string `pulumi:"kind"`
	// The name of the Azure region hosting replicated data.
	Location string `pulumi:"location"`
	Name     string `pulumi:"name"`
	// The Offer Type to used by this CosmosDB Account.
	OfferType string `pulumi:"offerType"`
	// The primary key for the CosmosDB account.
	PrimaryKey string `pulumi:"primaryKey"`
	// The primary read-only Key for the CosmosDB account.
	PrimaryReadonlyKey string `pulumi:"primaryReadonlyKey"`
	// A list of read endpoints available for this CosmosDB account.
	ReadEndpoints     []string `pulumi:"readEndpoints"`
	ResourceGroupName string   `pulumi:"resourceGroupName"`
	// The secondary key for the CosmosDB account.
	SecondaryKey string `pulumi:"secondaryKey"`
	// The secondary read-only key for the CosmosDB account.
	SecondaryReadonlyKey string `pulumi:"secondaryReadonlyKey"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
	// Subnets that are allowed to access this CosmosDB account.
	VirtualNetworkRules []GetAccountVirtualNetworkRule `pulumi:"virtualNetworkRules"`
	// A list of write endpoints available for this CosmosDB account.
	WriteEndpoints []string `pulumi:"writeEndpoints"`
}

func LookupAccountOutput(ctx *pulumi.Context, args LookupAccountOutputArgs, opts ...pulumi.InvokeOption) LookupAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAccountResult, error) {
			args := v.(LookupAccountArgs)
			r, err := LookupAccount(ctx, &args, opts...)
			var s LookupAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAccountResultOutput)
}

// A collection of arguments for invoking getAccount.
type LookupAccountOutputArgs struct {
	// Specifies the name of the CosmosDB Account.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the name of the resource group in which the CosmosDB Account resides.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountArgs)(nil)).Elem()
}

// A collection of values returned by getAccount.
type LookupAccountResultOutput struct{ *pulumi.OutputState }

func (LookupAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountResult)(nil)).Elem()
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutput() LookupAccountResultOutput {
	return o
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutputWithContext(ctx context.Context) LookupAccountResultOutput {
	return o
}

func (o LookupAccountResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAccountResult] {
	return pulumix.Output[LookupAccountResult]{
		OutputState: o.OutputState,
	}
}

// Capabilities enabled on this Cosmos DB account.
func (o LookupAccountResultOutput) Capabilities() GetAccountCapabilityArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []GetAccountCapability { return v.Capabilities }).(GetAccountCapabilityArrayOutput)
}

func (o LookupAccountResultOutput) ConsistencyPolicies() GetAccountConsistencyPolicyArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []GetAccountConsistencyPolicy { return v.ConsistencyPolicies }).(GetAccountConsistencyPolicyArrayOutput)
}

// If automatic failover is enabled for this CosmosDB Account.
func (o LookupAccountResultOutput) EnableAutomaticFailover() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountResult) bool { return v.EnableAutomaticFailover }).(pulumi.BoolOutput)
}

// If Free Tier pricing option is enabled for this CosmosDB Account. You can have up to one free tier Azure Cosmos DB account per Azure subscription.
func (o LookupAccountResultOutput) EnableFreeTier() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountResult) bool { return v.EnableFreeTier }).(pulumi.BoolOutput)
}

// If multiple write locations are enabled for this Cosmos DB account.
func (o LookupAccountResultOutput) EnableMultipleWriteLocations() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountResult) bool { return v.EnableMultipleWriteLocations }).(pulumi.BoolOutput)
}

// The endpoint used to connect to the CosmosDB account.
func (o LookupAccountResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) GeoLocations() GetAccountGeoLocationArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []GetAccountGeoLocation { return v.GeoLocations }).(GetAccountGeoLocationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current IP Filter for this CosmosDB account
func (o LookupAccountResultOutput) IpRangeFilter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.IpRangeFilter }).(pulumi.StringOutput)
}

// If virtual network filtering is enabled for this Cosmos DB account.
func (o LookupAccountResultOutput) IsVirtualNetworkFilterEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAccountResult) bool { return v.IsVirtualNetworkFilterEnabled }).(pulumi.BoolOutput)
}

// The Key Vault key URI for CMK encryption.
func (o LookupAccountResultOutput) KeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.KeyVaultKeyId }).(pulumi.StringOutput)
}

// The Kind of the CosmosDB account.
func (o LookupAccountResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Kind }).(pulumi.StringOutput)
}

// The name of the Azure region hosting replicated data.
func (o LookupAccountResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

// The Offer Type to used by this CosmosDB Account.
func (o LookupAccountResultOutput) OfferType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.OfferType }).(pulumi.StringOutput)
}

// The primary key for the CosmosDB account.
func (o LookupAccountResultOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.PrimaryKey }).(pulumi.StringOutput)
}

// The primary read-only Key for the CosmosDB account.
func (o LookupAccountResultOutput) PrimaryReadonlyKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.PrimaryReadonlyKey }).(pulumi.StringOutput)
}

// A list of read endpoints available for this CosmosDB account.
func (o LookupAccountResultOutput) ReadEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []string { return v.ReadEndpoints }).(pulumi.StringArrayOutput)
}

func (o LookupAccountResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The secondary key for the CosmosDB account.
func (o LookupAccountResultOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.SecondaryKey }).(pulumi.StringOutput)
}

// The secondary read-only key for the CosmosDB account.
func (o LookupAccountResultOutput) SecondaryReadonlyKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.SecondaryReadonlyKey }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupAccountResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAccountResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Subnets that are allowed to access this CosmosDB account.
func (o LookupAccountResultOutput) VirtualNetworkRules() GetAccountVirtualNetworkRuleArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []GetAccountVirtualNetworkRule { return v.VirtualNetworkRules }).(GetAccountVirtualNetworkRuleArrayOutput)
}

// A list of write endpoints available for this CosmosDB account.
func (o LookupAccountResultOutput) WriteEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAccountResult) []string { return v.WriteEndpoints }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountResultOutput{})
}
