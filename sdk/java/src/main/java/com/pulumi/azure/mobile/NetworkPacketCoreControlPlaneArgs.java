// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.azure.mobile.inputs.NetworkPacketCoreControlPlaneIdentityArgs;
import com.pulumi.azure.mobile.inputs.NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs;
import com.pulumi.azure.mobile.inputs.NetworkPacketCoreControlPlanePlatformArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPacketCoreControlPlaneArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPacketCoreControlPlaneArgs Empty = new NetworkPacketCoreControlPlaneArgs();

    /**
     * The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Import(name="controlPlaneAccessIpv4Address")
    private @Nullable Output<String> controlPlaneAccessIpv4Address;

    /**
     * @return The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Optional<Output<String>> controlPlaneAccessIpv4Address() {
        return Optional.ofNullable(this.controlPlaneAccessIpv4Address);
    }

    /**
     * The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Import(name="controlPlaneAccessIpv4Gateway")
    private @Nullable Output<String> controlPlaneAccessIpv4Gateway;

    /**
     * @return The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Optional<Output<String>> controlPlaneAccessIpv4Gateway() {
        return Optional.ofNullable(this.controlPlaneAccessIpv4Gateway);
    }

    /**
     * The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Import(name="controlPlaneAccessIpv4Subnet")
    private @Nullable Output<String> controlPlaneAccessIpv4Subnet;

    /**
     * @return The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Optional<Output<String>> controlPlaneAccessIpv4Subnet() {
        return Optional.ofNullable(this.controlPlaneAccessIpv4Subnet);
    }

    /**
     * Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    @Import(name="controlPlaneAccessName")
    private @Nullable Output<String> controlPlaneAccessName;

    /**
     * @return Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
     * 
     */
    public Optional<Output<String>> controlPlaneAccessName() {
        return Optional.ofNullable(this.controlPlaneAccessName);
    }

    /**
     * The core network technology generation. Possible values are `EPG` and `5GC`.
     * 
     */
    @Import(name="coreNetworkTechnology")
    private @Nullable Output<String> coreNetworkTechnology;

    /**
     * @return The core network technology generation. Possible values are `EPG` and `5GC`.
     * 
     */
    public Optional<Output<String>> coreNetworkTechnology() {
        return Optional.ofNullable(this.coreNetworkTechnology);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<NetworkPacketCoreControlPlaneIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<NetworkPacketCoreControlPlaneIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
     * 
     */
    @Import(name="interoperabilitySettingsJson")
    private @Nullable Output<String> interoperabilitySettingsJson;

    /**
     * @return Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
     * 
     */
    public Optional<Output<String>> interoperabilitySettingsJson() {
        return Optional.ofNullable(this.interoperabilitySettingsJson);
    }

    /**
     * One or more `local_diagnostics_access` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
     * 
     */
    @Import(name="localDiagnosticsAccess", required=true)
    private Output<NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs> localDiagnosticsAccess;

    /**
     * @return One or more `local_diagnostics_access` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
     * 
     */
    public Output<NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs> localDiagnosticsAccess() {
        return this.localDiagnosticsAccess;
    }

    /**
     * Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `platform` block as defined below.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<NetworkPacketCoreControlPlanePlatformArgs> platform;

    /**
     * @return A `platform` block as defined below.
     * 
     */
    public Optional<Output<NetworkPacketCoreControlPlanePlatformArgs>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
     * 
     */
    @Import(name="siteIds", required=true)
    private Output<List<String>> siteIds;

    /**
     * @return A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
     * 
     */
    public Output<List<String>> siteIds() {
        return this.siteIds;
    }

    /**
     * The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    /**
     * Specifies the version of the packet core software that is deployed.
     * 
     */
    @Import(name="softwareVersion")
    private @Nullable Output<String> softwareVersion;

    /**
     * @return Specifies the version of the packet core software that is deployed.
     * 
     */
    public Optional<Output<String>> softwareVersion() {
        return Optional.ofNullable(this.softwareVersion);
    }

    /**
     * A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
     * 
     */
    @Import(name="userEquipmentMtuInBytes")
    private @Nullable Output<Integer> userEquipmentMtuInBytes;

    /**
     * @return Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
     * 
     */
    public Optional<Output<Integer>> userEquipmentMtuInBytes() {
        return Optional.ofNullable(this.userEquipmentMtuInBytes);
    }

    private NetworkPacketCoreControlPlaneArgs() {}

    private NetworkPacketCoreControlPlaneArgs(NetworkPacketCoreControlPlaneArgs $) {
        this.controlPlaneAccessIpv4Address = $.controlPlaneAccessIpv4Address;
        this.controlPlaneAccessIpv4Gateway = $.controlPlaneAccessIpv4Gateway;
        this.controlPlaneAccessIpv4Subnet = $.controlPlaneAccessIpv4Subnet;
        this.controlPlaneAccessName = $.controlPlaneAccessName;
        this.coreNetworkTechnology = $.coreNetworkTechnology;
        this.identity = $.identity;
        this.interoperabilitySettingsJson = $.interoperabilitySettingsJson;
        this.localDiagnosticsAccess = $.localDiagnosticsAccess;
        this.location = $.location;
        this.name = $.name;
        this.platform = $.platform;
        this.resourceGroupName = $.resourceGroupName;
        this.siteIds = $.siteIds;
        this.sku = $.sku;
        this.softwareVersion = $.softwareVersion;
        this.tags = $.tags;
        this.userEquipmentMtuInBytes = $.userEquipmentMtuInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPacketCoreControlPlaneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPacketCoreControlPlaneArgs $;

        public Builder() {
            $ = new NetworkPacketCoreControlPlaneArgs();
        }

        public Builder(NetworkPacketCoreControlPlaneArgs defaults) {
            $ = new NetworkPacketCoreControlPlaneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controlPlaneAccessIpv4Address The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Address(@Nullable Output<String> controlPlaneAccessIpv4Address) {
            $.controlPlaneAccessIpv4Address = controlPlaneAccessIpv4Address;
            return this;
        }

        /**
         * @param controlPlaneAccessIpv4Address The IPv4 address for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Address(String controlPlaneAccessIpv4Address) {
            return controlPlaneAccessIpv4Address(Output.of(controlPlaneAccessIpv4Address));
        }

        /**
         * @param controlPlaneAccessIpv4Gateway The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Gateway(@Nullable Output<String> controlPlaneAccessIpv4Gateway) {
            $.controlPlaneAccessIpv4Gateway = controlPlaneAccessIpv4Gateway;
            return this;
        }

        /**
         * @param controlPlaneAccessIpv4Gateway The default IPv4 gateway for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Gateway(String controlPlaneAccessIpv4Gateway) {
            return controlPlaneAccessIpv4Gateway(Output.of(controlPlaneAccessIpv4Gateway));
        }

        /**
         * @param controlPlaneAccessIpv4Subnet The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Subnet(@Nullable Output<String> controlPlaneAccessIpv4Subnet) {
            $.controlPlaneAccessIpv4Subnet = controlPlaneAccessIpv4Subnet;
            return this;
        }

        /**
         * @param controlPlaneAccessIpv4Subnet The IPv4 subnet for the control plane interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessIpv4Subnet(String controlPlaneAccessIpv4Subnet) {
            return controlPlaneAccessIpv4Subnet(Output.of(controlPlaneAccessIpv4Subnet));
        }

        /**
         * @param controlPlaneAccessName Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessName(@Nullable Output<String> controlPlaneAccessName) {
            $.controlPlaneAccessName = controlPlaneAccessName;
            return this;
        }

        /**
         * @param controlPlaneAccessName Specifies the logical name for this interface. This should match one of the interfaces configured on your Azure Stack Edge device.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneAccessName(String controlPlaneAccessName) {
            return controlPlaneAccessName(Output.of(controlPlaneAccessName));
        }

        /**
         * @param coreNetworkTechnology The core network technology generation. Possible values are `EPG` and `5GC`.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkTechnology(@Nullable Output<String> coreNetworkTechnology) {
            $.coreNetworkTechnology = coreNetworkTechnology;
            return this;
        }

        /**
         * @param coreNetworkTechnology The core network technology generation. Possible values are `EPG` and `5GC`.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkTechnology(String coreNetworkTechnology) {
            return coreNetworkTechnology(Output.of(coreNetworkTechnology));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<NetworkPacketCoreControlPlaneIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(NetworkPacketCoreControlPlaneIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param interoperabilitySettingsJson Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
         * 
         * @return builder
         * 
         */
        public Builder interoperabilitySettingsJson(@Nullable Output<String> interoperabilitySettingsJson) {
            $.interoperabilitySettingsJson = interoperabilitySettingsJson;
            return this;
        }

        /**
         * @param interoperabilitySettingsJson Settings in JSON format to allow interoperability with third party components e.g. RANs and UEs.
         * 
         * @return builder
         * 
         */
        public Builder interoperabilitySettingsJson(String interoperabilitySettingsJson) {
            return interoperabilitySettingsJson(Output.of(interoperabilitySettingsJson));
        }

        /**
         * @param localDiagnosticsAccess One or more `local_diagnostics_access` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
         * 
         * @return builder
         * 
         */
        public Builder localDiagnosticsAccess(Output<NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs> localDiagnosticsAccess) {
            $.localDiagnosticsAccess = localDiagnosticsAccess;
            return this;
        }

        /**
         * @param localDiagnosticsAccess One or more `local_diagnostics_access` blocks as defined below. Specifies the Kubernetes ingress configuration that controls access to the packet core diagnostics through local APIs.
         * 
         * @return builder
         * 
         */
        public Builder localDiagnosticsAccess(NetworkPacketCoreControlPlaneLocalDiagnosticsAccessArgs localDiagnosticsAccess) {
            return localDiagnosticsAccess(Output.of(localDiagnosticsAccess));
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies The name of the Mobile Network Packet Core Control Plane. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param platform A `platform` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<NetworkPacketCoreControlPlanePlatformArgs> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform A `platform` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder platform(NetworkPacketCoreControlPlanePlatformArgs platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Mobile Network Packet Core Control Plane should exist. Changing this forces a new Mobile Network Packet Core Control Plane to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param siteIds A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
         * 
         * @return builder
         * 
         */
        public Builder siteIds(Output<List<String>> siteIds) {
            $.siteIds = siteIds;
            return this;
        }

        /**
         * @param siteIds A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
         * 
         * @return builder
         * 
         */
        public Builder siteIds(List<String> siteIds) {
            return siteIds(Output.of(siteIds));
        }

        /**
         * @param siteIds A list of Mobile Network Site IDs in which this packet core control plane should be deployed. The Sites must be in the same location as the packet core control plane.
         * 
         * @return builder
         * 
         */
        public Builder siteIds(String... siteIds) {
            return siteIds(List.of(siteIds));
        }

        /**
         * @param sku The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU defining the throughput and SIM allowances for this packet core control plane deployment. Possible values are `G0`, `G1`, `G2`, `G3`, `G4`, `G5` and `G10`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param softwareVersion Specifies the version of the packet core software that is deployed.
         * 
         * @return builder
         * 
         */
        public Builder softwareVersion(@Nullable Output<String> softwareVersion) {
            $.softwareVersion = softwareVersion;
            return this;
        }

        /**
         * @param softwareVersion Specifies the version of the packet core software that is deployed.
         * 
         * @return builder
         * 
         */
        public Builder softwareVersion(String softwareVersion) {
            return softwareVersion(Output.of(softwareVersion));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Packet Core Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userEquipmentMtuInBytes Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
         * 
         * @return builder
         * 
         */
        public Builder userEquipmentMtuInBytes(@Nullable Output<Integer> userEquipmentMtuInBytes) {
            $.userEquipmentMtuInBytes = userEquipmentMtuInBytes;
            return this;
        }

        /**
         * @param userEquipmentMtuInBytes Specifies the MTU in bytes that can be sent to the user equipment. The same MTU is set on the user plane data links for all data networks. The MTU set on the user plane access link will be 60 bytes greater than this value to allow for GTP encapsulation.
         * 
         * @return builder
         * 
         */
        public Builder userEquipmentMtuInBytes(Integer userEquipmentMtuInBytes) {
            return userEquipmentMtuInBytes(Output.of(userEquipmentMtuInBytes));
        }

        public NetworkPacketCoreControlPlaneArgs build() {
            $.localDiagnosticsAccess = Objects.requireNonNull($.localDiagnosticsAccess, "expected parameter 'localDiagnosticsAccess' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteIds = Objects.requireNonNull($.siteIds, "expected parameter 'siteIds' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
