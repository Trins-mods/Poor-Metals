package trinsdar.poormetals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trinsdar.poormetals.PoorMetals;

public class BlockPoorModernMetalsEndOres extends Block {
    public enum PoorModernMetalsEndOreVariant{
        ALUMINUM, BERYLLIUM, BORON, CADMIUM, CHROMIUM, IRIDIUM, MAGNESIUM, PLATINUM, MAGANESE, OSMIUM, PLUTONIUM, RUTILE, TANTALUM, THORIUM, TITANIUM, TUNGSTEN, URANIUM, ZIRCONIUM;
    }

    PoorModernMetalsEndOreVariant variant;
    public BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant variant) {
        super(Material.ROCK);
        this.variant = variant;
        setCreativeTab(PoorMetals.creativeTab);
        final String name = "poor_end_"+ variant.toString().toLowerCase()+ "_ore";
        setUnlocalizedName( PoorMetals.MODID + "." + name );
        setRegistryName(name);
        this.setHarvestLevel("pickaxe", 1);
        setHardness(4.0f);
        setResistance(15.0f);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }
}
