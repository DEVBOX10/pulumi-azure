// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterWindowsProfileGmsaArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterWindowsProfileGmsaArgs Empty = new KubernetesClusterWindowsProfileGmsaArgs();

    /**
     * Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     */
    @Import(name="dnsServer", required=true)
    private Output<String> dnsServer;

    /**
     * @return Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     */
    public Output<String> dnsServer() {
        return this.dnsServer;
    }

    /**
     * Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
     * 
     */
    @Import(name="rootDomain", required=true)
    private Output<String> rootDomain;

    /**
     * @return Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
     * 
     */
    public Output<String> rootDomain() {
        return this.rootDomain;
    }

    private KubernetesClusterWindowsProfileGmsaArgs() {}

    private KubernetesClusterWindowsProfileGmsaArgs(KubernetesClusterWindowsProfileGmsaArgs $) {
        this.dnsServer = $.dnsServer;
        this.rootDomain = $.rootDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterWindowsProfileGmsaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterWindowsProfileGmsaArgs $;

        public Builder() {
            $ = new KubernetesClusterWindowsProfileGmsaArgs();
        }

        public Builder(KubernetesClusterWindowsProfileGmsaArgs defaults) {
            $ = new KubernetesClusterWindowsProfileGmsaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsServer Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
         * 
         * @return builder
         * 
         */
        public Builder dnsServer(Output<String> dnsServer) {
            $.dnsServer = dnsServer;
            return this;
        }

        /**
         * @param dnsServer Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
         * 
         * @return builder
         * 
         */
        public Builder dnsServer(String dnsServer) {
            return dnsServer(Output.of(dnsServer));
        }

        /**
         * @param rootDomain Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
         * 
         * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
         * 
         * @return builder
         * 
         */
        public Builder rootDomain(Output<String> rootDomain) {
            $.rootDomain = rootDomain;
            return this;
        }

        /**
         * @param rootDomain Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
         * 
         * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
         * 
         * @return builder
         * 
         */
        public Builder rootDomain(String rootDomain) {
            return rootDomain(Output.of(rootDomain));
        }

        public KubernetesClusterWindowsProfileGmsaArgs build() {
            $.dnsServer = Objects.requireNonNull($.dnsServer, "expected parameter 'dnsServer' to be non-null");
            $.rootDomain = Objects.requireNonNull($.rootDomain, "expected parameter 'rootDomain' to be non-null");
            return $;
        }
    }

}
