// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.media.ContentKeyPolicyArgs;
import com.pulumi.azure.media.inputs.ContentKeyPolicyState;
import com.pulumi.azure.media.outputs.ContentKeyPolicyPolicyOption;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Content Key Policy.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.media.ServiceAccount;
 * import com.pulumi.azure.media.ServiceAccountArgs;
 * import com.pulumi.azure.media.inputs.ServiceAccountStorageAccountArgs;
 * import com.pulumi.azure.media.ContentKeyPolicy;
 * import com.pulumi.azure.media.ContentKeyPolicyArgs;
 * import com.pulumi.azure.media.inputs.ContentKeyPolicyPolicyOptionArgs;
 * import com.pulumi.azure.media.inputs.ContentKeyPolicyPolicyOptionFairplayConfigurationArgs;
 * import com.pulumi.azure.media.inputs.ContentKeyPolicyPolicyOptionTokenRestrictionArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;GRS&#34;)
 *             .build());
 * 
 *         var exampleServiceAccount = new ServiceAccount(&#34;exampleServiceAccount&#34;, ServiceAccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .storageAccounts(ServiceAccountStorageAccountArgs.builder()
 *                 .id(exampleAccount.id())
 *                 .isPrimary(true)
 *                 .build())
 *             .build());
 * 
 *         var exampleContentKeyPolicy = new ContentKeyPolicy(&#34;exampleContentKeyPolicy&#34;, ContentKeyPolicyArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .mediaServicesAccountName(exampleServiceAccount.name())
 *             .policyOptions(            
 *                 ContentKeyPolicyPolicyOptionArgs.builder()
 *                     .name(&#34;fairPlay&#34;)
 *                     .fairplayConfiguration(ContentKeyPolicyPolicyOptionFairplayConfigurationArgs.builder()
 *                         .ask(&#34;bb566284cc124a21c435a92cd3c108c4&#34;)
 *                         .pfx(&#34;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&#34;)
 *                         .pfxPassword(&#34;password&#34;)
 *                         .rentalDurationSeconds(2249)
 *                         .rentalAndLeaseKeyType(&#34;PersistentUnlimited&#34;)
 *                         .build())
 *                     .openRestrictionEnabled(true)
 *                     .build(),
 *                 ContentKeyPolicyPolicyOptionArgs.builder()
 *                     .name(&#34;playReady&#34;)
 *                     .playreadyConfigurationLicenses(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicenseArgs.builder()
 *                         .allowTestDevices(true)
 *                         .beginDate(&#34;2017-10-16T18:22:53Z&#34;)
 *                         .securityLevel(&#34;SL150&#34;)
 *                         .playRight(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs.builder()
 *                             .scmsRestriction(2)
 *                             .digitalVideoOnlyContentRestriction(false)
 *                             .imageConstraintForAnalogComponentVideoRestriction(false)
 *                             .imageConstraintForAnalogComputerMonitorRestriction(false)
 *                             .allowPassingVideoContentToUnknownOutput(&#34;NotAllowed&#34;)
 *                             .uncompressedDigitalVideoOpl(100)
 *                             .uncompressedDigitalAudioOpl(100)
 *                             .analogVideoOpl(150)
 *                             .compressedDigitalAudioOpl(250)
 *                             .compressedDigitalVideoOpl(400)
 *                             .explicitAnalogTelevisionOutputRestriction(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs.builder()
 *                                 .bestEffortEnforced(true)
 *                                 .controlBits(3)
 *                                 .build())
 *                             .build())
 *                         .licenseType(&#34;Persistent&#34;)
 *                         .contentType(&#34;UltraVioletDownload&#34;)
 *                         .contentKeyLocationFromHeaderEnabled(true)
 *                         .build())
 *                     .openRestrictionEnabled(true)
 *                     .build(),
 *                 ContentKeyPolicyPolicyOptionArgs.builder()
 *                     .name(&#34;clearKey&#34;)
 *                     .clearKeyConfigurationEnabled(true)
 *                     .tokenRestriction(ContentKeyPolicyPolicyOptionTokenRestrictionArgs.builder()
 *                         .issuer(&#34;urn:issuer&#34;)
 *                         .audience(&#34;urn:audience&#34;)
 *                         .tokenType(&#34;Swt&#34;)
 *                         .primarySymmetricTokenKey(&#34;AAAAAAAAAAAAAAAAAAAAAA==&#34;)
 *                         .alternateKeys(                        
 *                             ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyArgs.builder()
 *                                 .rsaTokenKeyExponent(&#34;AQAB&#34;)
 *                                 .rsaTokenKeyModulus(&#34;AQAD&#34;)
 *                                 .build(),
 *                             ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKeyArgs.builder()
 *                                 .symmetricTokenKey(&#34;BBAAAAAAAAAAAAAAAAAAAA==&#34;)
 *                                 .build())
 *                         .build())
 *                     .build(),
 *                 ContentKeyPolicyPolicyOptionArgs.builder()
 *                     .name(&#34;widevine&#34;)
 *                     .widevineConfigurationTemplate(serializeJson(
 *                         jsonObject(
 *                             jsonProperty(&#34;allowed_track_types&#34;, &#34;SD_HD&#34;),
 *                             jsonProperty(&#34;content_key_specs&#34;, jsonArray(jsonObject(
 *                                 jsonProperty(&#34;track_type&#34;, &#34;SD&#34;),
 *                                 jsonProperty(&#34;security_level&#34;, 1),
 *                                 jsonProperty(&#34;required_output_protection&#34;, jsonObject(
 *                                     jsonProperty(&#34;hdcp&#34;, &#34;HDCP_V2&#34;)
 *                                 ))
 *                             ))),
 *                             jsonProperty(&#34;policy_overrides&#34;, jsonObject(
 *                                 jsonProperty(&#34;can_play&#34;, true),
 *                                 jsonProperty(&#34;can_persist&#34;, true),
 *                                 jsonProperty(&#34;can_renew&#34;, false)
 *                             ))
 *                         )))
 *                     .openRestrictionEnabled(true)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Content Key Policy can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:media/contentKeyPolicy:ContentKeyPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Media/mediaServices/account1/contentKeyPolicies/policy1
 * ```
 * 
 */
@ResourceType(type="azure:media/contentKeyPolicy:ContentKeyPolicy")
public class ContentKeyPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Media Services account name. Changing this forces a new Content Key Policy to be created.
     * 
     */
    @Export(name="mediaServicesAccountName", refs={String.class}, tree="[0]")
    private Output<String> mediaServicesAccountName;

    /**
     * @return The Media Services account name. Changing this forces a new Content Key Policy to be created.
     * 
     */
    public Output<String> mediaServicesAccountName() {
        return this.mediaServicesAccountName;
    }
    /**
     * The name which should be used for this Content Key Policy. Changing this forces a new Content Key Policy to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Content Key Policy. Changing this forces a new Content Key Policy to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `policy_option` blocks as defined below.
     * 
     */
    @Export(name="policyOptions", refs={List.class,ContentKeyPolicyPolicyOption.class}, tree="[0,1]")
    private Output<List<ContentKeyPolicyPolicyOption>> policyOptions;

    /**
     * @return One or more `policy_option` blocks as defined below.
     * 
     */
    public Output<List<ContentKeyPolicyPolicyOption>> policyOptions() {
        return this.policyOptions;
    }
    /**
     * The name of the Resource Group where the Content Key Policy should exist. Changing this forces a new Content Key Policy to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Content Key Policy should exist. Changing this forces a new Content Key Policy to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContentKeyPolicy(String name) {
        this(name, ContentKeyPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContentKeyPolicy(String name, ContentKeyPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContentKeyPolicy(String name, ContentKeyPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:media/contentKeyPolicy:ContentKeyPolicy", name, args == null ? ContentKeyPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContentKeyPolicy(String name, Output<String> id, @Nullable ContentKeyPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:media/contentKeyPolicy:ContentKeyPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContentKeyPolicy get(String name, Output<String> id, @Nullable ContentKeyPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContentKeyPolicy(name, id, state, options);
    }
}
