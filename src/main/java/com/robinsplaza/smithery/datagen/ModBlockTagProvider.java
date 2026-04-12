package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

    public static final TagKey<Block> MATTOCK_MINEABLE = TagKey.create(Registries.BLOCK, Identifier.parse("c:mineable/mattock"));
    public static final TagKey<Block> BEACON_BLOCKS = TagKey.create(Registries.BLOCK, Identifier.parse("minecraft:beacon_base_blocks"));

    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        valueLookupBuilder(BEACON_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.ROSE_GOLD_BLOCK)
                .add(ModBlocks.WYRMSTEEL_BLOCK);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_SHOVEL);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_HOE);

        valueLookupBuilder(MATTOCK_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_HOE);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.QUICKSILVER_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.ROSE_GOLD_BLOCK)
                .add(ModBlocks.WYRMSTEEL_BLOCK)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.IRON_GRATE)
                .add(ModBlocks.CUT_IRON)
                .add(ModBlocks.CUT_IRON_WALL)
                .add(ModBlocks.CUT_IRON_STAIRS)
                .add(ModBlocks.CUT_IRON_SLAB)
                .add(ModBlocks.ROSE_GOLD_GRATE)
                .add(ModBlocks.ROSE_GOLD_BARS)
                .add(ModBlocks.ROSE_GOLD_CHAIN)
                .add(ModBlocks.GOLD_GRATE)
                .add(ModBlocks.GOLD_BARS)
                .add(ModBlocks.GOLD_CHAIN)
                .add(ModBlocks.NETHERITE_GRATE)
                .add(ModBlocks.NETHERITE_BARS)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.CUT_NETHERITE)
                .add(ModBlocks.CUT_NETHERITE_WALL)
                .add(ModBlocks.CUT_NETHERITE_STAIRS)
                .add(ModBlocks.CUT_NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_CHAIN)
                .add(ModBlocks.WYRMSTEEL_GRATE)
                .add(ModBlocks.WYRMSTEEL_BARS)
                .add(ModBlocks.CUT_WYRMSTEEL)
                .add(ModBlocks.WYRMSTEEL_WALL)
                .add(ModBlocks.WYRMSTEEL_STAIRS)
                .add(ModBlocks.WYRMSTEEL_SLAB)
                .add(ModBlocks.WYRMSTEEL_CHAIN);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.ROSE_GOLD_BLOCK)
                .add(ModBlocks.WYRMSTEEL_BLOCK)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.NETHERITE_GRATE)
                .add(ModBlocks.NETHERITE_BARS)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.NETHERITE_CHAIN)
                .add(ModBlocks.CUT_NETHERITE)
                .add(ModBlocks.CUT_NETHERITE_WALL)
                .add(ModBlocks.CUT_NETHERITE_STAIRS)
                .add(ModBlocks.CUT_NETHERITE_SLAB)
                .add(ModBlocks.WYRMSTEEL_GRATE)
                .add(ModBlocks.WYRMSTEEL_BARS)
                .add(ModBlocks.CUT_WYRMSTEEL)
                .add(ModBlocks.CUT_WYRMSTEEL_WALL)
                .add(ModBlocks.CUT_WYRMSTEEL_STAIRS)
                .add(ModBlocks.CUT_WYRMSTEEL_SLAB)
                .add(ModBlocks.WYRMSTEEL_WALL)
                .add(ModBlocks.WYRMSTEEL_STAIRS)
                .add(ModBlocks.WYRMSTEEL_SLAB)
                .add(ModBlocks.WYRMSTEEL_CHAIN);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.QUICKSILVER_ORE);

        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.CUT_IRON_WALL)
                .add(ModBlocks.NETHERITE_WALL)
                .add(ModBlocks.CUT_NETHERITE_WALL)
                .add(ModBlocks.WYRMSTEEL_WALL)
                .add(ModBlocks.CUT_WYRMSTEEL_WALL);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(ModBlocks.CUT_IRON_STAIRS)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.CUT_NETHERITE_STAIRS)
                .add(ModBlocks.WYRMSTEEL_STAIRS)
                .add(ModBlocks.CUT_WYRMSTEEL_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ModBlocks.CUT_IRON_SLAB)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.CUT_NETHERITE_SLAB)
                .add(ModBlocks.WYRMSTEEL_SLAB)
                .add(ModBlocks.CUT_WYRMSTEEL_SLAB);

    }
}
