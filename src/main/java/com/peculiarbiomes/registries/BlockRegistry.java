package com.peculiarbiomes.registries;

import com.peculiarbiomes.PeculiarBiomes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WoodType;
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

    public static final Block ETHEREAL_SLAB = register(new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).nonOpaque()), "ethereal_slab", true);
    public static final Block ETHEREAL_STAIRS = register(new StairsBlock(ETHEREAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).nonOpaque()), "ethereal_stairs", true);
    public static final Block ETHEREAL_FENCE = register(new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE).nonOpaque()), "ethereal_fence", true);
    public static final Block ETHEREAL_FENCE_GATE = register(new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).nonOpaque(), WoodType.CHERRY), "ethereal_fence_gate", true);
    
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
