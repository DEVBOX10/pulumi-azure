// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to access information about an existing Storage Encryption Scope.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleAccount, err := storage.LookupAccount(ctx, &storage.LookupAccountArgs{
//				Name:              "storageaccountname",
//				ResourceGroupName: pulumi.StringRef("resourcegroupname"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleEncryptionScope, err := storage.LookupEncryptionScope(ctx, &storage.LookupEncryptionScopeArgs{
//				Name:             "existingStorageES",
//				StorageAccountId: exampleAccount.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", exampleEncryptionScope.Id)
//			return nil
//		})
//	}
//
// ```
func LookupEncryptionScope(ctx *pulumi.Context, args *LookupEncryptionScopeArgs, opts ...pulumi.InvokeOption) (*LookupEncryptionScopeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEncryptionScopeResult
	err := ctx.Invoke("azure:storage/getEncryptionScope:getEncryptionScope", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEncryptionScope.
type LookupEncryptionScopeArgs struct {
	// The name of this Storage Encryption Scope.
	Name string `pulumi:"name"`
	// The ID of the Storage Account where this Storage Encryption Scope exists.
	StorageAccountId string `pulumi:"storageAccountId"`
}

// A collection of values returned by getEncryptionScope.
type LookupEncryptionScopeResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the Key Vault Key.
	KeyVaultKeyId string `pulumi:"keyVaultKeyId"`
	Name          string `pulumi:"name"`
	// The source of the Storage Encryption Scope.
	Source           string `pulumi:"source"`
	StorageAccountId string `pulumi:"storageAccountId"`
}

func LookupEncryptionScopeOutput(ctx *pulumi.Context, args LookupEncryptionScopeOutputArgs, opts ...pulumi.InvokeOption) LookupEncryptionScopeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEncryptionScopeResult, error) {
			args := v.(LookupEncryptionScopeArgs)
			r, err := LookupEncryptionScope(ctx, &args, opts...)
			var s LookupEncryptionScopeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEncryptionScopeResultOutput)
}

// A collection of arguments for invoking getEncryptionScope.
type LookupEncryptionScopeOutputArgs struct {
	// The name of this Storage Encryption Scope.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the Storage Account where this Storage Encryption Scope exists.
	StorageAccountId pulumi.StringInput `pulumi:"storageAccountId"`
}

func (LookupEncryptionScopeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionScopeArgs)(nil)).Elem()
}

// A collection of values returned by getEncryptionScope.
type LookupEncryptionScopeResultOutput struct{ *pulumi.OutputState }

func (LookupEncryptionScopeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEncryptionScopeResult)(nil)).Elem()
}

func (o LookupEncryptionScopeResultOutput) ToLookupEncryptionScopeResultOutput() LookupEncryptionScopeResultOutput {
	return o
}

func (o LookupEncryptionScopeResultOutput) ToLookupEncryptionScopeResultOutputWithContext(ctx context.Context) LookupEncryptionScopeResultOutput {
	return o
}

func (o LookupEncryptionScopeResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupEncryptionScopeResult] {
	return pulumix.Output[LookupEncryptionScopeResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEncryptionScopeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionScopeResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Key Vault Key.
func (o LookupEncryptionScopeResultOutput) KeyVaultKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionScopeResult) string { return v.KeyVaultKeyId }).(pulumi.StringOutput)
}

func (o LookupEncryptionScopeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionScopeResult) string { return v.Name }).(pulumi.StringOutput)
}

// The source of the Storage Encryption Scope.
func (o LookupEncryptionScopeResultOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionScopeResult) string { return v.Source }).(pulumi.StringOutput)
}

func (o LookupEncryptionScopeResultOutput) StorageAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEncryptionScopeResult) string { return v.StorageAccountId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEncryptionScopeResultOutput{})
}
