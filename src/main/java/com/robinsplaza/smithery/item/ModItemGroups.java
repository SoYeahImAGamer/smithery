package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.Smithery;
import com.robinsplaza.smithery.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroups {
    public static final CreativeModeTab RUBY_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, "smithery"),
            FabricCreativeModeTab.builder().title(Component.translatable("itemgroup.smithery"))
                    .icon(() -> new ItemStack(Items.SMITHING_TABLE)).displayItems((displayContext, entries) -> {
                        entries.accept(ModItems.MULTITOOL_UPGRADE);

                        entries.accept(ModItems.RUBY);
                        entries.accept(ModBlocks.RUBY_BLOCK);
                        entries.accept(ModBlocks.NETHER_RUBY_ORE);
                        entries.accept(ModItems.QUICKSILVER);
                        entries.accept(ModBlocks.QUICKSILVER_ORE);
                        entries.accept(ModItems.WYRMSTEEL_INGOT);
                        entries.accept(ModBlocks.WYRMSTEEL_BLOCK);
                        entries.accept(ModItems.ROSE_GOLD_INGOT);
                        entries.accept(ModItems.ROSE_GOLD_NUGGET);
                        entries.accept(ModBlocks.ROSE_GOLD_BLOCK);

                        entries.accept(ModItems.ROSE_GOLD_PICKAXE);
                        entries.accept(ModItems.ROSE_GOLD_AXE);
                        entries.accept(ModItems.ROSE_GOLD_MATTOCK);
                        entries.accept(ModItems.ROSE_GOLD_SHOVEL);
                        entries.accept(ModItems.ROSE_GOLD_HOE);
                        entries.accept(ModItems.ROSE_GOLD_SWORD);

                        entries.accept(ModItems.ROSE_GOLD_HELMET);
                        entries.accept(ModItems.ROSE_GOLD_CHESTPLATE);
                        entries.accept(ModItems.ROSE_GOLD_LEGGINGS);
                        entries.accept(ModItems.ROSE_GOLD_BOOTS);

                        entries.accept(ModItems.RUBY_PICKAXE);
                        entries.accept(ModItems.RUBY_HAMMER);
                        entries.accept(ModItems.RUBY_AXE);
                        entries.accept(ModItems.RUBY_MATTOCK);
                        entries.accept(ModItems.RUBY_SHOVEL);
                        entries.accept(ModItems.RUBY_HOE);
                        entries.accept(ModItems.RUBY_SWORD);

                        entries.accept(ModItems.RUBY_HELMET);
                        entries.accept(ModItems.RUBY_CHESTPLATE);
                        entries.accept(ModItems.RUBY_LEGGINGS);
                        entries.accept(ModItems.RUBY_BOOTS);

                        entries.accept(ModItems.WYRMSTEEL_UPGRADE);

                        entries.accept(ModItems.WYRMSTEEL_PICKAXE);
                        entries.accept(ModItems.WYRMSTEEL_HAMMER);
                        entries.accept(ModItems.WYRMSTEEL_AXE);
                        entries.accept(ModItems.WYRMSTEEL_MATTOCK);
                        entries.accept(ModItems.WYRMSTEEL_SHOVEL);
                        entries.accept(ModItems.WYRMSTEEL_HOE);
                        entries.accept(ModItems.WYRMSTEEL_SWORD);

                        entries.accept(ModItems.WYRMSTEEL_HELMET);
                        entries.accept(ModItems.WYRMSTEEL_CHESTPLATE);
                        entries.accept(ModItems.WYRMSTEEL_LEGGINGS);
                        entries.accept(ModItems.WYRMSTEEL_BOOTS);

                        entries.accept(ModItems.DIAMOND_HAMMER);
                        entries.accept(ModItems.NETHERITE_HAMMER);
                        entries.accept(ModItems.DIAMOND_MATTOCK);
                        entries.accept(ModItems.NETHERITE_MATTOCK);
                        entries.accept(ModItems.IRON_MATTOCK);
                        entries.accept(ModItems.GOLDEN_MATTOCK);

                        entries.accept(ModBlocks.IRON_GRATE);
                        entries.accept(ModBlocks.ROSE_GOLD_GRATE);
                        entries.accept(ModBlocks.ROSE_GOLD_BARS);
                        entries.accept(ModBlocks.ROSE_GOLD_CHAIN);
                        entries.accept(ModBlocks.GOLD_GRATE);
                        entries.accept(ModBlocks.GOLD_BARS);
                        entries.accept(ModBlocks.GOLD_CHAIN);
                        entries.accept(ModBlocks.NETHERITE_GRATE);
                        entries.accept(ModBlocks.NETHERITE_BARS);
                        entries.accept(ModBlocks.NETHERITE_WALL);
                        entries.accept(ModBlocks.NETHERITE_CHAIN);
                        entries.accept(ModBlocks.NETHERITE_STAIRS);
                        entries.accept(ModBlocks.NETHERITE_SLAB);
                        entries.accept(ModBlocks.WYRMSTEEL_GRATE);
                        entries.accept(ModBlocks.WYRMSTEEL_BARS);
                        entries.accept(ModBlocks.WYRMSTEEL_WALL);
                        entries.accept(ModBlocks.WYRMSTEEL_CHAIN);
                        entries.accept(ModBlocks.WYRMSTEEL_STAIRS);
                        entries.accept(ModBlocks.WYRMSTEEL_SLAB);

                        entries.accept(ModItems.COPPER_SPUR);
                        entries.accept(ModItems.SILVER_SPUR);
                        entries.accept(ModItems.GOLDEN_SPUR);

                    }).build());

    public static void registerItemGroups(){
        Smithery.LOGGER.info("Registering Item Groups for " + Smithery.MOD_ID);
    }
}
