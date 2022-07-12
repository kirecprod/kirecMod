package fr.kirecprod.kirecmod.init;

import fr.kirecprod.kirecmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class KirecModTab
{
    public static final CreativeModeTab KIRECMOD_TAB = new CreativeModeTab("kirecmod_tab")
    {
        @Override public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
}
