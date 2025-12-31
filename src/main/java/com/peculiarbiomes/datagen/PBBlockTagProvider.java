package com.peculiarbiomes.datagen;

import java.util.concurrent.CompletableFuture;

import com.peculiarbiomes.registries.BlockRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;

public class PBBlockTagProvider extends BlockTagProvider {

    public PBBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.FENCES)
            .add(BlockRegistry.ETHEREAL_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(BlockRegistry.ETHEREAL_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
            .add(BlockRegistry.ETHEREAL_STAIRS);
        
        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(BlockRegistry.ETHEREAL_SLAB);
    }
    
}
