# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BackupVaultArgs', 'BackupVault']

@pulumi.input_type
class BackupVaultArgs:
    def __init__(__self__, *,
                 datastore_type: pulumi.Input[str],
                 redundancy: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 identity: Optional[pulumi.Input['BackupVaultIdentityArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a BackupVault resource.
        :param pulumi.Input[str] datastore_type: Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] redundancy: Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input['BackupVaultIdentityArgs'] identity: An `identity` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] name: Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Backup Vault.
        """
        pulumi.set(__self__, "datastore_type", datastore_type)
        pulumi.set(__self__, "redundancy", redundancy)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="datastoreType")
    def datastore_type(self) -> pulumi.Input[str]:
        """
        Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "datastore_type")

    @datastore_type.setter
    def datastore_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "datastore_type", value)

    @property
    @pulumi.getter
    def redundancy(self) -> pulumi.Input[str]:
        """
        Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "redundancy")

    @redundancy.setter
    def redundancy(self, value: pulumi.Input[str]):
        pulumi.set(self, "redundancy", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['BackupVaultIdentityArgs']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['BackupVaultIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Backup Vault.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _BackupVaultState:
    def __init__(__self__, *,
                 datastore_type: Optional[pulumi.Input[str]] = None,
                 identity: Optional[pulumi.Input['BackupVaultIdentityArgs']] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redundancy: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering BackupVault resources.
        :param pulumi.Input[str] datastore_type: Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        :param pulumi.Input['BackupVaultIdentityArgs'] identity: An `identity` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] name: Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] redundancy: Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Backup Vault.
        """
        if datastore_type is not None:
            pulumi.set(__self__, "datastore_type", datastore_type)
        if identity is not None:
            pulumi.set(__self__, "identity", identity)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if redundancy is not None:
            pulumi.set(__self__, "redundancy", redundancy)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="datastoreType")
    def datastore_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "datastore_type")

    @datastore_type.setter
    def datastore_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_type", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input['BackupVaultIdentityArgs']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input['BackupVaultIdentityArgs']]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def redundancy(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "redundancy")

    @redundancy.setter
    def redundancy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redundancy", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Backup Vault.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class BackupVault(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datastore_type: Optional[pulumi.Input[str]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['BackupVaultIdentityArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redundancy: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages a Backup Vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_backup_vault = azure.dataprotection.BackupVault("exampleBackupVault",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant")
        ```

        ## Import

        Backup Vaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:dataprotection/backupVault:BackupVault example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datastore_type: Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        :param pulumi.Input[pulumi.InputType['BackupVaultIdentityArgs']] identity: An `identity` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] name: Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] redundancy: Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Backup Vault.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupVaultArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Backup Vault.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_backup_vault = azure.dataprotection.BackupVault("exampleBackupVault",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            datastore_type="VaultStore",
            redundancy="LocallyRedundant")
        ```

        ## Import

        Backup Vaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:dataprotection/backupVault:BackupVault example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1
        ```

        :param str resource_name: The name of the resource.
        :param BackupVaultArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupVaultArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 datastore_type: Optional[pulumi.Input[str]] = None,
                 identity: Optional[pulumi.Input[pulumi.InputType['BackupVaultIdentityArgs']]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redundancy: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BackupVaultArgs.__new__(BackupVaultArgs)

            if datastore_type is None and not opts.urn:
                raise TypeError("Missing required property 'datastore_type'")
            __props__.__dict__["datastore_type"] = datastore_type
            __props__.__dict__["identity"] = identity
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            if redundancy is None and not opts.urn:
                raise TypeError("Missing required property 'redundancy'")
            __props__.__dict__["redundancy"] = redundancy
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
        super(BackupVault, __self__).__init__(
            'azure:dataprotection/backupVault:BackupVault',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            datastore_type: Optional[pulumi.Input[str]] = None,
            identity: Optional[pulumi.Input[pulumi.InputType['BackupVaultIdentityArgs']]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            redundancy: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'BackupVault':
        """
        Get an existing BackupVault resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] datastore_type: Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        :param pulumi.Input[pulumi.InputType['BackupVaultIdentityArgs']] identity: An `identity` block as defined below.
        :param pulumi.Input[str] location: The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] name: Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] redundancy: Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[str] resource_group_name: The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Backup Vault.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BackupVaultState.__new__(_BackupVaultState)

        __props__.__dict__["datastore_type"] = datastore_type
        __props__.__dict__["identity"] = identity
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["redundancy"] = redundancy
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return BackupVault(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="datastoreType")
    def datastore_type(self) -> pulumi.Output[str]:
        """
        Specifies the type of the data store. Possible values are `ArchiveStore`, `SnapshotStore` and `VaultStore`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "datastore_type")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output[Optional['outputs.BackupVaultIdentity']]:
        """
        An `identity` block as defined below.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The Azure Region where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Backup Vault. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def redundancy(self) -> pulumi.Output[str]:
        """
        Specifies the backup storage redundancy. Possible values are `GeoRedundant` and `LocallyRedundant`. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "redundancy")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The name of the Resource Group where the Backup Vault should exist. Changing this forces a new Backup Vault to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the Backup Vault.
        """
        return pulumi.get(self, "tags")

