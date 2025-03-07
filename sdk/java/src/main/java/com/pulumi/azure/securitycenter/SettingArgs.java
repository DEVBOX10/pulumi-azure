// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class SettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingArgs Empty = new SettingArgs();

    /**
     * Boolean flag to enable/disable data access.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Boolean flag to enable/disable data access.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The setting to manage. Possible values are `MCAS` , `WDATP` and `SENTINEL`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="settingName", required=true)
    private Output<String> settingName;

    /**
     * @return The setting to manage. Possible values are `MCAS` , `WDATP` and `SENTINEL`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> settingName() {
        return this.settingName;
    }

    private SettingArgs() {}

    private SettingArgs(SettingArgs $) {
        this.enabled = $.enabled;
        this.settingName = $.settingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingArgs $;

        public Builder() {
            $ = new SettingArgs();
        }

        public Builder(SettingArgs defaults) {
            $ = new SettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean flag to enable/disable data access.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean flag to enable/disable data access.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param settingName The setting to manage. Possible values are `MCAS` , `WDATP` and `SENTINEL`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder settingName(Output<String> settingName) {
            $.settingName = settingName;
            return this;
        }

        /**
         * @param settingName The setting to manage. Possible values are `MCAS` , `WDATP` and `SENTINEL`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder settingName(String settingName) {
            return settingName(Output.of(settingName));
        }

        public SettingArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.settingName = Objects.requireNonNull($.settingName, "expected parameter 'settingName' to be non-null");
            return $;
        }
    }

}
