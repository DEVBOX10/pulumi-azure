// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:compute/availabilitySet:AvailabilitySet":
		r = &AvailabilitySet{}
	case "azure:compute/bastionHost:BastionHost":
		r = &BastionHost{}
	case "azure:compute/capacityReservation:CapacityReservation":
		r = &CapacityReservation{}
	case "azure:compute/capacityReservationGroup:CapacityReservationGroup":
		r = &CapacityReservationGroup{}
	case "azure:compute/dataDiskAttachment:DataDiskAttachment":
		r = &DataDiskAttachment{}
	case "azure:compute/dedicatedHost:DedicatedHost":
		r = &DedicatedHost{}
	case "azure:compute/dedicatedHostGroup:DedicatedHostGroup":
		r = &DedicatedHostGroup{}
	case "azure:compute/diskAccess:DiskAccess":
		r = &DiskAccess{}
	case "azure:compute/diskEncryptionSet:DiskEncryptionSet":
		r = &DiskEncryptionSet{}
	case "azure:compute/diskPool:DiskPool":
		r = &DiskPool{}
	case "azure:compute/diskPoolIscsiTarget:DiskPoolIscsiTarget":
		r = &DiskPoolIscsiTarget{}
	case "azure:compute/diskPoolIscsiTargetLun:DiskPoolIscsiTargetLun":
		r = &DiskPoolIscsiTargetLun{}
	case "azure:compute/diskPoolManagedDiskAttachment:DiskPoolManagedDiskAttachment":
		r = &DiskPoolManagedDiskAttachment{}
	case "azure:compute/extension:Extension":
		r = &Extension{}
	case "azure:compute/galleryApplication:GalleryApplication":
		r = &GalleryApplication{}
	case "azure:compute/galleryApplicationVersion:GalleryApplicationVersion":
		r = &GalleryApplicationVersion{}
	case "azure:compute/image:Image":
		r = &Image{}
	case "azure:compute/linuxVirtualMachine:LinuxVirtualMachine":
		r = &LinuxVirtualMachine{}
	case "azure:compute/linuxVirtualMachineScaleSet:LinuxVirtualMachineScaleSet":
		r = &LinuxVirtualMachineScaleSet{}
	case "azure:compute/managedDisk:ManagedDisk":
		r = &ManagedDisk{}
	case "azure:compute/managedDiskSasToken:ManagedDiskSasToken":
		r = &ManagedDiskSasToken{}
	case "azure:compute/orchestratedVirtualMachineScaleSet:OrchestratedVirtualMachineScaleSet":
		r = &OrchestratedVirtualMachineScaleSet{}
	case "azure:compute/packetCapture:PacketCapture":
		r = &PacketCapture{}
	case "azure:compute/scaleSet:ScaleSet":
		r = &ScaleSet{}
	case "azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture":
		r = &ScaleSetPacketCapture{}
	case "azure:compute/sharedImage:SharedImage":
		r = &SharedImage{}
	case "azure:compute/sharedImageGallery:SharedImageGallery":
		r = &SharedImageGallery{}
	case "azure:compute/sharedImageVersion:SharedImageVersion":
		r = &SharedImageVersion{}
	case "azure:compute/snapshot:Snapshot":
		r = &Snapshot{}
	case "azure:compute/sshPublicKey:SshPublicKey":
		r = &SshPublicKey{}
	case "azure:compute/virtualMachine:VirtualMachine":
		r = &VirtualMachine{}
	case "azure:compute/virtualMachineScaleSetExtension:VirtualMachineScaleSetExtension":
		r = &VirtualMachineScaleSetExtension{}
	case "azure:compute/windowsVirtualMachine:WindowsVirtualMachine":
		r = &WindowsVirtualMachine{}
	case "azure:compute/windowsVirtualMachineScaleSet:WindowsVirtualMachineScaleSet":
		r = &WindowsVirtualMachineScaleSet{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"azure",
		"compute/availabilitySet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/bastionHost",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/capacityReservation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/capacityReservationGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/dataDiskAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/dedicatedHost",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/dedicatedHostGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskAccess",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskEncryptionSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskPoolIscsiTarget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskPoolIscsiTargetLun",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/diskPoolManagedDiskAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/extension",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/galleryApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/galleryApplicationVersion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/linuxVirtualMachine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/linuxVirtualMachineScaleSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/managedDisk",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/managedDiskSasToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/orchestratedVirtualMachineScaleSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/packetCapture",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/scaleSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/scaleSetPacketCapture",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/sharedImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/sharedImageGallery",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/sharedImageVersion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/snapshot",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/sshPublicKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/virtualMachine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/virtualMachineScaleSetExtension",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/windowsVirtualMachine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"compute/windowsVirtualMachineScaleSet",
		&module{version},
	)
}
