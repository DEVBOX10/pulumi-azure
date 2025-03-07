// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSharedImageIdentifier {
    /**
     * @return The Offer Name for this Shared Image.
     * 
     */
    private String offer;
    /**
     * @return (Optional) The Purchase Plan Publisher for this Gallery Image.
     * 
     */
    private String publisher;
    /**
     * @return The Name of the SKU for this Gallery Image.
     * 
     */
    private String sku;

    private GetSharedImageIdentifier() {}
    /**
     * @return The Offer Name for this Shared Image.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return (Optional) The Purchase Plan Publisher for this Gallery Image.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return The Name of the SKU for this Gallery Image.
     * 
     */
    public String sku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedImageIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;
        public Builder() {}
        public Builder(GetSharedImageIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
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
        public GetSharedImageIdentifier build() {
            final var _resultValue = new GetSharedImageIdentifier();
            _resultValue.offer = offer;
            _resultValue.publisher = publisher;
            _resultValue.sku = sku;
            return _resultValue;
        }
    }
}
