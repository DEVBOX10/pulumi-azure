// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.SnapshotEncryptionSettingsDiskEncryptionKey;
import com.pulumi.azure.compute.outputs.SnapshotEncryptionSettingsKeyEncryptionKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SnapshotEncryptionSettings {
    /**
     * @return A `disk_encryption_key` block as defined below.
     * 
     */
    private @Nullable SnapshotEncryptionSettingsDiskEncryptionKey diskEncryptionKey;
    /**
     * @deprecated
     * Deprecated, Azure Disk Encryption is now configured directly by `disk_encryption_key` and `key_encryption_key`. To disable Azure Disk Encryption, please remove `encryption_settings` block. To enabled, specify a `encryption_settings` block`
     * 
     */
    @Deprecated /* Deprecated, Azure Disk Encryption is now configured directly by `disk_encryption_key` and `key_encryption_key`. To disable Azure Disk Encryption, please remove `encryption_settings` block. To enabled, specify a `encryption_settings` block` */
    private @Nullable Boolean enabled;
    /**
     * @return A `key_encryption_key` block as defined below.
     * 
     */
    private @Nullable SnapshotEncryptionSettingsKeyEncryptionKey keyEncryptionKey;

    private SnapshotEncryptionSettings() {}
    /**
     * @return A `disk_encryption_key` block as defined below.
     * 
     */
    public Optional<SnapshotEncryptionSettingsDiskEncryptionKey> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }
    /**
     * @deprecated
     * Deprecated, Azure Disk Encryption is now configured directly by `disk_encryption_key` and `key_encryption_key`. To disable Azure Disk Encryption, please remove `encryption_settings` block. To enabled, specify a `encryption_settings` block`
     * 
     */
    @Deprecated /* Deprecated, Azure Disk Encryption is now configured directly by `disk_encryption_key` and `key_encryption_key`. To disable Azure Disk Encryption, please remove `encryption_settings` block. To enabled, specify a `encryption_settings` block` */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return A `key_encryption_key` block as defined below.
     * 
     */
    public Optional<SnapshotEncryptionSettingsKeyEncryptionKey> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotEncryptionSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SnapshotEncryptionSettingsDiskEncryptionKey diskEncryptionKey;
        private @Nullable Boolean enabled;
        private @Nullable SnapshotEncryptionSettingsKeyEncryptionKey keyEncryptionKey;
        public Builder() {}
        public Builder(SnapshotEncryptionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.enabled = defaults.enabled;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        @CustomType.Setter
        public Builder diskEncryptionKey(@Nullable SnapshotEncryptionSettingsDiskEncryptionKey diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder keyEncryptionKey(@Nullable SnapshotEncryptionSettingsKeyEncryptionKey keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public SnapshotEncryptionSettings build() {
            final var _resultValue = new SnapshotEncryptionSettings();
            _resultValue.diskEncryptionKey = diskEncryptionKey;
            _resultValue.enabled = enabled;
            _resultValue.keyEncryptionKey = keyEncryptionKey;
            return _resultValue;
        }
    }
}
