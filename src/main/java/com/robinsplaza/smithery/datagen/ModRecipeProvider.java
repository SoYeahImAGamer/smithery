package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Blocks;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.RecipeProvider.inventoryTrigger;
import static net.minecraft.data.recipes.RecipeProvider.getItemName;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {

                //wyrmsteel tools
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_PICKAXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_PICKAXE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_AXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_AXE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.DIAMOND_MATTOCK, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_SHOVEL, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_SHOVEL);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_HOE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HOE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_SWORD, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_SWORD);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.DIAMOND_HAMMER, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HAMMER);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_PICKAXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_PICKAXE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_AXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_AXE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_MATTOCK, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_SHOVEL, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_SHOVEL);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_HOE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HOE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_SWORD, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_SWORD);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_HAMMER, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HAMMER);

                //wyrmsteel armor
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_HELMET, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_HELMET);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_CHESTPLATE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_CHESTPLATE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_LEGGINGS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_LEGGINGS);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_BOOTS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_BOOTS);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_HELMET, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_HELMET);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_CHESTPLATE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_CHESTPLATE);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_LEGGINGS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_LEGGINGS);
                offerBasicUpgradeRecipe(output, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_BOOTS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_BOOTS);

                //netherite hammer and mattock
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HAMMER, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_MATTOCK, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MATTOCK);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_MATTOCK, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MATTOCK);

                //ruby gear to netherite
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HELMET, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_HELMET);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_CHESTPLATE, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_LEGGINGS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_LEGGINGS);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_BOOTS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_BOOTS);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_PICKAXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_PICKAXE);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_AXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_AXE);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_SHOVEL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_SHOVEL);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HOE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_HOE);
                offerBasicUpgradeRecipe(output, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_SWORD, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_SWORD);

                //mattocks
                offerBasicUpgradeRecipe(output, ModItems.MULTITOOL_UPGRADE, Items.IRON_AXE, Items.IRON_HOE, RecipeCategory.TOOLS, ModItems.IRON_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.MULTITOOL_UPGRADE, Items.GOLDEN_AXE, Items.GOLDEN_HOE, RecipeCategory.TOOLS, ModItems.GOLDEN_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.MULTITOOL_UPGRADE, Items.DIAMOND_AXE, Items.DIAMOND_HOE, RecipeCategory.TOOLS, ModItems.DIAMOND_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.MULTITOOL_UPGRADE, ModItems.RUBY_AXE, ModItems.RUBY_HOE, RecipeCategory.TOOLS, ModItems.RUBY_MATTOCK);
                offerBasicUpgradeRecipe(output, ModItems.MULTITOOL_UPGRADE, ModItems.ROSE_GOLD_AXE, ModItems.ROSE_GOLD_HOE, RecipeCategory.TOOLS, ModItems.ROSE_GOLD_MATTOCK);

                //resources
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ROSE_GOLD_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.WYRMSTEEL_BLOCK);

                //deco blocks
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_GRATE, Blocks.IRON_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BARS, Blocks.IRON_BLOCK, 24);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_TRAPDOOR, Blocks.IRON_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_DOOR, Blocks.IRON_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_CHAIN, Blocks.IRON_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON, Blocks.IRON_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_STAIRS, Blocks.IRON_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_WALL, Blocks.IRON_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_SLAB, Blocks.IRON_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_STAIRS, ModBlocks.CUT_IRON, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_WALL, ModBlocks.CUT_IRON, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_SLAB, ModBlocks.CUT_IRON, 2);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_SLAB, ModBlocks.CUT_IRON);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_WALL, ModBlocks.CUT_IRON);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_IRON_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ModBlocks.CUT_IRON)
                        .unlockedBy(getHasName(ModBlocks.CUT_IRON), has(ModBlocks.CUT_IRON))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("cut_iron_stairs")));

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_GRATE, ModBlocks.ROSE_GOLD_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_BARS, ModBlocks.ROSE_GOLD_BLOCK, 24);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_CHAIN, ModBlocks.ROSE_GOLD_BLOCK, 8);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_GRATE, Blocks.GOLD_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_BARS, Blocks.GOLD_BLOCK, 24);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_CHAIN, Blocks.GOLD_BLOCK, 8);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_GRATE, Blocks.NETHERITE_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_BARS, Blocks.NETHERITE_BLOCK, 24);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_CHAIN, Blocks.NETHERITE_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE, Blocks.NETHERITE_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_WALL, Blocks.NETHERITE_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_STAIRS, Blocks.NETHERITE_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_SLAB, Blocks.NETHERITE_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_STAIRS, ModBlocks.CUT_NETHERITE, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_WALL, ModBlocks.CUT_NETHERITE, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_SLAB, ModBlocks.CUT_NETHERITE, 2);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_SLAB, ModBlocks.CUT_NETHERITE);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_WALL, ModBlocks.CUT_NETHERITE);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERITE_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ModBlocks.CUT_NETHERITE)
                        .unlockedBy(getHasName(ModBlocks.CUT_NETHERITE), has(ModBlocks.CUT_NETHERITE))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("cut_netherite_stairs")));

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_GRATE, ModBlocks.WYRMSTEEL_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_BARS, ModBlocks.WYRMSTEEL_BLOCK, 24);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL, ModBlocks.WYRMSTEEL_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_WALL, ModBlocks.WYRMSTEEL_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_CHAIN, ModBlocks.WYRMSTEEL_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_STAIRS, ModBlocks.WYRMSTEEL_BLOCK, 4);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_SLAB, ModBlocks.WYRMSTEEL_BLOCK, 8);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_STAIRS, ModBlocks.CUT_WYRMSTEEL, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_WALL, ModBlocks.CUT_WYRMSTEEL, 1);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_SLAB, ModBlocks.CUT_WYRMSTEEL, 2);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_SLAB, ModBlocks.CUT_WYRMSTEEL);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_WALL, ModBlocks.CUT_WYRMSTEEL);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_WYRMSTEEL_STAIRS, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .define('#', ModBlocks.CUT_WYRMSTEEL)
                        .unlockedBy(getHasName(ModBlocks.CUT_WYRMSTEEL), has(ModBlocks.CUT_WYRMSTEEL))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("cut_wyrmsteel_stairs")));


                //alloys
                shapeless(RecipeCategory.MISC, ModItems.WYRMSTEEL_INGOT, 1)
                        .requires(ModItems.QUICKSILVER)
                        .requires(ModItems.QUICKSILVER)
                        .requires(ModItems.QUICKSILVER)
                        .requires(ModItems.QUICKSILVER)
                        .requires(Items.COPPER_INGOT)
                        .requires(Items.COPPER_INGOT)
                        .requires(Items.COPPER_INGOT)
                        .requires(Items.COPPER_INGOT)
                        .unlockedBy(getHasName(ModItems.QUICKSILVER), has(ModItems.QUICKSILVER))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("wyrmsteel_crafting")));

                shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 1)
                        .requires(Items.COPPER_NUGGET)
                        .requires(Items.COPPER_NUGGET)
                        .requires(Items.COPPER_NUGGET)
                        .requires(Items.COPPER_NUGGET)
                        .requires(Items.COPPER_NUGGET)
                        .requires(Items.GOLD_NUGGET)
                        .requires(Items.GOLD_NUGGET)
                        .requires(Items.GOLD_NUGGET)
                        .requires(Items.GOLD_NUGGET)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_crafting")));

                shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, 9)
                        .requires(ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_nugget_from_ingot")));

                shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 1)
                        .pattern("rrr")
                        .pattern("rrr")
                        .pattern("rrr")
                        .define('r', ModItems.ROSE_GOLD_NUGGET)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET), has(ModItems.ROSE_GOLD_NUGGET))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_ingot_from_nugget")));

                //hamma
                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER, 1)
                        .pattern(" d ")
                        .pattern(" sd")
                        .pattern("s  ")
                        .define('d', Blocks.DIAMOND_BLOCK)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Blocks.DIAMOND_BLOCK))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("diamond_hammer_crafting")));


                //rose gold gear
                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE, 1)
                        .pattern("rrr")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_pickaxe")));

                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE, 1)
                        .pattern("rr ")
                        .pattern("rs ")
                        .pattern(" s ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_axe")));

                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL, 1)
                        .pattern(" r ")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_shovel")));

                shaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE, 1)
                        .pattern("rr ")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_hoe")));

                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD, 1)
                        .pattern(" r ")
                        .pattern(" r ")
                        .pattern(" s ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_sword")));

                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET, 1)
                        .pattern("rrr")
                        .pattern("r r")
                        .pattern("   ")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_helmet")));

                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE, 1)
                        .pattern("r r")
                        .pattern("rrr")
                        .pattern("rrr")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_chestplate")));

                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS, 1)
                        .pattern("rrr")
                        .pattern("r r")
                        .pattern("r r")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_leggings")));

                shaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS, 1)
                        .pattern("   ")
                        .pattern("r r")
                        .pattern("r r")
                        .define('r', ModItems.ROSE_GOLD_INGOT)
                        .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT), has(ModItems.ROSE_GOLD_INGOT))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("rose_gold_boots")));

                //ruby gear
                shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
                        .pattern("rrr")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.RUBY)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_pickaxe")));

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_HAMMER, 1)
                        .pattern(" r ")
                        .pattern(" sr")
                        .pattern("s  ")
                        .define('r', ModBlocks.RUBY_BLOCK)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModBlocks.RUBY_BLOCK))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_hammer_crafting")));

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE, 1)
                        .pattern("rr ")
                        .pattern("rs ")
                        .pattern(" s ")
                        .define('r', ModItems.RUBY)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_axe")));

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL, 1)
                        .pattern(" r ")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.RUBY)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_shovel")));

                shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE, 1)
                        .pattern("rr ")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('r', ModItems.RUBY)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_hoe")));

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD, 1)
                        .pattern(" r ")
                        .pattern(" r ")
                        .pattern(" s ")
                        .define('r', ModItems.RUBY)
                        .define('s', Items.STICK)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_sword")));

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET, 1)
                        .pattern("rrr")
                        .pattern("r r")
                        .pattern("   ")
                        .define('r', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_helmet")));

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE, 1)
                        .pattern("r r")
                        .pattern("rrr")
                        .pattern("rrr")
                        .define('r', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_chestplate")));

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS, 1)
                        .pattern("rrr")
                        .pattern("r r")
                        .pattern("r r")
                        .define('r', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_leggings")));

                shaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS, 1)
                        .pattern("   ")
                        .pattern("r r")
                        .pattern("r r")
                        .define('r', ModItems.RUBY)
                        .unlockedBy(getHasName(ModItems.RUBY), has(ModItems.RUBY))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("ruby_boots")));

                //Spurs

                shaped(RecipeCategory.MISC, ModItems.COPPER_SPUR, 8)
                        .pattern("###")
                        .pattern("#!#")
                        .pattern("###")
                        .define('#', Items.COPPER_INGOT)
                        .define('!', Items.DIAMOND)
                        .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("copper_spur_from_diamond")));

                shapeless(RecipeCategory.MISC, ModItems.SILVER_SPUR, 1)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .requires(ModItems.COPPER_SPUR)
                        .unlockedBy(getHasName(ModItems.COPPER_SPUR), has(ModItems.COPPER_SPUR))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("silver_spur_from_copper_spur")));

                shapeless(RecipeCategory.MISC, ModItems.GOLDEN_SPUR, 1)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .requires(ModItems.SILVER_SPUR)
                        .unlockedBy(getHasName(ModItems.SILVER_SPUR), has(ModItems.SILVER_SPUR))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("golden_spur_from_silver_spur")));

                shapeless(RecipeCategory.MISC, ModItems.SILVER_SPUR, 8)
                        .requires(ModItems.GOLDEN_SPUR)
                        .unlockedBy(getHasName(ModItems.GOLDEN_SPUR), has(ModItems.GOLDEN_SPUR))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("silver_spur_from_golden_spur")));

                shapeless(RecipeCategory.MISC, ModItems.COPPER_SPUR, 8)
                        .requires(ModItems.SILVER_SPUR)
                        .unlockedBy(getHasName(ModItems.SILVER_SPUR), has(ModItems.SILVER_SPUR))
                        .save(output, ResourceKey.create(Registries.RECIPE, Identifier.parse("copper_spur_from_silver_spur")));

                oreSmelting(List.of(ModItems.SILVER_SPUR), RecipeCategory.MISC, CookingBookCategory.MISC , Items.DIAMOND, 0.3f, 200, "spur_to_diamond");


                copySmithingTemplate(ModItems.WYRMSTEEL_UPGRADE, Items.END_STONE);
                copySmithingTemplate(ModItems.MULTITOOL_UPGRADE, Items.IRON_INGOT);

            }
        };
    }

    public void offerBasicUpgradeRecipe(RecipeOutput exporter, Item template, Item input, Item ingot, RecipeCategory category, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(template),
                Ingredient.of(input), Ingredient.of(ingot), category, result)
                .unlocks("has_" + getItemName(ingot), RecipeProvider.insideOf(Blocks.AIR))
                .save(exporter, getItemName(result) + "_smithing_from_" + getItemName(input));
    }


    @Override
    public String getName() {
        return "Smithery Recipes";
    }
}
