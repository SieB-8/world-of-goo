package net.sieb8.worldofgoo;

import net.fabricmc.api.ModInitializer;

import net.sieb8.worldofgoo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldOfGoo implements ModInitializer {
	public static final String MOD_ID = "worldofgoo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}