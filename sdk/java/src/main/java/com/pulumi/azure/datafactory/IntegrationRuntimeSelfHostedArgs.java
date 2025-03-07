// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.datafactory.inputs.IntegrationRuntimeSelfHostedRbacAuthorizationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRuntimeSelfHostedArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSelfHostedArgs Empty = new IntegrationRuntimeSelfHostedArgs();

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId", required=true)
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="rbacAuthorizations")
    private @Nullable Output<List<IntegrationRuntimeSelfHostedRbacAuthorizationArgs>> rbacAuthorizations;

    /**
     * @return A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<IntegrationRuntimeSelfHostedRbacAuthorizationArgs>>> rbacAuthorizations() {
        return Optional.ofNullable(this.rbacAuthorizations);
    }

    private IntegrationRuntimeSelfHostedArgs() {}

    private IntegrationRuntimeSelfHostedArgs(IntegrationRuntimeSelfHostedArgs $) {
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.name = $.name;
        this.rbacAuthorizations = $.rbacAuthorizations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeSelfHostedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeSelfHostedArgs $;

        public Builder() {
            $ = new IntegrationRuntimeSelfHostedArgs();
        }

        public Builder(IntegrationRuntimeSelfHostedArgs defaults) {
            $ = new IntegrationRuntimeSelfHostedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(Output<String> dataFactoryId) {
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
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Data Factory. Changing this forces a new Data Factory Self-hosted Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rbacAuthorizations A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder rbacAuthorizations(@Nullable Output<List<IntegrationRuntimeSelfHostedRbacAuthorizationArgs>> rbacAuthorizations) {
            $.rbacAuthorizations = rbacAuthorizations;
            return this;
        }

        /**
         * @param rbacAuthorizations A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder rbacAuthorizations(List<IntegrationRuntimeSelfHostedRbacAuthorizationArgs> rbacAuthorizations) {
            return rbacAuthorizations(Output.of(rbacAuthorizations));
        }

        /**
         * @param rbacAuthorizations A `rbac_authorization` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder rbacAuthorizations(IntegrationRuntimeSelfHostedRbacAuthorizationArgs... rbacAuthorizations) {
            return rbacAuthorizations(List.of(rbacAuthorizations));
        }

        public IntegrationRuntimeSelfHostedArgs build() {
            $.dataFactoryId = Objects.requireNonNull($.dataFactoryId, "expected parameter 'dataFactoryId' to be non-null");
            return $;
        }
    }

}
