// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsWebAppLogHttpLogAzureBlobStorage;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppLogHttpLogFileSystem;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppLogHttpLog {
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    private List<GetWindowsWebAppLogHttpLogAzureBlobStorage> azureBlobStorages;
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    private List<GetWindowsWebAppLogHttpLogFileSystem> fileSystems;

    private GetWindowsWebAppLogHttpLog() {}
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    public List<GetWindowsWebAppLogHttpLogAzureBlobStorage> azureBlobStorages() {
        return this.azureBlobStorages;
    }
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    public List<GetWindowsWebAppLogHttpLogFileSystem> fileSystems() {
        return this.fileSystems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppLogHttpLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWindowsWebAppLogHttpLogAzureBlobStorage> azureBlobStorages;
        private List<GetWindowsWebAppLogHttpLogFileSystem> fileSystems;
        public Builder() {}
        public Builder(GetWindowsWebAppLogHttpLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorages = defaults.azureBlobStorages;
    	      this.fileSystems = defaults.fileSystems;
        }

        @CustomType.Setter
        public Builder azureBlobStorages(List<GetWindowsWebAppLogHttpLogAzureBlobStorage> azureBlobStorages) {
            this.azureBlobStorages = Objects.requireNonNull(azureBlobStorages);
            return this;
        }
        public Builder azureBlobStorages(GetWindowsWebAppLogHttpLogAzureBlobStorage... azureBlobStorages) {
            return azureBlobStorages(List.of(azureBlobStorages));
        }
        @CustomType.Setter
        public Builder fileSystems(List<GetWindowsWebAppLogHttpLogFileSystem> fileSystems) {
            this.fileSystems = Objects.requireNonNull(fileSystems);
            return this;
        }
        public Builder fileSystems(GetWindowsWebAppLogHttpLogFileSystem... fileSystems) {
            return fileSystems(List.of(fileSystems));
        }
        public GetWindowsWebAppLogHttpLog build() {
            final var _resultValue = new GetWindowsWebAppLogHttpLog();
            _resultValue.azureBlobStorages = azureBlobStorages;
            _resultValue.fileSystems = fileSystems;
            return _resultValue;
        }
    }
}
