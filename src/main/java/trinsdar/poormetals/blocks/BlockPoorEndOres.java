package trinsdar.poormetals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import trinsdar.poormetals.PoorMetals;

public class BlockPoorEndOres extends Block {

    BlockPooreOreTypes variant;
    public BlockPoorEndOres(BlockPooreOreTypes variant) {
        super(Material.ROCK);
        this.variant = variant;
        setCreativeTab(PoorMetals.creativeTab);
        final String name = "poor_end_"+ variant.getName() + "_ore";
        setUnlocalizedName( PoorMetals.MODID + "." + name );
        setRegistryName(name);
        this.setHarvestLevel("pickaxe", variant.getHarvest());
        setHardness(4.0f);
        setResistance(15.0f);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory")
        );
    }
}
