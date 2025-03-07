// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiOperationResponseHeader;
import com.pulumi.azure.apimanagement.outputs.ApiOperationResponseRepresentation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiOperationResponse {
    /**
     * @return A description of the HTTP Response, which may include HTML tags.
     * 
     */
    private @Nullable String description;
    /**
     * @return One or more `header` blocks as defined above.
     * 
     */
    private @Nullable List<ApiOperationResponseHeader> headers;
    /**
     * @return One or more `representation` blocks as defined below.
     * 
     */
    private @Nullable List<ApiOperationResponseRepresentation> representations;
    /**
     * @return The HTTP Status Code.
     * 
     */
    private Integer statusCode;

    private ApiOperationResponse() {}
    /**
     * @return A description of the HTTP Response, which may include HTML tags.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return One or more `header` blocks as defined above.
     * 
     */
    public List<ApiOperationResponseHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return One or more `representation` blocks as defined below.
     * 
     */
    public List<ApiOperationResponseRepresentation> representations() {
        return this.representations == null ? List.of() : this.representations;
    }
    /**
     * @return The HTTP Status Code.
     * 
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOperationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<ApiOperationResponseHeader> headers;
        private @Nullable List<ApiOperationResponseRepresentation> representations;
        private Integer statusCode;
        public Builder() {}
        public Builder(ApiOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.representations = defaults.representations;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<ApiOperationResponseHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ApiOperationResponseHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder representations(@Nullable List<ApiOperationResponseRepresentation> representations) {
            this.representations = representations;
            return this;
        }
        public Builder representations(ApiOperationResponseRepresentation... representations) {
            return representations(List.of(representations));
        }
        @CustomType.Setter
        public Builder statusCode(Integer statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public ApiOperationResponse build() {
            final var _resultValue = new ApiOperationResponse();
            _resultValue.description = description;
            _resultValue.headers = headers;
            _resultValue.representations = representations;
            _resultValue.statusCode = statusCode;
            return _resultValue;
        }
    }
}
