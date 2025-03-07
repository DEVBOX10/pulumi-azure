// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.SparkClusterMetastoresAmbari;
import com.pulumi.azure.hdinsight.outputs.SparkClusterMetastoresHive;
import com.pulumi.azure.hdinsight.outputs.SparkClusterMetastoresOozie;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SparkClusterMetastores {
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    private @Nullable SparkClusterMetastoresAmbari ambari;
    /**
     * @return A `hive` block as defined below.
     * 
     */
    private @Nullable SparkClusterMetastoresHive hive;
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    private @Nullable SparkClusterMetastoresOozie oozie;

    private SparkClusterMetastores() {}
    /**
     * @return An `ambari` block as defined below.
     * 
     */
    public Optional<SparkClusterMetastoresAmbari> ambari() {
        return Optional.ofNullable(this.ambari);
    }
    /**
     * @return A `hive` block as defined below.
     * 
     */
    public Optional<SparkClusterMetastoresHive> hive() {
        return Optional.ofNullable(this.hive);
    }
    /**
     * @return An `oozie` block as defined below.
     * 
     */
    public Optional<SparkClusterMetastoresOozie> oozie() {
        return Optional.ofNullable(this.oozie);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterMetastores defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SparkClusterMetastoresAmbari ambari;
        private @Nullable SparkClusterMetastoresHive hive;
        private @Nullable SparkClusterMetastoresOozie oozie;
        public Builder() {}
        public Builder(SparkClusterMetastores defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambari = defaults.ambari;
    	      this.hive = defaults.hive;
    	      this.oozie = defaults.oozie;
        }

        @CustomType.Setter
        public Builder ambari(@Nullable SparkClusterMetastoresAmbari ambari) {
            this.ambari = ambari;
            return this;
        }
        @CustomType.Setter
        public Builder hive(@Nullable SparkClusterMetastoresHive hive) {
            this.hive = hive;
            return this;
        }
        @CustomType.Setter
        public Builder oozie(@Nullable SparkClusterMetastoresOozie oozie) {
            this.oozie = oozie;
            return this;
        }
        public SparkClusterMetastores build() {
            final var _resultValue = new SparkClusterMetastores();
            _resultValue.ambari = ambari;
            _resultValue.hive = hive;
            _resultValue.oozie = oozie;
            return _resultValue;
        }
    }
}
