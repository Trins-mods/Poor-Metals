package trinsdar.poormetals;

import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.registry.CrusherRecipeRegistry;
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

        if (!Config.netherMetalsPoorOresOverride){
            if (Loader.isModLoaded("nethermetals")){
                if (Config.netherMetalsPoorOres){
                    if (Config.vanillaPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2), 0.7f);
                    }
                    if (!Config.baseMetalsPoorOresOverride){
                        if (Loader.isModLoaded("basemetals")){
                            if (Config.baseMetalsPoorOres){
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                            }
                        }
                    }else if (Config.baseMetalsPoorOresOverride){
                        if (Config.baseMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                        }
                    }
                }
            }
        }else if (Config.netherMetalsPoorOresOverride){
            if (Config.netherMetalsPoorOres){
                if (Config.vanillaPoorOres){
                    FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2), 0.7f);
                    FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2), 0.7f);
                }
                if (!Config.baseMetalsPoorOresOverride){
                    if (Loader.isModLoaded("basemetals")){
                        if (Config.baseMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                        }
                    }
                }else if (Config.baseMetalsPoorOresOverride){
                    if (Config.baseMetalsPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                    }
                }
            }
        }

        if (!Config.endMetalsPoorOresOverride){
            if (Loader.isModLoaded("endmetals")){
                if (Config.endMetalsPoorOres){
                    if (Config.vanillaPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2), 0.7f);
                    }
                    if (!Config.baseMetalsPoorOresOverride){
                        if (Loader.isModLoaded("basemetals")){
                            if (Config.baseMetalsPoorOres){
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                            }
                        }
                    }else if (Config.baseMetalsPoorOresOverride){
                        if (Config.baseMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                        }
                    }
                }
            }
        }else if (Config.endMetalsPoorOresOverride){
            if (Config.endMetalsPoorOres){
                if (Config.vanillaPoorOres){
                    FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2), 0.7f);
                    FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2), 0.7f);
                }
                if (!Config.baseMetalsPoorOresOverride){
                    if (Loader.isModLoaded("basemetals")){
                        if (Config.baseMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                        }
                    }
                }else if (Config.baseMetalsPoorOresOverride){
                    if (Config.baseMetalsPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2), 0.7f);
                    }
                }
            }
        }

        if (!Config.netherModernMetalsPoorOresOverride){
            if (Loader.isModLoaded("nethermetals") && Loader.isModLoaded("modernmetals")){
                if (Config.netherModernMetalsPoorOres){
                    if (!Config.modernMetalsPoorOresOverride){
                        if (Loader.isModLoaded("modernmetals")){
                            if (Config.modernMetalsPoorOres){
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                            }
                        }
                    }else if (Config.modernMetalsPoorOresOverride){
                        if (Config.modernMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                        }
                    }
                }
            }
        }else if (Config.netherModernMetalsPoorOresOverride){
            if (Config.netherModernMetalsPoorOres){
                if (!Config.modernMetalsPoorOresOverride){
                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.modernMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                        }
                    }
                }else if (Config.modernMetalsPoorOresOverride){
                    if (Config.modernMetalsPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                    }
                }
            }
        }

        if (!Config.endModernMetalsPoorOresOverride){
            if (Loader.isModLoaded("endmetals") && Loader.isModLoaded("modernmetals")){
                if (Config.endModernMetalsPoorOres){
                    if (!Config.modernMetalsPoorOresOverride){
                        if (Loader.isModLoaded("modernmetals")){
                            if (Config.modernMetalsPoorOres){
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                            }
                        }
                    }else if (Config.modernMetalsPoorOresOverride){
                        if (Config.modernMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                        }
                    }
                }
            }
        }else if (Config.endModernMetalsPoorOresOverride){
            if (Config.endModernMetalsPoorOres){
                if (!Config.modernMetalsPoorOresOverride){
                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.modernMetalsPoorOres){
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                        }
                    }
                }else if (Config.modernMetalsPoorOresOverride){
                    if (Config.modernMetalsPoorOres){
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2), 0.7f);
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2), 0.7f);
                    }
                }
            }
        }

    }

    public static void initCrackhammerRecipes(){
        if (Config.poorOreCrackHammer){
            if (Config.poorOreDouble){
                if (Loader.isModLoaded("basemetals")) {
                    if (Config.vanillaPoorOres){
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorGoldOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.GOLD).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorIronOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.IRON).getItem(Names.SMALLPOWDER), 6));
                    }

                    if (Config.baseMetalsPoorOres){
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAdamantineOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ADAMANTINE).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAntimonyOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ANTIMONY).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBismuthOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.BISMUTH).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorColdIronOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COLDIRON).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorCopperOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COPPER).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorLeadOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.LEAD).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMercuryOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.MERCURY).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNickelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.NICKEL).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorPlatinumOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.PLATINUM).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorSilverOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.SILVER).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorStarsteelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.STARSTEEL).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTinOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.TIN).getItem(Names.SMALLPOWDER), 6));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorZincOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ZINC).getItem(Names.SMALLPOWDER), 6));
                    }

                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.modernMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAluminumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ALUMINUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBerylliumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BERYLLIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBoronOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BORON).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorCadmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CADMIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorChromiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CHROMIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorIridiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.IRIDIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMaganeseOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MANGANESE).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMagnesiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MAGNESIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorOsmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.OSMIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorPlutoniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.PLUTONIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorRutileOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.RUTILE).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTantalumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TANTALUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorThoriumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.THORIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTitaniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TITANIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTungstenOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TUNGSTEN).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorUraniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.URANIUM).getItem(Names.SMALLPOWDER), 6));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorZirconiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ZIRCONIUM).getItem(Names.SMALLPOWDER), 6));
                        }
                    }
                }
            }else if (!Config.poorOreDouble){ //returns 3 instead of 6 tiny ore dust
                if (Loader.isModLoaded("basemetals")) {
                    if (Config.vanillaPoorOres){
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorGoldOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.GOLD).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorIronOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.IRON).getItem(Names.SMALLPOWDER), 3));
                    }

                    if (Config.baseMetalsPoorOres){
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAdamantineOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ADAMANTINE).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAntimonyOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ANTIMONY).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBismuthOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.BISMUTH).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorColdIronOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COLDIRON).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorCopperOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.COPPER).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorLeadOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.LEAD).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMercuryOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.MERCURY).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNickelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.NICKEL).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorPlatinumOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.PLATINUM).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorSilverOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.SILVER).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorStarsteelOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.STARSTEEL).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTinOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.TIN).getItem(Names.SMALLPOWDER), 3));
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorZincOre, 1), new ItemStack(Materials.getMaterialByName(MaterialNames.ZINC).getItem(Names.SMALLPOWDER), 3));
                    }

                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.modernMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorAluminumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ALUMINUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBerylliumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BERYLLIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorBoronOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.BORON).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorCadmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CADMIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorChromiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.CHROMIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorIridiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.IRIDIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMaganeseOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MANGANESE).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorMagnesiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MAGNESIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorOsmiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.OSMIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorPlutoniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.PLUTONIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorRutileOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.RUTILE).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTantalumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TANTALUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorThoriumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.THORIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTitaniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TITANIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorTungstenOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.TUNGSTEN).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorUraniumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.URANIUM).getItem(Names.SMALLPOWDER), 3));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorZirconiumOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.ZIRCONIUM).getItem(Names.SMALLPOWDER), 3));
                        }
                    }
                }
            }
        }
        if (Config.poorOreCrackHammer){
            if (Loader.isModLoaded("basemetals")){
                if (Loader.isModLoaded("nethermetals")){
                    if (Config.netherMetalsPoorOres){
                        if (Config.vanillaPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2));
                        }
                        if (Config.baseMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2));
                        }
                    }
                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.netherModernMetalsPoorOres && Config.modernMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2));
                        }
                    }
                }
                if (Loader.isModLoaded("endmetals")){
                    if (Config.endMetalsPoorOres){
                        if (Config.vanillaPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndGoldOre, 1), new ItemStack(ModBlocks.poorGoldOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndIronOre, 1), new ItemStack(ModBlocks.poorIronOre, 2));
                        }
                        if (Config.baseMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndAntimonyOre, 1), new ItemStack(ModBlocks.poorAntimonyOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndBismuthOre, 1), new ItemStack(ModBlocks.poorBismuthOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndCopperOre, 1), new ItemStack(ModBlocks.poorCopperOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndLeadOre, 1), new ItemStack(ModBlocks.poorLeadOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndMercuryOre, 1), new ItemStack(ModBlocks.poorMercuryOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndNickelOre, 1), new ItemStack(ModBlocks.poorNickelOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndPlatinumOre, 1), new ItemStack(ModBlocks.poorPlatinumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndSilverOre, 1), new ItemStack(ModBlocks.poorSilverOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndTinOre, 1), new ItemStack(ModBlocks.poorTinOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndZincOre, 1), new ItemStack(ModBlocks.poorZincOre, 2));
                        }
                    }
                    if (Loader.isModLoaded("modernmetals")){
                        if (Config.endModernMetalsPoorOres && Config.modernMetalsPoorOres){
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndMaganeseOre, 1), new ItemStack(ModBlocks.poorMaganeseOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndMagnesiumOre, 1), new ItemStack(ModBlocks.poorMagnesiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndOsmiumOre, 1), new ItemStack(ModBlocks.poorOsmiumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndPlutoniumOre, 1), new ItemStack(ModBlocks.poorPlutoniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndRutileOre, 1), new ItemStack(ModBlocks.poorRutileOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndTantalumOre, 1), new ItemStack(ModBlocks.poorTantalumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndTitaniumOre, 1), new ItemStack(ModBlocks.poorTitaniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndTungstenOre, 1), new ItemStack(ModBlocks.poorTungstenOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndUraniumOre, 1), new ItemStack(ModBlocks.poorUraniumOre, 2));
                            CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndZirconiumOre, 1), new ItemStack(ModBlocks.poorZirconiumOre, 2));
                        }
                    }
                }
            }
        }
    }

    public static void init(){
        PoorMetalsRecipes.initFurnaceRecipes();
        PoorMetalsRecipes.initCrackhammerRecipes();
    }
}