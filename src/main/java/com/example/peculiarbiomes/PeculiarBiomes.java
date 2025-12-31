package com.example.peculiarbiomes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.peculiarbiomes.registries.BlockRegistry;

public class PeculiarBiomes implements ModInitializer {
	public static final String modID = "peculiar-biomes";
	public static final String modName = "Peculiar Biomes";
	public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	// Item Group
	private static final ItemGroup PECULIAR_BIOMES_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(BlockRegistry.ETHEREAL_LOG))
		.displayName(Text.translatable(modName))
		.entries((context, entries) -> {
			entries.add(BlockRegistry.ETHEREAL_LOG);
			entries.add(BlockRegistry.ETHEREAL_WOOD);
			entries.add(BlockRegistry.ETHEREAL_PLANKS);
		})
		.build();

	@Override
	public void onInitialize() {
		LOGGER.info("Registering Blocks!");
		BlockRegistry.registerBlocks();

		LOGGER.info("Registering Item Group!");
		Registry.register(Registries.ITEM_GROUP, new Identifier(modID, "peculiar_biomes_group"), PECULIAR_BIOMES_GROUP);
	}
}