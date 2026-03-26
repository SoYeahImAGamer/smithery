package com.robinsplaza.smithery;

import com.robinsplaza.smithery.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class SmitheryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        FabricLoader.getInstance().getModContainer(Smithery.MOD_ID).ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(Identifier.fromNamespaceAndPath(Smithery.MOD_ID, "wormy"), container, Component.translatable("resourcePack.smithery.wormy.name"), ResourcePackActivationType.NORMAL);
        });


    }
}
