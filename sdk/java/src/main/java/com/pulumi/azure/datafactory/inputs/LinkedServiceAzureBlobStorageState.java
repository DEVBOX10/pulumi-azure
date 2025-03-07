// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceAzureBlobStorageState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceAzureBlobStorageState Empty = new LinkedServiceAzureBlobStorageState();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to Azure Blob Storage Linked Service:
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     * The following supported arguments are specific to Azure Blob Storage Linked Service:
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The connection string. Conflicts with `connection_string_insecure`, `sas_uri` and `service_endpoint`.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string. Conflicts with `connection_string_insecure`, `sas_uri` and `service_endpoint`.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The connection string sent insecurely. Conflicts with `connection_string`, `sas_uri` and `service_endpoint`.
     * 
     * &gt; **Note:** `connection_string` uses the Azure [SecureString](https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.management.datafactory.models.securestring) to encrypt the contents within the REST payload sent to Azure whilst the `connection_string_insecure` is sent as a regular string. Both properties are still sent using SSL/HTTPS. At this time the portal will not decrypt Secure Strings so the `connection_string` property in the portal will show as `******` whilst `connection_string_insecure` will be viewable in the portal.
     * 
     */
    @Import(name="connectionStringInsecure")
    private @Nullable Output<String> connectionStringInsecure;

    /**
     * @return The connection string sent insecurely. Conflicts with `connection_string`, `sas_uri` and `service_endpoint`.
     * 
     * &gt; **Note:** `connection_string` uses the Azure [SecureString](https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.management.datafactory.models.securestring) to encrypt the contents within the REST payload sent to Azure whilst the `connection_string_insecure` is sent as a regular string. Both properties are still sent using SSL/HTTPS. At this time the portal will not decrypt Secure Strings so the `connection_string` property in the portal will show as `******` whilst `connection_string_insecure` will be viewable in the portal.
     * 
     */
    public Optional<Output<String>> connectionStringInsecure() {
        return Optional.ofNullable(this.connectionStringInsecure);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * A `key_vault_sas_token` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sas_uri` is required.
     * 
     */
    @Import(name="keyVaultSasToken")
    private @Nullable Output<LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs> keyVaultSasToken;

    /**
     * @return A `key_vault_sas_token` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sas_uri` is required.
     * 
     */
    public Optional<Output<LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs>> keyVaultSasToken() {
        return Optional.ofNullable(this.keyVaultSasToken);
    }

    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The SAS URI. Conflicts with `connection_string_insecure`, `connection_string` and `service_endpoint`.
     * 
     */
    @Import(name="sasUri")
    private @Nullable Output<String> sasUri;

    /**
     * @return The SAS URI. Conflicts with `connection_string_insecure`, `connection_string` and `service_endpoint`.
     * 
     */
    public Optional<Output<String>> sasUri() {
        return Optional.ofNullable(this.sasUri);
    }

    /**
     * The Service Endpoint. Conflicts with `connection_string`, `connection_string_insecure` and `sas_uri`.
     * 
     */
    @Import(name="serviceEndpoint")
    private @Nullable Output<String> serviceEndpoint;

    /**
     * @return The Service Endpoint. Conflicts with `connection_string`, `connection_string_insecure` and `sas_uri`.
     * 
     */
    public Optional<Output<String>> serviceEndpoint() {
        return Optional.ofNullable(this.serviceEndpoint);
    }

    /**
     * The service principal id in which to authenticate against the Azure Blob Storage account.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<String> servicePrincipalId;

    /**
     * @return The service principal id in which to authenticate against the Azure Blob Storage account.
     * 
     */
    public Optional<Output<String>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The service principal key in which to authenticate against the AAzure Blob Storage account.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<String> servicePrincipalKey;

    /**
     * @return The service principal key in which to authenticate against the AAzure Blob Storage account.
     * 
     */
    public Optional<Output<String>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * A `service_principal_linked_key_vault_key` block as defined below. Use this argument to store Service Principal key in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    @Import(name="servicePrincipalLinkedKeyVaultKey")
    private @Nullable Output<LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs> servicePrincipalLinkedKeyVaultKey;

    /**
     * @return A `service_principal_linked_key_vault_key` block as defined below. Use this argument to store Service Principal key in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    public Optional<Output<LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs>> servicePrincipalLinkedKeyVaultKey() {
        return Optional.ofNullable(this.servicePrincipalLinkedKeyVaultKey);
    }

    /**
     * Specify the kind of the storage account. Allowed values are `Storage`, `StorageV2`, `BlobStorage` and `BlockBlobStorage`.
     * 
     */
    @Import(name="storageKind")
    private @Nullable Output<String> storageKind;

    /**
     * @return Specify the kind of the storage account. Allowed values are `Storage`, `StorageV2`, `BlobStorage` and `BlockBlobStorage`.
     * 
     */
    public Optional<Output<String>> storageKind() {
        return Optional.ofNullable(this.storageKind);
    }

    /**
     * The tenant id or name in which to authenticate against the Azure Blob Storage account.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id or name in which to authenticate against the Azure Blob Storage account.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure Blob Storage account. Incompatible with `service_principal_id` and `service_principal_key`.
     * 
     */
    @Import(name="useManagedIdentity")
    private @Nullable Output<Boolean> useManagedIdentity;

    /**
     * @return Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure Blob Storage account. Incompatible with `service_principal_id` and `service_principal_key`.
     * 
     */
    public Optional<Output<Boolean>> useManagedIdentity() {
        return Optional.ofNullable(this.useManagedIdentity);
    }

    private LinkedServiceAzureBlobStorageState() {}

    private LinkedServiceAzureBlobStorageState(LinkedServiceAzureBlobStorageState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.connectionString = $.connectionString;
        this.connectionStringInsecure = $.connectionStringInsecure;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.keyVaultSasToken = $.keyVaultSasToken;
        this.name = $.name;
        this.parameters = $.parameters;
        this.sasUri = $.sasUri;
        this.serviceEndpoint = $.serviceEndpoint;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.servicePrincipalLinkedKeyVaultKey = $.servicePrincipalLinkedKeyVaultKey;
        this.storageKind = $.storageKind;
        this.tenantId = $.tenantId;
        this.useManagedIdentity = $.useManagedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceAzureBlobStorageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceAzureBlobStorageState $;

        public Builder() {
            $ = new LinkedServiceAzureBlobStorageState();
        }

        public Builder(LinkedServiceAzureBlobStorageState defaults) {
            $ = new LinkedServiceAzureBlobStorageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * The following supported arguments are specific to Azure Blob Storage Linked Service:
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * The following supported arguments are specific to Azure Blob Storage Linked Service:
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectionString The connection string. Conflicts with `connection_string_insecure`, `sas_uri` and `service_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string. Conflicts with `connection_string_insecure`, `sas_uri` and `service_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param connectionStringInsecure The connection string sent insecurely. Conflicts with `connection_string`, `sas_uri` and `service_endpoint`.
         * 
         * &gt; **Note:** `connection_string` uses the Azure [SecureString](https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.management.datafactory.models.securestring) to encrypt the contents within the REST payload sent to Azure whilst the `connection_string_insecure` is sent as a regular string. Both properties are still sent using SSL/HTTPS. At this time the portal will not decrypt Secure Strings so the `connection_string` property in the portal will show as `******` whilst `connection_string_insecure` will be viewable in the portal.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringInsecure(@Nullable Output<String> connectionStringInsecure) {
            $.connectionStringInsecure = connectionStringInsecure;
            return this;
        }

        /**
         * @param connectionStringInsecure The connection string sent insecurely. Conflicts with `connection_string`, `sas_uri` and `service_endpoint`.
         * 
         * &gt; **Note:** `connection_string` uses the Azure [SecureString](https://learn.microsoft.com/en-us/dotnet/api/microsoft.azure.management.datafactory.models.securestring) to encrypt the contents within the REST payload sent to Azure whilst the `connection_string_insecure` is sent as a regular string. Both properties are still sent using SSL/HTTPS. At this time the portal will not decrypt Secure Strings so the `connection_string` property in the portal will show as `******` whilst `connection_string_insecure` will be viewable in the portal.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringInsecure(String connectionStringInsecure) {
            return connectionStringInsecure(Output.of(connectionStringInsecure));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param keyVaultSasToken A `key_vault_sas_token` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sas_uri` is required.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSasToken(@Nullable Output<LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs> keyVaultSasToken) {
            $.keyVaultSasToken = keyVaultSasToken;
            return this;
        }

        /**
         * @param keyVaultSasToken A `key_vault_sas_token` block as defined below. Use this argument to store SAS Token in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. A `sas_uri` is required.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSasToken(LinkedServiceAzureBlobStorageKeyVaultSasTokenArgs keyVaultSasToken) {
            return keyVaultSasToken(Output.of(keyVaultSasToken));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param sasUri The SAS URI. Conflicts with `connection_string_insecure`, `connection_string` and `service_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder sasUri(@Nullable Output<String> sasUri) {
            $.sasUri = sasUri;
            return this;
        }

        /**
         * @param sasUri The SAS URI. Conflicts with `connection_string_insecure`, `connection_string` and `service_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder sasUri(String sasUri) {
            return sasUri(Output.of(sasUri));
        }

        /**
         * @param serviceEndpoint The Service Endpoint. Conflicts with `connection_string`, `connection_string_insecure` and `sas_uri`.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoint(@Nullable Output<String> serviceEndpoint) {
            $.serviceEndpoint = serviceEndpoint;
            return this;
        }

        /**
         * @param serviceEndpoint The Service Endpoint. Conflicts with `connection_string`, `connection_string_insecure` and `sas_uri`.
         * 
         * @return builder
         * 
         */
        public Builder serviceEndpoint(String serviceEndpoint) {
            return serviceEndpoint(Output.of(serviceEndpoint));
        }

        /**
         * @param servicePrincipalId The service principal id in which to authenticate against the Azure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The service principal id in which to authenticate against the Azure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey The service principal key in which to authenticate against the AAzure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Output<String> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The service principal key in which to authenticate against the AAzure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(String servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalLinkedKeyVaultKey A `service_principal_linked_key_vault_key` block as defined below. Use this argument to store Service Principal key in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalLinkedKeyVaultKey(@Nullable Output<LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs> servicePrincipalLinkedKeyVaultKey) {
            $.servicePrincipalLinkedKeyVaultKey = servicePrincipalLinkedKeyVaultKey;
            return this;
        }

        /**
         * @param servicePrincipalLinkedKeyVaultKey A `service_principal_linked_key_vault_key` block as defined below. Use this argument to store Service Principal key in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalLinkedKeyVaultKey(LinkedServiceAzureBlobStorageServicePrincipalLinkedKeyVaultKeyArgs servicePrincipalLinkedKeyVaultKey) {
            return servicePrincipalLinkedKeyVaultKey(Output.of(servicePrincipalLinkedKeyVaultKey));
        }

        /**
         * @param storageKind Specify the kind of the storage account. Allowed values are `Storage`, `StorageV2`, `BlobStorage` and `BlockBlobStorage`.
         * 
         * @return builder
         * 
         */
        public Builder storageKind(@Nullable Output<String> storageKind) {
            $.storageKind = storageKind;
            return this;
        }

        /**
         * @param storageKind Specify the kind of the storage account. Allowed values are `Storage`, `StorageV2`, `BlobStorage` and `BlockBlobStorage`.
         * 
         * @return builder
         * 
         */
        public Builder storageKind(String storageKind) {
            return storageKind(Output.of(storageKind));
        }

        /**
         * @param tenantId The tenant id or name in which to authenticate against the Azure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id or name in which to authenticate against the Azure Blob Storage account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param useManagedIdentity Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure Blob Storage account. Incompatible with `service_principal_id` and `service_principal_key`.
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentity(@Nullable Output<Boolean> useManagedIdentity) {
            $.useManagedIdentity = useManagedIdentity;
            return this;
        }

        /**
         * @param useManagedIdentity Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure Blob Storage account. Incompatible with `service_principal_id` and `service_principal_key`.
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentity(Boolean useManagedIdentity) {
            return useManagedIdentity(Output.of(useManagedIdentity));
        }

        public LinkedServiceAzureBlobStorageState build() {
            return $;
        }
    }

}
