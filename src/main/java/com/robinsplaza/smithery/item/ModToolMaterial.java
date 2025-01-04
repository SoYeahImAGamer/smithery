package com.robinsplaza.smithery.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum ModToolMaterial implements ToolMaterial {
    WYRMSTEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1432, 38.29F, 2.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.WYRMSTEEL_INGOT});
    }),
    ROSE_GOLD(BlockTags.INCORRECT_FOR_STONE_TOOL, 250, 12.0F, 0.0F, 20, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ROSE_GOLD_INGOT});
    }),
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 6.0F, 2.0F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    WYRMSTEEL_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 5728, 38.29F, 2.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.WYRMSTEEL_INGOT});
    }),
    DIAMOND_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6244, 8.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    RUBY_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6244, 8.0F, 3.0F, 10, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    NETHERITE_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 8124, 9.0F, 4.0F, 15, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHERITE_INGOT});
    });

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterial(final TagKey inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
