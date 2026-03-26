package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.datagen.ModItemTagProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterial {

    public static ToolMaterial WYRMSTEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1432, 38.29f, 2.0f, 15, ModItemTagProvider.WYRMSTEEL_REPAIR_MATERIALS);

    public static ToolMaterial ROSE_GOLD = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
            250, 12.0f, 0.0f, 20, ModItemTagProvider.WYRMSTEEL_REPAIR_MATERIALS);

    public static ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561, 6.0f, 2.0f, 14, ModItemTagProvider.RUBY_REPAIR_MATERIALS);

    public static ToolMaterial WYRMSTEEL_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            5728, 38.29f, 2.0f, 15, ModItemTagProvider.WYRMSTEEL_REPAIR_MATERIALS);

    public static ToolMaterial DIAMOND_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            6244, 8.0f, 3.0f, 10, ItemTags.DIAMOND_TOOL_MATERIALS);

    public static ToolMaterial RUBY_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            6244, 8.0f, 3.0f, 10, ModItemTagProvider.RUBY_REPAIR_MATERIALS);

    public static ToolMaterial NETHERITE_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            8124, 9.0f, 4.0f, 15, ItemTags.NETHERITE_TOOL_MATERIALS);
}
