package com.peculiarbiomes;

import com.peculiarbiomes.registries.BlockRegistry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PeculiarBiomesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_LOG, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_LOG, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_WOOD, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_WOOD, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_PLANKS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_PLANKS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_SLAB, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_STAIRS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_STAIRS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_FENCE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_FENCE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_FENCE_GATE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_FENCE_GATE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_BUTTON, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_BUTTON, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_PRESSURE_PLATE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ETHEREAL_PRESSURE_PLATE, RenderLayer.getTranslucent());
	}
}