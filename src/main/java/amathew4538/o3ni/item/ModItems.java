package amathew4538.o3ni.item;

import amathew4538.o3ni.O3NI;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation; 


public class ModItems {
    public static final Item ABYSSALITE = RegisterItem("abyssalite", new Item(new FabricItemSettings()));
    public static final Item CERAMIC = RegisterItem("ceramic", new Item(new FabricItemSettings()));
    public static final Item NEUTRONIUM = RegisterItem("neutronium", new Item(new FabricItemSettings()));

    @SuppressWarnings("null")
    private static Item RegisterItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(O3NI.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        O3NI.LOGGER.info("Registering items for " + O3NI.MOD_ID);
    }
}
