package com.ashnaviv1.cosmicrailgunmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CosmicRailGunMod implements ModInitializer {
    public static final String MOD_ID = "cosmicrailgunmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item COSMIC_RAIL_GUN = new Item(new Item.Properties().stacksTo(1));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Cosmic Rail Gun Mod");
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, "cosmic_rail_gun"), COSMIC_RAIL_GUN);
    }
}