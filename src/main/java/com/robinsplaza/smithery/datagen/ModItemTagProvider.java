package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Item> TOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:tools"));
    public static final TagKey<Item> PIGLIN_SAFE = TagKey.of(RegistryKeys.ITEM, Identifier.of("c:piglin_safe_armor"));
    private static final TagKey<Item> ROSE_GOLD_TOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:rose_gold_tools"));
    private static final TagKey<Item> ROSE_GOLD_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:rose_gold_armor"));
    private static final TagKey<Item> RUBY_TOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:ruby_tools"));
    private static final TagKey<Item> RUBY_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:ruby_armor"));
    private static final TagKey<Item> WYRMSTEEL_TOOLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:wyrmsteel_tools"));
    private static final TagKey<Item> WYRMSTEEL_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:wyrmsteel_armor"));
    private static final TagKey<Item> HAMMERS = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:hammers"));
    private static final TagKey<Item> MATTOCKS = TagKey.of(RegistryKeys.ITEM, Identifier.of("smithery:mattocks"));

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(TOOLS)
                .addTag(MATTOCKS)
                .addTag(HAMMERS)
                .addTag(ROSE_GOLD_TOOLS)
                .addTag(RUBY_TOOLS)
                .addTag(WYRMSTEEL_TOOLS);

        getOrCreateTagBuilder(ROSE_GOLD_TOOLS)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.ROSE_GOLD_SWORD);

        getOrCreateTagBuilder(ROSE_GOLD_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS);

        getOrCreateTagBuilder(RUBY_TOOLS)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.RUBY_HAMMER);

        getOrCreateTagBuilder(RUBY_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(WYRMSTEEL_TOOLS)
                .add(ModItems.WYRMSTEEL_PICKAXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.WYRMSTEEL_SHOVEL)
                .add(ModItems.WYRMSTEEL_HOE)
                .add(ModItems.WYRMSTEEL_HAMMER);

        getOrCreateTagBuilder(WYRMSTEEL_ARMOR)
                .add(ModItems.WYRMSTEEL_HELMET)
                .add(ModItems.WYRMSTEEL_CHESTPLATE)
                .add(ModItems.WYRMSTEEL_LEGGINGS)
                .add(ModItems.WYRMSTEEL_BOOTS);

        getOrCreateTagBuilder(HAMMERS)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WYRMSTEEL_HAMMER);

        getOrCreateTagBuilder(MATTOCKS)
                .add(ModItems.WYRMSTEEL_MATTOCK)
                .add(ModItems.NETHERITE_MATTOCK)
                .add(ModItems.DIAMOND_MATTOCK)
                .add(ModItems.RUBY_MATTOCK)
                .add(ModItems.ROSE_GOLD_MATTOCK)
                .add(ModItems.IRON_MATTOCK)
                .add(ModItems.GOLDEN_MATTOCK);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.WYRMSTEEL_PICKAXE)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.WYRMSTEEL_SHOVEL)
                .add(ModItems.WYRMSTEEL_HOE)
                .add(ModItems.WYRMSTEEL_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_AXE);

        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_AXE);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_PICKAXE)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.WYRMSTEEL_SHOVEL)
                .add(ModItems.WYRMSTEEL_HOE)
                .add(ModItems.WYRMSTEEL_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.WYRMSTEEL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.WYRMSTEEL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.WYRMSTEEL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.WYRMSTEEL_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.WYRMSTEEL_HELMET)
                .add(ModItems.WYRMSTEEL_CHESTPLATE)
                .add(ModItems.WYRMSTEEL_LEGGINGS)
                .add(ModItems.WYRMSTEEL_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.WYRMSTEEL_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.WYRMSTEEL_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.WYRMSTEEL_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.ROSE_GOLD_BOOTS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.WYRMSTEEL_BOOTS);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS)
                .add(ModItems.ROSE_GOLD_INGOT);

        getOrCreateTagBuilder(PIGLIN_SAFE)
                .add(Items.GOLDEN_HELMET)
                .add(Items.GOLDEN_CHESTPLATE)
                .add(Items.GOLDEN_LEGGINGS)
                .add(Items.GOLDEN_BOOTS)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS);

    }
}
