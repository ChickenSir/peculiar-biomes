package com.example.peculiarbiomes.datagen;

import com.example.peculiarbiomes.registries.BlockRegistry;

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
    }
    
}
