package com.peculiarbiomes.datagen;

import com.peculiarbiomes.registries.BlockRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class PBModelProvider extends FabricModelProvider {

    public PBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Ethereal Wood Set
        blockStateModelGenerator.registerLog(BlockRegistry.ETHEREAL_LOG)
            .log(BlockRegistry.ETHEREAL_LOG)
            .wood(BlockRegistry.ETHEREAL_WOOD);

        BlockStateModelGenerator.BlockTexturePool ethereal_planks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlockRegistry.ETHEREAL_PLANKS);
        ethereal_planks_pool.slab(BlockRegistry.ETHEREAL_SLAB);
        ethereal_planks_pool.stairs(BlockRegistry.ETHEREAL_STAIRS);
        ethereal_planks_pool.fence(BlockRegistry.ETHEREAL_FENCE);
        ethereal_planks_pool.fenceGate(BlockRegistry.ETHEREAL_FENCE_GATE);
        ethereal_planks_pool.button(BlockRegistry.ETHEREAL_BUTTON);
        ethereal_planks_pool.pressurePlate(BlockRegistry.ETHEREAL_PRESSURE_PLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
    
}
