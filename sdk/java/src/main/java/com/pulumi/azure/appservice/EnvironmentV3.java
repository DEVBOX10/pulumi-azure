// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.EnvironmentV3Args;
import com.pulumi.azure.appservice.inputs.EnvironmentV3State;
import com.pulumi.azure.appservice.outputs.EnvironmentV3ClusterSetting;
import com.pulumi.azure.appservice.outputs.EnvironmentV3InboundNetworkDependency;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * A 3rd Generation (v3) App Service Environment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/environmentV3:EnvironmentV3 myAppServiceEnv /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Web/hostingEnvironments/myAppServiceEnv
 * ```
 * 
 */
@ResourceType(type="azure:appservice/environmentV3:EnvironmentV3")
public class EnvironmentV3 extends com.pulumi.resources.CustomResource {
    /**
     * Should new Private Endpoint Connections be allowed. Defaults to `true`.
     * 
     */
    @Export(name="allowNewPrivateEndpointConnections", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowNewPrivateEndpointConnections;

    /**
     * @return Should new Private Endpoint Connections be allowed. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> allowNewPrivateEndpointConnections() {
        return Codegen.optional(this.allowNewPrivateEndpointConnections);
    }
    /**
     * Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    @Export(name="clusterSettings", refs={List.class,EnvironmentV3ClusterSetting.class}, tree="[0,1]")
    private Output<List<EnvironmentV3ClusterSetting>> clusterSettings;

    /**
     * @return Zero or more `cluster_setting` blocks as defined below.
     * 
     */
    public Output<List<EnvironmentV3ClusterSetting>> clusterSettings() {
        return this.clusterSettings;
    }
    /**
     * This ASEv3 should use dedicated Hosts. Possible values are `2`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="dedicatedHostCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dedicatedHostCount;

    /**
     * @return This ASEv3 should use dedicated Hosts. Possible values are `2`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> dedicatedHostCount() {
        return Codegen.optional(this.dedicatedHostCount);
    }
    /**
     * the DNS suffix for this App Service Environment V3.
     * 
     */
    @Export(name="dnsSuffix", refs={String.class}, tree="[0]")
    private Output<String> dnsSuffix;

    /**
     * @return the DNS suffix for this App Service Environment V3.
     * 
     */
    public Output<String> dnsSuffix() {
        return this.dnsSuffix;
    }
    /**
     * The external inbound IP addresses of the App Service Environment V3.
     * 
     */
    @Export(name="externalInboundIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> externalInboundIpAddresses;

    /**
     * @return The external inbound IP addresses of the App Service Environment V3.
     * 
     */
    public Output<List<String>> externalInboundIpAddresses() {
        return this.externalInboundIpAddresses;
    }
    /**
     * An Inbound Network Dependencies block as defined below.
     * 
     */
    @Export(name="inboundNetworkDependencies", refs={List.class,EnvironmentV3InboundNetworkDependency.class}, tree="[0,1]")
    private Output<List<EnvironmentV3InboundNetworkDependency>> inboundNetworkDependencies;

    /**
     * @return An Inbound Network Dependencies block as defined below.
     * 
     */
    public Output<List<EnvironmentV3InboundNetworkDependency>> inboundNetworkDependencies() {
        return this.inboundNetworkDependencies;
    }
    /**
     * The internal inbound IP addresses of the App Service Environment V3.
     * 
     */
    @Export(name="internalInboundIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> internalInboundIpAddresses;

    /**
     * @return The internal inbound IP addresses of the App Service Environment V3.
     * 
     */
    public Output<List<String>> internalInboundIpAddresses() {
        return this.internalInboundIpAddresses;
    }
    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None` (for an External VIP Type), and `&#34;Web, Publishing&#34;` (for an Internal VIP Type). Defaults to `None`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="internalLoadBalancingMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> internalLoadBalancingMode;

    /**
     * @return Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment. Possible values are `None` (for an External VIP Type), and `&#34;Web, Publishing&#34;` (for an Internal VIP Type). Defaults to `None`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> internalLoadBalancingMode() {
        return Codegen.optional(this.internalLoadBalancingMode);
    }
    /**
     * The number of IP SSL addresses reserved for the App Service Environment V3.
     * 
     */
    @Export(name="ipSslAddressCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipSslAddressCount;

    /**
     * @return The number of IP SSL addresses reserved for the App Service Environment V3.
     * 
     */
    public Output<Integer> ipSslAddressCount() {
        return this.ipSslAddressCount;
    }
    /**
     * Outbound addresses of Linux based Apps in this App Service Environment V3
     * 
     */
    @Export(name="linuxOutboundIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> linuxOutboundIpAddresses;

    /**
     * @return Outbound addresses of Linux based Apps in this App Service Environment V3
     * 
     */
    public Output<List<String>> linuxOutboundIpAddresses() {
        return this.linuxOutboundIpAddresses;
    }
    /**
     * The location where the App Service Environment exists.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location where the App Service Environment exists.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the App Service Environment. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the App Service Environment. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pricing tier for the front end instances.
     * 
     */
    @Export(name="pricingTier", refs={String.class}, tree="[0]")
    private Output<String> pricingTier;

    /**
     * @return Pricing tier for the front end instances.
     * 
     */
    public Output<String> pricingTier() {
        return this.pricingTier;
    }
    /**
     * The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the App Service Environment exists. Defaults to the Resource Group of the Subnet (specified by `subnet_id`). Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** a /24 or larger CIDR is required. Once associated with an ASE, this size cannot be changed.
     * 
     * &gt; **NOTE:** This Subnet requires a delegation to `Microsoft.Web/hostingEnvironments` as detailed in the example above.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet which the App Service Environment should be connected to. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE** a /24 or larger CIDR is required. Once associated with an ASE, this size cannot be changed.
     * 
     * &gt; **NOTE:** This Subnet requires a delegation to `Microsoft.Web/hostingEnvironments` as detailed in the example above.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Outbound addresses of Windows based Apps in this App Service Environment V3.
     * 
     */
    @Export(name="windowsOutboundIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> windowsOutboundIpAddresses;

    /**
     * @return Outbound addresses of Windows based Apps in this App Service Environment V3.
     * 
     */
    public Output<List<String>> windowsOutboundIpAddresses() {
        return this.windowsOutboundIpAddresses;
    }
    /**
     * Set to `true` to deploy the ASEv3 with availability zones supported. Zonal ASEs can be deployed in some regions, you can refer to [Availability Zone support for App Service Environments](https://docs.microsoft.com/azure/app-service/environment/zone-redundancy). You can only set either `dedicated_host_count` or `zone_redundant` but not both. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Setting this value will provision 2 Physical Hosts for your App Service Environment V3, this is done at additional cost, please be aware of the pricing commitment in the [General Availability Notes](https://techcommunity.microsoft.com/t5/apps-on-azure/announcing-app-service-environment-v3-ga/ba-p/2517990)
     * 
     */
    @Export(name="zoneRedundant", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Set to `true` to deploy the ASEv3 with availability zones supported. Zonal ASEs can be deployed in some regions, you can refer to [Availability Zone support for App Service Environments](https://docs.microsoft.com/azure/app-service/environment/zone-redundancy). You can only set either `dedicated_host_count` or `zone_redundant` but not both. Changing this forces a new resource to be created.
     * 
     * &gt; **NOTE:** Setting this value will provision 2 Physical Hosts for your App Service Environment V3, this is done at additional cost, please be aware of the pricing commitment in the [General Availability Notes](https://techcommunity.microsoft.com/t5/apps-on-azure/announcing-app-service-environment-v3-ga/ba-p/2517990)
     * 
     */
    public Output<Optional<Boolean>> zoneRedundant() {
        return Codegen.optional(this.zoneRedundant);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentV3(String name) {
        this(name, EnvironmentV3Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentV3(String name, EnvironmentV3Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentV3(String name, EnvironmentV3Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/environmentV3:EnvironmentV3", name, args == null ? EnvironmentV3Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnvironmentV3(String name, Output<String> id, @Nullable EnvironmentV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/environmentV3:EnvironmentV3", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnvironmentV3 get(String name, Output<String> id, @Nullable EnvironmentV3State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentV3(name, id, state, options);
    }
}
