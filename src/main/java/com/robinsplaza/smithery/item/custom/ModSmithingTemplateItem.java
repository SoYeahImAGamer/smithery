package com.robinsplaza.smithery.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import java.util.List;
import java.util.function.Consumer;

public class ModSmithingTemplateItem extends Item {
    public static final ChatFormatting TITLE_FORMATTING;
    public static final ChatFormatting DESCRIPTION_FORMATTING;
    public static final Component INGREDIENTS_TEXT;
    public static final Component APPLIES_TO_TEXT;
    public static final Component MODULAR_UPGRADE_TEXT;
    public static final Component SMITHING_TEMPLATE_TEXT;
    public static final Component ARMOR_TRIM_APPLIES_TO_TEXT;
    public static final Component ARMOR_TRIM_INGREDIENTS_TEXT;
    public static final Component ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT;
    public static final Component ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT;
    public static final Component MODULAR_UPGRADE_APPLIES_TO_TEXT;
    public static final Component MODULAR_UPGRADE_INGREDIENTS_TEXT;
    public static final Component MODULAR_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT;
    public static final Component MODULAR_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT;
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
    public final Component appliesToText;
    public final Component ingredientsText;
    public final Component baseSlotDescriptionText;
    public final Component additionsSlotDescriptionText;
    public final List<Identifier> emptyBaseSlotTextures;
    public final List<Identifier> emptyAdditionsSlotTextures;
    public static String modularName;

    public ModSmithingTemplateItem(Component appliesToText, Component ingredientsText, Component baseSlotDescriptionText, Component additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures, Properties settings) {
        super(settings);
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static ModSmithingTemplateItem of(Properties settings) {
        return new ModSmithingTemplateItem(
                ARMOR_TRIM_APPLIES_TO_TEXT,
                ARMOR_TRIM_INGREDIENTS_TEXT,
                ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT,
                ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getModularUpgradeEmptyBaseSlotTextures(),
                getModularUpgradeEmptyAdditionsSlotTextures(),
                settings);
    }

    /*thank you mojang for hardcoding netherite upgrade templates
    real good future-proofing in your forever game there

    this is as good as I could get it with the newer item registry system
            */
    public static ModSmithingTemplateItem wyrm(Properties settings) {
        modularName = "wyrmsteel";
        return new ModSmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.additions_slot_description"))),
                getModularUpgradeEmptyBaseSlotTextures(),
                getModularUpgradeEmptyAdditionsSlotTextures(),
                settings);
    }
    public static ModSmithingTemplateItem multi(Properties settings) {
        modularName = "multitool";
        return new ModSmithingTemplateItem(
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.base_slot_description"))),
                Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.additions_slot_description"))),
                getModularUpgradeEmptyBaseSlotTextures(),
                getModularUpgradeEmptyAdditionsSlotTextures(),
                settings);
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

    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);
        textConsumer.accept(SMITHING_TEMPLATE_TEXT);
        textConsumer.accept(CommonComponents.EMPTY);
        textConsumer.accept(APPLIES_TO_TEXT);
        textConsumer.accept(CommonComponents.space().append(this.appliesToText));
        textConsumer.accept(INGREDIENTS_TEXT);
        textConsumer.accept(CommonComponents.space().append(this.ingredientsText));
    }

    public Component getBaseSlotDescription() {
        return this.baseSlotDescriptionText;
    }

    public Component getAdditionsSlotDescription() {
        return this.additionsSlotDescriptionText;
    }

    public List<Identifier> getEmptyBaseSlotTextures() {
        return this.emptyBaseSlotTextures;
    }

    public List<Identifier> getEmptyAdditionsSlotTextures() {
        return this.emptyAdditionsSlotTextures;
    }

    static {
        TITLE_FORMATTING = ChatFormatting.GRAY;
        DESCRIPTION_FORMATTING = ChatFormatting.BLUE;
        INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.ingredients"))).withStyle(TITLE_FORMATTING);
        APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.applies_to"))).withStyle(TITLE_FORMATTING);

        MODULAR_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", Identifier.parse(modularName + "_upgrade"))).withStyle(TITLE_FORMATTING);

        SMITHING_TEMPLATE_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template"))).withStyle(TITLE_FORMATTING);
        ARMOR_TRIM_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.armor_trim.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        ARMOR_TRIM_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.armor_trim.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        ARMOR_TRIM_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.armor_trim.base_slot_description")));
        ARMOR_TRIM_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.withDefaultNamespace("smithing_template.armor_trim.additions_slot_description")));

        MODULAR_UPGRADE_APPLIES_TO_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMATTING);
        MODULAR_UPGRADE_INGREDIENTS_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMATTING);
        MODULAR_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.base_slot_description")));
        MODULAR_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Component.translatable(Util.makeDescriptionId("item", Identifier.parse("smithing_template." + modularName + "_upgrade.additions_slot_description")));

        EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.withDefaultNamespace("item/empty_armor_slot_helmet");
        EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.withDefaultNamespace("item/empty_armor_slot_chestplate");
        EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.withDefaultNamespace("item/empty_armor_slot_leggings");
        EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.withDefaultNamespace("item/empty_armor_slot_boots");
        EMPTY_SLOT_HOE_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_hoe");
        EMPTY_SLOT_AXE_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_axe");
        EMPTY_SLOT_SWORD_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_sword");
        EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_shovel");
        EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_pickaxe");
        EMPTY_SLOT_INGOT_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_ingot");
        EMPTY_SLOT_REDSTONE_DUST_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_redstone_dust");
        EMPTY_SLOT_QUARTZ_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_quartz");
        EMPTY_SLOT_EMERALD_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_emerald");
        EMPTY_SLOT_DIAMOND_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_diamond");
        EMPTY_SLOT_LAPIS_LAZULI_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_lapis_lazuli");
        EMPTY_SLOT_AMETHYST_SHARD_TEXTURE = Identifier.withDefaultNamespace("item/empty_slot_amethyst_shard");
    }
}
