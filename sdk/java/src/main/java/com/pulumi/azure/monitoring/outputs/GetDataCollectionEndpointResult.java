// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDataCollectionEndpointResult {
    /**
     * @return The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    private String configurationAccessEndpoint;
    /**
     * @return Specifies a description for the Data Collection Endpoint.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    private String kind;
    /**
     * @return The Azure Region where the Data Collection Endpoint should exist.
     * 
     */
    private String location;
    /**
     * @return The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    private String logsIngestionEndpoint;
    private String name;
    /**
     * @return Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
     * 
     */
    private Boolean publicNetworkAccessEnabled;
    private String resourceGroupName;
    /**
     * @return A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    private Map<String,String> tags;

    private GetDataCollectionEndpointResult() {}
    /**
     * @return The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    public String configurationAccessEndpoint() {
        return this.configurationAccessEndpoint;
    }
    /**
     * @return Specifies a description for the Data Collection Endpoint.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure Region where the Data Collection Endpoint should exist.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    public String logsIngestionEndpoint() {
        return this.logsIngestionEndpoint;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
     * 
     */
    public Boolean publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configurationAccessEndpoint;
        private String description;
        private String id;
        private String kind;
        private String location;
        private String logsIngestionEndpoint;
        private String name;
        private Boolean publicNetworkAccessEnabled;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetDataCollectionEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAccessEndpoint = defaults.configurationAccessEndpoint;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.logsIngestionEndpoint = defaults.logsIngestionEndpoint;
    	      this.name = defaults.name;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder configurationAccessEndpoint(String configurationAccessEndpoint) {
            this.configurationAccessEndpoint = Objects.requireNonNull(configurationAccessEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder logsIngestionEndpoint(String logsIngestionEndpoint) {
            this.logsIngestionEndpoint = Objects.requireNonNull(logsIngestionEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            this.publicNetworkAccessEnabled = Objects.requireNonNull(publicNetworkAccessEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetDataCollectionEndpointResult build() {
            final var _resultValue = new GetDataCollectionEndpointResult();
            _resultValue.configurationAccessEndpoint = configurationAccessEndpoint;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.location = location;
            _resultValue.logsIngestionEndpoint = logsIngestionEndpoint;
            _resultValue.name = name;
            _resultValue.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
