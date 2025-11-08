package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.VOID_BLOCK);
        addDrop(ModBlocks.ROSE_GOLD_BLOCK);
        addDrop(ModBlocks.WYRMSTEEL_BLOCK);
        addDrop(ModBlocks.NETHER_RUBY_ORE, multiOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RUBY, 1.0f, 1.0f));
        addDrop(ModBlocks.QUICKSILVER_ORE, multiOreDrops(ModBlocks.QUICKSILVER_ORE, ModItems.QUICKSILVER, 1.0f, 2.0f));

        addDrop(ModBlocks.IRON_GRATE);

        addDrop(ModBlocks.GOLD_GRATE);
        addDrop(ModBlocks.GOLD_BARS);
        addDrop(ModBlocks.GOLD_CHAIN);

        addDrop(ModBlocks.ROSE_GOLD_GRATE);
        addDrop(ModBlocks.ROSE_GOLD_BARS);
        addDrop(ModBlocks.ROSE_GOLD_CHAIN);

        addDrop(ModBlocks.NETHERITE_GRATE);
        addDrop(ModBlocks.NETHERITE_BARS);
        addDrop(ModBlocks.NETHERITE_WALL);
        addDrop(ModBlocks.NETHERITE_CHAIN);
        addDrop(ModBlocks.NETHERITE_STAIRS);
        addDrop(ModBlocks.NETHERITE_SLAB);

        addDrop(ModBlocks.WYRMSTEEL_GRATE);
        addDrop(ModBlocks.WYRMSTEEL_BARS);
        addDrop(ModBlocks.WYRMSTEEL_WALL);
        addDrop(ModBlocks.WYRMSTEEL_CHAIN);
        addDrop(ModBlocks.WYRMSTEEL_STAIRS);
        addDrop(ModBlocks.WYRMSTEEL_SLAB);

    }

    public LootTable.Builder multiOreDrops(Block drop, Item idrop, float min, float max) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ItemEntry.builder(idrop)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
