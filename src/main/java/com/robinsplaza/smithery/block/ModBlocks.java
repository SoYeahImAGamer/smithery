package com.robinsplaza.smithery.block;

import com.robinsplaza.smithery.Smithery;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    //ore blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block QUICKSILVER_ORE = registerBlock("quicksilver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 8), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
    public static final Block WYRMSTEEL_BLOCK = registerBlock("wyrmsteel_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    //deco blocks
    public static final Block VOID_BLOCK = registerBlock("void_block",
            new VoidBlock(AbstractBlock.Settings.create().nonOpaque().hardness(0.5f).luminance(state -> 15)));
    public static final Block VOID_BLOCK_ITEM = registerBlock("void_block_item",
            new Block(AbstractBlock.Settings.create().nonOpaque().hardness(0.5f).luminance(state -> 15)));

    public static final Block IRON_GRATE = registerBlock("iron_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.COPPER_GRATE).nonOpaque().mapColor(MapColor.LIGHT_GRAY)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

    public static final Block ROSE_GOLD_GRATE = registerBlock("rose_gold_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.COPPER_GRATE).nonOpaque().mapColor(MapColor.PINK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block ROSE_GOLD_BARS = registerBlock("rose_gold_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).nonOpaque().mapColor(MapColor.PINK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block ROSE_GOLD_CHAIN = registerBlock("rose_gold_chain",
            new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN).nonOpaque().mapColor(MapColor.PINK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

    public static final Block GOLD_GRATE = registerBlock("gold_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.COPPER_GRATE).nonOpaque().mapColor(MapColor.GOLD)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block GOLD_BARS = registerBlock("gold_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).nonOpaque().mapColor(MapColor.GOLD)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block GOLD_CHAIN = registerBlock("gold_chain",
            new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN).nonOpaque().mapColor(MapColor.GOLD)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

    public static final Block NETHERITE_GRATE = registerBlock("netherite_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.COPPER_GRATE).nonOpaque().mapColor(MapColor.BLACK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block NETHERITE_BARS = registerBlock("netherite_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).nonOpaque().mapColor(MapColor.BLACK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.BLACK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block NETHERITE_CHAIN = registerBlock("netherite_chain",
            new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN).nonOpaque().mapColor(MapColor.BLACK)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));

    public static final Block WYRMSTEEL_GRATE = registerBlock("wyrmsteel_grate",
            new GrateBlock(AbstractBlock.Settings.copy(Blocks.COPPER_GRATE).nonOpaque().mapColor(MapColor.MAGENTA)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block WYRMSTEEL_BARS = registerBlock("wyrmsteel_bars",
            new PaneBlock(AbstractBlock.Settings.copy(Blocks.IRON_BARS).nonOpaque().mapColor(MapColor.MAGENTA)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block WYRMSTEEL_WALL = registerBlock("wyrmsteel_wall",
            new WallBlock(AbstractBlock.Settings.copy(WYRMSTEEL_BLOCK).mapColor(MapColor.MAGENTA)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block WYRMSTEEL_CHAIN = registerBlock("wyrmsteel_chain",
            new ChainBlock(AbstractBlock.Settings.copy(Blocks.CHAIN).nonOpaque().mapColor(MapColor.MAGENTA)
                    .solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Smithery.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(Smithery.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Smithery.LOGGER.info("Registering blocks for " + Smithery.MOD_ID);
    }
}
