package com.robinsplaza.smithery.block;

import com.robinsplaza.smithery.Smithery;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import java.util.function.Function;

public class ModBlocks {

    //ore blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.AMETHYST)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.NETHER)
                    .strength(3.0f, 3.0f)
                    .sound(SoundType.NETHERRACK)));
    public static final Block QUICKSILVER_ORE = registerBlock("quicksilver_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 8), properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.SAND)
                    .strength(3.0f, 9.0f)
                    .sound(SoundType.STONE)));
    public static final Block WYRMSTEEL_BLOCK = registerBlock("wyrmsteel_block",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));

    //deco blocks
        //iron
    public static final Block IRON_GRATE = registerBlock("iron_grate",
            properties -> new WaterloggedTransparentBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block CUT_IRON = registerBlock("cut_iron",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block CUT_IRON_WALL = registerBlock("cut_iron_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            properties -> new StairBlock(CUT_IRON.defaultBlockState(), properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            properties -> new SlabBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.0f, 6.0f)
                    .sound(SoundType.METAL)));

        //rose gold
    public static final Block ROSE_GOLD_GRATE = registerBlock("rose_gold_grate",
            properties -> new WaterloggedTransparentBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(3.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block ROSE_GOLD_BARS = registerBlock("rose_gold_bars",
            properties -> new IronBarsBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block ROSE_GOLD_CHAIN = registerBlock("rose_gold_chain",
            properties -> new ChainBlock(properties
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.CHAIN)));
    public static final Block CUT_ROSE_GOLD = registerBlock("cut_rose_gold",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final Block CUT_ROSE_GOLD_WALL = registerBlock("cut_rose_gold_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block CUT_ROSE_GOLD_STAIRS = registerBlock("cut_rose_gold_stairs",
            properties -> new StairBlock(ROSE_GOLD_BLOCK.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final Block CUT_ROSE_GOLD_SLAB = registerBlock("cut_rose_gold_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

        //gold
    public static final Block GOLD_GRATE = registerBlock("gold_grate",
            properties -> new WaterloggedTransparentBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.GOLD)
                    .strength(3.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block GOLD_BARS = registerBlock("gold_bars",
            properties -> new IronBarsBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block GOLD_CHAIN = registerBlock("gold_chain",
            properties -> new ChainBlock(properties
                    .noOcclusion()
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.CHAIN)));
    public static final Block CUT_GOLD = registerBlock("cut_gold",
            properties -> new Block(properties
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final Block CUT_GOLD_WALL = registerBlock("cut_gold_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block CUT_GOLD_STAIRS = registerBlock("cut_gold_stairs",
            properties -> new StairBlock(Blocks.GOLD_BLOCK.defaultBlockState(), properties
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

        //netherite
    public static final Block NETHERITE_GRATE = registerBlock("netherite_grate",
            properties -> new WaterloggedTransparentBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(3.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block NETHERITE_BARS = registerBlock("netherite_bars",
            properties -> new IronBarsBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CUT_NETHERITE = registerBlock("cut_netherite",
            properties -> new Block(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(20.0f, 600.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CUT_NETHERITE_WALL = registerBlock("cut_netherite_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(20.0f, 600.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CUT_NETHERITE_STAIRS = registerBlock("cut_netherite_stairs",
            properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(20.0f, 600.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block CUT_NETHERITE_SLAB = registerBlock("cut_netherite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(20.0f, 600.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(33.0f, 1200.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block NETHERITE_CHAIN = registerBlock("netherite_chain",
            properties -> new ChainBlock(properties
                    .noOcclusion()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.CHAIN)));
    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            properties -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(), properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(33.0f, 1200.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab",
            properties -> new SlabBlock(properties
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(33.0f, 1200.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));

        //wyrmsteel
    public static final Block WYRMSTEEL_GRATE = registerBlock("wyrmsteel_grate",
            properties -> new WaterloggedTransparentBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.ICE)
                    .strength(3.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)));
    public static final Block WYRMSTEEL_BARS = registerBlock("wyrmsteel_bars",
            properties -> new IronBarsBlock(properties
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block WYRMSTEEL_CHAIN = registerBlock("wyrmsteel_chain",
            properties -> new ChainBlock(properties
                    .noOcclusion()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.CHAIN)));
    public static final Block CUT_WYRMSTEEL = registerBlock("cut_wyrmsteel",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block CUT_WYRMSTEEL_WALL = registerBlock("cut_wyrmsteel_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block CUT_WYRMSTEEL_STAIRS = registerBlock("cut_wyrmsteel_stairs",
            properties -> new StairBlock(WYRMSTEEL_BLOCK.defaultBlockState(), properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block CUT_WYRMSTEEL_SLAB = registerBlock("cut_wyrmsteel_slab",
            properties -> new SlabBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block WYRMSTEEL_WALL = registerBlock("wyrmsteel_wall",
            properties -> new WallBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never)
                    .sound(SoundType.METAL)));
    public static final Block WYRMSTEEL_STAIRS = registerBlock("wyrmsteel_stairs",
            properties -> new StairBlock(WYRMSTEEL_BLOCK.defaultBlockState(), properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));
    public static final Block WYRMSTEEL_SLAB = registerBlock("wyrmsteel_slab",
            properties -> new SlabBlock(properties
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.ICE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name)))));
    }
    public static void registerModBlocks(){
        Smithery.LOGGER.info("Registering blocks for " + Smithery.MOD_ID);
    }
}
