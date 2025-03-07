// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterDefaultNodePoolGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID of the Capacity Reservation Group within which this AKS Cluster should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("capacityReservationGroupId")]
        public Input<string>? CapacityReservationGroupId { get; set; }

        /// <summary>
        /// Specifies whether to trust a Custom CA.
        /// </summary>
        [Input("customCaTrustEnabled")]
        public Input<bool>? CustomCaTrustEnabled { get; set; }

        /// <summary>
        /// Should [the Kubernetes Auto Scaler](https://docs.microsoft.com/azure/aks/cluster-autoscaler) be enabled for this Node Pool?
        /// 
        /// &gt; **Note:** This requires that the `type` is set to `VirtualMachineScaleSets`.
        /// 
        /// &gt; **Note:** If you're using AutoScaling, you may wish to use [`ignoreChanges` functionality](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to ignore changes to the `node_count` field.
        /// </summary>
        [Input("enableAutoScaling")]
        public Input<bool>? EnableAutoScaling { get; set; }

        /// <summary>
        /// Should the nodes in the Default Node Pool have host encryption enabled? `temporary_name_for_rotation` must be specified when changing this property.
        /// 
        /// &gt; **Note:** This requires that the Preview Feature `Microsoft.ContainerService/EnableEncryptionAtHostPreview` is enabled and the Resource Provider is re-registered.
        /// </summary>
        [Input("enableHostEncryption")]
        public Input<bool>? EnableHostEncryption { get; set; }

        /// <summary>
        /// Should nodes in this Node Pool have a Public IP Address? `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("enableNodePublicIp")]
        public Input<bool>? EnableNodePublicIp { get; set; }

        /// <summary>
        /// Should the nodes in this Node Pool have Federal Information Processing Standard enabled? Changing this forces a new resource to be created.
        /// </summary>
        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        /// <summary>
        /// Specifies the ID of the Host Group within which this AKS Cluster should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("hostGroupId")]
        public Input<string>? HostGroupId { get; set; }

        /// <summary>
        /// A `kubelet_config` block as defined below. `temporary_name_for_rotation` must be specified when changing this block.
        /// </summary>
        [Input("kubeletConfig")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolKubeletConfigGetArgs>? KubeletConfig { get; set; }

        /// <summary>
        /// The type of disk used by kubelet. Possible values are `OS` and `Temporary`.
        /// </summary>
        [Input("kubeletDiskType")]
        public Input<string>? KubeletDiskType { get; set; }

        /// <summary>
        /// A `linux_os_config` block as defined below. `temporary_name_for_rotation` must be specified when changing this block.
        /// </summary>
        [Input("linuxOsConfig")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigGetArgs>? LinuxOsConfig { get; set; }

        /// <summary>
        /// The maximum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
        /// </summary>
        [Input("maxCount")]
        public Input<int>? MaxCount { get; set; }

        /// <summary>
        /// The maximum number of pods that can run on each agent. Changing this forces a new resource to be created. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("maxPods")]
        public Input<int>? MaxPods { get; set; }

        /// <summary>
        /// A base64-encoded string which will be written to /etc/motd after decoding. This allows customization of the message of the day for Linux nodes. It cannot be specified for Windows nodes and must be a static string (i.e. will be printed raw and not executed as a script). Changing this forces a new resource to be created.
        /// </summary>
        [Input("messageOfTheDay")]
        public Input<string>? MessageOfTheDay { get; set; }

        /// <summary>
        /// The minimum number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
        /// </summary>
        [Input("minCount")]
        public Input<int>? MinCount { get; set; }

        /// <summary>
        /// The name which should be used for the default Kubernetes Node Pool. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The number of nodes which should exist in this Node Pool. If specified this must be between `1` and `1000`.
        /// 
        /// &gt; **Note:** If `enable_auto_scaling` is set to `false` both `min_count` and `max_count` fields need to be set to `null` or omitted from the configuration.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodeLabels")]
        private InputMap<string>? _nodeLabels;

        /// <summary>
        /// A map of Kubernetes labels which should be applied to nodes in the Default Node Pool.
        /// </summary>
        public InputMap<string> NodeLabels
        {
            get => _nodeLabels ?? (_nodeLabels = new InputMap<string>());
            set => _nodeLabels = value;
        }

        /// <summary>
        /// A `node_network_profile` block as documented below.
        /// </summary>
        [Input("nodeNetworkProfile")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileGetArgs>? NodeNetworkProfile { get; set; }

        /// <summary>
        /// Resource ID for the Public IP Addresses Prefix for the nodes in this Node Pool. `enable_node_public_ip` should be `true`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("nodePublicIpPrefixId")]
        public Input<string>? NodePublicIpPrefixId { get; set; }

        [Input("nodeTaints")]
        private InputList<string>? _nodeTaints;

        /// <summary>
        /// A list of the taints added to new nodes during node pool create and scale. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        public InputList<string> NodeTaints
        {
            get => _nodeTaints ?? (_nodeTaints = new InputList<string>());
            set => _nodeTaints = value;
        }

        /// <summary>
        /// Enabling this option will taint default node pool with `CriticalAddonsOnly=true:NoSchedule` taint. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("onlyCriticalAddonsEnabled")]
        public Input<bool>? OnlyCriticalAddonsEnabled { get; set; }

        /// <summary>
        /// Version of Kubernetes used for the Agents. If not specified, the default node pool will be created with the version specified by `kubernetes_version`. If both are unspecified, the latest recommended version will be used at provisioning time (but won't auto-upgrade). AKS does not require an exact patch version to be specified, minor version aliases such as `1.22` are also supported. - The minor version's latest GA patch is automatically chosen in that case. More details can be found in [the documentation](https://docs.microsoft.com/en-us/azure/aks/supported-kubernetes-versions?tabs=azure-cli#alias-minor-version).
        /// 
        /// &gt; **Note:** This version must be supported by the Kubernetes Cluster - as such the version of Kubernetes used on the Cluster/Control Plane may need to be upgraded first.
        /// </summary>
        [Input("orchestratorVersion")]
        public Input<string>? OrchestratorVersion { get; set; }

        /// <summary>
        /// The size of the OS Disk which should be used for each agent in the Node Pool. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osDiskSizeGb")]
        public Input<int>? OsDiskSizeGb { get; set; }

        /// <summary>
        /// The type of disk which should be used for the Operating System. Possible values are `Ephemeral` and `Managed`. Defaults to `Managed`.  `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osDiskType")]
        public Input<string>? OsDiskType { get; set; }

        /// <summary>
        /// Specifies the OS SKU used by the agent pool. Possible values include: `AzureLinux`, `Ubuntu`, `Windows2019`, `Windows2022`. If not specified, the default is `Ubuntu` if OSType=Linux or `Windows2019` if OSType=Windows. And the default Windows OSSKU will be changed to `Windows2022` after Windows2019 is deprecated. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("osSku")]
        public Input<string>? OsSku { get; set; }

        /// <summary>
        /// The ID of the Subnet where the pods in the default Node Pool should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("podSubnetId")]
        public Input<string>? PodSubnetId { get; set; }

        /// <summary>
        /// The ID of the Proximity Placement Group. Changing this forces a new resource to be created.
        /// </summary>
        [Input("proximityPlacementGroupId")]
        public Input<string>? ProximityPlacementGroupId { get; set; }

        /// <summary>
        /// Specifies the autoscaling behaviour of the Kubernetes Cluster. Allowed values are `Delete` and `Deallocate`. Defaults to `Delete`.
        /// </summary>
        [Input("scaleDownMode")]
        public Input<string>? ScaleDownMode { get; set; }

        /// <summary>
        /// The ID of the Snapshot which should be used to create this default Node Pool. `temporary_name_for_rotation` must be specified when changing this property.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the Node Pool.
        /// 
        /// &gt; At this time there's a bug in the AKS API where Tags for a Node Pool are not stored in the correct case - you may wish to use `ignore_changes` functionality to ignore changes to the casing until this is fixed in the AKS API.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the name of the temporary node pool used to cycle the default node pool for VM resizing.
        /// </summary>
        [Input("temporaryNameForRotation")]
        public Input<string>? TemporaryNameForRotation { get; set; }

        /// <summary>
        /// The type of Node Pool which should be created. Possible values are `AvailabilitySet` and `VirtualMachineScaleSets`. Defaults to `VirtualMachineScaleSets`. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** When creating a cluster that supports multiple node pools, the cluster must use `VirtualMachineScaleSets`. For more information on the limitations of clusters using multiple node pools see [the documentation](https://learn.microsoft.com/en-us/azure/aks/use-multiple-node-pools#limitations).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Used to specify whether the UltraSSD is enabled in the Default Node Pool. Defaults to `false`. See [the documentation](https://docs.microsoft.com/azure/aks/use-ultra-disks) for more information. `temporary_name_for_rotation` must be specified when attempting a change.
        /// </summary>
        [Input("ultraSsdEnabled")]
        public Input<bool>? UltraSsdEnabled { get; set; }

        /// <summary>
        /// A `upgrade_settings` block as documented below.
        /// </summary>
        [Input("upgradeSettings")]
        public Input<Inputs.KubernetesClusterDefaultNodePoolUpgradeSettingsGetArgs>? UpgradeSettings { get; set; }

        /// <summary>
        /// The size of the Virtual Machine, such as `Standard_DS2_v2`. `temporary_name_for_rotation` must be specified when attempting a resize.
        /// </summary>
        [Input("vmSize", required: true)]
        public Input<string> VmSize { get; set; } = null!;

        /// <summary>
        /// The ID of a Subnet where the Kubernetes Node Pool should exist. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** A Route Table must be configured on this Subnet.
        /// </summary>
        [Input("vnetSubnetId")]
        public Input<string>? VnetSubnetId { get; set; }

        /// <summary>
        /// Specifies the workload runtime used by the node pool. Possible values are `OCIContainer` and `KataMshvVmIsolation`.
        /// 
        /// &gt; **Note:** Pod Sandboxing / KataVM Isolation node pools are in Public Preview - more information and details on how to opt into the preview can be found in [this article](https://learn.microsoft.com/azure/aks/use-pod-sandboxing)
        /// </summary>
        [Input("workloadRuntime")]
        public Input<string>? WorkloadRuntime { get; set; }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// Specifies a list of Availability Zones in which this Kubernetes Cluster should be located. `temporary_name_for_rotation` must be specified when changing this property.
        /// 
        /// &gt; **Note:** This requires that the `type` is set to `VirtualMachineScaleSets` and that `load_balancer_sku` is set to `standard`.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public KubernetesClusterDefaultNodePoolGetArgs()
        {
        }
        public static new KubernetesClusterDefaultNodePoolGetArgs Empty => new KubernetesClusterDefaultNodePoolGetArgs();
    }
}
