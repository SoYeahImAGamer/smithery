package com.robinsplaza.smithery;

import com.robinsplaza.smithery.block.ModBlocks;
import com.robinsplaza.smithery.block.VoidBlockEntity;
import com.robinsplaza.smithery.component.ModDataComponentTypes;
import com.robinsplaza.smithery.item.ModItemGroups;
import com.robinsplaza.smithery.item.ModItems;
import com.robinsplaza.smithery.util.HammerUsageEvent;
import com.robinsplaza.smithery.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Smithery implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	// To whomever is reading this, check out Modding by Kaupenjoe on YT
	// his tutorials have really helped make this mod possible

	public static final String MOD_ID = "smithery";
    public static final Logger LOGGER = LoggerFactory.getLogger("smithery");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading Stuff for " + MOD_ID + "...");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModDataComponentTypes.registerDataComponentTypes();
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
	public static final BlockEntityType<VoidBlockEntity> VOID_BLOCK_ENTITY_TYPE = Registry.register(
			Registries.BLOCK_ENTITY_TYPE,
			Identifier.of(MOD_ID, "void_block_entity_type"),
			BlockEntityType.Builder.create(VoidBlockEntity::new, ModBlocks.VOID_BLOCK).build(null)
	);
}