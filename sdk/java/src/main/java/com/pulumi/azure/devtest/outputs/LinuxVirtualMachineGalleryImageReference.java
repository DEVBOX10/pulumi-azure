// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinuxVirtualMachineGalleryImageReference {
    /**
     * @return The Offer of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String offer;
    /**
     * @return The Publisher of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String publisher;
    /**
     * @return The SKU of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String sku;
    /**
     * @return The Version of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String version;

    private LinuxVirtualMachineGalleryImageReference() {}
    /**
     * @return The Offer of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return The Publisher of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return The SKU of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return The Version of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineGalleryImageReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;
        private String version;
        public Builder() {}
        public Builder(LinuxVirtualMachineGalleryImageReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        @CustomType.Setter
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public LinuxVirtualMachineGalleryImageReference build() {
            final var _resultValue = new LinuxVirtualMachineGalleryImageReference();
            _resultValue.offer = offer;
            _resultValue.publisher = publisher;
            _resultValue.sku = sku;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
