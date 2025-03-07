// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.role.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRoleDefinitionPermission {
    /**
     * @return a list of actions supported by this role
     * 
     */
    private List<String> actions;
    private @Nullable List<String> dataActions;
    /**
     * @return a list of actions which are denied by this role
     * 
     */
    private List<String> notActions;
    private @Nullable List<String> notDataActions;

    private GetRoleDefinitionPermission() {}
    /**
     * @return a list of actions supported by this role
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    public List<String> dataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }
    /**
     * @return a list of actions which are denied by this role
     * 
     */
    public List<String> notActions() {
        return this.notActions;
    }
    public List<String> notDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleDefinitionPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private @Nullable List<String> dataActions;
        private List<String> notActions;
        private @Nullable List<String> notDataActions;
        public Builder() {}
        public Builder(GetRoleDefinitionPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.dataActions = defaults.dataActions;
    	      this.notActions = defaults.notActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder dataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }
        public Builder dataActions(String... dataActions) {
            return dataActions(List.of(dataActions));
        }
        @CustomType.Setter
        public Builder notActions(List<String> notActions) {
            this.notActions = Objects.requireNonNull(notActions);
            return this;
        }
        public Builder notActions(String... notActions) {
            return notActions(List.of(notActions));
        }
        @CustomType.Setter
        public Builder notDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }
        public Builder notDataActions(String... notDataActions) {
            return notDataActions(List.of(notDataActions));
        }
        public GetRoleDefinitionPermission build() {
            final var _resultValue = new GetRoleDefinitionPermission();
            _resultValue.actions = actions;
            _resultValue.dataActions = dataActions;
            _resultValue.notActions = notActions;
            _resultValue.notDataActions = notDataActions;
            return _resultValue;
        }
    }
}
