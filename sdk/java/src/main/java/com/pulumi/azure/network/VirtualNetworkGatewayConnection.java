// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayConnectionState;
import com.pulumi.azure.network.outputs.VirtualNetworkGatewayConnectionCustomBgpAddresses;
import com.pulumi.azure.network.outputs.VirtualNetworkGatewayConnectionIpsecPolicy;
import com.pulumi.azure.network.outputs.VirtualNetworkGatewayConnectionTrafficSelectorPolicy;
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
 * Manages a connection in an existing Virtual Network Gateway.
 * 
 * ## Example Usage
 * ### Site-to-Site connection
 * 
 * The following example shows a connection between an Azure virtual network
 * and an on-premises VPN device and network.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.LocalNetworkGateway;
 * import com.pulumi.azure.network.LocalNetworkGatewayArgs;
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.VirtualNetworkGateway;
 * import com.pulumi.azure.network.VirtualNetworkGatewayArgs;
 * import com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnection;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var onpremiseLocalNetworkGateway = new LocalNetworkGateway(&#34;onpremiseLocalNetworkGateway&#34;, LocalNetworkGatewayArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .gatewayAddress(&#34;168.62.225.23&#34;)
 *             .addressSpaces(&#34;10.1.1.0/24&#34;)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetworkGateway = new VirtualNetworkGateway(&#34;exampleVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .activeActive(false)
 *             .enableBgp(false)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfigurationArgs.builder()
 *                 .publicIpAddressId(examplePublicIp.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(exampleSubnet.id())
 *                 .build())
 *             .build());
 * 
 *         var onpremiseVirtualNetworkGatewayConnection = new VirtualNetworkGatewayConnection(&#34;onpremiseVirtualNetworkGatewayConnection&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .type(&#34;IPsec&#34;)
 *             .virtualNetworkGatewayId(exampleVirtualNetworkGateway.id())
 *             .localNetworkGatewayId(onpremiseLocalNetworkGateway.id())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### VNet-to-VNet connection
 * 
 * The following example shows a connection between two Azure virtual network
 * in different locations/regions.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.VirtualNetworkGateway;
 * import com.pulumi.azure.network.VirtualNetworkGatewayArgs;
 * import com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnection;
 * import com.pulumi.azure.network.VirtualNetworkGatewayConnectionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var usResourceGroup = new ResourceGroup(&#34;usResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var usVirtualNetwork = new VirtualNetwork(&#34;usVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(usResourceGroup.location())
 *             .resourceGroupName(usResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var usGateway = new Subnet(&#34;usGateway&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(usResourceGroup.name())
 *             .virtualNetworkName(usVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var usPublicIp = new PublicIp(&#34;usPublicIp&#34;, PublicIpArgs.builder()        
 *             .location(usResourceGroup.location())
 *             .resourceGroupName(usResourceGroup.name())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var usVirtualNetworkGateway = new VirtualNetworkGateway(&#34;usVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(usResourceGroup.location())
 *             .resourceGroupName(usResourceGroup.name())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfigurationArgs.builder()
 *                 .publicIpAddressId(usPublicIp.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(usGateway.id())
 *                 .build())
 *             .build());
 * 
 *         var europeResourceGroup = new ResourceGroup(&#34;europeResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var europeVirtualNetwork = new VirtualNetwork(&#34;europeVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(europeResourceGroup.location())
 *             .resourceGroupName(europeResourceGroup.name())
 *             .addressSpaces(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var europeGateway = new Subnet(&#34;europeGateway&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(europeResourceGroup.name())
 *             .virtualNetworkName(europeVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.1.1.0/24&#34;)
 *             .build());
 * 
 *         var europePublicIp = new PublicIp(&#34;europePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(europeResourceGroup.location())
 *             .resourceGroupName(europeResourceGroup.name())
 *             .allocationMethod(&#34;Dynamic&#34;)
 *             .build());
 * 
 *         var europeVirtualNetworkGateway = new VirtualNetworkGateway(&#34;europeVirtualNetworkGateway&#34;, VirtualNetworkGatewayArgs.builder()        
 *             .location(europeResourceGroup.location())
 *             .resourceGroupName(europeResourceGroup.name())
 *             .type(&#34;Vpn&#34;)
 *             .vpnType(&#34;RouteBased&#34;)
 *             .sku(&#34;Basic&#34;)
 *             .ipConfigurations(VirtualNetworkGatewayIpConfigurationArgs.builder()
 *                 .publicIpAddressId(europePublicIp.id())
 *                 .privateIpAddressAllocation(&#34;Dynamic&#34;)
 *                 .subnetId(europeGateway.id())
 *                 .build())
 *             .build());
 * 
 *         var usToEurope = new VirtualNetworkGatewayConnection(&#34;usToEurope&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(usResourceGroup.location())
 *             .resourceGroupName(usResourceGroup.name())
 *             .type(&#34;Vnet2Vnet&#34;)
 *             .virtualNetworkGatewayId(usVirtualNetworkGateway.id())
 *             .peerVirtualNetworkGatewayId(europeVirtualNetworkGateway.id())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *         var europeToUs = new VirtualNetworkGatewayConnection(&#34;europeToUs&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .location(europeResourceGroup.location())
 *             .resourceGroupName(europeResourceGroup.name())
 *             .type(&#34;Vnet2Vnet&#34;)
 *             .virtualNetworkGatewayId(europeVirtualNetworkGateway.id())
 *             .peerVirtualNetworkGatewayId(usVirtualNetworkGateway.id())
 *             .sharedKey(&#34;4-v3ry-53cr37-1p53c-5h4r3d-k3y&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Network Gateway Connections can be imported using their `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection exampleConnection /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.Network/connections/myConnection1
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection")
public class VirtualNetworkGatewayConnection extends com.pulumi.resources.CustomResource {
    /**
     * The authorization key associated with the Express Route Circuit. This field is required only if the type is an ExpressRoute connection.
     * 
     */
    @Export(name="authorizationKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorization key associated with the Express Route Circuit. This field is required only if the type is an ExpressRoute connection.
     * 
     */
    public Output<Optional<String>> authorizationKey() {
        return Codegen.optional(this.authorizationKey);
    }
    /**
     * Connection mode to use. Possible values are `Default`, `InitiatorOnly` and `ResponderOnly`. Defaults to `Default`. Changing this value will force a resource to be created.
     * 
     */
    @Export(name="connectionMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionMode;

    /**
     * @return Connection mode to use. Possible values are `Default`, `InitiatorOnly` and `ResponderOnly`. Defaults to `Default`. Changing this value will force a resource to be created.
     * 
     */
    public Output<Optional<String>> connectionMode() {
        return Codegen.optional(this.connectionMode);
    }
    /**
     * The IKE protocol version to use. Possible values are `IKEv1` and `IKEv2`, values are `IKEv1` and `IKEv2`. Defaults to `IKEv2`. Changing this forces a new resource to be created.
     * &gt; **Note:** Only valid for `IPSec` connections on virtual network gateways with SKU `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw1AZ`, `VpnGw2AZ` or `VpnGw3AZ`.
     * 
     */
    @Export(name="connectionProtocol", refs={String.class}, tree="[0]")
    private Output<String> connectionProtocol;

    /**
     * @return The IKE protocol version to use. Possible values are `IKEv1` and `IKEv2`, values are `IKEv1` and `IKEv2`. Defaults to `IKEv2`. Changing this forces a new resource to be created.
     * &gt; **Note:** Only valid for `IPSec` connections on virtual network gateways with SKU `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw1AZ`, `VpnGw2AZ` or `VpnGw3AZ`.
     * 
     */
    public Output<String> connectionProtocol() {
        return this.connectionProtocol;
    }
    /**
     * A `custom_bgp_addresses` (Border Gateway Protocol custom IP Addresses) block which is documented below.
     * The block can only be used on `IPSec` / `activeactive` connections,
     * For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * 
     */
    @Export(name="customBgpAddresses", refs={VirtualNetworkGatewayConnectionCustomBgpAddresses.class}, tree="[0]")
    private Output</* @Nullable */ VirtualNetworkGatewayConnectionCustomBgpAddresses> customBgpAddresses;

    /**
     * @return A `custom_bgp_addresses` (Border Gateway Protocol custom IP Addresses) block which is documented below.
     * The block can only be used on `IPSec` / `activeactive` connections,
     * For details about see [the relevant section in the Azure documentation](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-howto-aws-bgp).
     * 
     */
    public Output<Optional<VirtualNetworkGatewayConnectionCustomBgpAddresses>> customBgpAddresses() {
        return Codegen.optional(this.customBgpAddresses);
    }
    /**
     * The dead peer detection timeout of this connection in seconds. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="dpdTimeoutSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dpdTimeoutSeconds;

    /**
     * @return The dead peer detection timeout of this connection in seconds. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> dpdTimeoutSeconds() {
        return Codegen.optional(this.dpdTimeoutSeconds);
    }
    /**
     * A list of the egress NAT Rule Ids.
     * 
     */
    @Export(name="egressNatRuleIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> egressNatRuleIds;

    /**
     * @return A list of the egress NAT Rule Ids.
     * 
     */
    public Output<Optional<List<String>>> egressNatRuleIds() {
        return Codegen.optional(this.egressNatRuleIds);
    }
    /**
     * If `true`, BGP (Border Gateway Protocol) is enabled for this connection. Defaults to `false`.
     * 
     */
    @Export(name="enableBgp", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enableBgp;

    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled for this connection. Defaults to `false`.
     * 
     */
    public Output<Boolean> enableBgp() {
        return this.enableBgp;
    }
    /**
     * The ID of the Express Route Circuit when creating an ExpressRoute connection (i.e. when `type` is `ExpressRoute`). The Express Route Circuit can be in the same or in a different subscription. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="expressRouteCircuitId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expressRouteCircuitId;

    /**
     * @return The ID of the Express Route Circuit when creating an ExpressRoute connection (i.e. when `type` is `ExpressRoute`). The Express Route Circuit can be in the same or in a different subscription. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> expressRouteCircuitId() {
        return Codegen.optional(this.expressRouteCircuitId);
    }
    /**
     * If `true`, data packets will bypass ExpressRoute Gateway for data forwarding This is only valid for ExpressRoute connections.
     * 
     */
    @Export(name="expressRouteGatewayBypass", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> expressRouteGatewayBypass;

    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding This is only valid for ExpressRoute connections.
     * 
     */
    public Output<Boolean> expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * A list of the ingress NAT Rule Ids.
     * 
     */
    @Export(name="ingressNatRuleIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ingressNatRuleIds;

    /**
     * @return A list of the ingress NAT Rule Ids.
     * 
     */
    public Output<Optional<List<String>>> ingressNatRuleIds() {
        return Codegen.optional(this.ingressNatRuleIds);
    }
    /**
     * A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    @Export(name="ipsecPolicy", refs={VirtualNetworkGatewayConnectionIpsecPolicy.class}, tree="[0]")
    private Output</* @Nullable */ VirtualNetworkGatewayConnectionIpsecPolicy> ipsecPolicy;

    /**
     * @return A `ipsec_policy` block which is documented below.
     * Only a single policy can be defined for a connection. For details on
     * custom policies refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-ipsecikepolicy-rm-powershell).
     * 
     */
    public Output<Optional<VirtualNetworkGatewayConnectionIpsecPolicy>> ipsecPolicy() {
        return Codegen.optional(this.ipsecPolicy);
    }
    /**
     * Use private local Azure IP for the connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="localAzureIpAddressEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> localAzureIpAddressEnabled;

    /**
     * @return Use private local Azure IP for the connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> localAzureIpAddressEnabled() {
        return Codegen.optional(this.localAzureIpAddressEnabled);
    }
    /**
     * The ID of the local network gateway when creating Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    @Export(name="localNetworkGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> localNetworkGatewayId;

    /**
     * @return The ID of the local network gateway when creating Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    public Output<Optional<String>> localNetworkGatewayId() {
        return Codegen.optional(this.localNetworkGatewayId);
    }
    /**
     * The location/region where the connection is located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location/region where the connection is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the connection. Changing the name forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the connection. Changing the name forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the peer virtual network gateway when creating a VNet-to-VNet connection (i.e. when `type` is `Vnet2Vnet`). The peer Virtual Network Gateway can be in the same or in a different subscription. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="peerVirtualNetworkGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> peerVirtualNetworkGatewayId;

    /**
     * @return The ID of the peer virtual network gateway when creating a VNet-to-VNet connection (i.e. when `type` is `Vnet2Vnet`). The peer Virtual Network Gateway can be in the same or in a different subscription. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> peerVirtualNetworkGatewayId() {
        return Codegen.optional(this.peerVirtualNetworkGatewayId);
    }
    /**
     * The name of the resource group in which to create the connection Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the connection Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The routing weight. Defaults to `10`.
     * 
     */
    @Export(name="routingWeight", refs={Integer.class}, tree="[0]")
    private Output<Integer> routingWeight;

    /**
     * @return The routing weight. Defaults to `10`.
     * 
     */
    public Output<Integer> routingWeight() {
        return this.routingWeight;
    }
    /**
     * The shared IPSec key. A key could be provided if a Site-to-Site, VNet-to-VNet or ExpressRoute connection is created.
     * 
     */
    @Export(name="sharedKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sharedKey;

    /**
     * @return The shared IPSec key. A key could be provided if a Site-to-Site, VNet-to-VNet or ExpressRoute connection is created.
     * 
     */
    public Output<Optional<String>> sharedKey() {
        return Codegen.optional(this.sharedKey);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * One or more `traffic_selector_policy` blocks which are documented below.
     * A `traffic_selector_policy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    @Export(name="trafficSelectorPolicy", refs={VirtualNetworkGatewayConnectionTrafficSelectorPolicy.class}, tree="[0]")
    private Output</* @Nullable */ VirtualNetworkGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicy;

    /**
     * @return One or more `traffic_selector_policy` blocks which are documented below.
     * A `traffic_selector_policy` allows to specify a traffic selector policy proposal to be used in a virtual network gateway connection.
     * For details about traffic selectors refer to [the relevant section in the Azure documentation](https://docs.microsoft.com/azure/vpn-gateway/vpn-gateway-connect-multiple-policybased-rm-ps).
     * 
     */
    public Output<Optional<VirtualNetworkGatewayConnectionTrafficSelectorPolicy>> trafficSelectorPolicy() {
        return Codegen.optional(this.trafficSelectorPolicy);
    }
    /**
     * The type of connection. Valid options are `IPsec` (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet). Each connection type requires different mandatory arguments (refer to the examples above). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of connection. Valid options are `IPsec` (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet). Each connection type requires different mandatory arguments (refer to the examples above). Changing this forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * If `true`, policy-based traffic selectors are enabled for this connection. Enabling policy-based traffic selectors requires an `ipsec_policy` block. Defaults to `false`.
     * 
     */
    @Export(name="usePolicyBasedTrafficSelectors", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return If `true`, policy-based traffic selectors are enabled for this connection. Enabling policy-based traffic selectors requires an `ipsec_policy` block. Defaults to `false`.
     * 
     */
    public Output<Boolean> usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * The ID of the Virtual Network Gateway in which the connection will be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualNetworkGatewayId", refs={String.class}, tree="[0]")
    private Output<String> virtualNetworkGatewayId;

    /**
     * @return The ID of the Virtual Network Gateway in which the connection will be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkGatewayId() {
        return this.virtualNetworkGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkGatewayConnection(String name) {
        this(name, VirtualNetworkGatewayConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection", name, args == null ? VirtualNetworkGatewayConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkGatewayConnection(String name, Output<String> id, @Nullable VirtualNetworkGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualNetworkGatewayConnection:VirtualNetworkGatewayConnection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "authorizationKey",
                "sharedKey"
            ))
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
    public static VirtualNetworkGatewayConnection get(String name, Output<String> id, @Nullable VirtualNetworkGatewayConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGatewayConnection(name, id, state, options);
    }
}
