package com.robinsplaza.smithery.datagen;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //wyrmsteel tools
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_PICKAXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_PICKAXE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_AXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_AXE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.DIAMOND_MATTOCK, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_SHOVEL, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_SHOVEL);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_HOE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HOE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.DIAMOND_SWORD, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_SWORD);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.DIAMOND_HAMMER, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HAMMER);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_PICKAXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_PICKAXE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_AXE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_AXE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_MATTOCK, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_SHOVEL, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_SHOVEL);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_HOE, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HOE);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_SWORD, ModItems.WYRMSTEEL_INGOT, RecipeCategory.COMBAT, ModItems.WYRMSTEEL_SWORD);
        offerBasicUpgradeRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, ModItems.RUBY_HAMMER, ModItems.WYRMSTEEL_INGOT, RecipeCategory.TOOLS, ModItems.WYRMSTEEL_HAMMER);

        //wyrmsteel armor
        //moved to manual recipes bc I cannot figure out for the life of me how to add attribute modifiers to the items themselves

        //netherite hammer and mattock
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_HAMMER, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HAMMER, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_MATTOCK, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MATTOCK);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_MATTOCK, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MATTOCK);

        //ruby gear to netherite
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HELMET, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_HELMET);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_CHESTPLATE, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_LEGGINGS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_LEGGINGS);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_BOOTS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_BOOTS);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_PICKAXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_PICKAXE);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_AXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_AXE);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_SHOVEL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_SHOVEL);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_HOE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_HOE);
        offerBasicUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.RUBY_SWORD, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_SWORD);

        //mattocks
        offerBasicUpgradeRecipe(exporter, ModItems.MULTITOOL_UPGRADE, Items.IRON_AXE, Items.IRON_HOE, RecipeCategory.TOOLS, ModItems.IRON_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.MULTITOOL_UPGRADE, Items.GOLDEN_AXE, Items.GOLDEN_HOE, RecipeCategory.TOOLS, ModItems.GOLDEN_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.MULTITOOL_UPGRADE, Items.DIAMOND_AXE, Items.DIAMOND_HOE, RecipeCategory.TOOLS, ModItems.DIAMOND_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.MULTITOOL_UPGRADE, ModItems.RUBY_AXE, ModItems.RUBY_HOE, RecipeCategory.TOOLS, ModItems.RUBY_MATTOCK);
        offerBasicUpgradeRecipe(exporter, ModItems.MULTITOOL_UPGRADE, ModItems.ROSE_GOLD_AXE, ModItems.ROSE_GOLD_HOE, RecipeCategory.TOOLS, ModItems.ROSE_GOLD_MATTOCK);

        //resources
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_GOLD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ROSE_GOLD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WYRMSTEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.WYRMSTEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);

        //deco blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_GRATE, Blocks.IRON_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BARS, Blocks.IRON_BLOCK, 24);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_TRAPDOOR, Blocks.IRON_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_DOOR, Blocks.IRON_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHAIN, Blocks.IRON_BLOCK, 8);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_GRATE, ModBlocks.ROSE_GOLD_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_BARS, ModBlocks.ROSE_GOLD_BLOCK, 24);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROSE_GOLD_CHAIN, ModBlocks.ROSE_GOLD_BLOCK, 8);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_GRATE, Blocks.GOLD_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_BARS, Blocks.GOLD_BLOCK, 24);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_CHAIN, Blocks.GOLD_BLOCK, 8);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_GRATE, Blocks.NETHERITE_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_BARS, Blocks.NETHERITE_BLOCK, 24);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_WALL, Blocks.NETHERITE_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_CHAIN, Blocks.NETHERITE_BLOCK, 8);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_GRATE, ModBlocks.WYRMSTEEL_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_BARS, ModBlocks.WYRMSTEEL_BLOCK, 24);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_WALL, ModBlocks.WYRMSTEEL_BLOCK, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WYRMSTEEL_CHAIN, ModBlocks.WYRMSTEEL_BLOCK, 8);

        //alloys
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WYRMSTEEL_INGOT, 1)
                .input(ModItems.QUICKSILVER)
                .input(ModItems.QUICKSILVER)
                .input(ModItems.QUICKSILVER)
                .input(ModItems.QUICKSILVER)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(ModItems.QUICKSILVER), conditionsFromItem(ModItems.QUICKSILVER))
                .offerTo(exporter, Identifier.of("wyrmsteel_crafting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 1)
                .input(ModItems.COPPER_NUGGET)
                .input(ModItems.COPPER_NUGGET)
                .input(ModItems.COPPER_NUGGET)
                .input(ModItems.COPPER_NUGGET)
                .input(ModItems.COPPER_NUGGET)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .input(Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_crafting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, 9)
                .input(ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_nugget_from_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 1)
                .pattern("rrr")
                .pattern("rrr")
                .pattern("rrr")
                .input('r', ModItems.ROSE_GOLD_NUGGET)
                .criterion(hasItem(ModItems.ROSE_GOLD_NUGGET), conditionsFromItem(ModItems.ROSE_GOLD_NUGGET))
                .offerTo(exporter, Identifier.of("rose_gold_ingot_from_nugget"));

        //void blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.VOID_BLOCK, 4)
                .pattern("qqq")
                .pattern("qgq")
                .pattern("qqq")
                .input('g', Blocks.GLOWSTONE)
                .input('q', ModItems.QUICKSILVER)
                .criterion(hasItem(ModItems.QUICKSILVER), conditionsFromItem(ModItems.QUICKSILVER))
                .offerTo(exporter, Identifier.of("void_block_crafting"));

        //hamma
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_HAMMER, 1)
                .pattern(" d ")
                .pattern(" sd")
                .pattern("s  ")
                .input('d', Blocks.DIAMOND_BLOCK)
                .input('s', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Blocks.DIAMOND_BLOCK))
                .offerTo(exporter, Identifier.of("diamond_hammer_crafting"));


        //rose gold gear
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE, 1)
                .pattern("rrr")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE, 1)
                .pattern("rr ")
                .pattern("rs ")
                .pattern(" s ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL, 1)
                .pattern(" r ")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE, 1)
                .pattern("rr ")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD, 1)
                .pattern(" r ")
                .pattern(" r ")
                .pattern(" s ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_HELMET, 1)
                .pattern("rrr")
                .pattern("r r")
                .pattern("   ")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_CHESTPLATE, 1)
                .pattern("r r")
                .pattern("rrr")
                .pattern("rrr")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_LEGGINGS, 1)
                .pattern("rrr")
                .pattern("r r")
                .pattern("r r")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_leggings"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_BOOTS, 1)
                .pattern("   ")
                .pattern("r r")
                .pattern("r r")
                .input('r', ModItems.ROSE_GOLD_INGOT)
                .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of("rose_gold_boots"));

        //ruby gear
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
                .pattern("rrr")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.RUBY)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_pickaxe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HAMMER, 1)
                .pattern(" r ")
                .pattern(" sr")
                .pattern("s  ")
                .input('r', ModBlocks.RUBY_BLOCK)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, Identifier.of("ruby_hammer_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE, 1)
                .pattern("rr ")
                .pattern("rs ")
                .pattern(" s ")
                .input('r', ModItems.RUBY)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_axe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL, 1)
                .pattern(" r ")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.RUBY)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_shovel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE, 1)
                .pattern("rr ")
                .pattern(" s ")
                .pattern(" s ")
                .input('r', ModItems.RUBY)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_hoe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_SWORD, 1)
                .pattern(" r ")
                .pattern(" r ")
                .pattern(" s ")
                .input('r', ModItems.RUBY)
                .input('s', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_sword"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_HELMET, 1)
                .pattern("rrr")
                .pattern("r r")
                .pattern("   ")
                .input('r', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_helmet"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE, 1)
                .pattern("r r")
                .pattern("rrr")
                .pattern("rrr")
                .input('r', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_chestplate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS, 1)
                .pattern("rrr")
                .pattern("r r")
                .pattern("r r")
                .input('r', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_leggings"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS, 1)
                .pattern("   ")
                .pattern("r r")
                .pattern("r r")
                .input('r', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of("ruby_boots"));


        offerSmithingTemplateCopyingRecipe(exporter, ModItems.WYRMSTEEL_UPGRADE, Items.END_STONE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.MULTITOOL_UPGRADE, Items.IRON_INGOT);

    }

    public static void offerBasicUpgradeRecipe(RecipeExporter exporter,Item template, Item input, Item ingot, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(new ItemConvertible[]{template}),
                Ingredient.ofItems(new ItemConvertible[]{input}), Ingredient.ofItems(new ItemConvertible[]{ingot}),
                category, result)
                .criterion("has_" + getItemPath(ingot), conditionsFromItem(ingot))
                .offerTo(exporter, getItemPath(result) + "_smithing_from_" + getItemPath(input));
    }
}
