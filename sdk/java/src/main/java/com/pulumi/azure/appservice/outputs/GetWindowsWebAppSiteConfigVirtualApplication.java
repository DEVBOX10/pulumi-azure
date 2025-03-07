// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigVirtualApplication {
    /**
     * @return The path on disk to the Virtual Directory
     * 
     */
    private String physicalPath;
    /**
     * @return Is this Application Pre-loaded at startup.
     * 
     */
    private Boolean preload;
    /**
     * @return A `virtual_directory` block as defined below.
     * 
     */
    private List<GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories;
    /**
     * @return The Virtual Path of the Virtual Directory.
     * 
     */
    private String virtualPath;

    private GetWindowsWebAppSiteConfigVirtualApplication() {}
    /**
     * @return The path on disk to the Virtual Directory
     * 
     */
    public String physicalPath() {
        return this.physicalPath;
    }
    /**
     * @return Is this Application Pre-loaded at startup.
     * 
     */
    public Boolean preload() {
        return this.preload;
    }
    /**
     * @return A `virtual_directory` block as defined below.
     * 
     */
    public List<GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories() {
        return this.virtualDirectories;
    }
    /**
     * @return The Virtual Path of the Virtual Directory.
     * 
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigVirtualApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String physicalPath;
        private Boolean preload;
        private List<GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories;
        private String virtualPath;
        public Builder() {}
        public Builder(GetWindowsWebAppSiteConfigVirtualApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.preload = defaults.preload;
    	      this.virtualDirectories = defaults.virtualDirectories;
    	      this.virtualPath = defaults.virtualPath;
        }

        @CustomType.Setter
        public Builder physicalPath(String physicalPath) {
            this.physicalPath = Objects.requireNonNull(physicalPath);
            return this;
        }
        @CustomType.Setter
        public Builder preload(Boolean preload) {
            this.preload = Objects.requireNonNull(preload);
            return this;
        }
        @CustomType.Setter
        public Builder virtualDirectories(List<GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories) {
            this.virtualDirectories = Objects.requireNonNull(virtualDirectories);
            return this;
        }
        public Builder virtualDirectories(GetWindowsWebAppSiteConfigVirtualApplicationVirtualDirectory... virtualDirectories) {
            return virtualDirectories(List.of(virtualDirectories));
        }
        @CustomType.Setter
        public Builder virtualPath(String virtualPath) {
            this.virtualPath = Objects.requireNonNull(virtualPath);
            return this;
        }
        public GetWindowsWebAppSiteConfigVirtualApplication build() {
            final var _resultValue = new GetWindowsWebAppSiteConfigVirtualApplication();
            _resultValue.physicalPath = physicalPath;
            _resultValue.preload = preload;
            _resultValue.virtualDirectories = virtualDirectories;
            _resultValue.virtualPath = virtualPath;
            return _resultValue;
        }
    }
}
