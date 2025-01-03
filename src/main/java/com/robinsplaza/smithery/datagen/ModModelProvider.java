package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool netheritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WYRMSTEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUICKSILVER_ORE);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_BLOCK_ITEM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_GRATE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_GOLD_GRATE);
        this.registerGenericBars(blockStateModelGenerator, ModBlocks.ROSE_GOLD_BARS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.ROSE_GOLD_CHAIN, ModelIds.getBlockModelId(ModBlocks.ROSE_GOLD_CHAIN));
        blockStateModelGenerator.registerItemModel(ModBlocks.ROSE_GOLD_CHAIN.asItem());

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_GRATE);
        this.registerGenericBars(blockStateModelGenerator, ModBlocks.GOLD_BARS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GOLD_CHAIN, ModelIds.getBlockModelId(ModBlocks.GOLD_CHAIN));
        blockStateModelGenerator.registerItemModel(ModBlocks.GOLD_CHAIN.asItem());

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_GRATE);
        this.registerGenericBars(blockStateModelGenerator, ModBlocks.NETHERITE_BARS);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.NETHERITE_CHAIN, ModelIds.getBlockModelId(ModBlocks.NETHERITE_CHAIN));
        blockStateModelGenerator.registerItemModel(ModBlocks.NETHERITE_CHAIN.asItem());
        netheritePool.wall(ModBlocks.NETHERITE_WALL);

    }

    public void registerGenericBars(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = ModelIds.getBlockSubModelId(block, "_post_ends");
        Identifier identifier2 = ModelIds.getBlockSubModelId(block, "_post");
        Identifier identifier3 = ModelIds.getBlockSubModelId(block, "_cap");
        Identifier identifier4 = ModelIds.getBlockSubModelId(block, "_cap_alt");
        Identifier identifier5 = ModelIds.getBlockSubModelId(block, "_side");
        Identifier identifier6 = ModelIds.getBlockSubModelId(block, "_side_alt");
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
                .with(BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier2))
                .with(When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier3))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier3).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier4))
                .with(When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier4).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier5))
                .with(When.create().set(Properties.EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier5).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.SOUTH, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier6))
                .with(When.create().set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier6).put(VariantSettings.Y, VariantSettings.Rotation.R90)));
        blockStateModelGenerator.registerItemModel(block);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUICKSILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WYRMSTEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WYRMSTEEL_UPGRADE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WYRMSTEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WYRMSTEEL_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WYRMSTEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WYRMSTEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WYRMSTEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WYRMSTEEL_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ROSE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MAGIC_MIRROR, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIAMOND_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_HAMMER, Models.HANDHELD);
        
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WYRMSTEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WYRMSTEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WYRMSTEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.WYRMSTEEL_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ROSE_GOLD_BOOTS));

    }
}
