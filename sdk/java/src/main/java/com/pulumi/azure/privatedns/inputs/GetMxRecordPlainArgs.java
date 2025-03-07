// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMxRecordPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMxRecordPlainArgs Empty = new GetMxRecordPlainArgs();

    /**
     * The name of the Private DNS MX Record.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Private DNS MX Record.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the resource group where the Private DNS Zone (parent resource) exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the resource group where the Private DNS Zone (parent resource) exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the Private DNS Zone where the resource exists.
     * 
     */
    @Import(name="zoneName", required=true)
    private String zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists.
     * 
     */
    public String zoneName() {
        return this.zoneName;
    }

    private GetMxRecordPlainArgs() {}

    private GetMxRecordPlainArgs(GetMxRecordPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMxRecordPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMxRecordPlainArgs $;

        public Builder() {
            $ = new GetMxRecordPlainArgs();
        }

        public Builder(GetMxRecordPlainArgs defaults) {
            $ = new GetMxRecordPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Private DNS MX Record.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group where the Private DNS Zone (parent resource) exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param zoneName Specifies the Private DNS Zone where the resource exists.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        public GetMxRecordPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}
