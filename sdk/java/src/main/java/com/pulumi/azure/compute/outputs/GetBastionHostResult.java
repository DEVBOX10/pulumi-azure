// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetBastionHostIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBastionHostResult {
    /**
     * @return Is Copy/Paste feature enabled for the Bastion Host.
     * 
     */
    private Boolean copyPasteEnabled;
    /**
     * @return The FQDN for the Bastion Host.
     * 
     */
    private String dnsName;
    /**
     * @return Is File Copy feature enabled for the Bastion Host.
     * 
     */
    private Boolean fileCopyEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `ip_configuration` block as defined below.
     * 
     */
    private List<GetBastionHostIpConfiguration> ipConfigurations;
    /**
     * @return Is IP Connect feature enabled for the Bastion Host.
     * 
     */
    private Boolean ipConnectEnabled;
    /**
     * @return The Azure Region where the Bastion Host exists.
     * 
     */
    private String location;
    /**
     * @return The name of the IP configuration.
     * 
     */
    private String name;
    private String resourceGroupName;
    /**
     * @return The number of scale units provisioned for the Bastion Host.
     * 
     */
    private Integer scaleUnits;
    /**
     * @return Is Shareable Link feature enabled for the Bastion Host.
     * 
     */
    private Boolean shareableLinkEnabled;
    /**
     * @return The SKU of the Bastion Host.
     * 
     */
    private String sku;
    /**
     * @return A mapping of tags assigned to the Bastion Host.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Is Tunneling feature enabled for the Bastion Host.
     * 
     */
    private Boolean tunnelingEnabled;

    private GetBastionHostResult() {}
    /**
     * @return Is Copy/Paste feature enabled for the Bastion Host.
     * 
     */
    public Boolean copyPasteEnabled() {
        return this.copyPasteEnabled;
    }
    /**
     * @return The FQDN for the Bastion Host.
     * 
     */
    public String dnsName() {
        return this.dnsName;
    }
    /**
     * @return Is File Copy feature enabled for the Bastion Host.
     * 
     */
    public Boolean fileCopyEnabled() {
        return this.fileCopyEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `ip_configuration` block as defined below.
     * 
     */
    public List<GetBastionHostIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return Is IP Connect feature enabled for the Bastion Host.
     * 
     */
    public Boolean ipConnectEnabled() {
        return this.ipConnectEnabled;
    }
    /**
     * @return The Azure Region where the Bastion Host exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the IP configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The number of scale units provisioned for the Bastion Host.
     * 
     */
    public Integer scaleUnits() {
        return this.scaleUnits;
    }
    /**
     * @return Is Shareable Link feature enabled for the Bastion Host.
     * 
     */
    public Boolean shareableLinkEnabled() {
        return this.shareableLinkEnabled;
    }
    /**
     * @return The SKU of the Bastion Host.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags assigned to the Bastion Host.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Is Tunneling feature enabled for the Bastion Host.
     * 
     */
    public Boolean tunnelingEnabled() {
        return this.tunnelingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBastionHostResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean copyPasteEnabled;
        private String dnsName;
        private Boolean fileCopyEnabled;
        private String id;
        private List<GetBastionHostIpConfiguration> ipConfigurations;
        private Boolean ipConnectEnabled;
        private String location;
        private String name;
        private String resourceGroupName;
        private Integer scaleUnits;
        private Boolean shareableLinkEnabled;
        private String sku;
        private Map<String,String> tags;
        private Boolean tunnelingEnabled;
        public Builder() {}
        public Builder(GetBastionHostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyPasteEnabled = defaults.copyPasteEnabled;
    	      this.dnsName = defaults.dnsName;
    	      this.fileCopyEnabled = defaults.fileCopyEnabled;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.ipConnectEnabled = defaults.ipConnectEnabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scaleUnits = defaults.scaleUnits;
    	      this.shareableLinkEnabled = defaults.shareableLinkEnabled;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.tunnelingEnabled = defaults.tunnelingEnabled;
        }

        @CustomType.Setter
        public Builder copyPasteEnabled(Boolean copyPasteEnabled) {
            this.copyPasteEnabled = Objects.requireNonNull(copyPasteEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        @CustomType.Setter
        public Builder fileCopyEnabled(Boolean fileCopyEnabled) {
            this.fileCopyEnabled = Objects.requireNonNull(fileCopyEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurations(List<GetBastionHostIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(GetBastionHostIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        @CustomType.Setter
        public Builder ipConnectEnabled(Boolean ipConnectEnabled) {
            this.ipConnectEnabled = Objects.requireNonNull(ipConnectEnabled);
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
        public Builder scaleUnits(Integer scaleUnits) {
            this.scaleUnits = Objects.requireNonNull(scaleUnits);
            return this;
        }
        @CustomType.Setter
        public Builder shareableLinkEnabled(Boolean shareableLinkEnabled) {
            this.shareableLinkEnabled = Objects.requireNonNull(shareableLinkEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder tunnelingEnabled(Boolean tunnelingEnabled) {
            this.tunnelingEnabled = Objects.requireNonNull(tunnelingEnabled);
            return this;
        }
        public GetBastionHostResult build() {
            final var _resultValue = new GetBastionHostResult();
            _resultValue.copyPasteEnabled = copyPasteEnabled;
            _resultValue.dnsName = dnsName;
            _resultValue.fileCopyEnabled = fileCopyEnabled;
            _resultValue.id = id;
            _resultValue.ipConfigurations = ipConfigurations;
            _resultValue.ipConnectEnabled = ipConnectEnabled;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.scaleUnits = scaleUnits;
            _resultValue.shareableLinkEnabled = shareableLinkEnabled;
            _resultValue.sku = sku;
            _resultValue.tags = tags;
            _resultValue.tunnelingEnabled = tunnelingEnabled;
            return _resultValue;
        }
    }
}
