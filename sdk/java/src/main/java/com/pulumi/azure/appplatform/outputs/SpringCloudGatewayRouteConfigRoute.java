// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudGatewayRouteConfigRoute {
    /**
     * @return Specifies the classification tags which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private @Nullable List<String> classificationTags;
    /**
     * @return Specifies the description which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private @Nullable String description;
    /**
     * @return Specifies a list of filters which are used to modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    private @Nullable List<String> filters;
    /**
     * @return Specifies the route processing order.
     * 
     */
    private Integer order;
    /**
     * @return Specifies a list of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    private @Nullable List<String> predicates;
    /**
     * @return Should the sso validation be enabled?
     * 
     */
    private @Nullable Boolean ssoValidationEnabled;
    /**
     * @return Specifies the title which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private @Nullable String title;
    /**
     * @return Should pass currently-authenticated user&#39;s identity token to application service?
     * 
     */
    private @Nullable Boolean tokenRelay;
    /**
     * @return Specifies the full uri which will override `appName`.
     * 
     */
    private @Nullable String uri;

    private SpringCloudGatewayRouteConfigRoute() {}
    /**
     * @return Specifies the classification tags which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public List<String> classificationTags() {
        return this.classificationTags == null ? List.of() : this.classificationTags;
    }
    /**
     * @return Specifies the description which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies a list of filters which are used to modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    public List<String> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Specifies the route processing order.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return Specifies a list of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    public List<String> predicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * @return Should the sso validation be enabled?
     * 
     */
    public Optional<Boolean> ssoValidationEnabled() {
        return Optional.ofNullable(this.ssoValidationEnabled);
    }
    /**
     * @return Specifies the title which will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return Should pass currently-authenticated user&#39;s identity token to application service?
     * 
     */
    public Optional<Boolean> tokenRelay() {
        return Optional.ofNullable(this.tokenRelay);
    }
    /**
     * @return Specifies the full uri which will override `appName`.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudGatewayRouteConfigRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> classificationTags;
        private @Nullable String description;
        private @Nullable List<String> filters;
        private Integer order;
        private @Nullable List<String> predicates;
        private @Nullable Boolean ssoValidationEnabled;
        private @Nullable String title;
        private @Nullable Boolean tokenRelay;
        private @Nullable String uri;
        public Builder() {}
        public Builder(SpringCloudGatewayRouteConfigRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationTags = defaults.classificationTags;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.order = defaults.order;
    	      this.predicates = defaults.predicates;
    	      this.ssoValidationEnabled = defaults.ssoValidationEnabled;
    	      this.title = defaults.title;
    	      this.tokenRelay = defaults.tokenRelay;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder classificationTags(@Nullable List<String> classificationTags) {
            this.classificationTags = classificationTags;
            return this;
        }
        public Builder classificationTags(String... classificationTags) {
            return classificationTags(List.of(classificationTags));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        @CustomType.Setter
        public Builder predicates(@Nullable List<String> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(String... predicates) {
            return predicates(List.of(predicates));
        }
        @CustomType.Setter
        public Builder ssoValidationEnabled(@Nullable Boolean ssoValidationEnabled) {
            this.ssoValidationEnabled = ssoValidationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder tokenRelay(@Nullable Boolean tokenRelay) {
            this.tokenRelay = tokenRelay;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public SpringCloudGatewayRouteConfigRoute build() {
            final var _resultValue = new SpringCloudGatewayRouteConfigRoute();
            _resultValue.classificationTags = classificationTags;
            _resultValue.description = description;
            _resultValue.filters = filters;
            _resultValue.order = order;
            _resultValue.predicates = predicates;
            _resultValue.ssoValidationEnabled = ssoValidationEnabled;
            _resultValue.title = title;
            _resultValue.tokenRelay = tokenRelay;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
