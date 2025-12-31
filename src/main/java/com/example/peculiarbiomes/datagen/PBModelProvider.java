package com.example.peculiarbiomes.datagen;

import com.example.peculiarbiomes.registries.BlockRegistry;

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

        blockStateModelGenerator.registerSimpleCubeAll(BlockRegistry.ETHEREAL_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
    
}
