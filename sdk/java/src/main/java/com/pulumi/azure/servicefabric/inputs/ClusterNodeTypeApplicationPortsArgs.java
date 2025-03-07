// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodeTypeApplicationPortsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeTypeApplicationPortsArgs Empty = new ClusterNodeTypeApplicationPortsArgs();

    /**
     * The end of the Application Port Range on this Node Type.
     * 
     */
    @Import(name="endPort", required=true)
    private Output<Integer> endPort;

    /**
     * @return The end of the Application Port Range on this Node Type.
     * 
     */
    public Output<Integer> endPort() {
        return this.endPort;
    }

    /**
     * The start of the Application Port Range on this Node Type.
     * 
     */
    @Import(name="startPort", required=true)
    private Output<Integer> startPort;

    /**
     * @return The start of the Application Port Range on this Node Type.
     * 
     */
    public Output<Integer> startPort() {
        return this.startPort;
    }

    private ClusterNodeTypeApplicationPortsArgs() {}

    private ClusterNodeTypeApplicationPortsArgs(ClusterNodeTypeApplicationPortsArgs $) {
        this.endPort = $.endPort;
        this.startPort = $.startPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeTypeApplicationPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeTypeApplicationPortsArgs $;

        public Builder() {
            $ = new ClusterNodeTypeApplicationPortsArgs();
        }

        public Builder(ClusterNodeTypeApplicationPortsArgs defaults) {
            $ = new ClusterNodeTypeApplicationPortsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endPort The end of the Application Port Range on this Node Type.
         * 
         * @return builder
         * 
         */
        public Builder endPort(Output<Integer> endPort) {
            $.endPort = endPort;
            return this;
        }

        /**
         * @param endPort The end of the Application Port Range on this Node Type.
         * 
         * @return builder
         * 
         */
        public Builder endPort(Integer endPort) {
            return endPort(Output.of(endPort));
        }

        /**
         * @param startPort The start of the Application Port Range on this Node Type.
         * 
         * @return builder
         * 
         */
        public Builder startPort(Output<Integer> startPort) {
            $.startPort = startPort;
            return this;
        }

        /**
         * @param startPort The start of the Application Port Range on this Node Type.
         * 
         * @return builder
         * 
         */
        public Builder startPort(Integer startPort) {
            return startPort(Output.of(startPort));
        }

        public ClusterNodeTypeApplicationPortsArgs build() {
            $.endPort = Objects.requireNonNull($.endPort, "expected parameter 'endPort' to be non-null");
            $.startPort = Objects.requireNonNull($.startPort, "expected parameter 'startPort' to be non-null");
            return $;
        }
    }

}
