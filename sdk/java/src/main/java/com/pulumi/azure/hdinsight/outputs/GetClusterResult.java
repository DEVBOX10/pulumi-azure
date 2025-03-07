// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.GetClusterGateway;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * @return The version of HDInsights which is used on this HDInsight Cluster.
     * 
     */
    private String clusterVersion;
    /**
     * @return A map of versions of software used on this HDInsights Cluster.
     * 
     */
    private Map<String,String> componentVersions;
    /**
     * @return The SSH Endpoint of the Edge Node for this HDInsight Cluster, if an Edge Node exists.
     * 
     */
    private String edgeSshEndpoint;
    /**
     * @return A `gateway` block as defined below.
     * 
     */
    private List<GetClusterGateway> gateways;
    /**
     * @return The HTTPS Endpoint for this HDInsight Cluster.
     * 
     */
    private String httpsEndpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Kafka Rest Proxy Endpoint for this HDInsight Cluster.
     * 
     */
    private String kafkaRestProxyEndpoint;
    /**
     * @return The kind of HDInsight Cluster this is, such as a Spark or Storm cluster.
     * 
     */
    private String kind;
    /**
     * @return The Azure Region in which this HDInsight Cluster exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return The SSH Endpoint for this HDInsight Cluster.
     * 
     */
    private String sshEndpoint;
    /**
     * @return A map of tags assigned to the HDInsight Cluster.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The SKU / Tier of this HDInsight Cluster.
     * 
     */
    private String tier;
    /**
     * @return The minimal supported TLS version.
     * 
     */
    private String tlsMinVersion;

    private GetClusterResult() {}
    /**
     * @return The version of HDInsights which is used on this HDInsight Cluster.
     * 
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return A map of versions of software used on this HDInsights Cluster.
     * 
     */
    public Map<String,String> componentVersions() {
        return this.componentVersions;
    }
    /**
     * @return The SSH Endpoint of the Edge Node for this HDInsight Cluster, if an Edge Node exists.
     * 
     */
    public String edgeSshEndpoint() {
        return this.edgeSshEndpoint;
    }
    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public List<GetClusterGateway> gateways() {
        return this.gateways;
    }
    /**
     * @return The HTTPS Endpoint for this HDInsight Cluster.
     * 
     */
    public String httpsEndpoint() {
        return this.httpsEndpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Kafka Rest Proxy Endpoint for this HDInsight Cluster.
     * 
     */
    public String kafkaRestProxyEndpoint() {
        return this.kafkaRestProxyEndpoint;
    }
    /**
     * @return The kind of HDInsight Cluster this is, such as a Spark or Storm cluster.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure Region in which this HDInsight Cluster exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SSH Endpoint for this HDInsight Cluster.
     * 
     */
    public String sshEndpoint() {
        return this.sshEndpoint;
    }
    /**
     * @return A map of tags assigned to the HDInsight Cluster.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The SKU / Tier of this HDInsight Cluster.
     * 
     */
    public String tier() {
        return this.tier;
    }
    /**
     * @return The minimal supported TLS version.
     * 
     */
    public String tlsMinVersion() {
        return this.tlsMinVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterVersion;
        private Map<String,String> componentVersions;
        private String edgeSshEndpoint;
        private List<GetClusterGateway> gateways;
        private String httpsEndpoint;
        private String id;
        private String kafkaRestProxyEndpoint;
        private String kind;
        private String location;
        private String name;
        private String resourceGroupName;
        private String sshEndpoint;
        private Map<String,String> tags;
        private String tier;
        private String tlsMinVersion;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.componentVersions = defaults.componentVersions;
    	      this.edgeSshEndpoint = defaults.edgeSshEndpoint;
    	      this.gateways = defaults.gateways;
    	      this.httpsEndpoint = defaults.httpsEndpoint;
    	      this.id = defaults.id;
    	      this.kafkaRestProxyEndpoint = defaults.kafkaRestProxyEndpoint;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sshEndpoint = defaults.sshEndpoint;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.tlsMinVersion = defaults.tlsMinVersion;
        }

        @CustomType.Setter
        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        @CustomType.Setter
        public Builder componentVersions(Map<String,String> componentVersions) {
            this.componentVersions = Objects.requireNonNull(componentVersions);
            return this;
        }
        @CustomType.Setter
        public Builder edgeSshEndpoint(String edgeSshEndpoint) {
            this.edgeSshEndpoint = Objects.requireNonNull(edgeSshEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder gateways(List<GetClusterGateway> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(GetClusterGateway... gateways) {
            return gateways(List.of(gateways));
        }
        @CustomType.Setter
        public Builder httpsEndpoint(String httpsEndpoint) {
            this.httpsEndpoint = Objects.requireNonNull(httpsEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kafkaRestProxyEndpoint(String kafkaRestProxyEndpoint) {
            this.kafkaRestProxyEndpoint = Objects.requireNonNull(kafkaRestProxyEndpoint);
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder sshEndpoint(String sshEndpoint) {
            this.sshEndpoint = Objects.requireNonNull(sshEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        @CustomType.Setter
        public Builder tlsMinVersion(String tlsMinVersion) {
            this.tlsMinVersion = Objects.requireNonNull(tlsMinVersion);
            return this;
        }
        public GetClusterResult build() {
            final var _resultValue = new GetClusterResult();
            _resultValue.clusterVersion = clusterVersion;
            _resultValue.componentVersions = componentVersions;
            _resultValue.edgeSshEndpoint = edgeSshEndpoint;
            _resultValue.gateways = gateways;
            _resultValue.httpsEndpoint = httpsEndpoint;
            _resultValue.id = id;
            _resultValue.kafkaRestProxyEndpoint = kafkaRestProxyEndpoint;
            _resultValue.kind = kind;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.sshEndpoint = sshEndpoint;
            _resultValue.tags = tags;
            _resultValue.tier = tier;
            _resultValue.tlsMinVersion = tlsMinVersion;
            return _resultValue;
        }
    }
}
