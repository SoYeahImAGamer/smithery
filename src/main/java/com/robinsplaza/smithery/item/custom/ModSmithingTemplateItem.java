package com.robinsplaza.smithery.item.custom;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.RegistryKey;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModSmithingTemplateItem extends Item {
    public static final Formatting TITLE_FORMATTING;
    public static final Formatting DESCRIPTION_FORMATTING;
    public static final Text INGREDIENTS_TEXT;
    public static final Text APPLIES_TO_TEXT;
    public static final Text MODULAR_UPGRADE_TEXT;
    public static final Text ARMOR_TRIM_APPLIES_TO_TEXT;
    public static final Text ARMOR_TRIM_INGREDIENTS_TEXT;
    public static final Text ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT;
    public static final Text ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    public static final Text MODULAR_UPGRADE_APPLIES_TO_TEXT;
    public static final Text MODULAR_UPGRADE_INGREDIENTS_TEXT;
    public static final Text MODULAR_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    public static final Text MODULAR_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    public static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE;
    public static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE;
    public static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE;
    public static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE;
    public static final Identifier EMPTY_SLOT_HOE_TEXTURE;
    public static final Identifier EMPTY_SLOT_AXE_TEXTURE;
    public static final Identifier EMPTY_SLOT_SWORD_TEXTURE;
    public static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE;
    public static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE;
    public static final Identifier EMPTY_SLOT_INGOT_TEXTURE;
    public static final Identifier EMPTY_SLOT_REDSTONE_DUST_TEXTURE;
    public static final Identifier EMPTY_SLOT_QUARTZ_TEXTURE;
    public static final Identifier EMPTY_SLOT_EMERALD_TEXTURE;
    public static final Identifier EMPTY_SLOT_DIAMOND_TEXTURE;
    public static final Identifier EMPTY_SLOT_LAPIS_LAZULI_TEXTURE;
    public static final Identifier EMPTY_SLOT_AMETHYST_SHARD_TEXTURE;
    public final Text appliesToText;
    public final Text ingredientsText;
    public final Text titleText;
    public final Text baseSlotDescriptionText;
    public final Text additionsSlotDescriptionText;
    public final List<Identifier> emptyBaseSlotTextures;
    public final List<Identifier> emptyAdditionsSlotTextures;
    public static String modularName = "wyrmsteel";

    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures, FeatureFlag... requiredFeatures) {
        super((new Item.Settings()).requires(requiredFeatures));
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static ModSmithingTemplateItem of(RegistryKey<ArmorTrimPattern> trimPattern, FeatureFlag... requiredFeatures) {
        return of(trimPattern.getValue(), requiredFeatures);
    }

    public static ModSmithingTemplateItem of(Identifier trimPatternIn, FeatureFlag... requiredFeatures) {
        return new ModSmithingTemplateItem(ARMOR_TRIM_APPLIES_TO_TEXT, ARMOR_TRIM_INGREDIENTS_TEXT, Text.translatable(Util.createTranslationKey("trim_pattern", trimPatternIn)).formatted(TITLE_FORMATTING), ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT, ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT, getArmorTrimEmptyBaseSlotTextures(), getArmorTrimEmptyAdditionsSlotTextures(), requiredFeatures);
    }

    public static ModSmithingTemplateItem createModularUpgrade(String name) {
        modularName = name;
        return new ModSmithingTemplateItem(
                Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + name + "_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING),
                Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + name + "_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING),
                Text.translatable(Util.createTranslationKey("upgrade", Identifier.of(name + "_upgrade"))).formatted(TITLE_FORMATTING),
                Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + name + "_upgrade.base_slot_description"))),
                Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + name + "_upgrade.additions_slot_description"))),
                getModularUpgradeEmptyBaseSlotTextures(),
                getModularUpgradeEmptyAdditionsSlotTextures(),
                new FeatureFlag[0]);
    }

    public static List<Identifier> getArmorTrimEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }

    public static List<Identifier> getArmorTrimEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE, EMPTY_SLOT_REDSTONE_DUST_TEXTURE, EMPTY_SLOT_LAPIS_LAZULI_TEXTURE, EMPTY_SLOT_QUARTZ_TEXTURE, EMPTY_SLOT_DIAMOND_TEXTURE, EMPTY_SLOT_EMERALD_TEXTURE, EMPTY_SLOT_AMETHYST_SHARD_TEXTURE);
    }

    public static List<Identifier> getModularUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    public static List<Identifier> getModularUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(this.titleText);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(this.appliesToText));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(this.ingredientsText));
    }

    public Text getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Text getAdditionsSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<Identifier> getEmptyBaseSlotTextures() {
        return this.emptyBaseSlotTextures;
    }

    public List<Identifier> getEmptyAdditionsSlotTextures() {
        return this.emptyAdditionsSlotTextures;
    }

    static {
        TITLE_FORMATTING = Formatting.GRAY;
        DESCRIPTION_FORMATTING = Formatting.BLUE;
        INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.ingredients"))).formatted(TITLE_FORMATTING);
        APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.applies_to"))).formatted(TITLE_FORMATTING);

        MODULAR_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.of(modularName + "_upgrade"))).formatted(TITLE_FORMATTING);

        ARMOR_TRIM_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.armor_trim.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        ARMOR_TRIM_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.armor_trim.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.armor_trim.base_slot_description")));
        ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.armor_trim.additions_slot_description")));

        MODULAR_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + modularName + "_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
        MODULAR_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + modularName + "_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
        MODULAR_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + modularName + "_upgrade.base_slot_description")));
        MODULAR_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", Identifier.of("smithing_template." + modularName + "_upgrade.additions_slot_description")));

        EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
        EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
        EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
        EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
        EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
        EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
        EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
        EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
        EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");
        EMPTY_SLOT_INGOT_TEXTURE = Identifier.ofVanilla("item/empty_slot_ingot");
        EMPTY_SLOT_REDSTONE_DUST_TEXTURE = Identifier.ofVanilla("item/empty_slot_redstone_dust");
        EMPTY_SLOT_QUARTZ_TEXTURE = Identifier.ofVanilla("item/empty_slot_quartz");
        EMPTY_SLOT_EMERALD_TEXTURE = Identifier.ofVanilla("item/empty_slot_emerald");
        EMPTY_SLOT_DIAMOND_TEXTURE = Identifier.ofVanilla("item/empty_slot_diamond");
        EMPTY_SLOT_LAPIS_LAZULI_TEXTURE = Identifier.ofVanilla("item/empty_slot_lapis_lazuli");
        EMPTY_SLOT_AMETHYST_SHARD_TEXTURE = Identifier.ofVanilla("item/empty_slot_amethyst_shard");
    }
}
