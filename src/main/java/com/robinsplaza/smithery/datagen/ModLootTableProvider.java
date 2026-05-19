package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {

    public ModLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.ROSE_GOLD_BLOCK);
        dropSelf(ModBlocks.WYRMSTEEL_BLOCK);
        add(ModBlocks.NETHER_RUBY_ORE, multiOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RUBY, 1.0f, 1.0f));
        add(ModBlocks.QUICKSILVER_ORE, multiOreDrops(ModBlocks.QUICKSILVER_ORE, ModItems.QUICKSILVER, 1.0f, 2.0f));

        dropSelf(ModBlocks.IRON_GRATE);
        dropSelf(ModBlocks.CUT_IRON);
        dropSelf(ModBlocks.CUT_IRON_WALL);
        dropSelf(ModBlocks.CUT_IRON_STAIRS);
        add(ModBlocks.CUT_IRON_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.GOLD_GRATE);
        dropSelf(ModBlocks.GOLD_BARS);
        dropSelf(ModBlocks.GOLD_CHAIN);
        dropSelf(ModBlocks.CUT_GOLD);
        dropSelf(ModBlocks.CUT_GOLD_WALL);
        dropSelf(ModBlocks.CUT_GOLD_STAIRS);
        add(ModBlocks.CUT_GOLD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.ROSE_GOLD_GRATE);
        dropSelf(ModBlocks.ROSE_GOLD_BARS);
        dropSelf(ModBlocks.ROSE_GOLD_CHAIN);
        dropSelf(ModBlocks.CUT_ROSE_GOLD);
        dropSelf(ModBlocks.CUT_ROSE_GOLD_WALL);
        dropSelf(ModBlocks.CUT_ROSE_GOLD_STAIRS);
        add(ModBlocks.CUT_ROSE_GOLD_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.NETHERITE_GRATE);
        dropSelf(ModBlocks.NETHERITE_BARS);
        dropSelf(ModBlocks.CUT_NETHERITE);
        dropSelf(ModBlocks.CUT_NETHERITE_WALL);
        dropSelf(ModBlocks.CUT_NETHERITE_STAIRS);
        add(ModBlocks.CUT_NETHERITE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.NETHERITE_WALL);
        dropSelf(ModBlocks.NETHERITE_CHAIN);
        dropSelf(ModBlocks.NETHERITE_STAIRS);
        add(ModBlocks.NETHERITE_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.WYRMSTEEL_GRATE);
        dropSelf(ModBlocks.WYRMSTEEL_BARS);
        dropSelf(ModBlocks.CUT_WYRMSTEEL);
        dropSelf(ModBlocks.CUT_WYRMSTEEL_WALL);
        add(ModBlocks.CUT_WYRMSTEEL_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.CUT_WYRMSTEEL_STAIRS);
        dropSelf(ModBlocks.WYRMSTEEL_WALL);
        dropSelf(ModBlocks.WYRMSTEEL_CHAIN);
        dropSelf(ModBlocks.WYRMSTEEL_STAIRS);
        add(ModBlocks.WYRMSTEEL_SLAB, this::createSlabItemTable);

    }

    public LootTable.Builder multiOreDrops(Block drop, Item idrop, float min, float max) {
        HolderLookup.RegistryLookup<Enchantment> impl = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(drop, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(drop, LootItem.lootTableItem(idrop)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                .apply(ApplyBonusCount.addOreBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
