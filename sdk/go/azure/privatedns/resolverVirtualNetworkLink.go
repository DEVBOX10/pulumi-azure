// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a Private DNS Resolver Virtual Network Link.
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
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/privatedns"
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
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "exampleSubnet", &network.SubnetArgs{
//				ResourceGroupName:  exampleResourceGroup.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.0.64/28"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("Microsoft.Network.dnsResolvers"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//							},
//							Name: pulumi.String("Microsoft.Network/dnsResolvers"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolver, err := privatedns.NewResolver(ctx, "exampleResolver", &privatedns.ResolverArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				VirtualNetworkId:  exampleVirtualNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolverOutboundEndpoint, err := privatedns.NewResolverOutboundEndpoint(ctx, "exampleResolverOutboundEndpoint", &privatedns.ResolverOutboundEndpointArgs{
//				PrivateDnsResolverId: exampleResolver.ID(),
//				Location:             exampleResolver.Location,
//				SubnetId:             exampleSubnet.ID(),
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolverDnsForwardingRuleset, err := privatedns.NewResolverDnsForwardingRuleset(ctx, "exampleResolverDnsForwardingRuleset", &privatedns.ResolverDnsForwardingRulesetArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				PrivateDnsResolverOutboundEndpointIds: pulumi.StringArray{
//					exampleResolverOutboundEndpoint.ID(),
//				},
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewResolverVirtualNetworkLink(ctx, "exampleResolverVirtualNetworkLink", &privatedns.ResolverVirtualNetworkLinkArgs{
//				DnsForwardingRulesetId: exampleResolverDnsForwardingRuleset.ID(),
//				VirtualNetworkId:       exampleVirtualNetwork.ID(),
//				Metadata: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
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
// Private DNS Resolver Virtual Network Link can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsForwardingRulesets/dnsForwardingRuleset1/virtualNetworkLinks/virtualNetworkLink1
//
// ```
type ResolverVirtualNetworkLink struct {
	pulumi.CustomResourceState

	// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	DnsForwardingRulesetId pulumi.StringOutput `pulumi:"dnsForwardingRulesetId"`
	// Metadata attached to the Private DNS Resolver Virtual Network Link.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
	VirtualNetworkId pulumi.StringOutput `pulumi:"virtualNetworkId"`
}

// NewResolverVirtualNetworkLink registers a new resource with the given unique name, arguments, and options.
func NewResolverVirtualNetworkLink(ctx *pulumi.Context,
	name string, args *ResolverVirtualNetworkLinkArgs, opts ...pulumi.ResourceOption) (*ResolverVirtualNetworkLink, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DnsForwardingRulesetId == nil {
		return nil, errors.New("invalid value for required argument 'DnsForwardingRulesetId'")
	}
	if args.VirtualNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualNetworkId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResolverVirtualNetworkLink
	err := ctx.RegisterResource("azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverVirtualNetworkLink gets an existing ResolverVirtualNetworkLink resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverVirtualNetworkLink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverVirtualNetworkLinkState, opts ...pulumi.ResourceOption) (*ResolverVirtualNetworkLink, error) {
	var resource ResolverVirtualNetworkLink
	err := ctx.ReadResource("azure:privatedns/resolverVirtualNetworkLink:ResolverVirtualNetworkLink", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverVirtualNetworkLink resources.
type resolverVirtualNetworkLinkState struct {
	// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	DnsForwardingRulesetId *string `pulumi:"dnsForwardingRulesetId"`
	// Metadata attached to the Private DNS Resolver Virtual Network Link.
	Metadata map[string]string `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	Name *string `pulumi:"name"`
	// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

type ResolverVirtualNetworkLinkState struct {
	// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	DnsForwardingRulesetId pulumi.StringPtrInput
	// Metadata attached to the Private DNS Resolver Virtual Network Link.
	Metadata pulumi.StringMapInput
	// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	Name pulumi.StringPtrInput
	// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
	VirtualNetworkId pulumi.StringPtrInput
}

func (ResolverVirtualNetworkLinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverVirtualNetworkLinkState)(nil)).Elem()
}

type resolverVirtualNetworkLinkArgs struct {
	// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	DnsForwardingRulesetId string `pulumi:"dnsForwardingRulesetId"`
	// Metadata attached to the Private DNS Resolver Virtual Network Link.
	Metadata map[string]string `pulumi:"metadata"`
	// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	Name *string `pulumi:"name"`
	// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
	VirtualNetworkId string `pulumi:"virtualNetworkId"`
}

// The set of arguments for constructing a ResolverVirtualNetworkLink resource.
type ResolverVirtualNetworkLinkArgs struct {
	// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	DnsForwardingRulesetId pulumi.StringInput
	// Metadata attached to the Private DNS Resolver Virtual Network Link.
	Metadata pulumi.StringMapInput
	// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
	Name pulumi.StringPtrInput
	// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
	VirtualNetworkId pulumi.StringInput
}

func (ResolverVirtualNetworkLinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverVirtualNetworkLinkArgs)(nil)).Elem()
}

type ResolverVirtualNetworkLinkInput interface {
	pulumi.Input

	ToResolverVirtualNetworkLinkOutput() ResolverVirtualNetworkLinkOutput
	ToResolverVirtualNetworkLinkOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkOutput
}

func (*ResolverVirtualNetworkLink) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverVirtualNetworkLink)(nil)).Elem()
}

func (i *ResolverVirtualNetworkLink) ToResolverVirtualNetworkLinkOutput() ResolverVirtualNetworkLinkOutput {
	return i.ToResolverVirtualNetworkLinkOutputWithContext(context.Background())
}

func (i *ResolverVirtualNetworkLink) ToResolverVirtualNetworkLinkOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverVirtualNetworkLinkOutput)
}

func (i *ResolverVirtualNetworkLink) ToOutput(ctx context.Context) pulumix.Output[*ResolverVirtualNetworkLink] {
	return pulumix.Output[*ResolverVirtualNetworkLink]{
		OutputState: i.ToResolverVirtualNetworkLinkOutputWithContext(ctx).OutputState,
	}
}

// ResolverVirtualNetworkLinkArrayInput is an input type that accepts ResolverVirtualNetworkLinkArray and ResolverVirtualNetworkLinkArrayOutput values.
// You can construct a concrete instance of `ResolverVirtualNetworkLinkArrayInput` via:
//
//	ResolverVirtualNetworkLinkArray{ ResolverVirtualNetworkLinkArgs{...} }
type ResolverVirtualNetworkLinkArrayInput interface {
	pulumi.Input

	ToResolverVirtualNetworkLinkArrayOutput() ResolverVirtualNetworkLinkArrayOutput
	ToResolverVirtualNetworkLinkArrayOutputWithContext(context.Context) ResolverVirtualNetworkLinkArrayOutput
}

type ResolverVirtualNetworkLinkArray []ResolverVirtualNetworkLinkInput

func (ResolverVirtualNetworkLinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverVirtualNetworkLink)(nil)).Elem()
}

func (i ResolverVirtualNetworkLinkArray) ToResolverVirtualNetworkLinkArrayOutput() ResolverVirtualNetworkLinkArrayOutput {
	return i.ToResolverVirtualNetworkLinkArrayOutputWithContext(context.Background())
}

func (i ResolverVirtualNetworkLinkArray) ToResolverVirtualNetworkLinkArrayOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverVirtualNetworkLinkArrayOutput)
}

func (i ResolverVirtualNetworkLinkArray) ToOutput(ctx context.Context) pulumix.Output[[]*ResolverVirtualNetworkLink] {
	return pulumix.Output[[]*ResolverVirtualNetworkLink]{
		OutputState: i.ToResolverVirtualNetworkLinkArrayOutputWithContext(ctx).OutputState,
	}
}

// ResolverVirtualNetworkLinkMapInput is an input type that accepts ResolverVirtualNetworkLinkMap and ResolverVirtualNetworkLinkMapOutput values.
// You can construct a concrete instance of `ResolverVirtualNetworkLinkMapInput` via:
//
//	ResolverVirtualNetworkLinkMap{ "key": ResolverVirtualNetworkLinkArgs{...} }
type ResolverVirtualNetworkLinkMapInput interface {
	pulumi.Input

	ToResolverVirtualNetworkLinkMapOutput() ResolverVirtualNetworkLinkMapOutput
	ToResolverVirtualNetworkLinkMapOutputWithContext(context.Context) ResolverVirtualNetworkLinkMapOutput
}

type ResolverVirtualNetworkLinkMap map[string]ResolverVirtualNetworkLinkInput

func (ResolverVirtualNetworkLinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverVirtualNetworkLink)(nil)).Elem()
}

func (i ResolverVirtualNetworkLinkMap) ToResolverVirtualNetworkLinkMapOutput() ResolverVirtualNetworkLinkMapOutput {
	return i.ToResolverVirtualNetworkLinkMapOutputWithContext(context.Background())
}

func (i ResolverVirtualNetworkLinkMap) ToResolverVirtualNetworkLinkMapOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverVirtualNetworkLinkMapOutput)
}

func (i ResolverVirtualNetworkLinkMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ResolverVirtualNetworkLink] {
	return pulumix.Output[map[string]*ResolverVirtualNetworkLink]{
		OutputState: i.ToResolverVirtualNetworkLinkMapOutputWithContext(ctx).OutputState,
	}
}

type ResolverVirtualNetworkLinkOutput struct{ *pulumi.OutputState }

func (ResolverVirtualNetworkLinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverVirtualNetworkLink)(nil)).Elem()
}

func (o ResolverVirtualNetworkLinkOutput) ToResolverVirtualNetworkLinkOutput() ResolverVirtualNetworkLinkOutput {
	return o
}

func (o ResolverVirtualNetworkLinkOutput) ToResolverVirtualNetworkLinkOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkOutput {
	return o
}

func (o ResolverVirtualNetworkLinkOutput) ToOutput(ctx context.Context) pulumix.Output[*ResolverVirtualNetworkLink] {
	return pulumix.Output[*ResolverVirtualNetworkLink]{
		OutputState: o.OutputState,
	}
}

// Specifies the ID of the Private DNS Resolver DNS Forwarding Ruleset. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
func (o ResolverVirtualNetworkLinkOutput) DnsForwardingRulesetId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverVirtualNetworkLink) pulumi.StringOutput { return v.DnsForwardingRulesetId }).(pulumi.StringOutput)
}

// Metadata attached to the Private DNS Resolver Virtual Network Link.
func (o ResolverVirtualNetworkLinkOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverVirtualNetworkLink) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// Specifies the name which should be used for this Private DNS Resolver Virtual Network Link. Changing this forces a new Private DNS Resolver Virtual Network Link to be created.
func (o ResolverVirtualNetworkLinkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverVirtualNetworkLink) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the Virtual Network that is linked to the Private DNS Resolver Virtual Network Link. Changing this forces a new resource to be created.
func (o ResolverVirtualNetworkLinkOutput) VirtualNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverVirtualNetworkLink) pulumi.StringOutput { return v.VirtualNetworkId }).(pulumi.StringOutput)
}

type ResolverVirtualNetworkLinkArrayOutput struct{ *pulumi.OutputState }

func (ResolverVirtualNetworkLinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverVirtualNetworkLink)(nil)).Elem()
}

func (o ResolverVirtualNetworkLinkArrayOutput) ToResolverVirtualNetworkLinkArrayOutput() ResolverVirtualNetworkLinkArrayOutput {
	return o
}

func (o ResolverVirtualNetworkLinkArrayOutput) ToResolverVirtualNetworkLinkArrayOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkArrayOutput {
	return o
}

func (o ResolverVirtualNetworkLinkArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ResolverVirtualNetworkLink] {
	return pulumix.Output[[]*ResolverVirtualNetworkLink]{
		OutputState: o.OutputState,
	}
}

func (o ResolverVirtualNetworkLinkArrayOutput) Index(i pulumi.IntInput) ResolverVirtualNetworkLinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverVirtualNetworkLink {
		return vs[0].([]*ResolverVirtualNetworkLink)[vs[1].(int)]
	}).(ResolverVirtualNetworkLinkOutput)
}

type ResolverVirtualNetworkLinkMapOutput struct{ *pulumi.OutputState }

func (ResolverVirtualNetworkLinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverVirtualNetworkLink)(nil)).Elem()
}

func (o ResolverVirtualNetworkLinkMapOutput) ToResolverVirtualNetworkLinkMapOutput() ResolverVirtualNetworkLinkMapOutput {
	return o
}

func (o ResolverVirtualNetworkLinkMapOutput) ToResolverVirtualNetworkLinkMapOutputWithContext(ctx context.Context) ResolverVirtualNetworkLinkMapOutput {
	return o
}

func (o ResolverVirtualNetworkLinkMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ResolverVirtualNetworkLink] {
	return pulumix.Output[map[string]*ResolverVirtualNetworkLink]{
		OutputState: o.OutputState,
	}
}

func (o ResolverVirtualNetworkLinkMapOutput) MapIndex(k pulumi.StringInput) ResolverVirtualNetworkLinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverVirtualNetworkLink {
		return vs[0].(map[string]*ResolverVirtualNetworkLink)[vs[1].(string)]
	}).(ResolverVirtualNetworkLinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverVirtualNetworkLinkInput)(nil)).Elem(), &ResolverVirtualNetworkLink{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverVirtualNetworkLinkArrayInput)(nil)).Elem(), ResolverVirtualNetworkLinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverVirtualNetworkLinkMapInput)(nil)).Elem(), ResolverVirtualNetworkLinkMap{})
	pulumi.RegisterOutputType(ResolverVirtualNetworkLinkOutput{})
	pulumi.RegisterOutputType(ResolverVirtualNetworkLinkArrayOutput{})
	pulumi.RegisterOutputType(ResolverVirtualNetworkLinkMapOutput{})
}
