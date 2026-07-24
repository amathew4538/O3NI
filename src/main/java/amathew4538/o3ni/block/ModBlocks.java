package amathew4538.o3ni.block;

import amathew4538.o3ni.O3NI;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.util.valueproviders.UniformInt;

public class ModBlocks {
    @SuppressWarnings("null")
    public static final Block COBALT_ORE = RegisterBlock("cobalt_ore",
        new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(3, 7))
    );
    @SuppressWarnings("null")
    public static final Block NEUTRONIUM_BLOCK = RegisterBlock("neutronium_block",
        new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK))
    );

    @SuppressWarnings("null")
    private static Block RegisterBlock(String name, Block block) {
        RegisterBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(O3NI.MOD_ID, name), block);
    }

    @SuppressWarnings("null")
    private static Item RegisterBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(O3NI.MOD_ID, name), 
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterModBlocks() {
        O3NI.LOGGER.info("Registering blocks for " + O3NI.MOD_ID);
    }
}
