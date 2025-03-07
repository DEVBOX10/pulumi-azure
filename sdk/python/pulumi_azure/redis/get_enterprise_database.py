# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetEnterpriseDatabaseResult',
    'AwaitableGetEnterpriseDatabaseResult',
    'get_enterprise_database',
    'get_enterprise_database_output',
]

@pulumi.output_type
class GetEnterpriseDatabaseResult:
    """
    A collection of values returned by getEnterpriseDatabase.
    """
    def __init__(__self__, cluster_id=None, id=None, linked_database_group_nickname=None, linked_database_ids=None, name=None, primary_access_key=None, resource_group_name=None, secondary_access_key=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if linked_database_group_nickname and not isinstance(linked_database_group_nickname, str):
            raise TypeError("Expected argument 'linked_database_group_nickname' to be a str")
        pulumi.set(__self__, "linked_database_group_nickname", linked_database_group_nickname)
        if linked_database_ids and not isinstance(linked_database_ids, list):
            raise TypeError("Expected argument 'linked_database_ids' to be a list")
        pulumi.set(__self__, "linked_database_ids", linked_database_ids)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if primary_access_key and not isinstance(primary_access_key, str):
            raise TypeError("Expected argument 'primary_access_key' to be a str")
        pulumi.set(__self__, "primary_access_key", primary_access_key)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if secondary_access_key and not isinstance(secondary_access_key, str):
            raise TypeError("Expected argument 'secondary_access_key' to be a str")
        pulumi.set(__self__, "secondary_access_key", secondary_access_key)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        """
        The Redis Enterprise Cluster ID that is hosting the Redis Enterprise Database.
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="linkedDatabaseGroupNickname")
    def linked_database_group_nickname(self) -> str:
        """
        The Linked Database Group Nickname for the Redis Enterprise Database instance.
        """
        return pulumi.get(self, "linked_database_group_nickname")

    @property
    @pulumi.getter(name="linkedDatabaseIds")
    def linked_database_ids(self) -> Sequence[str]:
        """
        The Linked Database list for the Redis Enterprise Database instance.
        """
        return pulumi.get(self, "linked_database_ids")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Redis Enterprise Database name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="primaryAccessKey")
    def primary_access_key(self) -> str:
        """
        The Primary Access Key for the Redis Enterprise Database instance.
        """
        return pulumi.get(self, "primary_access_key")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        warnings.warn("""This field is no longer used and will be removed in the next major version of the Azure Provider""", DeprecationWarning)
        pulumi.log.warn("""resource_group_name is deprecated: This field is no longer used and will be removed in the next major version of the Azure Provider""")

        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="secondaryAccessKey")
    def secondary_access_key(self) -> str:
        """
        The Secondary Access Key for the Redis Enterprise Database instance.
        """
        return pulumi.get(self, "secondary_access_key")


class AwaitableGetEnterpriseDatabaseResult(GetEnterpriseDatabaseResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnterpriseDatabaseResult(
            cluster_id=self.cluster_id,
            id=self.id,
            linked_database_group_nickname=self.linked_database_group_nickname,
            linked_database_ids=self.linked_database_ids,
            name=self.name,
            primary_access_key=self.primary_access_key,
            resource_group_name=self.resource_group_name,
            secondary_access_key=self.secondary_access_key)


def get_enterprise_database(cluster_id: Optional[str] = None,
                            name: Optional[str] = None,
                            resource_group_name: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnterpriseDatabaseResult:
    """
    Use this data source to access information about an existing Redis Enterprise Database

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.redis.get_enterprise_database(name="default",
        resource_group_name=azurerm_resource_group["example"]["name"],
        cluster_id=azurerm_redis_enterprise_cluster["example"]["id"])
    pulumi.export("redisEnterpriseDatabasePrimaryKey", example.primary_access_key)
    pulumi.export("redisEnterpriseDatabaseSecondaryKey", example.secondary_access_key)
    ```


    :param str cluster_id: The resource ID of Redis Enterprise Cluster which hosts the Redis Enterprise Database instance.
    :param str name: The name of the Redis Enterprise Database.
    :param str resource_group_name: The name of the resource group the Redis Enterprise Database instance is located in.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['name'] = name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:redis/getEnterpriseDatabase:getEnterpriseDatabase', __args__, opts=opts, typ=GetEnterpriseDatabaseResult).value

    return AwaitableGetEnterpriseDatabaseResult(
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'),
        linked_database_group_nickname=pulumi.get(__ret__, 'linked_database_group_nickname'),
        linked_database_ids=pulumi.get(__ret__, 'linked_database_ids'),
        name=pulumi.get(__ret__, 'name'),
        primary_access_key=pulumi.get(__ret__, 'primary_access_key'),
        resource_group_name=pulumi.get(__ret__, 'resource_group_name'),
        secondary_access_key=pulumi.get(__ret__, 'secondary_access_key'))


@_utilities.lift_output_func(get_enterprise_database)
def get_enterprise_database_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                   name: Optional[pulumi.Input[str]] = None,
                                   resource_group_name: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnterpriseDatabaseResult]:
    """
    Use this data source to access information about an existing Redis Enterprise Database

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.redis.get_enterprise_database(name="default",
        resource_group_name=azurerm_resource_group["example"]["name"],
        cluster_id=azurerm_redis_enterprise_cluster["example"]["id"])
    pulumi.export("redisEnterpriseDatabasePrimaryKey", example.primary_access_key)
    pulumi.export("redisEnterpriseDatabaseSecondaryKey", example.secondary_access_key)
    ```


    :param str cluster_id: The resource ID of Redis Enterprise Cluster which hosts the Redis Enterprise Database instance.
    :param str name: The name of the Redis Enterprise Database.
    :param str resource_group_name: The name of the resource group the Redis Enterprise Database instance is located in.
    """
    ...
