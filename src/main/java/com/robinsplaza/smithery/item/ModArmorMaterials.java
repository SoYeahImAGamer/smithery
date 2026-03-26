package com.robinsplaza.smithery.item;

import com.robinsplaza.smithery.Smithery;
import com.robinsplaza.smithery.datagen.ModItemTagProvider;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import java.util.EnumMap;

public class ModArmorMaterials {
    //old (<1.21.3)
    //public static EquipmentModel WYRMSTEEL = EquipmentModel.builder().addHumanoidLayers(Identifier.of(Smithery.MOD_ID, "wyrmsteel")).build();

    //new (>1.21.4)
    static ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static final ResourceKey<EquipmentAsset> WYRMSTEEL_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, "wyrmsteel"));
    public static final ResourceKey<EquipmentAsset> ROSE_GOLD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, "rose_gold"));
    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, "ruby"));

    public static final ArmorMaterial WYRMSTEEL_ARMOR_MATERIAL = new ArmorMaterial(500, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 11);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0, 0, ModItemTagProvider.WYRMSTEEL_REPAIR_MATERIALS, WYRMSTEEL_KEY);

    public static final ArmorMaterial ROSE_GOLD_ARMOR_MATERIAL = new ArmorMaterial(500, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 1);
        map.put(ArmorType.LEGGINGS, 4);
        map.put(ArmorType.CHESTPLATE, 5);
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.BODY, 7);
    }), 20, SoundEvents.ARMOR_EQUIP_GOLD, 0, 0, ModItemTagProvider.ROSE_GOLD_REPAIR_MATERIALS, ROSE_GOLD_KEY);

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(500, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
        map.put(ArmorType.BODY, 11);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0, 0, ModItemTagProvider.RUBY_REPAIR_MATERIALS, RUBY_KEY);
}
