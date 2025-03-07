# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SpringCloudAppRedisAssociationArgs', 'SpringCloudAppRedisAssociation']

@pulumi.input_type
class SpringCloudAppRedisAssociationArgs:
    def __init__(__self__, *,
                 redis_access_key: pulumi.Input[str],
                 redis_cache_id: pulumi.Input[str],
                 spring_cloud_app_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 ssl_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SpringCloudAppRedisAssociation resource.
        :param pulumi.Input[str] redis_access_key: Specifies the Redis Cache access key.
        :param pulumi.Input[str] redis_cache_id: Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] ssl_enabled: Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        pulumi.set(__self__, "redis_access_key", redis_access_key)
        pulumi.set(__self__, "redis_cache_id", redis_cache_id)
        pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ssl_enabled is not None:
            pulumi.set(__self__, "ssl_enabled", ssl_enabled)

    @property
    @pulumi.getter(name="redisAccessKey")
    def redis_access_key(self) -> pulumi.Input[str]:
        """
        Specifies the Redis Cache access key.
        """
        return pulumi.get(self, "redis_access_key")

    @redis_access_key.setter
    def redis_access_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "redis_access_key", value)

    @property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> pulumi.Input[str]:
        """
        Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "redis_cache_id")

    @redis_cache_id.setter
    def redis_cache_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "redis_cache_id", value)

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Input[str]:
        """
        Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "spring_cloud_app_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sslEnabled")
    def ssl_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        return pulumi.get(self, "ssl_enabled")

    @ssl_enabled.setter
    def ssl_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl_enabled", value)


@pulumi.input_type
class _SpringCloudAppRedisAssociationState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 redis_access_key: Optional[pulumi.Input[str]] = None,
                 redis_cache_id: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
                 ssl_enabled: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SpringCloudAppRedisAssociation resources.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] redis_access_key: Specifies the Redis Cache access key.
        :param pulumi.Input[str] redis_cache_id: Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] ssl_enabled: Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if redis_access_key is not None:
            pulumi.set(__self__, "redis_access_key", redis_access_key)
        if redis_cache_id is not None:
            pulumi.set(__self__, "redis_cache_id", redis_cache_id)
        if spring_cloud_app_id is not None:
            pulumi.set(__self__, "spring_cloud_app_id", spring_cloud_app_id)
        if ssl_enabled is not None:
            pulumi.set(__self__, "ssl_enabled", ssl_enabled)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="redisAccessKey")
    def redis_access_key(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Redis Cache access key.
        """
        return pulumi.get(self, "redis_access_key")

    @redis_access_key.setter
    def redis_access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redis_access_key", value)

    @property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "redis_cache_id")

    @redis_cache_id.setter
    def redis_cache_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redis_cache_id", value)

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @spring_cloud_app_id.setter
    def spring_cloud_app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spring_cloud_app_id", value)

    @property
    @pulumi.getter(name="sslEnabled")
    def ssl_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        return pulumi.get(self, "ssl_enabled")

    @ssl_enabled.setter
    def ssl_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl_enabled", value)


class SpringCloudAppRedisAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redis_access_key: Optional[pulumi.Input[str]] = None,
                 redis_cache_id: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
                 ssl_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Associates a Spring Cloud Application with a Redis Cache.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("exampleSpringCloudApp",
            resource_group_name=example_resource_group.name,
            service_name=example_spring_cloud_service.name)
        example_cache = azure.redis.Cache("exampleCache",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            capacity=0,
            family="C",
            sku_name="Basic",
            enable_non_ssl_port=True)
        example_spring_cloud_app_redis_association = azure.appplatform.SpringCloudAppRedisAssociation("exampleSpringCloudAppRedisAssociation",
            spring_cloud_app_id=example_spring_cloud_app.id,
            redis_cache_id=example_cache.id,
            redis_access_key=example_cache.primary_access_key,
            ssl_enabled=True)
        ```

        ## Import

        Spring Cloud Application Redis Association can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.AppPlatform/spring/myservice/apps/myapp/bindings/bind1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] redis_access_key: Specifies the Redis Cache access key.
        :param pulumi.Input[str] redis_cache_id: Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] ssl_enabled: Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpringCloudAppRedisAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Associates a Spring Cloud Application with a Redis Cache.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location)
        example_spring_cloud_app = azure.appplatform.SpringCloudApp("exampleSpringCloudApp",
            resource_group_name=example_resource_group.name,
            service_name=example_spring_cloud_service.name)
        example_cache = azure.redis.Cache("exampleCache",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            capacity=0,
            family="C",
            sku_name="Basic",
            enable_non_ssl_port=True)
        example_spring_cloud_app_redis_association = azure.appplatform.SpringCloudAppRedisAssociation("exampleSpringCloudAppRedisAssociation",
            spring_cloud_app_id=example_spring_cloud_app.id,
            redis_cache_id=example_cache.id,
            redis_access_key=example_cache.primary_access_key,
            ssl_enabled=True)
        ```

        ## Import

        Spring Cloud Application Redis Association can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.AppPlatform/spring/myservice/apps/myapp/bindings/bind1
        ```

        :param str resource_name: The name of the resource.
        :param SpringCloudAppRedisAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpringCloudAppRedisAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 redis_access_key: Optional[pulumi.Input[str]] = None,
                 redis_cache_id: Optional[pulumi.Input[str]] = None,
                 spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
                 ssl_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpringCloudAppRedisAssociationArgs.__new__(SpringCloudAppRedisAssociationArgs)

            __props__.__dict__["name"] = name
            if redis_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'redis_access_key'")
            __props__.__dict__["redis_access_key"] = redis_access_key
            if redis_cache_id is None and not opts.urn:
                raise TypeError("Missing required property 'redis_cache_id'")
            __props__.__dict__["redis_cache_id"] = redis_cache_id
            if spring_cloud_app_id is None and not opts.urn:
                raise TypeError("Missing required property 'spring_cloud_app_id'")
            __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
            __props__.__dict__["ssl_enabled"] = ssl_enabled
        super(SpringCloudAppRedisAssociation, __self__).__init__(
            'azure:appplatform/springCloudAppRedisAssociation:SpringCloudAppRedisAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            redis_access_key: Optional[pulumi.Input[str]] = None,
            redis_cache_id: Optional[pulumi.Input[str]] = None,
            spring_cloud_app_id: Optional[pulumi.Input[str]] = None,
            ssl_enabled: Optional[pulumi.Input[bool]] = None) -> 'SpringCloudAppRedisAssociation':
        """
        Get an existing SpringCloudAppRedisAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        :param pulumi.Input[str] redis_access_key: Specifies the Redis Cache access key.
        :param pulumi.Input[str] redis_cache_id: Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        :param pulumi.Input[str] spring_cloud_app_id: Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] ssl_enabled: Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpringCloudAppRedisAssociationState.__new__(_SpringCloudAppRedisAssociationState)

        __props__.__dict__["name"] = name
        __props__.__dict__["redis_access_key"] = redis_access_key
        __props__.__dict__["redis_cache_id"] = redis_cache_id
        __props__.__dict__["spring_cloud_app_id"] = spring_cloud_app_id
        __props__.__dict__["ssl_enabled"] = ssl_enabled
        return SpringCloudAppRedisAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="redisAccessKey")
    def redis_access_key(self) -> pulumi.Output[str]:
        """
        Specifies the Redis Cache access key.
        """
        return pulumi.get(self, "redis_access_key")

    @property
    @pulumi.getter(name="redisCacheId")
    def redis_cache_id(self) -> pulumi.Output[str]:
        """
        Specifies the Redis Cache resource ID. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "redis_cache_id")

    @property
    @pulumi.getter(name="springCloudAppId")
    def spring_cloud_app_id(self) -> pulumi.Output[str]:
        """
        Specifies the Spring Cloud Application resource ID in which the Association is created. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "spring_cloud_app_id")

    @property
    @pulumi.getter(name="sslEnabled")
    def ssl_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Should SSL be used when connecting to Redis? Defaults to `true`.
        """
        return pulumi.get(self, "ssl_enabled")

