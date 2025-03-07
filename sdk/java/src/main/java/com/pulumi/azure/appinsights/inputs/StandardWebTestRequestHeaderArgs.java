// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StandardWebTestRequestHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardWebTestRequestHeaderArgs Empty = new StandardWebTestRequestHeaderArgs();

    /**
     * The name which should be used for a header in the request.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for a header in the request.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value which should be used for a header in the request.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value which should be used for a header in the request.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private StandardWebTestRequestHeaderArgs() {}

    private StandardWebTestRequestHeaderArgs(StandardWebTestRequestHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardWebTestRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardWebTestRequestHeaderArgs $;

        public Builder() {
            $ = new StandardWebTestRequestHeaderArgs();
        }

        public Builder(StandardWebTestRequestHeaderArgs defaults) {
            $ = new StandardWebTestRequestHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for a header in the request.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for a header in the request.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value which should be used for a header in the request.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value which should be used for a header in the request.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public StandardWebTestRequestHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
