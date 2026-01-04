package com.peculiarbiomes.registries;

import com.peculiarbiomes.PeculiarBiomes;
import com.peculiarbiomes.block.TransparentFenceBlock;
import com.peculiarbiomes.block.TransparentFenceGateBlock;
import com.peculiarbiomes.block.TransparentPillarBlock;
import com.peculiarbiomes.block.TransparentSlabBlock;
import com.peculiarbiomes.block.TransparentStairsBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.PressurePlateBlock.ActivationRule;
import net.minecraft.block.TransparentBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    // Ethereal Wood Set
    public static final Block ETHEREAL_LOG = register(new TransparentPillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).nonOpaque()), "ethereal_log", true);
    public static final Block ETHEREAL_WOOD = register(new TransparentPillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).nonOpaque()), "ethereal_wood", true);
    public static final Block ETHEREAL_PLANKS = register(new TransparentBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()), "ethereal_planks", true);

    public static final Block ETHEREAL_SLAB = register(new TransparentSlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).nonOpaque()), "ethereal_slab", true);
    public static final Block ETHEREAL_STAIRS = register(new TransparentStairsBlock(ETHEREAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).nonOpaque()), "ethereal_stairs", true);
    public static final Block ETHEREAL_FENCE = register(new TransparentFenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE).nonOpaque()), "ethereal_fence", true);
    public static final Block ETHEREAL_FENCE_GATE = register(new TransparentFenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).nonOpaque(), WoodType.CHERRY), "ethereal_fence_gate", true);

    public static final Block ETHEREAL_BUTTON = register(new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON).nonOpaque(), BlockSetType.CHERRY, 30, true), "ethereal_button", true);
    public static final Block ETHEREAL_PRESSURE_PLATE = register(new PressurePlateBlock(ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE).nonOpaque(), BlockSetType.CHERRY), "ethereal_pressure_plate", true);
    
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
