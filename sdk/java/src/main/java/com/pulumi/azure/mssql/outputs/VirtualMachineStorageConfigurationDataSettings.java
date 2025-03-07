// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VirtualMachineStorageConfigurationDataSettings {
    /**
     * @return The SQL Server default path
     * 
     */
    private String defaultFilePath;
    /**
     * @return A list of Logical Unit Numbers for the disks.
     * 
     */
    private List<Integer> luns;

    private VirtualMachineStorageConfigurationDataSettings() {}
    /**
     * @return The SQL Server default path
     * 
     */
    public String defaultFilePath() {
        return this.defaultFilePath;
    }
    /**
     * @return A list of Logical Unit Numbers for the disks.
     * 
     */
    public List<Integer> luns() {
        return this.luns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineStorageConfigurationDataSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultFilePath;
        private List<Integer> luns;
        public Builder() {}
        public Builder(VirtualMachineStorageConfigurationDataSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultFilePath = defaults.defaultFilePath;
    	      this.luns = defaults.luns;
        }

        @CustomType.Setter
        public Builder defaultFilePath(String defaultFilePath) {
            this.defaultFilePath = Objects.requireNonNull(defaultFilePath);
            return this;
        }
        @CustomType.Setter
        public Builder luns(List<Integer> luns) {
            this.luns = Objects.requireNonNull(luns);
            return this;
        }
        public Builder luns(Integer... luns) {
            return luns(List.of(luns));
        }
        public VirtualMachineStorageConfigurationDataSettings build() {
            final var _resultValue = new VirtualMachineStorageConfigurationDataSettings();
            _resultValue.defaultFilePath = defaultFilePath;
            _resultValue.luns = luns;
            return _resultValue;
        }
    }
}
