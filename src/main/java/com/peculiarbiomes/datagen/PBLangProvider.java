package com.peculiarbiomes.datagen;

import com.peculiarbiomes.registries.BlockRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class PBLangProvider extends FabricLanguageProvider {

    protected PBLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Ethereal Wood Set
        translationBuilder.add(BlockRegistry.ETHEREAL_LOG, "Ethereal Log");
        translationBuilder.add(BlockRegistry.ETHEREAL_WOOD, "Ethereal Wood");
        translationBuilder.add(BlockRegistry.ETHEREAL_PLANKS, "Ethereal Planks");
        translationBuilder.add(BlockRegistry.ETHEREAL_SLAB, "Ethereal Slab");
        translationBuilder.add(BlockRegistry.ETHEREAL_STAIRS, "Ethereal Stairs");
        translationBuilder.add(BlockRegistry.ETHEREAL_FENCE, "Ethereal Fence");
        translationBuilder.add(BlockRegistry.ETHEREAL_FENCE_GATE, "Ethereal Fence Gate");
        translationBuilder.add(BlockRegistry.ETHEREAL_BUTTON, "Ethereal Button");
        translationBuilder.add(BlockRegistry.ETHEREAL_PRESSURE_PLATE, "Ethereal Pressure Plate");

        // Cobalt Set
        translationBuilder.add(BlockRegistry.COBALT_ORE, "Cobalt Ore");
        translationBuilder.add(BlockRegistry.DEEPSLATE_COBALT_ORE, "Deepslate Cobalt Ore");
        translationBuilder.add(BlockRegistry.COBALT_BLOCK, "Block of Cobalt");
        translationBuilder.add(BlockRegistry.RAW_COBALT_BLOCK, "Block of Raw Cobalt");
    }
    
}
