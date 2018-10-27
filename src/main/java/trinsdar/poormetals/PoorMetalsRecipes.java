package trinsdar.poormetals;

import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.data.Names;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import trinsdar.poormetals.init.ModBlocks;

public class PoorMetalsRecipes {
    public static void initFurnaceRecipes() {
        if (Config.vanillaPoorOres){
            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorGoldOre, 1), new ItemStack(Items.GOLD_NUGGET, 3), 0.7f);
            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorIronOre, 1), new ItemStack(Items.IRON_NUGGET, 3), 0.7f);
        }

        if (Loader.isModLoaded("basemetals")) {
            if (Config.baseMetalsPoorOres){
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorAdamantineOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ADAMANTINE).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorAntimonyOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ANTIMONY).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorBismuthOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.BISMUTH).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorColdIronOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COLDIRON).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorCopperOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COPPER).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorLeadOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.LEAD).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorMercuryOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.MERCURY).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNickelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.NICKEL).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorPlatinumOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.PLATINUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorSilverOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.SILVER).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorStarsteelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.STARSTEEL).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorTinOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.TIN).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorZincOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ZINC).getItem(Names.NUGGET), 3), 0.7f);
            }
        }

        if (Loader.isModLoaded("modernmetals")){
            if (Config.modernMetalsPoorOres){
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorAluminumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ALUMINUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorBerylliumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BERYLLIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorBoronOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BORON).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorCadmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CADMIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorChromiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CHROMIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorIridiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.IRIDIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorMaganeseOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MANGANESE).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorMagnesiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MAGNESIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorOsmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.OSMIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorPlutoniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.PLUTONIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorRutileOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.RUTILE).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorTantalumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TANTALUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorThoriumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.THORIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorTitaniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TITANIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorTungstenOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TUNGSTEN).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorUraniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.URANIUM).getItem(Names.NUGGET), 3), 0.7f);
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorZirconiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ZIRCONIUM).getItem(Names.NUGGET), 3), 0.7f);
            }
        }

    }

    public static void init(){
      PoorMetalsRecipes.initFurnaceRecipes();
    }
}