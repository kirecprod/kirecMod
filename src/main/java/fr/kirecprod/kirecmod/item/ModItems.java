package fr.kirecprod.kirecmod.item;

import fr.kirecprod.kirecmod.init.KirecModTab;
import fr.kirecprod.kirecmod.kirecMod;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.*;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, kirecMod.MOD_ID);

    //ITEMS
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties().tab(KirecModTab.KIRECMOD_TAB)));
    public static final RegistryObject<Item> TITANIUM_RAW =  ITEMS.register("titanium_raw", () -> new Item(new Item.Properties().tab(KirecModTab.KIRECMOD_TAB)));

    public static final RegistryObject<Item> ENDEMONIUM_INGOT = ITEMS.register("endemonium_ingot", () -> new Item(new Item.Properties().tab(KirecModTab.KIRECMOD_TAB).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ENDEMONIUM_NUGGET = ITEMS.register("endemonium_nugget", () -> new Item(new Item.Properties().tab(KirecModTab.KIRECMOD_TAB).fireResistant().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus)
    { ITEMS.register(eventBus); }
}
