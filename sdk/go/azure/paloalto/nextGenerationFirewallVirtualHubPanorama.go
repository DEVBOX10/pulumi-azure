// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package paloalto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type NextGenerationFirewallVirtualHubPanorama struct {
	pulumi.CustomResourceState

	DestinationNats      NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayOutput `pulumi:"destinationNats"`
	DnsSettings          NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrOutput      `pulumi:"dnsSettings"`
	Location             pulumi.StringOutput                                               `pulumi:"location"`
	Name                 pulumi.StringOutput                                               `pulumi:"name"`
	NetworkProfile       NextGenerationFirewallVirtualHubPanoramaNetworkProfileOutput      `pulumi:"networkProfile"`
	PanoramaBase64Config pulumi.StringOutput                                               `pulumi:"panoramaBase64Config"`
	Panoramas            NextGenerationFirewallVirtualHubPanoramaPanoramaArrayOutput       `pulumi:"panoramas"`
	ResourceGroupName    pulumi.StringOutput                                               `pulumi:"resourceGroupName"`
	Tags                 pulumi.StringMapOutput                                            `pulumi:"tags"`
}

// NewNextGenerationFirewallVirtualHubPanorama registers a new resource with the given unique name, arguments, and options.
func NewNextGenerationFirewallVirtualHubPanorama(ctx *pulumi.Context,
	name string, args *NextGenerationFirewallVirtualHubPanoramaArgs, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualHubPanorama, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkProfile == nil {
		return nil, errors.New("invalid value for required argument 'NetworkProfile'")
	}
	if args.PanoramaBase64Config == nil {
		return nil, errors.New("invalid value for required argument 'PanoramaBase64Config'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NextGenerationFirewallVirtualHubPanorama
	err := ctx.RegisterResource("azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNextGenerationFirewallVirtualHubPanorama gets an existing NextGenerationFirewallVirtualHubPanorama resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNextGenerationFirewallVirtualHubPanorama(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NextGenerationFirewallVirtualHubPanoramaState, opts ...pulumi.ResourceOption) (*NextGenerationFirewallVirtualHubPanorama, error) {
	var resource NextGenerationFirewallVirtualHubPanorama
	err := ctx.ReadResource("azure:paloalto/nextGenerationFirewallVirtualHubPanorama:NextGenerationFirewallVirtualHubPanorama", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NextGenerationFirewallVirtualHubPanorama resources.
type nextGenerationFirewallVirtualHubPanoramaState struct {
	DestinationNats      []NextGenerationFirewallVirtualHubPanoramaDestinationNat `pulumi:"destinationNats"`
	DnsSettings          *NextGenerationFirewallVirtualHubPanoramaDnsSettings     `pulumi:"dnsSettings"`
	Location             *string                                                  `pulumi:"location"`
	Name                 *string                                                  `pulumi:"name"`
	NetworkProfile       *NextGenerationFirewallVirtualHubPanoramaNetworkProfile  `pulumi:"networkProfile"`
	PanoramaBase64Config *string                                                  `pulumi:"panoramaBase64Config"`
	Panoramas            []NextGenerationFirewallVirtualHubPanoramaPanorama       `pulumi:"panoramas"`
	ResourceGroupName    *string                                                  `pulumi:"resourceGroupName"`
	Tags                 map[string]string                                        `pulumi:"tags"`
}

type NextGenerationFirewallVirtualHubPanoramaState struct {
	DestinationNats      NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayInput
	DnsSettings          NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrInput
	Location             pulumi.StringPtrInput
	Name                 pulumi.StringPtrInput
	NetworkProfile       NextGenerationFirewallVirtualHubPanoramaNetworkProfilePtrInput
	PanoramaBase64Config pulumi.StringPtrInput
	Panoramas            NextGenerationFirewallVirtualHubPanoramaPanoramaArrayInput
	ResourceGroupName    pulumi.StringPtrInput
	Tags                 pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualHubPanoramaState) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualHubPanoramaState)(nil)).Elem()
}

type nextGenerationFirewallVirtualHubPanoramaArgs struct {
	DestinationNats      []NextGenerationFirewallVirtualHubPanoramaDestinationNat `pulumi:"destinationNats"`
	DnsSettings          *NextGenerationFirewallVirtualHubPanoramaDnsSettings     `pulumi:"dnsSettings"`
	Location             *string                                                  `pulumi:"location"`
	Name                 *string                                                  `pulumi:"name"`
	NetworkProfile       NextGenerationFirewallVirtualHubPanoramaNetworkProfile   `pulumi:"networkProfile"`
	PanoramaBase64Config string                                                   `pulumi:"panoramaBase64Config"`
	ResourceGroupName    string                                                   `pulumi:"resourceGroupName"`
	Tags                 map[string]string                                        `pulumi:"tags"`
}

// The set of arguments for constructing a NextGenerationFirewallVirtualHubPanorama resource.
type NextGenerationFirewallVirtualHubPanoramaArgs struct {
	DestinationNats      NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayInput
	DnsSettings          NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrInput
	Location             pulumi.StringPtrInput
	Name                 pulumi.StringPtrInput
	NetworkProfile       NextGenerationFirewallVirtualHubPanoramaNetworkProfileInput
	PanoramaBase64Config pulumi.StringInput
	ResourceGroupName    pulumi.StringInput
	Tags                 pulumi.StringMapInput
}

func (NextGenerationFirewallVirtualHubPanoramaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nextGenerationFirewallVirtualHubPanoramaArgs)(nil)).Elem()
}

type NextGenerationFirewallVirtualHubPanoramaInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubPanoramaOutput() NextGenerationFirewallVirtualHubPanoramaOutput
	ToNextGenerationFirewallVirtualHubPanoramaOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaOutput
}

func (*NextGenerationFirewallVirtualHubPanorama) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (i *NextGenerationFirewallVirtualHubPanorama) ToNextGenerationFirewallVirtualHubPanoramaOutput() NextGenerationFirewallVirtualHubPanoramaOutput {
	return i.ToNextGenerationFirewallVirtualHubPanoramaOutputWithContext(context.Background())
}

func (i *NextGenerationFirewallVirtualHubPanorama) ToNextGenerationFirewallVirtualHubPanoramaOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubPanoramaOutput)
}

func (i *NextGenerationFirewallVirtualHubPanorama) ToOutput(ctx context.Context) pulumix.Output[*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: i.ToNextGenerationFirewallVirtualHubPanoramaOutputWithContext(ctx).OutputState,
	}
}

// NextGenerationFirewallVirtualHubPanoramaArrayInput is an input type that accepts NextGenerationFirewallVirtualHubPanoramaArray and NextGenerationFirewallVirtualHubPanoramaArrayOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualHubPanoramaArrayInput` via:
//
//	NextGenerationFirewallVirtualHubPanoramaArray{ NextGenerationFirewallVirtualHubPanoramaArgs{...} }
type NextGenerationFirewallVirtualHubPanoramaArrayInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubPanoramaArrayOutput() NextGenerationFirewallVirtualHubPanoramaArrayOutput
	ToNextGenerationFirewallVirtualHubPanoramaArrayOutputWithContext(context.Context) NextGenerationFirewallVirtualHubPanoramaArrayOutput
}

type NextGenerationFirewallVirtualHubPanoramaArray []NextGenerationFirewallVirtualHubPanoramaInput

func (NextGenerationFirewallVirtualHubPanoramaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualHubPanoramaArray) ToNextGenerationFirewallVirtualHubPanoramaArrayOutput() NextGenerationFirewallVirtualHubPanoramaArrayOutput {
	return i.ToNextGenerationFirewallVirtualHubPanoramaArrayOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualHubPanoramaArray) ToNextGenerationFirewallVirtualHubPanoramaArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubPanoramaArrayOutput)
}

func (i NextGenerationFirewallVirtualHubPanoramaArray) ToOutput(ctx context.Context) pulumix.Output[[]*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[[]*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: i.ToNextGenerationFirewallVirtualHubPanoramaArrayOutputWithContext(ctx).OutputState,
	}
}

// NextGenerationFirewallVirtualHubPanoramaMapInput is an input type that accepts NextGenerationFirewallVirtualHubPanoramaMap and NextGenerationFirewallVirtualHubPanoramaMapOutput values.
// You can construct a concrete instance of `NextGenerationFirewallVirtualHubPanoramaMapInput` via:
//
//	NextGenerationFirewallVirtualHubPanoramaMap{ "key": NextGenerationFirewallVirtualHubPanoramaArgs{...} }
type NextGenerationFirewallVirtualHubPanoramaMapInput interface {
	pulumi.Input

	ToNextGenerationFirewallVirtualHubPanoramaMapOutput() NextGenerationFirewallVirtualHubPanoramaMapOutput
	ToNextGenerationFirewallVirtualHubPanoramaMapOutputWithContext(context.Context) NextGenerationFirewallVirtualHubPanoramaMapOutput
}

type NextGenerationFirewallVirtualHubPanoramaMap map[string]NextGenerationFirewallVirtualHubPanoramaInput

func (NextGenerationFirewallVirtualHubPanoramaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (i NextGenerationFirewallVirtualHubPanoramaMap) ToNextGenerationFirewallVirtualHubPanoramaMapOutput() NextGenerationFirewallVirtualHubPanoramaMapOutput {
	return i.ToNextGenerationFirewallVirtualHubPanoramaMapOutputWithContext(context.Background())
}

func (i NextGenerationFirewallVirtualHubPanoramaMap) ToNextGenerationFirewallVirtualHubPanoramaMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NextGenerationFirewallVirtualHubPanoramaMapOutput)
}

func (i NextGenerationFirewallVirtualHubPanoramaMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[map[string]*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: i.ToNextGenerationFirewallVirtualHubPanoramaMapOutputWithContext(ctx).OutputState,
	}
}

type NextGenerationFirewallVirtualHubPanoramaOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubPanoramaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) ToNextGenerationFirewallVirtualHubPanoramaOutput() NextGenerationFirewallVirtualHubPanoramaOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) ToNextGenerationFirewallVirtualHubPanoramaOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) ToOutput(ctx context.Context) pulumix.Output[*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: o.OutputState,
	}
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) DestinationNats() NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayOutput {
		return v.DestinationNats
	}).(NextGenerationFirewallVirtualHubPanoramaDestinationNatArrayOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) DnsSettings() NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrOutput {
		return v.DnsSettings
	}).(NextGenerationFirewallVirtualHubPanoramaDnsSettingsPtrOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) NetworkProfile() NextGenerationFirewallVirtualHubPanoramaNetworkProfileOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) NextGenerationFirewallVirtualHubPanoramaNetworkProfileOutput {
		return v.NetworkProfile
	}).(NextGenerationFirewallVirtualHubPanoramaNetworkProfileOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) PanoramaBase64Config() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) pulumi.StringOutput { return v.PanoramaBase64Config }).(pulumi.StringOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) Panoramas() NextGenerationFirewallVirtualHubPanoramaPanoramaArrayOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) NextGenerationFirewallVirtualHubPanoramaPanoramaArrayOutput {
		return v.Panoramas
	}).(NextGenerationFirewallVirtualHubPanoramaPanoramaArrayOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func (o NextGenerationFirewallVirtualHubPanoramaOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NextGenerationFirewallVirtualHubPanorama) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type NextGenerationFirewallVirtualHubPanoramaArrayOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubPanoramaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubPanoramaArrayOutput) ToNextGenerationFirewallVirtualHubPanoramaArrayOutput() NextGenerationFirewallVirtualHubPanoramaArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaArrayOutput) ToNextGenerationFirewallVirtualHubPanoramaArrayOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaArrayOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[[]*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: o.OutputState,
	}
}

func (o NextGenerationFirewallVirtualHubPanoramaArrayOutput) Index(i pulumi.IntInput) NextGenerationFirewallVirtualHubPanoramaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualHubPanorama {
		return vs[0].([]*NextGenerationFirewallVirtualHubPanorama)[vs[1].(int)]
	}).(NextGenerationFirewallVirtualHubPanoramaOutput)
}

type NextGenerationFirewallVirtualHubPanoramaMapOutput struct{ *pulumi.OutputState }

func (NextGenerationFirewallVirtualHubPanoramaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NextGenerationFirewallVirtualHubPanorama)(nil)).Elem()
}

func (o NextGenerationFirewallVirtualHubPanoramaMapOutput) ToNextGenerationFirewallVirtualHubPanoramaMapOutput() NextGenerationFirewallVirtualHubPanoramaMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaMapOutput) ToNextGenerationFirewallVirtualHubPanoramaMapOutputWithContext(ctx context.Context) NextGenerationFirewallVirtualHubPanoramaMapOutput {
	return o
}

func (o NextGenerationFirewallVirtualHubPanoramaMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*NextGenerationFirewallVirtualHubPanorama] {
	return pulumix.Output[map[string]*NextGenerationFirewallVirtualHubPanorama]{
		OutputState: o.OutputState,
	}
}

func (o NextGenerationFirewallVirtualHubPanoramaMapOutput) MapIndex(k pulumi.StringInput) NextGenerationFirewallVirtualHubPanoramaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NextGenerationFirewallVirtualHubPanorama {
		return vs[0].(map[string]*NextGenerationFirewallVirtualHubPanorama)[vs[1].(string)]
	}).(NextGenerationFirewallVirtualHubPanoramaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubPanoramaInput)(nil)).Elem(), &NextGenerationFirewallVirtualHubPanorama{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubPanoramaArrayInput)(nil)).Elem(), NextGenerationFirewallVirtualHubPanoramaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NextGenerationFirewallVirtualHubPanoramaMapInput)(nil)).Elem(), NextGenerationFirewallVirtualHubPanoramaMap{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubPanoramaOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubPanoramaArrayOutput{})
	pulumi.RegisterOutputType(NextGenerationFirewallVirtualHubPanoramaMapOutput{})
}
