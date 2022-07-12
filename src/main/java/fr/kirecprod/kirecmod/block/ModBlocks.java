package fr.kirecprod.kirecmod.block;

import fr.kirecprod.kirecmod.init.KirecModTab;
import fr.kirecprod.kirecmod.item.ModItems;
import fr.kirecprod.kirecmod.kirecMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, kirecMod.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = createBlock("titanium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> block)
    {
        RegistryObject<Block> b = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(b.get(), new Item.Properties().tab(KirecModTab.KIRECMOD_TAB)));
        return b;
    }

    public static void register(IEventBus eventBus){ BLOCKS.register(eventBus); }

}
