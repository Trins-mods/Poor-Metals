package trinsdar.poormetals;

import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.lib.registry.CrusherRecipeRegistry;
import com.mcmoddev.lib.util.Config.Options;
import ic2.api.event.ProfileEvent;
import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.oredict.OreDictionary;
import trinsdar.poormetals.init.ModBlocks;

public class PoorMetalsRecipes {
    private static void initFurnaceRecipes() {
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
                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorManganeseOre, 1), new ItemStack(com.mcmoddev.modernmetals.init.Materials.getMaterialByName(com.mcmoddev.modernmetals.data.MaterialNames.MANGANESE).getItem(Names.NUGGET), 3), 0.7f);
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
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorNetherManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                                FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                            FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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
                        FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(ModBlocks.poorEndManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2), 0.7f);
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

    public static MaterialNames materialNamesBme;
    public static com.mcmoddev.modernmetals.data.MaterialNames materialNamesMme;

    static final String[] myMaterialNamesBme = {
            materialNamesBme.ADAMANTINE,
            materialNamesBme.ANTIMONY,
            materialNamesBme.BISMUTH,
            materialNamesBme.COPPER,
            materialNamesBme.COLDIRON,
            materialNamesBme.LEAD,
            materialNamesBme.MERCURY,
            materialNamesBme.NICKEL,
            materialNamesBme.PLATINUM,
            materialNamesBme.SILVER,
            materialNamesBme.STARSTEEL,
            materialNamesBme.TIN,
            materialNamesBme.ZINC
    };

    static final String[] myMaterialNamesMme = {
            materialNamesMme.ALUMINUM,
            materialNamesMme.BERYLLIUM,
            materialNamesMme.BORON,
            materialNamesMme.CADMIUM,
            materialNamesMme.CHROMIUM,
            materialNamesMme.IRIDIUM,
            materialNamesMme.MAGNESIUM,
            materialNamesMme.MANGANESE,
            materialNamesMme.OSMIUM,
            materialNamesMme.PLUTONIUM,
            materialNamesMme.RUTILE,
            materialNamesMme.TANTALUM,
            materialNamesMme.THORIUM,
            materialNamesMme.TITANIUM,
            materialNamesMme.TUNGSTEN,
            materialNamesMme.URANIUM,
            materialNamesMme.ZIRCONIUM
    };

    private static void initCrackhammerRecipes(){
        if (Config.poorOreCrackHammer && Loader.isModLoaded("basemetals")){
            if (Config.poorOreDouble){
                if (Config.baseMetalsPoorOres){
                    for (String matName : myMaterialNamesBme) {
                        if (Materials.hasMaterial(matName)){
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack smallPowder = mat.getItemStack(Names.SMALLPOWDER, 6);
                            CrusherRecipeRegistry.addNewCrusherRecipe(poorOreName, smallPowder);
                        }
                    }
                }
                if (Config.vanillaPoorOres){
                    CrusherRecipeRegistry.addNewCrusherRecipe("orePoorGold", Materials.getMaterialByName(MaterialNames.GOLD).getItemStack(Names.SMALLPOWDER, 6));
                    CrusherRecipeRegistry.addNewCrusherRecipe("orePoorIron", Materials.getMaterialByName(MaterialNames.IRON).getItemStack(Names.SMALLPOWDER, 6));
                }

                if (Loader.isModLoaded("modernmetals") && Config.modernMetalsPoorOres){
                    for (String matName : myMaterialNamesMme) {
                        if (Materials.hasMaterial(matName)){
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack smallPowder = mat.getItemStack(Names.SMALLPOWDER, 6);
                            CrusherRecipeRegistry.addNewCrusherRecipe(poorOreName, smallPowder);
                        }
                    }
                }
            }else { //returns 3 instead of 6 tiny ore dust
                if (Config.baseMetalsPoorOres){
                    for (String matName : myMaterialNamesBme) {
                        if (Materials.hasMaterial(matName)){
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack smallPowder = mat.getItemStack(Names.SMALLPOWDER, 3);
                            CrusherRecipeRegistry.addNewCrusherRecipe(poorOreName, smallPowder);
                        }
                    }
                }
                if (Config.vanillaPoorOres){
                    CrusherRecipeRegistry.addNewCrusherRecipe("orePoorGold", Materials.getMaterialByName(MaterialNames.GOLD).getItemStack(Names.SMALLPOWDER, 3));
                    CrusherRecipeRegistry.addNewCrusherRecipe("orePoorIron", Materials.getMaterialByName(MaterialNames.IRON).getItemStack(Names.SMALLPOWDER, 3));
                }

                if (Loader.isModLoaded("modernmetals") && Config.modernMetalsPoorOres){
                    for (String matName : myMaterialNamesMme) {
                        if (Materials.hasMaterial(matName)){
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack smallPowder = mat.getItemStack(Names.SMALLPOWDER, 3);
                            CrusherRecipeRegistry.addNewCrusherRecipe(poorOreName, smallPowder);
                        }
                    }
                }
            }
        }
        if (Config.poorOreCrackHammer && Loader.isModLoaded("basemetals")){
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
                if (Loader.isModLoaded("modernmetals") && Config.netherModernMetalsPoorOres && Config.modernMetalsPoorOres){
                    CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherAluminumOre, 1), new ItemStack(ModBlocks.poorAluminumOre, 2));
                    CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherCadmiumOre, 1), new ItemStack(ModBlocks.poorCadmiumOre, 2));
                    CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherChromiumOre, 1), new ItemStack(ModBlocks.poorChromiumOre, 2));
                    CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherIridiumOre, 1), new ItemStack(ModBlocks.poorIridiumOre, 2));
                    CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorNetherManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2));
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
                        CrusherRecipeRegistry.addNewCrusherRecipe(new ItemStack(ModBlocks.poorEndManganeseOre, 1), new ItemStack(ModBlocks.poorManganeseOre, 2));
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

    private static void initOreDictionary(){
        if (Config.vanillaPoorOres){
            OreDictionary.registerOre("orePoorIron", ModBlocks.poorIronOre);
            OreDictionary.registerOre("orePoorGold", ModBlocks.poorGoldOre);
        }
        if (Config.baseMetalsPoorOresOverride || Loader.isModLoaded("basemetals")){
            if (Config.baseMetalsPoorOres){
                OreDictionary.registerOre("orePoorAdamantine", ModBlocks.poorAdamantineOre);
                OreDictionary.registerOre("orePoorAntimony", ModBlocks.poorAntimonyOre);
                OreDictionary.registerOre("orePoorBismuth", ModBlocks.poorBismuthOre);
                OreDictionary.registerOre("orePoorColdiron", ModBlocks.poorColdIronOre);
                OreDictionary.registerOre("orePoorCopper", ModBlocks.poorCopperOre);
                OreDictionary.registerOre("orePoorLead", ModBlocks.poorLeadOre);
                OreDictionary.registerOre("orePoorMercury", ModBlocks.poorMercuryOre);
                OreDictionary.registerOre("orePoorNickel", ModBlocks.poorNickelOre);
                OreDictionary.registerOre("orePoorPlatinum", ModBlocks.poorPlatinumOre);
                OreDictionary.registerOre("orePoorSilver", ModBlocks.poorSilverOre);
                OreDictionary.registerOre("orePoorStarsteel", ModBlocks.poorStarsteelOre);
                OreDictionary.registerOre("orePoorTin", ModBlocks.poorTinOre);
                OreDictionary.registerOre("orePoorZinc", ModBlocks.poorZincOre);

            }
            if (Config.netherMetalsPoorOresOverride || Loader.isModLoaded("nethermetals")){
                if (Config.netherMetalsPoorOres){
                    OreDictionary.registerOre("orePoorNetherAntimony", ModBlocks.poorNetherAntimonyOre);
                    OreDictionary.registerOre("orePoorNetherBismuth", ModBlocks.poorNetherBismuthOre);
                    OreDictionary.registerOre("orePoorNetherCopper", ModBlocks.poorNetherCopperOre);
                    OreDictionary.registerOre("orePoorNetherLead", ModBlocks.poorNetherLeadOre);
                    OreDictionary.registerOre("orePoorNetherMercury", ModBlocks.poorNetherMercuryOre);
                    OreDictionary.registerOre("orePoorNetherNickel", ModBlocks.poorNetherNickelOre);
                    OreDictionary.registerOre("orePoorNetherPlatinum", ModBlocks.poorNetherPlatinumOre);
                    OreDictionary.registerOre("orePoorNetherSilver", ModBlocks.poorNetherSilverOre);
                    OreDictionary.registerOre("orePoorNetherTin", ModBlocks.poorNetherTinOre);
                    OreDictionary.registerOre("orePoorNetherZinc", ModBlocks.poorNetherZincOre);

                }
            }
            if (Config.endMetalsPoorOresOverride || Loader.isModLoaded("endmetals")){
                if (Config.endMetalsPoorOres){
                    OreDictionary.registerOre("orePoorEndAntimony", ModBlocks.poorEndAntimonyOre);
                    OreDictionary.registerOre("orePoorEndBismuth", ModBlocks.poorEndBismuthOre);
                    OreDictionary.registerOre("orePoorEndCopper", ModBlocks.poorEndCopperOre);
                    OreDictionary.registerOre("orePoorEndLead", ModBlocks.poorEndLeadOre);
                    OreDictionary.registerOre("orePoorEndMercury", ModBlocks.poorEndMercuryOre);
                    OreDictionary.registerOre("orePoorEndNickel", ModBlocks.poorEndNickelOre);
                    OreDictionary.registerOre("orePoorEndPlatinum", ModBlocks.poorEndPlatinumOre);
                    OreDictionary.registerOre("orePoorEndSilver", ModBlocks.poorEndSilverOre);
                    OreDictionary.registerOre("orePoorEndTin", ModBlocks.poorEndTinOre);
                    OreDictionary.registerOre("orePoorEndZinc", ModBlocks.poorEndZincOre);

                }
            }
        }
        if (Config.modernMetalsPoorOresOverride || Loader.isModLoaded("modernmetals")){
            if (Config.modernMetalsPoorOres){
                OreDictionary.registerOre("orePoorAluminum", ModBlocks.poorAluminumOre);
                OreDictionary.registerOre("orePoorBeryllium", ModBlocks.poorBerylliumOre);
                OreDictionary.registerOre("orePoorBoron", ModBlocks.poorBoronOre);
                OreDictionary.registerOre("orePoorCadmium", ModBlocks.poorCadmiumOre);
                OreDictionary.registerOre("orePoorChromium", ModBlocks.poorChromiumOre);
                OreDictionary.registerOre("orePoorIridium", ModBlocks.poorIridiumOre);
                OreDictionary.registerOre("orePoorMagnesium", ModBlocks.poorMagnesiumOre);
                OreDictionary.registerOre("orePoorManganese", ModBlocks.poorManganeseOre);
                OreDictionary.registerOre("orePoorOsmium", ModBlocks.poorOsmiumOre);
                OreDictionary.registerOre("orePoorPlutonium", ModBlocks.poorPlutoniumOre);
                OreDictionary.registerOre("orePoorRutile", ModBlocks.poorRutileOre);
                OreDictionary.registerOre("orePoorTantalum", ModBlocks.poorTantalumOre);
                OreDictionary.registerOre("orePoorThorium", ModBlocks.poorThoriumOre);
                OreDictionary.registerOre("orePoorTitanium", ModBlocks.poorTitaniumOre);
                OreDictionary.registerOre("orePoorTungsten", ModBlocks.poorTungstenOre);
                OreDictionary.registerOre("orePoorUranium", ModBlocks.poorUraniumOre);
                OreDictionary.registerOre("orePoorZirconium", ModBlocks.poorZirconiumOre);
            }
            if (Config.netherModernMetalsPoorOresOverride || Loader.isModLoaded("nethermetals")){
                if (Config.netherModernMetalsPoorOres){
                    OreDictionary.registerOre("orePoorNetherAluminum", ModBlocks.poorNetherAluminumOre);
                    OreDictionary.registerOre("orePoorNetherCadmium", ModBlocks.poorNetherCadmiumOre);
                    OreDictionary.registerOre("orePoorNetherChromium", ModBlocks.poorNetherChromiumOre);
                    OreDictionary.registerOre("orePoorNetherIridium", ModBlocks.poorNetherIridiumOre);
                    OreDictionary.registerOre("orePoorNetherMagnesium", ModBlocks.poorNetherMagnesiumOre);
                    OreDictionary.registerOre("orePoorNetherManganese", ModBlocks.poorNetherManganeseOre);
                    OreDictionary.registerOre("orePoorNetherOsmium", ModBlocks.poorNetherOsmiumOre);
                    OreDictionary.registerOre("orePoorNetherPlutonium", ModBlocks.poorNetherPlutoniumOre);
                    OreDictionary.registerOre("orePoorNetherRutile", ModBlocks.poorNetherRutileOre);
                    OreDictionary.registerOre("orePoorNetherTantalum", ModBlocks.poorNetherTantalumOre);
                    OreDictionary.registerOre("orePoorNetherTitanium", ModBlocks.poorNetherTitaniumOre);
                    OreDictionary.registerOre("orePoorNetherTungsten", ModBlocks.poorNetherTungstenOre);
                    OreDictionary.registerOre("orePoorNetherUranium", ModBlocks.poorNetherUraniumOre);
                    OreDictionary.registerOre("orePoorNetherZirconium", ModBlocks.poorNetherZirconiumOre);
                }
            }
            if (Config.endModernMetalsPoorOresOverride || Loader.isModLoaded("endmetals")){
                if (Config.endModernMetalsPoorOres){
                    OreDictionary.registerOre("orePoorEndAluminum", ModBlocks.poorEndAluminumOre);
                    OreDictionary.registerOre("orePoorEndCadmium", ModBlocks.poorEndCadmiumOre);
                    OreDictionary.registerOre("orePoorEndChromium", ModBlocks.poorEndChromiumOre);
                    OreDictionary.registerOre("orePoorEndIridium", ModBlocks.poorEndIridiumOre);
                    OreDictionary.registerOre("orePoorEndMagnesium", ModBlocks.poorEndMagnesiumOre);
                    OreDictionary.registerOre("orePoorEndManganese", ModBlocks.poorEndManganeseOre);
                    OreDictionary.registerOre("orePoorEndOsmium", ModBlocks.poorEndOsmiumOre);
                    OreDictionary.registerOre("orePoorEndPlutonium", ModBlocks.poorEndPlutoniumOre);
                    OreDictionary.registerOre("orePoorEndRutile", ModBlocks.poorEndRutileOre);
                    OreDictionary.registerOre("orePoorEndTantalum", ModBlocks.poorEndTantalumOre);
                    OreDictionary.registerOre("orePoorEndTitanium", ModBlocks.poorEndTitaniumOre);
                    OreDictionary.registerOre("orePoorEndTungsten", ModBlocks.poorEndTungstenOre);
                    OreDictionary.registerOre("orePoorEndUranium", ModBlocks.poorEndUraniumOre);
                    OreDictionary.registerOre("orePoorEndZirconium", ModBlocks.poorEndZirconiumOre);
                }
            }
        }
    }

    public static void initMaceratorRecipes(){
        if (Loader.isModLoaded("basemetals") && Loader.isModLoaded("ic2") && Config.poorOreMacerator && Options.isModEnabled("ic2")){
            if (Config.poorOreDouble){
                if (Config.baseMetalsPoorOres){
                    for (String matName : myMaterialNamesBme) {
                        if (Materials.hasMaterial(matName)){
                            if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury")){
                                continue;
                            }
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                            Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                        }
                    }
                    if (Config.netherMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury") || matName.equals("adamantine") || matName.equals("coldiron") || matName.equals("starsteel")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorNether" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 4);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                    if (Config.endMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury") || matName.equals("adamantine") || matName.equals("coldiron") || matName.equals("starsteel")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorEnd" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 4);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                }
                if (Config.modernMetalsPoorOres && Loader.isModLoaded("modernmetals")){
                    for (String matName : myMaterialNamesMme) {
                        if (Materials.hasMaterial(matName)){
                            if (matName.equals("uranium")){
                                continue;
                            }
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                            Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                        }
                    }
                    if (Config.netherModernMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("uranium") || matName.equals("beryllium") || matName.equals("boron") || matName.equals("thorium")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorNether" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 4);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                    if (Config.endModernMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("uranium") || matName.equals("beryllium") || matName.equals("boron") || matName.equals("thorium")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorEnd" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 4);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                }
            }else {
                if (Config.baseMetalsPoorOres){
                    for (String matName : myMaterialNamesBme) {
                        if (Materials.hasMaterial(matName)){
                            if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury")){
                                continue;
                            }
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack crushed = mat.getItemStack(Names.CRUSHED, 1);
                            Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                        }
                    }
                    if (Config.netherMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury") || matName.equals("adamantine") || matName.equals("coldiron") || matName.equals("starsteel")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorNether" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                    if (Config.endMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("copper") || matName.equals("tin") || matName.equals("silver") || matName.equals("lead") || matName.equals("mercury") || matName.equals("adamantine") || matName.equals("coldiron") || matName.equals("starsteel")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorEnd" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                }
                if (Config.modernMetalsPoorOres && Loader.isModLoaded("modernmetals")){
                    for (String matName : myMaterialNamesMme) {
                        if (Materials.hasMaterial(matName)){
                            if (matName.equals("uranium")){
                                continue;
                            }
                            MMDMaterial mat = Materials.getMaterialByName(matName);
                            String oreName = mat.getCapitalizedName();
                            String poorOreName = "orePoor" + oreName;
                            ItemStack crushed = mat.getItemStack(Names.CRUSHED, 1);
                            Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                        }
                    }
                    if (Config.netherModernMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("uranium") || matName.equals("beryllium") || matName.equals("boron") || matName.equals("thorium")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorNether" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                    if (Config.endModernMetalsPoorOres){
                        for (String matName : myMaterialNamesBme) {
                            if (Materials.hasMaterial(matName)){
                                if (matName.equals("uranium") || matName.equals("beryllium") || matName.equals("boron") || matName.equals("thorium")){
                                    continue;
                                }
                                MMDMaterial mat = Materials.getMaterialByName(matName);
                                String oreName = mat.getCapitalizedName();
                                String poorOreName = "orePoorEnd" + oreName;
                                ItemStack crushed = mat.getItemStack(Names.CRUSHED, 2);
                                Recipes.macerator.addRecipe(Recipes.inputFactory.forOreDict(poorOreName, 3), null, false, crushed);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void init(){
        initFurnaceRecipes();
        initOreDictionary();
        initCrackhammerRecipes();
        initMaceratorRecipes();
    }
}