package amathew4538.o3ni;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import amathew4538.o3ni.block.ModBlocks;
import amathew4538.o3ni.item.ModItemGroups;
import amathew4538.o3ni.item.ModItems;

public class O3NI implements ModInitializer {
	public static final String MOD_ID = "o3ni";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		GeckoLib.initialize();
		
		ModItemGroups.RegisterItemGroups();
		ModItems.RegisterModItems();
		ModBlocks.RegisterModBlocks();

		LOGGER.info("Ozone Not Included Initialized!");
	}

	@SuppressWarnings("null")
	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
