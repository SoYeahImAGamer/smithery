package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.Smithery;
import com.robinsplaza.smithery.item.custom.HammerItem;
import com.robinsplaza.smithery.item.custom.MattockItem;
import com.robinsplaza.smithery.item.custom.ModSmithingTemplateItem;
import com.robinsplaza.smithery.item.custom.SpeedArmorItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import java.util.function.Function;

public class ModItems {

    //spurs
    public static final Item COPPER_SPUR = (Item) registerItem("copper_spur",
            Item::new);
    public static final Item SILVER_SPUR = (Item) registerItem("silver_spur",
            Item::new);
    public static final Item GOLDEN_SPUR = (Item) registerItem("golden_spur",
            Item::new);

    //tools
        //wyrmsteel set (fast tools)
    public static final Item WYRMSTEEL_PICKAXE = registerItem("wyrmsteel_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterial.WYRMSTEEL, 1, -2.4F).rarity(Rarity.UNCOMMON)));
    public static final Item WYRMSTEEL_HAMMER = registerItem("wyrmsteel_hammer",
            setting -> new HammerItem(ModToolMaterial.WYRMSTEEL_HAMMER, 6, -3.0F, setting.rarity(Rarity.UNCOMMON).durability(4296)));
    public static final AxeItem WYRMSTEEL_AXE = (AxeItem) registerItem("wyrmsteel_axe",
            setting -> new AxeItem(ModToolMaterial.WYRMSTEEL, 6, -2.8f, setting.rarity(Rarity.UNCOMMON)));
    public static final ShovelItem WYRMSTEEL_SHOVEL = (ShovelItem) registerItem("wyrmsteel_shovel",
            setting -> new ShovelItem(ModToolMaterial.WYRMSTEEL, 2, -2.2f, setting.rarity(Rarity.UNCOMMON)));
    public static final HoeItem WYRMSTEEL_HOE = (HoeItem) registerItem("wyrmsteel_hoe",
            setting -> new HoeItem(ModToolMaterial.WYRMSTEEL, 1, -2.2f, setting.rarity(Rarity.UNCOMMON)));
    public static final Item WYRMSTEEL_SWORD = registerItem("wyrmsteel_sword",
            setting -> new Item(setting.sword(ModToolMaterial.WYRMSTEEL, 4, -2f).rarity(Rarity.UNCOMMON)));
    public static final MattockItem WYRMSTEEL_MATTOCK = (MattockItem) registerItem("wyrmsteel_mattock",
            setting -> new MattockItem(ModToolMaterial.WYRMSTEEL, 6, -2.8f, setting.rarity(Rarity.UNCOMMON)));

        //rose gold set (sturdier gold)
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterial.ROSE_GOLD, 1.0f, -2.8F).rarity(Rarity.COMMON)));
    public static final AxeItem ROSE_GOLD_AXE = (AxeItem) registerItem("rose_gold_axe",
            setting -> new AxeItem(ModToolMaterial.ROSE_GOLD, 6, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final ShovelItem ROSE_GOLD_SHOVEL = (ShovelItem) registerItem("rose_gold_shovel",
            setting -> new ShovelItem(ModToolMaterial.ROSE_GOLD, 1.5f, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final HoeItem ROSE_GOLD_HOE = (HoeItem) registerItem("rose_gold_hoe",
            setting -> new HoeItem(ModToolMaterial.ROSE_GOLD, 0, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            setting -> new Item(setting.sword(ModToolMaterial.ROSE_GOLD, 3, -2.4f).rarity(Rarity.COMMON)));
    public static final MattockItem ROSE_GOLD_MATTOCK = (MattockItem) registerItem("rose_gold_mattock",
            setting -> new MattockItem(ModToolMaterial.ROSE_GOLD, 6, -3.0f, setting.rarity(Rarity.COMMON)));

        //ruby set (red diamonds)
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            setting -> new Item(setting.pickaxe(ModToolMaterial.RUBY, 1.0F, -2.8F).rarity(Rarity.COMMON)));
    public static final Item RUBY_HAMMER = registerItem("ruby_hammer",
            setting -> new HammerItem(ModToolMaterial.RUBY_HAMMER, 6, -3.2F, setting.rarity(Rarity.COMMON).durability(4296)));
    public static final AxeItem RUBY_AXE = (AxeItem) registerItem("ruby_axe",
            setting -> new AxeItem(ModToolMaterial.RUBY, 6, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final ShovelItem RUBY_SHOVEL = (ShovelItem) registerItem("ruby_shovel",
            setting -> new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final HoeItem RUBY_HOE = (HoeItem) registerItem("ruby_hoe",
            setting -> new HoeItem(ModToolMaterial.RUBY, 0, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            setting -> new Item(setting.sword(ModToolMaterial.RUBY, 3, -2.4f).rarity(Rarity.COMMON)));
    public static final MattockItem RUBY_MATTOCK = (MattockItem) registerItem("ruby_mattock",
            setting -> new MattockItem(ModToolMaterial.RUBY, 6, -3.0f, setting.rarity(Rarity.COMMON)));

        //vaniller hammers
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            setting -> new HammerItem(ModToolMaterial.DIAMOND_HAMMER, 6, -3.2F, setting));
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            setting -> new HammerItem(ModToolMaterial.NETHERITE_HAMMER, 6, -3.2F, setting));

        //vanilla mattocks
    public static final MattockItem NETHERITE_MATTOCK = (MattockItem) registerItem("netherite_mattock",
            setting -> new MattockItem(ToolMaterial.NETHERITE, 5, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final MattockItem DIAMOND_MATTOCK = (MattockItem) registerItem("diamond_mattock",
            setting -> new MattockItem(ToolMaterial.DIAMOND, 5, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final MattockItem GOLDEN_MATTOCK = (MattockItem) registerItem("golden_mattock",
            setting -> new MattockItem(ToolMaterial.GOLD, 6, -3.0f, setting.rarity(Rarity.COMMON)));
    public static final MattockItem IRON_MATTOCK = (MattockItem) registerItem("iron_mattock",
            setting -> new MattockItem(ToolMaterial.IRON, 6, -3.1f, setting.rarity(Rarity.COMMON)));

    //armors
        //wyrmsteel set (speedy armor)
    public static final Item WYRMSTEEL_HELMET = registerItem("wyrmsteel_helmet",
            setting -> new SpeedArmorItem(setting.humanoidArmor(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorType.HELMET).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_CHESTPLATE = registerItem("wyrmsteel_chestplate",
            setting -> new SpeedArmorItem(setting.humanoidArmor(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorType.CHESTPLATE).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_LEGGINGS = registerItem("wyrmsteel_leggings",
            setting -> new SpeedArmorItem(setting.humanoidArmor(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorType.LEGGINGS).rarity(Rarity.UNCOMMON)));

    public static final Item WYRMSTEEL_BOOTS = registerItem("wyrmsteel_boots",
            setting -> new SpeedArmorItem(setting.humanoidArmor(ModArmorMaterials.WYRMSTEEL_ARMOR_MATERIAL, ArmorType.BOOTS).rarity(Rarity.UNCOMMON)));

        //rose gold set (tougher gold)
     public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorType.HELMET).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorType.CHESTPLATE).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorType.LEGGINGS).rarity(Rarity.COMMON)));

    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.ROSE_GOLD_ARMOR_MATERIAL, ArmorType.BOOTS).rarity(Rarity.COMMON)));

        //ruby set (red diamonds)
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET).rarity(Rarity.COMMON)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE).rarity(Rarity.COMMON)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS).rarity(Rarity.COMMON)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            setting -> new Item(setting.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS).rarity(Rarity.COMMON)));


    //materials
    public static final Item RUBY = (Item) registerItem("ruby", Item::new);
    public static final Item QUICKSILVER = (Item) registerItem("quicksilver", Item::new);
    public static final Item COPPER_NUGGET = (Item) registerItem("copper_nugget", Item::new);
    public static final Item ROSE_GOLD_INGOT = (Item) registerItem("rose_gold_ingot", Item::new);
    public static final Item ROSE_GOLD_NUGGET = (Item) registerItem("rose_gold_nugget", Item::new);
    public static final Item WYRMSTEEL_INGOT = (Item) registerItem("wyrmsteel_ingot", Item::new);

    //upgrades
    public static final Item WYRMSTEEL_UPGRADE = (Item) registerItem("wyrmsteel_upgrade", ModSmithingTemplateItem::wyrm);
    public static final Item MULTITOOL_UPGRADE = (Item) registerItem("multitool_upgrade", ModSmithingTemplateItem::multi);


    //register the items
    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name)))));
    }

    public static void registerModItems(){
        Smithery.LOGGER.info("Registering mod items for " + Smithery.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
