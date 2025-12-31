package com.example.peculiarbiomes.registries;

import com.example.peculiarbiomes.PeculiarBiomes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    // Ethereal Wood Set
    public static final Block ETHEREAL_LOG = register(new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).nonOpaque()), "ethereal_log", true);
    public static final Block ETHEREAL_WOOD = register(new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).nonOpaque()), "ethereal_wood", true);
    public static final Block ETHEREAL_PLANKS = register(new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()), "ethereal_planks", true);
    
    public static Block register(Block block, String name, boolean registerItem) {
        // Register the blocks ID
        Identifier blockID = new Identifier(PeculiarBiomes.modID, name);

        if (registerItem) {
            // Register a block item with the block
            Registry.register(Registries.ITEM, blockID, new BlockItem(block, new Item.Settings()));
        }

        // Register the block
        return Registry.register(Registries.BLOCK, blockID, block);
    }

    public static void registerBlocks() {}
}
