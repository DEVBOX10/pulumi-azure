// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs;
import com.pulumi.azure.mssql.inputs.ManagedInstanceTransparentDataEncryptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the transparent data encryption configuration for a MSSQL Managed Instance
 * 
 * &gt; **NOTE:** Once transparent data encryption(TDE) is enabled on a MS SQL instance, it is not possible to remove TDE. You will be able to switch between &#39;ServiceManaged&#39; and &#39;CustomerManaged&#39; keys, but will not be able to remove encryption. For safety when this resource is deleted, the TDE mode will automatically be set to &#39;ServiceManaged&#39;. See `key_vault_uri` for more information on how to specify the key types. As SQL Managed Instance only supports a single configuration for encryption settings, this resource will replace the current encryption settings on the server.
 * 
 * &gt; **Note:** See [documentation](https://docs.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview) for important information on how handle lifecycle management of the keys to prevent data lockout.
 * 
 * ## Example Usage
 * ### With Service Managed Key
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
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.mssql.ManagedInstance;
 * import com.pulumi.azure.mssql.ManagedInstanceArgs;
 * import com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs;
 * import com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryption;
 * import com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs;
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
 *             .location(&#34;EastUs&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(azurerm_resource_group.test().location())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.0.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;managedinstancedelegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Sql/managedInstances&#34;)
 *                     .actions(                    
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/prepareNetworkPolicies/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/unprepareNetworkPolicies/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleManagedInstance = new ManagedInstance(&#34;exampleManagedInstance&#34;, ManagedInstanceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .licenseType(&#34;BasePrice&#34;)
 *             .skuName(&#34;GP_Gen5&#34;)
 *             .storageSizeInGb(32)
 *             .subnetId(exampleSubnet.id())
 *             .vcores(4)
 *             .administratorLogin(&#34;missadministrator&#34;)
 *             .administratorLoginPassword(&#34;NCC-1701-D&#34;)
 *             .identity(ManagedInstanceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleManagedInstanceTransparentDataEncryption = new ManagedInstanceTransparentDataEncryption(&#34;exampleManagedInstanceTransparentDataEncryption&#34;, ManagedInstanceTransparentDataEncryptionArgs.builder()        
 *             .managedInstanceId(exampleManagedInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Customer Managed Key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.mssql.ManagedInstance;
 * import com.pulumi.azure.mssql.ManagedInstanceArgs;
 * import com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs;
 * import com.pulumi.azure.keyvault.KeyVault;
 * import com.pulumi.azure.keyvault.KeyVaultArgs;
 * import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
 * import com.pulumi.azure.keyvault.Key;
 * import com.pulumi.azure.keyvault.KeyArgs;
 * import com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryption;
 * import com.pulumi.azure.mssql.ManagedInstanceTransparentDataEncryptionArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;EastUs&#34;)
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(azurerm_resource_group.test().location())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.0.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;managedinstancedelegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.Sql/managedInstances&#34;)
 *                     .actions(                    
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/join/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/prepareNetworkPolicies/action&#34;,
 *                         &#34;Microsoft.Network/virtualNetworks/subnets/unprepareNetworkPolicies/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleManagedInstance = new ManagedInstance(&#34;exampleManagedInstance&#34;, ManagedInstanceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .licenseType(&#34;BasePrice&#34;)
 *             .skuName(&#34;GP_Gen5&#34;)
 *             .storageSizeInGb(32)
 *             .subnetId(exampleSubnet.id())
 *             .vcores(4)
 *             .administratorLogin(&#34;missadministrator&#34;)
 *             .administratorLoginPassword(&#34;NCC-1701-D&#34;)
 *             .identity(ManagedInstanceIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .enabledForDiskEncryption(true)
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .softDeleteRetentionDays(7)
 *             .purgeProtectionEnabled(false)
 *             .skuName(&#34;standard&#34;)
 *             .accessPolicies(            
 *                 KeyVaultAccessPolicyArgs.builder()
 *                     .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *                     .objectId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.objectId()))
 *                     .keyPermissions(                    
 *                         &#34;Get&#34;,
 *                         &#34;List&#34;,
 *                         &#34;Create&#34;,
 *                         &#34;Delete&#34;,
 *                         &#34;Update&#34;,
 *                         &#34;Recover&#34;,
 *                         &#34;Purge&#34;,
 *                         &#34;GetRotationPolicy&#34;)
 *                     .build(),
 *                 KeyVaultAccessPolicyArgs.builder()
 *                     .tenantId(exampleManagedInstance.identity().applyValue(identity -&gt; identity.tenantId()))
 *                     .objectId(exampleManagedInstance.identity().applyValue(identity -&gt; identity.principalId()))
 *                     .keyPermissions(                    
 *                         &#34;Get&#34;,
 *                         &#34;WrapKey&#34;,
 *                         &#34;UnwrapKey&#34;)
 *                     .build())
 *             .build());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.id())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;unwrapKey&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleKeyVault)
 *                 .build());
 * 
 *         var exampleManagedInstanceTransparentDataEncryption = new ManagedInstanceTransparentDataEncryption(&#34;exampleManagedInstanceTransparentDataEncryption&#34;, ManagedInstanceTransparentDataEncryptionArgs.builder()        
 *             .managedInstanceId(exampleManagedInstance.id())
 *             .keyVaultKeyId(exampleKey.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SQL Managed Instance Transparent Data Encryption can be imported using the resource id, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/managedInstanceTransparentDataEncryption:ManagedInstanceTransparentDataEncryption example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Sql/managedInstances/instance1/encryptionProtector/current
 * ```
 * 
 */
@ResourceType(type="azure:mssql/managedInstanceTransparentDataEncryption:ManagedInstanceTransparentDataEncryption")
public class ManagedInstanceTransparentDataEncryption extends com.pulumi.resources.CustomResource {
    /**
     * When enabled, the SQL Managed Instance will continuously check the key vault for any new versions of the key being used as the TDE protector. If a new version of the key is detected, the TDE protector on the SQL Managed Instance will be automatically rotated to the latest key version within 60 minutes.
     * 
     */
    @Export(name="autoRotationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRotationEnabled;

    /**
     * @return When enabled, the SQL Managed Instance will continuously check the key vault for any new versions of the key being used as the TDE protector. If a new version of the key is detected, the TDE protector on the SQL Managed Instance will be automatically rotated to the latest key version within 60 minutes.
     * 
     */
    public Output<Optional<Boolean>> autoRotationEnabled() {
        return Codegen.optional(this.autoRotationEnabled);
    }
    /**
     * To use customer managed keys from Azure Key Vault, provide the AKV Key ID. To use service managed keys, omit this field.
     * 
     * &gt; **NOTE:** In order to use customer managed keys, the identity of the MSSQL Managed Instance must have the following permissions on the key vault: &#39;get&#39;, &#39;wrapKey&#39; and &#39;unwrapKey&#39;
     * 
     * &gt; **NOTE:** If `managed_instance_id` denotes a secondary instance deployed for disaster recovery purposes, then the `key_vault_key_id` should be the same key used for the primary instance&#39;s transparent data encryption. Both primary and secondary instances should be encrypted with same key material.
     * 
     */
    @Export(name="keyVaultKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyVaultKeyId;

    /**
     * @return To use customer managed keys from Azure Key Vault, provide the AKV Key ID. To use service managed keys, omit this field.
     * 
     * &gt; **NOTE:** In order to use customer managed keys, the identity of the MSSQL Managed Instance must have the following permissions on the key vault: &#39;get&#39;, &#39;wrapKey&#39; and &#39;unwrapKey&#39;
     * 
     * &gt; **NOTE:** If `managed_instance_id` denotes a secondary instance deployed for disaster recovery purposes, then the `key_vault_key_id` should be the same key used for the primary instance&#39;s transparent data encryption. Both primary and secondary instances should be encrypted with same key material.
     * 
     */
    public Output<Optional<String>> keyVaultKeyId() {
        return Codegen.optional(this.keyVaultKeyId);
    }
    /**
     * Specifies the name of the MS SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="managedInstanceId", refs={String.class}, tree="[0]")
    private Output<String> managedInstanceId;

    /**
     * @return Specifies the name of the MS SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managedInstanceId() {
        return this.managedInstanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedInstanceTransparentDataEncryption(String name) {
        this(name, ManagedInstanceTransparentDataEncryptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedInstanceTransparentDataEncryption(String name, ManagedInstanceTransparentDataEncryptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedInstanceTransparentDataEncryption(String name, ManagedInstanceTransparentDataEncryptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/managedInstanceTransparentDataEncryption:ManagedInstanceTransparentDataEncryption", name, args == null ? ManagedInstanceTransparentDataEncryptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedInstanceTransparentDataEncryption(String name, Output<String> id, @Nullable ManagedInstanceTransparentDataEncryptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/managedInstanceTransparentDataEncryption:ManagedInstanceTransparentDataEncryption", name, state, makeResourceOptions(options, id));
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
    public static ManagedInstanceTransparentDataEncryption get(String name, Output<String> id, @Nullable ManagedInstanceTransparentDataEncryptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstanceTransparentDataEncryption(name, id, state, options);
    }
}
