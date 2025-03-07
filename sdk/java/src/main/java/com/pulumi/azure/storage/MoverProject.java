// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.MoverProjectArgs;
import com.pulumi.azure.storage.inputs.MoverProjectState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Storage Mover Project.
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
 * import com.pulumi.azure.storage.Mover;
 * import com.pulumi.azure.storage.MoverArgs;
 * import com.pulumi.azure.storage.MoverProject;
 * import com.pulumi.azure.storage.MoverProjectArgs;
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
 *         var exampleMover = new Mover(&#34;exampleMover&#34;, MoverArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .build());
 * 
 *         var exampleMoverProject = new MoverProject(&#34;exampleMoverProject&#34;, MoverProjectArgs.builder()        
 *             .storageMoverId(exampleMover.id())
 *             .description(&#34;Example Project Description&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage Mover Project can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/moverProject:MoverProject example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1
 * ```
 * 
 */
@ResourceType(type="azure:storage/moverProject:MoverProject")
public class MoverProject extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a description for this Storage Mover Project.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies a description for this Storage Mover Project.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the name which should be used for this Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the ID of the storage mover for this Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageMoverId", refs={String.class}, tree="[0]")
    private Output<String> storageMoverId;

    /**
     * @return Specifies the ID of the storage mover for this Storage Mover Project. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageMoverId() {
        return this.storageMoverId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MoverProject(String name) {
        this(name, MoverProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MoverProject(String name, MoverProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MoverProject(String name, MoverProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/moverProject:MoverProject", name, args == null ? MoverProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MoverProject(String name, Output<String> id, @Nullable MoverProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/moverProject:MoverProject", name, state, makeResourceOptions(options, id));
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
    public static MoverProject get(String name, Output<String> id, @Nullable MoverProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MoverProject(name, id, state, options);
    }
}
