package amathew4538.o3ni.item;

import amathew4538.o3ni.O3NI;
import amathew4538.o3ni.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    @SuppressWarnings("null")
    public static final CreativeModeTab O3NI_TAB = FabricItemGroup.builder()
        .title(Component.translatable("itemGroup.o3ni.mod_tab"))
        .icon(() -> new ItemStack(ModItems.ABYSSALITE))
        .displayItems((parameters, output) -> {
            output.accept(ModItems.ABYSSALITE);
            output.accept(ModItems.CERAMIC);
            output.accept(ModItems.NEUTRONIUM);
            output.accept(ModBlocks.NEUTRONIUM_BLOCK);
        })
        .build();

    @SuppressWarnings("null")
    public static void RegisterItemGroups() {
        O3NI.LOGGER.info("Registering item groups for " + O3NI.MOD_ID);

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(O3NI.MOD_ID, "mod_tab"), O3NI_TAB);
    }
}
