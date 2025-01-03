package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.QUICKSILVER_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.VOID_BLOCK)
                .add(ModBlocks.IRON_GRATE)
                .add(ModBlocks.ROSE_GOLD_GRATE)
                .add(ModBlocks.ROSE_GOLD_BARS)
                .add(ModBlocks.ROSE_GOLD_CHAIN)
                .add(ModBlocks.GOLD_GRATE)
                .add(ModBlocks.GOLD_BARS)
                .add(ModBlocks.GOLD_CHAIN)
                .add(ModBlocks.NETHERITE_GRATE)
                .add(ModBlocks.NETHERITE_BARS)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.NETHERITE_CHAIN);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.ROSE_GOLD_GRATE)
                .add(ModBlocks.ROSE_GOLD_BARS)
                .add(ModBlocks.ROSE_GOLD_CHAIN)
                .add(ModBlocks.GOLD_GRATE)
                .add(ModBlocks.GOLD_BARS)
                .add(ModBlocks.GOLD_CHAIN)
                .add(ModBlocks.NETHERITE_GRATE)
                .add(ModBlocks.NETHERITE_BARS)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.NETHERITE_CHAIN);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.QUICKSILVER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.VOID_BLOCK)
                .add(ModBlocks.IRON_GRATE);


        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.NETHERITE_WALL);

    }
}
