// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class NetworkPacketCaptureStorageLocation
    {
        /// <summary>
        /// A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For Linux virtual machine it must start with `/var/captures`.
        /// </summary>
        public readonly string? FilePath;
        /// <summary>
        /// The ID of the storage account to save the packet capture session
        /// 
        /// &gt; **NOTE:** At least one of `file_path` or `storage_account_id` must be specified.
        /// </summary>
        public readonly string? StorageAccountId;
        /// <summary>
        /// The URI of the storage path to save the packet capture.
        /// </summary>
        public readonly string? StoragePath;

        [OutputConstructor]
        private NetworkPacketCaptureStorageLocation(
            string? filePath,

            string? storageAccountId,

            string? storagePath)
        {
            FilePath = filePath;
            StorageAccountId = storageAccountId;
            StoragePath = storagePath;
        }
    }
}
