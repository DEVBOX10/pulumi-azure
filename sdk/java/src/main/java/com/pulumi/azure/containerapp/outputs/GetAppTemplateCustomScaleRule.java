// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.GetAppTemplateCustomScaleRuleAuthentication;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAppTemplateCustomScaleRule {
    private List<GetAppTemplateCustomScaleRuleAuthentication> authentications;
    private String customRuleType;
    private Map<String,String> metadata;
    /**
     * @return The name of the Container App.
     * 
     */
    private String name;

    private GetAppTemplateCustomScaleRule() {}
    public List<GetAppTemplateCustomScaleRuleAuthentication> authentications() {
        return this.authentications;
    }
    public String customRuleType() {
        return this.customRuleType;
    }
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the Container App.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppTemplateCustomScaleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAppTemplateCustomScaleRuleAuthentication> authentications;
        private String customRuleType;
        private Map<String,String> metadata;
        private String name;
        public Builder() {}
        public Builder(GetAppTemplateCustomScaleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentications = defaults.authentications;
    	      this.customRuleType = defaults.customRuleType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authentications(List<GetAppTemplateCustomScaleRuleAuthentication> authentications) {
            this.authentications = Objects.requireNonNull(authentications);
            return this;
        }
        public Builder authentications(GetAppTemplateCustomScaleRuleAuthentication... authentications) {
            return authentications(List.of(authentications));
        }
        @CustomType.Setter
        public Builder customRuleType(String customRuleType) {
            this.customRuleType = Objects.requireNonNull(customRuleType);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAppTemplateCustomScaleRule build() {
            final var _resultValue = new GetAppTemplateCustomScaleRule();
            _resultValue.authentications = authentications;
            _resultValue.customRuleType = customRuleType;
            _resultValue.metadata = metadata;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
