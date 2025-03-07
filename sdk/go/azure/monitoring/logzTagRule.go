// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Manages a logz Tag Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/monitoring"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLogzMonitor, err := monitoring.NewLogzMonitor(ctx, "exampleLogzMonitor", &monitoring.LogzMonitorArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Plan: &monitoring.LogzMonitorPlanArgs{
//					BillingCycle:  pulumi.String("MONTHLY"),
//					EffectiveDate: pulumi.String("2022-06-06T00:00:00Z"),
//					UsageType:     pulumi.String("COMMITTED"),
//				},
//				User: &monitoring.LogzMonitorUserArgs{
//					Email:       pulumi.String("user@example.com"),
//					FirstName:   pulumi.String("Example"),
//					LastName:    pulumi.String("User"),
//					PhoneNumber: pulumi.String("+12313803556"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = monitoring.NewLogzTagRule(ctx, "exampleLogzTagRule", &monitoring.LogzTagRuleArgs{
//				LogzMonitorId: exampleLogzMonitor.ID(),
//				TagFilters: monitoring.LogzTagRuleTagFilterArray{
//					&monitoring.LogzTagRuleTagFilterArgs{
//						Name:   pulumi.String("name1"),
//						Action: pulumi.String("Include"),
//						Value:  pulumi.String("value1"),
//					},
//					&monitoring.LogzTagRuleTagFilterArgs{
//						Name:   pulumi.String("name2"),
//						Action: pulumi.String("Exclude"),
//						Value:  pulumi.String("value2"),
//					},
//				},
//				SendAadLogs:          pulumi.Bool(true),
//				SendActivityLogs:     pulumi.Bool(true),
//				SendSubscriptionLogs: pulumi.Bool(true),
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
// logz Tag Rules can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:monitoring/logzTagRule:LogzTagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/tagRules/ruleSet1
//
// ```
type LogzTagRule struct {
	pulumi.CustomResourceState

	// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
	LogzMonitorId pulumi.StringOutput `pulumi:"logzMonitorId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrOutput `pulumi:"sendAadLogs"`
	// Whether activity logs from Azure resources should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrOutput `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrOutput `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzTagRuleTagFilterArrayOutput `pulumi:"tagFilters"`
}

// NewLogzTagRule registers a new resource with the given unique name, arguments, and options.
func NewLogzTagRule(ctx *pulumi.Context,
	name string, args *LogzTagRuleArgs, opts ...pulumi.ResourceOption) (*LogzTagRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LogzMonitorId == nil {
		return nil, errors.New("invalid value for required argument 'LogzMonitorId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogzTagRule
	err := ctx.RegisterResource("azure:monitoring/logzTagRule:LogzTagRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogzTagRule gets an existing LogzTagRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogzTagRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogzTagRuleState, opts ...pulumi.ResourceOption) (*LogzTagRule, error) {
	var resource LogzTagRule
	err := ctx.ReadResource("azure:monitoring/logzTagRule:LogzTagRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogzTagRule resources.
type logzTagRuleState struct {
	// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
	LogzMonitorId *string `pulumi:"logzMonitorId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs *bool `pulumi:"sendAadLogs"`
	// Whether activity logs from Azure resources should be sent to the Monitor resource?
	SendActivityLogs *bool `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs *bool `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters []LogzTagRuleTagFilter `pulumi:"tagFilters"`
}

type LogzTagRuleState struct {
	// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
	LogzMonitorId pulumi.StringPtrInput
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrInput
	// Whether activity logs from Azure resources should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrInput
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrInput
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzTagRuleTagFilterArrayInput
}

func (LogzTagRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*logzTagRuleState)(nil)).Elem()
}

type logzTagRuleArgs struct {
	// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
	LogzMonitorId string `pulumi:"logzMonitorId"`
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs *bool `pulumi:"sendAadLogs"`
	// Whether activity logs from Azure resources should be sent to the Monitor resource?
	SendActivityLogs *bool `pulumi:"sendActivityLogs"`
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs *bool `pulumi:"sendSubscriptionLogs"`
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters []LogzTagRuleTagFilter `pulumi:"tagFilters"`
}

// The set of arguments for constructing a LogzTagRule resource.
type LogzTagRuleArgs struct {
	// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
	LogzMonitorId pulumi.StringInput
	// Whether AAD logs should be sent to the Monitor resource?
	SendAadLogs pulumi.BoolPtrInput
	// Whether activity logs from Azure resources should be sent to the Monitor resource?
	SendActivityLogs pulumi.BoolPtrInput
	// Whether subscription logs should be sent to the Monitor resource?
	SendSubscriptionLogs pulumi.BoolPtrInput
	// One or more (up to 10) `tagFilter` blocks as defined below.
	TagFilters LogzTagRuleTagFilterArrayInput
}

func (LogzTagRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logzTagRuleArgs)(nil)).Elem()
}

type LogzTagRuleInput interface {
	pulumi.Input

	ToLogzTagRuleOutput() LogzTagRuleOutput
	ToLogzTagRuleOutputWithContext(ctx context.Context) LogzTagRuleOutput
}

func (*LogzTagRule) ElementType() reflect.Type {
	return reflect.TypeOf((**LogzTagRule)(nil)).Elem()
}

func (i *LogzTagRule) ToLogzTagRuleOutput() LogzTagRuleOutput {
	return i.ToLogzTagRuleOutputWithContext(context.Background())
}

func (i *LogzTagRule) ToLogzTagRuleOutputWithContext(ctx context.Context) LogzTagRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzTagRuleOutput)
}

func (i *LogzTagRule) ToOutput(ctx context.Context) pulumix.Output[*LogzTagRule] {
	return pulumix.Output[*LogzTagRule]{
		OutputState: i.ToLogzTagRuleOutputWithContext(ctx).OutputState,
	}
}

// LogzTagRuleArrayInput is an input type that accepts LogzTagRuleArray and LogzTagRuleArrayOutput values.
// You can construct a concrete instance of `LogzTagRuleArrayInput` via:
//
//	LogzTagRuleArray{ LogzTagRuleArgs{...} }
type LogzTagRuleArrayInput interface {
	pulumi.Input

	ToLogzTagRuleArrayOutput() LogzTagRuleArrayOutput
	ToLogzTagRuleArrayOutputWithContext(context.Context) LogzTagRuleArrayOutput
}

type LogzTagRuleArray []LogzTagRuleInput

func (LogzTagRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogzTagRule)(nil)).Elem()
}

func (i LogzTagRuleArray) ToLogzTagRuleArrayOutput() LogzTagRuleArrayOutput {
	return i.ToLogzTagRuleArrayOutputWithContext(context.Background())
}

func (i LogzTagRuleArray) ToLogzTagRuleArrayOutputWithContext(ctx context.Context) LogzTagRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzTagRuleArrayOutput)
}

func (i LogzTagRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*LogzTagRule] {
	return pulumix.Output[[]*LogzTagRule]{
		OutputState: i.ToLogzTagRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// LogzTagRuleMapInput is an input type that accepts LogzTagRuleMap and LogzTagRuleMapOutput values.
// You can construct a concrete instance of `LogzTagRuleMapInput` via:
//
//	LogzTagRuleMap{ "key": LogzTagRuleArgs{...} }
type LogzTagRuleMapInput interface {
	pulumi.Input

	ToLogzTagRuleMapOutput() LogzTagRuleMapOutput
	ToLogzTagRuleMapOutputWithContext(context.Context) LogzTagRuleMapOutput
}

type LogzTagRuleMap map[string]LogzTagRuleInput

func (LogzTagRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogzTagRule)(nil)).Elem()
}

func (i LogzTagRuleMap) ToLogzTagRuleMapOutput() LogzTagRuleMapOutput {
	return i.ToLogzTagRuleMapOutputWithContext(context.Background())
}

func (i LogzTagRuleMap) ToLogzTagRuleMapOutputWithContext(ctx context.Context) LogzTagRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogzTagRuleMapOutput)
}

func (i LogzTagRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*LogzTagRule] {
	return pulumix.Output[map[string]*LogzTagRule]{
		OutputState: i.ToLogzTagRuleMapOutputWithContext(ctx).OutputState,
	}
}

type LogzTagRuleOutput struct{ *pulumi.OutputState }

func (LogzTagRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogzTagRule)(nil)).Elem()
}

func (o LogzTagRuleOutput) ToLogzTagRuleOutput() LogzTagRuleOutput {
	return o
}

func (o LogzTagRuleOutput) ToLogzTagRuleOutputWithContext(ctx context.Context) LogzTagRuleOutput {
	return o
}

func (o LogzTagRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*LogzTagRule] {
	return pulumix.Output[*LogzTagRule]{
		OutputState: o.OutputState,
	}
}

// The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
func (o LogzTagRuleOutput) LogzMonitorId() pulumi.StringOutput {
	return o.ApplyT(func(v *LogzTagRule) pulumi.StringOutput { return v.LogzMonitorId }).(pulumi.StringOutput)
}

// Whether AAD logs should be sent to the Monitor resource?
func (o LogzTagRuleOutput) SendAadLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzTagRule) pulumi.BoolPtrOutput { return v.SendAadLogs }).(pulumi.BoolPtrOutput)
}

// Whether activity logs from Azure resources should be sent to the Monitor resource?
func (o LogzTagRuleOutput) SendActivityLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzTagRule) pulumi.BoolPtrOutput { return v.SendActivityLogs }).(pulumi.BoolPtrOutput)
}

// Whether subscription logs should be sent to the Monitor resource?
func (o LogzTagRuleOutput) SendSubscriptionLogs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogzTagRule) pulumi.BoolPtrOutput { return v.SendSubscriptionLogs }).(pulumi.BoolPtrOutput)
}

// One or more (up to 10) `tagFilter` blocks as defined below.
func (o LogzTagRuleOutput) TagFilters() LogzTagRuleTagFilterArrayOutput {
	return o.ApplyT(func(v *LogzTagRule) LogzTagRuleTagFilterArrayOutput { return v.TagFilters }).(LogzTagRuleTagFilterArrayOutput)
}

type LogzTagRuleArrayOutput struct{ *pulumi.OutputState }

func (LogzTagRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogzTagRule)(nil)).Elem()
}

func (o LogzTagRuleArrayOutput) ToLogzTagRuleArrayOutput() LogzTagRuleArrayOutput {
	return o
}

func (o LogzTagRuleArrayOutput) ToLogzTagRuleArrayOutputWithContext(ctx context.Context) LogzTagRuleArrayOutput {
	return o
}

func (o LogzTagRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*LogzTagRule] {
	return pulumix.Output[[]*LogzTagRule]{
		OutputState: o.OutputState,
	}
}

func (o LogzTagRuleArrayOutput) Index(i pulumi.IntInput) LogzTagRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogzTagRule {
		return vs[0].([]*LogzTagRule)[vs[1].(int)]
	}).(LogzTagRuleOutput)
}

type LogzTagRuleMapOutput struct{ *pulumi.OutputState }

func (LogzTagRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogzTagRule)(nil)).Elem()
}

func (o LogzTagRuleMapOutput) ToLogzTagRuleMapOutput() LogzTagRuleMapOutput {
	return o
}

func (o LogzTagRuleMapOutput) ToLogzTagRuleMapOutputWithContext(ctx context.Context) LogzTagRuleMapOutput {
	return o
}

func (o LogzTagRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*LogzTagRule] {
	return pulumix.Output[map[string]*LogzTagRule]{
		OutputState: o.OutputState,
	}
}

func (o LogzTagRuleMapOutput) MapIndex(k pulumi.StringInput) LogzTagRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogzTagRule {
		return vs[0].(map[string]*LogzTagRule)[vs[1].(string)]
	}).(LogzTagRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogzTagRuleInput)(nil)).Elem(), &LogzTagRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogzTagRuleArrayInput)(nil)).Elem(), LogzTagRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogzTagRuleMapInput)(nil)).Elem(), LogzTagRuleMap{})
	pulumi.RegisterOutputType(LogzTagRuleOutput{})
	pulumi.RegisterOutputType(LogzTagRuleArrayOutput{})
	pulumi.RegisterOutputType(LogzTagRuleMapOutput{})
}
