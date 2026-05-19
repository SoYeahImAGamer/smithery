package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    private static final TagKey<Item> TOOLS = TagKey.create(Registries.ITEM, Identifier.parse("c:tools"));
    private static final TagKey<Item> INGOTS = TagKey.create(Registries.ITEM, Identifier.parse("c:ingots"));
    public static final TagKey<Item> COPPER_NUGGETS = TagKey.create(Registries.ITEM, Identifier.parse("c:nuggets/copper"));
    private static final TagKey<Item> BEACON_PAYMENTS = TagKey.create(Registries.ITEM, Identifier.parse("minecraft:beacon_payment_items"));
    public static final TagKey<Item> PIGLIN_SAFE = TagKey.create(Registries.ITEM, Identifier.parse("minecraft:piglin_safe_armor"));
    private static final TagKey<Item> ROSE_GOLD_TOOLS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:rose_gold_tools"));
    private static final TagKey<Item> ROSE_GOLD_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("smithery:rose_gold_armor"));
    public static final TagKey<Item> ROSE_GOLD_REPAIR_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:rose_gold_repair_materials"));
    private static final TagKey<Item> RUBY_TOOLS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:ruby_tools"));
    private static final TagKey<Item> RUBY_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("smithery:ruby_armor"));
    public static final TagKey<Item> RUBY_REPAIR_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:ruby_repair_materials"));
    private static final TagKey<Item> WYRMSTEEL_TOOLS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:wyrmsteel_tools"));
    private static final TagKey<Item> WYRMSTEEL_ARMOR = TagKey.create(Registries.ITEM, Identifier.parse("smithery:wyrmsteel_armor"));
    public static final TagKey<Item> WYRMSTEEL_REPAIR_MATERIALS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:wyrmsteel_repair_materials"));
    private static final TagKey<Item> HAMMERS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:hammers"));
    private static final TagKey<Item> MATTOCKS = TagKey.create(Registries.ITEM, Identifier.parse("smithery:mattocks"));

    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {

        valueLookupBuilder(COPPER_NUGGETS)
                .add(ModItems.COPPER_NUGGET);

        valueLookupBuilder(INGOTS)
                .add(ModItems.ROSE_GOLD_INGOT)
                .add(ModItems.WYRMSTEEL_INGOT);

        valueLookupBuilder(BEACON_PAYMENTS)
                .add(ModItems.RUBY)
                .addTag(INGOTS);

        valueLookupBuilder(TOOLS)
                .addTag(MATTOCKS)
                .addTag(HAMMERS)
                .addTag(ROSE_GOLD_TOOLS)
                .addTag(RUBY_TOOLS)
                .addTag(WYRMSTEEL_TOOLS);

        valueLookupBuilder(ROSE_GOLD_TOOLS)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_SPEAR);

        valueLookupBuilder(ROSE_GOLD_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS);

        valueLookupBuilder(ROSE_GOLD_REPAIR_MATERIALS)
                .add(ModItems.ROSE_GOLD_INGOT);

        valueLookupBuilder(RUBY_TOOLS)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.RUBY_HAMMER);

        valueLookupBuilder(RUBY_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS);

        valueLookupBuilder(RUBY_REPAIR_MATERIALS)
                .add(ModItems.RUBY);

        valueLookupBuilder(WYRMSTEEL_TOOLS)
                .add(ModItems.WYRMSTEEL_PICKAXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_SPEAR)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.WYRMSTEEL_SHOVEL)
                .add(ModItems.WYRMSTEEL_HOE)
                .add(ModItems.WYRMSTEEL_HAMMER);

        valueLookupBuilder(WYRMSTEEL_ARMOR)
                .add(ModItems.WYRMSTEEL_HELMET)
                .add(ModItems.WYRMSTEEL_CHESTPLATE)
                .add(ModItems.WYRMSTEEL_LEGGINGS)
                .add(ModItems.WYRMSTEEL_BOOTS);

        valueLookupBuilder(WYRMSTEEL_REPAIR_MATERIALS)
                .add(ModItems.WYRMSTEEL_INGOT);

        valueLookupBuilder(HAMMERS)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.NETHERITE_HAMMER)
                .add(ModItems.WYRMSTEEL_HAMMER);

        valueLookupBuilder(MATTOCKS)
                .add(ModItems.WYRMSTEEL_MATTOCK)
                .add(ModItems.NETHERITE_MATTOCK)
                .add(ModItems.DIAMOND_MATTOCK)
                .add(ModItems.RUBY_MATTOCK)
                .add(ModItems.ROSE_GOLD_MATTOCK)
                .add(ModItems.IRON_MATTOCK)
                .add(ModItems.GOLDEN_MATTOCK);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE)
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

        valueLookupBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.ROSE_GOLD_SPEAR)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.WYRMSTEEL_SPEAR);

        valueLookupBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.ROSE_GOLD_SPEAR)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.WYRMSTEEL_SPEAR);

        valueLookupBuilder(ItemTags.LUNGE_ENCHANTABLE)
                .add(ModItems.ROSE_GOLD_SPEAR)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.WYRMSTEEL_SPEAR);

        valueLookupBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.ROSE_GOLD_SPEAR)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.RUBY_HAMMER)
                .add(ModItems.WYRMSTEEL_SWORD)
                .add(ModItems.WYRMSTEEL_SPEAR)
                .add(ModItems.WYRMSTEEL_PICKAXE)
                .add(ModItems.WYRMSTEEL_AXE)
                .add(ModItems.WYRMSTEEL_SHOVEL)
                .add(ModItems.WYRMSTEEL_HOE)
                .add(ModItems.WYRMSTEEL_HAMMER)
                .add(ModItems.DIAMOND_HAMMER)
                .add(ModItems.NETHERITE_HAMMER);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.WYRMSTEEL_SWORD);
        valueLookupBuilder(ItemTags.SPEARS)
                .add(ModItems.ROSE_GOLD_SPEAR)
                .add(ModItems.RUBY_SPEAR)
                .add(ModItems.WYRMSTEEL_SPEAR);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.WYRMSTEEL_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.WYRMSTEEL_SHOVEL);
        valueLookupBuilder(ItemTags.AXES)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.WYRMSTEEL_AXE);
        valueLookupBuilder(ItemTags.HOES)
                .addTag(MATTOCKS)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.WYRMSTEEL_HOE);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
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

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.WYRMSTEEL_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.WYRMSTEEL_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.WYRMSTEEL_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.ROSE_GOLD_BOOTS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.WYRMSTEEL_BOOTS);

        valueLookupBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.ROSE_GOLD_HELMET)
                .add(ModItems.ROSE_GOLD_CHESTPLATE)
                .add(ModItems.ROSE_GOLD_LEGGINGS)
                .add(ModItems.ROSE_GOLD_BOOTS)
                .add(ModItems.ROSE_GOLD_INGOT);

        valueLookupBuilder(PIGLIN_SAFE)
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
