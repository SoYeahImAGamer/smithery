package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModArmorMaterials;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider netheritePool = blockStateModelGenerator.family(Blocks.NETHERITE_BLOCK);
        BlockModelGenerators.BlockFamilyProvider wyrmsteelPool = blockStateModelGenerator.family(ModBlocks.WYRMSTEEL_BLOCK);
        BlockModelGenerators.BlockFamilyProvider cutIronPool = blockStateModelGenerator.family(ModBlocks.CUT_IRON);
        BlockModelGenerators.BlockFamilyProvider cutNetheritePool = blockStateModelGenerator.family(ModBlocks.CUT_NETHERITE);
        BlockModelGenerators.BlockFamilyProvider cutWyrmsteelPool = blockStateModelGenerator.family(ModBlocks.CUT_WYRMSTEEL);

        blockStateModelGenerator.createTrivialCube(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.ROSE_GOLD_BLOCK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.QUICKSILVER_ORE);


        blockStateModelGenerator.createTrivialCube(ModBlocks.IRON_GRATE);
        cutIronPool.wall(ModBlocks.CUT_IRON_WALL);
        cutIronPool.stairs(ModBlocks.CUT_IRON_STAIRS);
        cutIronPool.slab(ModBlocks.CUT_IRON_SLAB);

        blockStateModelGenerator.createTrivialCube(ModBlocks.ROSE_GOLD_GRATE);
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.ROSE_GOLD_CHAIN.asItem());
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.ROSE_GOLD_BARS.asItem());

        blockStateModelGenerator.createTrivialCube(ModBlocks.GOLD_GRATE);
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.GOLD_CHAIN.asItem());
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.GOLD_BARS.asItem());

        blockStateModelGenerator.createTrivialCube(ModBlocks.NETHERITE_GRATE);
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.NETHERITE_CHAIN.asItem());
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.NETHERITE_BARS.asItem());
        netheritePool.wall(ModBlocks.NETHERITE_WALL);
        netheritePool.stairs(ModBlocks.NETHERITE_STAIRS);
        netheritePool.slab(ModBlocks.NETHERITE_SLAB);
        cutNetheritePool.wall(ModBlocks.CUT_NETHERITE_WALL);
        cutNetheritePool.stairs(ModBlocks.CUT_NETHERITE_STAIRS);
        cutNetheritePool.slab(ModBlocks.CUT_NETHERITE_SLAB);

        blockStateModelGenerator.createTrivialCube(ModBlocks.WYRMSTEEL_GRATE);
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.WYRMSTEEL_CHAIN.asItem());
        blockStateModelGenerator.registerSimpleFlatItemModel(ModBlocks.WYRMSTEEL_BARS.asItem());
        wyrmsteelPool.wall(ModBlocks.WYRMSTEEL_WALL);
        wyrmsteelPool.stairs(ModBlocks.WYRMSTEEL_STAIRS);
        wyrmsteelPool.slab(ModBlocks.WYRMSTEEL_SLAB);
        cutWyrmsteelPool.wall(ModBlocks.CUT_WYRMSTEEL_WALL);
        cutWyrmsteelPool.stairs(ModBlocks.CUT_WYRMSTEEL_STAIRS);
        cutWyrmsteelPool.slab(ModBlocks.CUT_WYRMSTEEL_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        itemModelGenerator.generateFlatItem(ModItems.COPPER_SPUR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SILVER_SPUR, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GOLDEN_SPUR, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.QUICKSILVER, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_UPGRADE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MULTITOOL_UPGRADE, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WYRMSTEEL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.RUBY_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.RUBY_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ROSE_GOLD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.DIAMOND_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHERITE_HAMMER, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.DIAMOND_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.NETHERITE_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GOLDEN_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.IRON_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerator.generateTrimmableItem(ModItems.WYRMSTEEL_HELMET, ModArmorMaterials.WYRMSTEEL_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.WYRMSTEEL_CHESTPLATE, ModArmorMaterials.WYRMSTEEL_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.WYRMSTEEL_LEGGINGS, ModArmorMaterials.WYRMSTEEL_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.WYRMSTEEL_BOOTS, ModArmorMaterials.WYRMSTEEL_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerator.generateTrimmableItem(ModItems.RUBY_HELMET, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.RUBY_CHESTPLATE, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.RUBY_LEGGINGS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.RUBY_BOOTS, ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModelGenerator.generateTrimmableItem(ModItems.ROSE_GOLD_HELMET, ModArmorMaterials.ROSE_GOLD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerator.generateTrimmableItem(ModItems.ROSE_GOLD_CHESTPLATE, ModArmorMaterials.ROSE_GOLD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerator.generateTrimmableItem(ModItems.ROSE_GOLD_LEGGINGS, ModArmorMaterials.ROSE_GOLD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerator.generateTrimmableItem(ModItems.ROSE_GOLD_BOOTS, ModArmorMaterials.ROSE_GOLD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

    }
}
