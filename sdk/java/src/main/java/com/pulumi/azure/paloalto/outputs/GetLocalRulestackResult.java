// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLocalRulestackResult {
    private String antiSpywareProfile;
    private String antiVirusProfile;
    private String description;
    private String dnsSubscription;
    private String fileBlockingProfile;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    private String name;
    private String outboundTrustCertificate;
    private String outboundUntrustCertificate;
    private String resourceGroupName;
    private String urlFilteringProfile;
    private String vulnerabilityProfile;

    private GetLocalRulestackResult() {}
    public String antiSpywareProfile() {
        return this.antiSpywareProfile;
    }
    public String antiVirusProfile() {
        return this.antiVirusProfile;
    }
    public String description() {
        return this.description;
    }
    public String dnsSubscription() {
        return this.dnsSubscription;
    }
    public String fileBlockingProfile() {
        return this.fileBlockingProfile;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String outboundTrustCertificate() {
        return this.outboundTrustCertificate;
    }
    public String outboundUntrustCertificate() {
        return this.outboundUntrustCertificate;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String urlFilteringProfile() {
        return this.urlFilteringProfile;
    }
    public String vulnerabilityProfile() {
        return this.vulnerabilityProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalRulestackResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String antiSpywareProfile;
        private String antiVirusProfile;
        private String description;
        private String dnsSubscription;
        private String fileBlockingProfile;
        private String id;
        private String location;
        private String name;
        private String outboundTrustCertificate;
        private String outboundUntrustCertificate;
        private String resourceGroupName;
        private String urlFilteringProfile;
        private String vulnerabilityProfile;
        public Builder() {}
        public Builder(GetLocalRulestackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiSpywareProfile = defaults.antiSpywareProfile;
    	      this.antiVirusProfile = defaults.antiVirusProfile;
    	      this.description = defaults.description;
    	      this.dnsSubscription = defaults.dnsSubscription;
    	      this.fileBlockingProfile = defaults.fileBlockingProfile;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundTrustCertificate = defaults.outboundTrustCertificate;
    	      this.outboundUntrustCertificate = defaults.outboundUntrustCertificate;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.urlFilteringProfile = defaults.urlFilteringProfile;
    	      this.vulnerabilityProfile = defaults.vulnerabilityProfile;
        }

        @CustomType.Setter
        public Builder antiSpywareProfile(String antiSpywareProfile) {
            this.antiSpywareProfile = Objects.requireNonNull(antiSpywareProfile);
            return this;
        }
        @CustomType.Setter
        public Builder antiVirusProfile(String antiVirusProfile) {
            this.antiVirusProfile = Objects.requireNonNull(antiVirusProfile);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder dnsSubscription(String dnsSubscription) {
            this.dnsSubscription = Objects.requireNonNull(dnsSubscription);
            return this;
        }
        @CustomType.Setter
        public Builder fileBlockingProfile(String fileBlockingProfile) {
            this.fileBlockingProfile = Objects.requireNonNull(fileBlockingProfile);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder outboundTrustCertificate(String outboundTrustCertificate) {
            this.outboundTrustCertificate = Objects.requireNonNull(outboundTrustCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder outboundUntrustCertificate(String outboundUntrustCertificate) {
            this.outboundUntrustCertificate = Objects.requireNonNull(outboundUntrustCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder urlFilteringProfile(String urlFilteringProfile) {
            this.urlFilteringProfile = Objects.requireNonNull(urlFilteringProfile);
            return this;
        }
        @CustomType.Setter
        public Builder vulnerabilityProfile(String vulnerabilityProfile) {
            this.vulnerabilityProfile = Objects.requireNonNull(vulnerabilityProfile);
            return this;
        }
        public GetLocalRulestackResult build() {
            final var _resultValue = new GetLocalRulestackResult();
            _resultValue.antiSpywareProfile = antiSpywareProfile;
            _resultValue.antiVirusProfile = antiVirusProfile;
            _resultValue.description = description;
            _resultValue.dnsSubscription = dnsSubscription;
            _resultValue.fileBlockingProfile = fileBlockingProfile;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.outboundTrustCertificate = outboundTrustCertificate;
            _resultValue.outboundUntrustCertificate = outboundUntrustCertificate;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.urlFilteringProfile = urlFilteringProfile;
            _resultValue.vulnerabilityProfile = vulnerabilityProfile;
            return _resultValue;
        }
    }
}
