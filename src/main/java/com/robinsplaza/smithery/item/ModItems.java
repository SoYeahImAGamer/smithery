package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.Smithery;
import com.robinsplaza.smithery.item.custom.HammerItem;
import com.robinsplaza.smithery.item.custom.MirrorItem;
import com.robinsplaza.smithery.item.custom.SpeedArmorItem;
import com.robinsplaza.smithery.item.custom.ModSmithingTemplateItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    //tools
        //mirror (figure out teleport mechanics before adding recipe)
    public static final MirrorItem MAGIC_MIRROR = (MirrorItem) registerItem("magic_mirror",
            new MirrorItem(new MirrorItem.Settings().maxCount(1).maxDamage(128)));

        //wyrmsteel set (fast tools)
    public static final PickaxeItem WYRMSTEEL_PICKAXE = (PickaxeItem) registerItem("wyrmsteel_pickaxe",
            new PickaxeItem(ModToolMaterial.WYRMSTEEL, new Item.Settings().rarity(Rarity.UNCOMMON)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL, 1.0F, -2.4F))));
    public static final Item WYRMSTEEL_HAMMER = registerItem("wyrmsteel_hammer",
            new HammerItem(ModToolMaterial.WYRMSTEEL_HAMMER, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(4296)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL_HAMMER, 6, -3.0F))));
    public static final AxeItem WYRMSTEEL_AXE = (AxeItem) registerItem("wyrmsteel_axe",
            new AxeItem(ModToolMaterial.WYRMSTEEL, new Item.Settings().rarity(Rarity.UNCOMMON)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL, 6, -2.8f))));
    public static final ShovelItem WYRMSTEEL_SHOVEL = (ShovelItem) registerItem("wyrmsteel_shovel",
            new ShovelItem(ModToolMaterial.WYRMSTEEL, new Item.Settings().rarity(Rarity.UNCOMMON)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL, 2, -2.2f))));
    public static final HoeItem WYRMSTEEL_HOE = (HoeItem) registerItem("wyrmsteel_hoe",
            new HoeItem(ModToolMaterial.WYRMSTEEL, new Item.Settings().rarity(Rarity.UNCOMMON)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL, 1, -2.2f))));
    public static final SwordItem WYRMSTEEL_SWORD = (SwordItem) registerItem("wyrmsteel_sword",
            new SwordItem(ModToolMaterial.WYRMSTEEL, new Item.Settings().rarity(Rarity.UNCOMMON)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.WYRMSTEEL, 4, -2f))));

        //rose gold set (sturdier gold)
    public static final PickaxeItem ROSE_GOLD_PICKAXE = (PickaxeItem) registerItem("rose_gold_pickaxe",
            new PickaxeItem(ModToolMaterial.ROSE_GOLD, new Item.Settings().rarity(Rarity.COMMON)
                     .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.ROSE_GOLD, 1.0f, -2.8F))));
    public static final AxeItem ROSE_GOLD_AXE = (AxeItem) registerItem("rose_gold_axe",
            new AxeItem(ModToolMaterial.ROSE_GOLD, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.ROSE_GOLD, 6, -3.0f))));
    public static final ShovelItem ROSE_GOLD_SHOVEL = (ShovelItem) registerItem("rose_gold_shovel",
            new ShovelItem(ModToolMaterial.ROSE_GOLD, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.ROSE_GOLD, 1.5f, -3.0f))));
    public static final HoeItem ROSE_GOLD_HOE = (HoeItem) registerItem("rose_gold_hoe",
            new HoeItem(ModToolMaterial.ROSE_GOLD, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.ROSE_GOLD, 0, -3.0f))));
    public static final SwordItem ROSE_GOLD_SWORD = (SwordItem) registerItem("rose_gold_sword",
            new SwordItem(ModToolMaterial.ROSE_GOLD, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.ROSE_GOLD, 3, -2.4f))));

        //ruby set (red diamonds)
    public static final PickaxeItem RUBY_PICKAXE = (PickaxeItem) registerItem("ruby_pickaxe",
            new PickaxeItem(ToolMaterials.DIAMOND, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.0F, -2.8F))));
    public static final Item RUBY_HAMMER = registerItem("ruby_hammer",
            new HammerItem(ModToolMaterial.DIAMOND_HAMMER, new Item.Settings().rarity(Rarity.COMMON).maxDamage(4296)
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.DIAMOND_HAMMER, 6, -3.2F))));
    public static final AxeItem RUBY_AXE = (AxeItem) registerItem("ruby_axe",
            new AxeItem(ToolMaterials.DIAMOND, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 6, -3.0f))));
    public static final ShovelItem RUBY_SHOVEL = (ShovelItem) registerItem("ruby_shovel",
            new ShovelItem(ToolMaterials.DIAMOND, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1.5f, -3.0f))));
    public static final HoeItem RUBY_HOE = (HoeItem) registerItem("ruby_hoe",
            new HoeItem(ToolMaterials.DIAMOND, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 0, -3.0f))));
    public static final SwordItem RUBY_SWORD = (SwordItem) registerItem("ruby_sword",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().rarity(Rarity.COMMON)
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4f))));

        //vaniller hammers
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new HammerItem(ModToolMaterial.DIAMOND_HAMMER, new Item.Settings().attributeModifiers(PickaxeItem
                    .createAttributeModifiers(ModToolMaterial.DIAMOND_HAMMER, 6, -3.2F))));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new HammerItem(ModToolMaterial.NETHERITE_HAMMER, new Item.Settings().attributeModifiers(PickaxeItem
                    .createAttributeModifiers(ModToolMaterial.NETHERITE_HAMMER, 6, -3.2F))));

    //armors
        //wyrmsteel set (speedy armor)
    public static final Item WYRMSTEEL_HELMET = registerItem("wyrmsteel_helmet",
            new SpeedArmorItem(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(32)).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_CHESTPLATE = registerItem("wyrmsteel_chestplate",
            new SpeedArmorItem(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(32)).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_LEGGINGS = registerItem("wyrmsteel_leggings",
            new SpeedArmorItem(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(32)).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_BOOTS = registerItem("wyrmsteel_boots",
            new SpeedArmorItem(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(32)).rarity(Rarity.UNCOMMON)));

        //rose gold set (tougher gold)
    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(12)).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(12)).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(12)).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(12)).rarity(Rarity.COMMON)));

        //ruby set (red diamonds)
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33)).rarity(Rarity.COMMON)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33)).rarity(Rarity.COMMON)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33)).rarity(Rarity.COMMON)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33)).rarity(Rarity.COMMON)));


    //materials
    public static final Item RUBY = (Item) registerItem("ruby", new Item(new Item.Settings()));
    public static final Item QUICKSILVER = (Item) registerItem("quicksilver", new Item(new Item.Settings()));
    public static final Item COPPER_NUGGET = (Item) registerItem("copper_nugget", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_INGOT = (Item) registerItem("rose_gold_ingot", new Item(new Item.Settings()));
    public static final Item ROSE_GOLD_NUGGET = (Item) registerItem("rose_gold_nugget", new Item(new Item.Settings()));
    public static final Item WYRMSTEEL_INGOT = (Item) registerItem("wyrmsteel_ingot", new Item(new Item.Settings()));

    //upgrades
    public static final Item WYRMSTEEL_UPGRADE = registerItem("wyrmsteel_upgrade", ModSmithingTemplateItem.createModularUpgrade("wyrmsteel"));


    //register the items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Smithery.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Smithery.LOGGER.info("Registering mod items for " + Smithery.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
