package net.sieb8.worldofgoo.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sieb8.worldofgoo.WorldOfGoo;

public class ModItems {

    //Register items
    public static final Item GOO_BALL = registerItem("goo_ball", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WorldOfGoo.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WorldOfGoo.LOGGER.info("Registering Mod Items for " + WorldOfGoo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GOO_BALL);
        });
    }
}
