package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.Smithery;
import com.robinsplaza.smithery.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Smithery.MOD_ID, "smithery"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smithery"))
                    .icon(() -> new ItemStack(Items.SMITHING_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MULTITOOL_UPGRADE);

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModItems.QUICKSILVER);
                        entries.add(ModBlocks.QUICKSILVER_ORE);
                        entries.add(ModItems.WYRMSTEEL_INGOT);
                        entries.add(ModBlocks.WYRMSTEEL_BLOCK);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);
                        entries.add(ModBlocks.ROSE_GOLD_BLOCK);

                        entries.add(ModItems.ROSE_GOLD_PICKAXE);
                        entries.add(ModItems.ROSE_GOLD_AXE);
                        entries.add(ModItems.ROSE_GOLD_MATTOCK);
                        entries.add(ModItems.ROSE_GOLD_SHOVEL);
                        entries.add(ModItems.ROSE_GOLD_HOE);
                        entries.add(ModItems.ROSE_GOLD_SWORD);

                        entries.add(ModItems.ROSE_GOLD_HELMET);
                        entries.add(ModItems.ROSE_GOLD_CHESTPLATE);
                        entries.add(ModItems.ROSE_GOLD_LEGGINGS);
                        entries.add(ModItems.ROSE_GOLD_BOOTS);

                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_HAMMER);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_MATTOCK);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SWORD);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.WYRMSTEEL_UPGRADE);

                        entries.add(ModItems.WYRMSTEEL_PICKAXE);
                        entries.add(ModItems.WYRMSTEEL_HAMMER);
                        entries.add(ModItems.WYRMSTEEL_AXE);
                        entries.add(ModItems.WYRMSTEEL_MATTOCK);
                        entries.add(ModItems.WYRMSTEEL_SHOVEL);
                        entries.add(ModItems.WYRMSTEEL_HOE);
                        entries.add(ModItems.WYRMSTEEL_SWORD);

                        entries.add(ModItems.WYRMSTEEL_HELMET);
                        entries.add(ModItems.WYRMSTEEL_CHESTPLATE);
                        entries.add(ModItems.WYRMSTEEL_LEGGINGS);
                        entries.add(ModItems.WYRMSTEEL_BOOTS);

                        entries.add(ModItems.DIAMOND_HAMMER);
                        entries.add(ModItems.NETHERITE_HAMMER);
                        entries.add(ModItems.DIAMOND_MATTOCK);
                        entries.add(ModItems.NETHERITE_MATTOCK);
                        entries.add(ModItems.IRON_MATTOCK);
                        entries.add(ModItems.GOLDEN_MATTOCK);

                        entries.add(ModBlocks.VOID_BLOCK);
                        entries.add(ModBlocks.IRON_GRATE);
                        entries.add(ModBlocks.ROSE_GOLD_GRATE);
                        entries.add(ModBlocks.ROSE_GOLD_BARS);
                        entries.add(ModBlocks.ROSE_GOLD_CHAIN);
                        entries.add(ModBlocks.GOLD_GRATE);
                        entries.add(ModBlocks.GOLD_BARS);
                        entries.add(ModBlocks.GOLD_CHAIN);
                        entries.add(ModBlocks.NETHERITE_GRATE);
                        entries.add(ModBlocks.NETHERITE_BARS);
                        entries.add(ModBlocks.NETHERITE_WALL);
                        entries.add(ModBlocks.NETHERITE_CHAIN);

                    }).build());

    public static void registerItemGroups(){
        Smithery.LOGGER.info("Registering Item Groups for " + Smithery.MOD_ID);
    }
}
