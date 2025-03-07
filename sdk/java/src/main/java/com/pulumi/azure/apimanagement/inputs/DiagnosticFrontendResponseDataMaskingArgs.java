// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingHeaderArgs;
import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseDataMaskingQueryParamArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiagnosticFrontendResponseDataMaskingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticFrontendResponseDataMaskingArgs Empty = new DiagnosticFrontendResponseDataMaskingArgs();

    /**
     * A `headers` block as defined below.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<DiagnosticFrontendResponseDataMaskingHeaderArgs>> headers;

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public Optional<Output<List<DiagnosticFrontendResponseDataMaskingHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A `query_params` block as defined below.
     * 
     */
    @Import(name="queryParams")
    private @Nullable Output<List<DiagnosticFrontendResponseDataMaskingQueryParamArgs>> queryParams;

    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public Optional<Output<List<DiagnosticFrontendResponseDataMaskingQueryParamArgs>>> queryParams() {
        return Optional.ofNullable(this.queryParams);
    }

    private DiagnosticFrontendResponseDataMaskingArgs() {}

    private DiagnosticFrontendResponseDataMaskingArgs(DiagnosticFrontendResponseDataMaskingArgs $) {
        this.headers = $.headers;
        this.queryParams = $.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticFrontendResponseDataMaskingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticFrontendResponseDataMaskingArgs $;

        public Builder() {
            $ = new DiagnosticFrontendResponseDataMaskingArgs();
        }

        public Builder(DiagnosticFrontendResponseDataMaskingArgs defaults) {
            $ = new DiagnosticFrontendResponseDataMaskingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<DiagnosticFrontendResponseDataMaskingHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<DiagnosticFrontendResponseDataMaskingHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers A `headers` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder headers(DiagnosticFrontendResponseDataMaskingHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(@Nullable Output<List<DiagnosticFrontendResponseDataMaskingQueryParamArgs>> queryParams) {
            $.queryParams = queryParams;
            return this;
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(List<DiagnosticFrontendResponseDataMaskingQueryParamArgs> queryParams) {
            return queryParams(Output.of(queryParams));
        }

        /**
         * @param queryParams A `query_params` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder queryParams(DiagnosticFrontendResponseDataMaskingQueryParamArgs... queryParams) {
            return queryParams(List.of(queryParams));
        }

        public DiagnosticFrontendResponseDataMaskingArgs build() {
            return $;
        }
    }

}
