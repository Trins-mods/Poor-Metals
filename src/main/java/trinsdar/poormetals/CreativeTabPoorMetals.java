package trinsdar.poormetals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trinsdar.poormetals.init.ModBlocks;

public class CreativeTabPoorMetals extends CreativeTabs {
    public CreativeTabPoorMetals(String label){
        super(label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.poorIronOre);
    }
}
