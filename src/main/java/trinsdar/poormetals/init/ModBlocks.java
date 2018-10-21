package trinsdar.poormetals.init;

import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import scala.actors.threadpool.Arrays;
import trinsdar.poormetals.Config;
import trinsdar.poormetals.PoorMetals;
import trinsdar.poormetals.blocks.*;
import trinsdar.poormetals.blocks.BlockPoorModdedNetherOres.PoorModdedNetherOresVariant;
import trinsdar.poormetals.blocks.BlockPoorModdedEndOres.PoorModdedEndOresVariant;
import trinsdar.poormetals.blocks.BlockPoorModdedOres.PoorModdedOresVariant;
import trinsdar.poormetals.blocks.BlockPoorVanillaOres.PoorVanillaOresVariant;
import trinsdar.poormetals.blocks.BlockPoorModernMetalsOres.PoorModernMetalsOreVariant;
import trinsdar.poormetals.blocks.BlockPoorModernMetalsEndOres.PoorModernMetalsEndOreVariant;
import trinsdar.poormetals.blocks.BlockPoorModernMetalsNetherOres.PoorModernMetalsNetherOreVariant;


import java.util.ArrayList;
import java.util.List;

@ObjectHolder(PoorMetals.MODID)
public class ModBlocks {
    public static final BlockPoorVanillaOres
    poorIronOre = new BlockPoorVanillaOres(PoorVanillaOresVariant.IRON),
    poorGoldOre = new BlockPoorVanillaOres(PoorVanillaOresVariant.GOLD);

    public static final BlockPoorModdedOres
    poorCopperOre = new BlockPoorModdedOres(PoorModdedOresVariant.COPPER),
    poorTinOre = new BlockPoorModdedOres(PoorModdedOresVariant.TIN),
    poorSilverOre = new BlockPoorModdedOres(PoorModdedOresVariant.SILVER),
    poorLeadOre = new BlockPoorModdedOres(PoorModdedOresVariant.LEAD),
    poorNickelOre = new BlockPoorModdedOres(PoorModdedOresVariant.NICKEL),
    poorZincOre = new BlockPoorModdedOres(PoorModdedOresVariant.ZINC),
    poorMercuryOre = new BlockPoorModdedOres(PoorModdedOresVariant.MERCURY),
    poorPlatinumOre = new BlockPoorModdedOres(PoorModdedOresVariant.PLATINUM),
    poorBismuthOre = new BlockPoorModdedOres(PoorModdedOresVariant.BISMUTH),
    poorAntimonyOre = new BlockPoorModdedOres(PoorModdedOresVariant.ANTIMONY),
    poorAdamantineOre = new BlockPoorModdedOres(PoorModdedOresVariant.ADAMANTINE),
    poorColdIronOre = new BlockPoorModdedOres(PoorModdedOresVariant.COLD_IRON),
    poorStarsteelOre = new BlockPoorModdedOres(PoorModdedOresVariant.STARSTEEL);

    public static final BlockPoorModernMetalsOres
    poorAluminumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.ALUMINUM),
    poorBerylliumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.BERYLLIUM),
    poorBoronOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.BORON),
    poorCadmiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.CADMIUM),
    poorChromiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.CHROMIUM),
    poorIridiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.IRIDIUM),
    poorMagnesiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.MAGNESIUM),
    poorMaganeseOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.MAGANESE),
    poorOsmiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.OSMIUM),
    poorPlutoniumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.PLUTONIUM),
    poorRutileOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.RUTILE),
    poorTantalumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.TANTALUM),
    poorThoriumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.THORIUM),
    poorTitaniumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.TITANIUM),
    poorTungstenOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.TUNGSTEN),
    poorUraniumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.URANIUM),
    poorZirconiumOre = new BlockPoorModernMetalsOres(PoorModernMetalsOreVariant.ZIRCONIUM);

    public static final BlockPoorModdedNetherOres
    poorNetherIronOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.IRON),
    poorNetherGoldOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.GOLD),
    poorNetherCopperOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.COPPER),
    poorNetherTinOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.TIN),
    poorNetherSilverOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.SILVER),
    poorNetherLeadOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.LEAD),
    poorNetherNickelOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.NICKEL),
    poorNetherZincOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.ZINC),
    poorNetherMercuryOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.MERCURY),
    poorNetherPlatinumOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.PLATINUM),
    poorNetherBismuthOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.BISMUTH),
    poorNetherAntimonyOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.ANTIMONY);

    public static final BlockPoorModdedEndOres
    poorEndIronOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.IRON),
    poorEndGoldOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.GOLD),
    poorEndCopperOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.COPPER),
    poorEndTinOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.TIN),
    poorEndSilverOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.SILVER),
    poorEndLeadOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.LEAD),
    poorEndNickelOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.NICKEL),
    poorEndZincOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.ZINC),
    poorEndMercuryOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.MERCURY),
    poorEndPlatinumOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.PLATINUM),
    poorEndBismuthOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.BISMUTH),
    poorEndAntimonyOre = new BlockPoorModdedEndOres(PoorModdedEndOresVariant.ANTIMONY);

    public static final BlockPoorModernMetalsEndOres
    poorEndAluminumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.ALUMINUM),
    poorEndBerylliumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.BERYLLIUM),
    poorEndBoronOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.BORON),
    poorEndCadmiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.CADMIUM),
    poorEndChromiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.CHROMIUM),
    poorEndIridiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.IRIDIUM),
    poorEndMagnesiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.MAGNESIUM),
    poorEndMaganeseOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.MAGANESE),
    poorEndOsmiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.OSMIUM),
    poorEndPlutoniumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.PLUTONIUM),
    poorEndRutileOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.RUTILE),
    poorEndTantalumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.TANTALUM),
    poorEndThoriumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.THORIUM),
    poorEndTitaniumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.TITANIUM),
    poorEndTungstenOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.TUNGSTEN),
    poorEndUraniumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.URANIUM),
    poorEndZirconiumOre = new BlockPoorModernMetalsEndOres(PoorModernMetalsEndOreVariant.ZIRCONIUM);

    public static final BlockPoorModernMetalsNetherOres
    poorNetherAluminumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.ALUMINUM),
    poorNetherBerylliumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.BERYLLIUM),
    poorNetherBoronOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.BORON),
    poorNetherCadmiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.CADMIUM),
    poorNetherChromiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.CHROMIUM),
    poorNetherIridiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.IRIDIUM),
    poorNetherMagnesiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.MAGNESIUM),
    poorNetherMaganeseOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.MAGANESE),
    poorNetherOsmiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.OSMIUM),
    poorNetherPlutoniumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.PLUTONIUM),
    poorNetherRutileOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.RUTILE),
    poorNetherTantalumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.TANTALUM),
    poorNetherThoriumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.THORIUM),
    poorNetherTitaniumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.TITANIUM),
    poorNetherTungstenOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.TUNGSTEN),
    poorNetherUraniumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.URANIUM),
    poorNetherZirconiumOre = new BlockPoorModernMetalsNetherOres(PoorModernMetalsNetherOreVariant.ZIRCONIUM);

    @Mod.EventBusSubscriber(modid = PoorMetals.MODID)
    public static class RegistrationHandler {

        private static ArrayList<BlockPoorVanillaOres> vanilla = null;
        private static ArrayList<BlockPoorModdedOres> baseMetals = null;
        private static ArrayList<BlockPoorModernMetalsOres> modernMetals = null;
        private static ArrayList<BlockPoorModdedNetherOres> netherMetalsRegular = null;
        private static ArrayList<BlockPoorModdedEndOres> endMetalsRegular = null;
        private static ArrayList<BlockPoorModernMetalsNetherOres> netherMetalsModern = null;
        private static ArrayList<BlockPoorModernMetalsEndOres> endMetalsModern = null;
        private void initVanilla(){
            if(vanilla == null){
                vanilla = new ArrayList<>();
                vanilla.add(poorIronOre);
                vanilla.add(poorGoldOre);
            }
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event){
            //Block[] blocksVanilla = vanilla.toArray(new Block[vanilla.size()]);
            //Block[] blocksVanilla = new Block[vanilla.size()];
            //blocksVanilla = vanilla.toArray(blocksVanilla);
            if (Config.vanillaPoorOres){
                event.getRegistry().registerAll(poorIronOre, poorGoldOre);
            }

            if (!Config.baseMetalsPoorOresOverride){
                if (Loader.isModLoaded("basemetals")){
                    if (Config.baseMetalsPoorOres){
                        event.getRegistry().registerAll(poorAdamantineOre, poorAntimonyOre, poorBismuthOre,
                                poorColdIronOre, poorCopperOre, poorLeadOre, poorMercuryOre, poorNickelOre,
                                poorPlatinumOre, poorSilverOre, poorStarsteelOre, poorTinOre, poorZincOre);
                    }
                }
            }else if (Config.baseMetalsPoorOresOverride){
                if (Config.baseMetalsPoorOres){
                    event.getRegistry().registerAll(poorAdamantineOre, poorAntimonyOre, poorBismuthOre,
                            poorColdIronOre, poorCopperOre, poorLeadOre, poorMercuryOre, poorNickelOre,
                            poorPlatinumOre, poorSilverOre, poorStarsteelOre, poorTinOre, poorZincOre);
                }
            }

            if (!Config.modernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals")){
                    if (Config.modernMetalsPoorOres){
                        event.getRegistry().registerAll(poorAluminumOre, poorBerylliumOre, poorBoronOre,
                                poorCadmiumOre, poorChromiumOre, poorIridiumOre, poorMagnesiumOre,
                                poorMaganeseOre, poorOsmiumOre, poorPlutoniumOre, poorRutileOre,
                                poorTantalumOre, poorThoriumOre, poorTitaniumOre, poorTungstenOre,
                                poorUraniumOre, poorZirconiumOre);
                    }
                }
            }else if (Config.modernMetalsPoorOresOverride){
                if (Config.modernMetalsPoorOres){
                    event.getRegistry().registerAll(poorAluminumOre, poorBerylliumOre, poorBoronOre,
                            poorCadmiumOre, poorChromiumOre, poorIridiumOre, poorMagnesiumOre,
                            poorMaganeseOre, poorOsmiumOre, poorPlutoniumOre, poorRutileOre,
                            poorTantalumOre, poorThoriumOre, poorTitaniumOre, poorTungstenOre,
                            poorUraniumOre, poorZirconiumOre);
                }
            }

            if (!Config.netherMetalsPoorOresOverride){
                if (Loader.isModLoaded("nethermetals")){
                    if (Config.netherMetalsPoorOres){
                        event.getRegistry().registerAll(poorNetherGoldOre, poorNetherIronOre, poorNetherAntimonyOre, poorNetherBismuthOre,
                                poorNetherCopperOre, poorNetherLeadOre, poorNetherMercuryOre, poorNetherNickelOre,
                                poorNetherPlatinumOre, poorNetherSilverOre, poorNetherTinOre, poorNetherZincOre);
                    }
                }
            }else if (Config.netherMetalsPoorOresOverride){
                if (Config.netherMetalsPoorOres){
                    event.getRegistry().registerAll(poorNetherGoldOre, poorNetherIronOre, poorNetherAntimonyOre, poorNetherBismuthOre,
                            poorNetherCopperOre, poorNetherLeadOre, poorNetherMercuryOre, poorNetherNickelOre,
                            poorNetherPlatinumOre, poorNetherSilverOre, poorNetherTinOre, poorNetherZincOre);
                }
            }

            if (!Config.netherModernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")){
                    if (Config.netherModernMetalsPoorOres){
                        event.getRegistry().registerAll(poorNetherAluminumOre, poorNetherBerylliumOre, poorNetherBoronOre,
                                poorNetherCadmiumOre, poorNetherChromiumOre, poorNetherIridiumOre, poorNetherMagnesiumOre,
                                poorNetherMaganeseOre, poorNetherOsmiumOre, poorNetherPlutoniumOre, poorNetherRutileOre,
                                poorNetherTantalumOre, poorNetherThoriumOre, poorNetherTitaniumOre, poorNetherTungstenOre,
                                poorNetherUraniumOre, poorNetherZirconiumOre);
                    }
                }
            }else if (Config.netherModernMetalsPoorOresOverride){
                if (Config.netherModernMetalsPoorOres){
                    event.getRegistry().registerAll(poorNetherAluminumOre, poorNetherBerylliumOre, poorNetherBoronOre,
                                poorNetherCadmiumOre, poorNetherChromiumOre, poorNetherIridiumOre, poorNetherMagnesiumOre,
                                poorNetherMaganeseOre, poorNetherOsmiumOre, poorNetherPlutoniumOre, poorNetherRutileOre,
                                poorNetherTantalumOre, poorNetherThoriumOre, poorNetherTitaniumOre, poorNetherTungstenOre,
                                poorNetherUraniumOre, poorNetherZirconiumOre);
                }
            }

            if (!Config.endMetalsPoorOresOverride){
                if (Loader.isModLoaded("endmetals")){
                    if (Config.endMetalsPoorOres){
                        event.getRegistry().registerAll(poorEndGoldOre, poorEndIronOre, poorEndAntimonyOre, poorEndBismuthOre,
                                poorEndCopperOre, poorEndLeadOre, poorEndMercuryOre, poorEndNickelOre,
                                poorEndPlatinumOre, poorEndSilverOre, poorEndTinOre, poorEndZincOre);
                    }
                }
            }else if (Config.endMetalsPoorOresOverride){
                if (Config.endMetalsPoorOres){
                    event.getRegistry().registerAll(poorEndGoldOre, poorEndIronOre, poorEndAntimonyOre, poorEndBismuthOre,
                            poorEndCopperOre, poorEndLeadOre, poorEndMercuryOre, poorEndNickelOre,
                            poorEndPlatinumOre, poorEndSilverOre, poorEndTinOre, poorEndZincOre);
                }
            }

            if (!Config.endModernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")){
                    if (Config.endModernMetalsPoorOres){
                        event.getRegistry().registerAll(poorEndAluminumOre, poorEndBerylliumOre, poorEndBoronOre,
                                poorEndCadmiumOre, poorEndChromiumOre, poorEndIridiumOre, poorEndMagnesiumOre,
                                poorEndMaganeseOre, poorEndOsmiumOre, poorEndPlutoniumOre, poorEndRutileOre,
                                poorEndTantalumOre, poorEndThoriumOre, poorEndTitaniumOre, poorEndTungstenOre,
                                poorEndUraniumOre, poorEndZirconiumOre);
                    }
                }
            }else if (Config.endModernMetalsPoorOresOverride){
                if (Config.endModernMetalsPoorOres){
                    event.getRegistry().registerAll(poorEndAluminumOre, poorEndBerylliumOre, poorEndBoronOre,
                                poorEndCadmiumOre, poorEndChromiumOre, poorEndIridiumOre, poorEndMagnesiumOre,
                                poorEndMaganeseOre, poorEndOsmiumOre, poorEndPlutoniumOre, poorEndRutileOre,
                                poorEndTantalumOre, poorEndThoriumOre, poorEndTitaniumOre, poorEndTungstenOre,
                                poorEndUraniumOre, poorEndZirconiumOre);
                }
            }
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event){
            final ItemBlock[] itemsVanilla = {
                    new ItemBlock(poorIronOre), new ItemBlock(poorGoldOre),
            };
            if (Config.vanillaPoorOres) {
                final IForgeRegistry<Item> registry = event.getRegistry();
                for (final ItemBlock item : itemsVanilla) {
                    final Block block = item.getBlock();
                    final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    registry.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }

            final ItemBlock[] itemsModded = {
                    new ItemBlock(poorAdamantineOre), new ItemBlock(poorAntimonyOre),
                    new ItemBlock(poorBismuthOre), new ItemBlock(poorColdIronOre),
                    new ItemBlock(poorCopperOre), new ItemBlock(poorLeadOre),
                    new ItemBlock(poorMercuryOre), new ItemBlock(poorNickelOre),
                    new ItemBlock(poorPlatinumOre), new ItemBlock(poorSilverOre),
                    new ItemBlock(poorStarsteelOre), new ItemBlock(poorTinOre),
                    new ItemBlock(poorZincOre)
            };
            if (!Config.baseMetalsPoorOresOverride){
                if (Loader.isModLoaded("basemetals")){
                    if (Config.baseMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsModded) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.baseMetalsPoorOresOverride){
                if (Config.baseMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsModded) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }

            final ItemBlock[] itemsModern = {
                    new ItemBlock(poorAluminumOre),new ItemBlock(poorBerylliumOre),
                    new ItemBlock(poorBoronOre), new ItemBlock(poorCadmiumOre),
                    new ItemBlock(poorChromiumOre), new ItemBlock(poorIridiumOre),
                    new ItemBlock(poorMagnesiumOre), new ItemBlock(poorMaganeseOre),
                    new ItemBlock(poorOsmiumOre), new ItemBlock(poorPlutoniumOre),
                    new ItemBlock(poorRutileOre), new ItemBlock(poorTantalumOre),
                    new ItemBlock(poorThoriumOre), new ItemBlock(poorTitaniumOre),
                    new ItemBlock(poorTungstenOre), new ItemBlock(poorUraniumOre),
                    new ItemBlock(poorZirconiumOre)
            };
            if (!Config.modernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals")){
                    if (Config.modernMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsModern) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.modernMetalsPoorOresOverride){
                if (Config.modernMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsModern) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }

            final ItemBlock[] itemsNether = {
                    new ItemBlock(poorNetherGoldOre),new ItemBlock(poorNetherIronOre),
                    new ItemBlock(poorNetherAntimonyOre), new ItemBlock(poorNetherBismuthOre),
                    new ItemBlock(poorNetherCopperOre), new ItemBlock(poorNetherLeadOre),
                    new ItemBlock(poorNetherMercuryOre), new ItemBlock(poorNetherNickelOre),
                    new ItemBlock(poorNetherPlatinumOre), new ItemBlock(poorNetherSilverOre),
                    new ItemBlock(poorNetherTinOre), new ItemBlock(poorNetherZincOre)
            };
            if (!Config.netherMetalsPoorOresOverride){
                if (Loader.isModLoaded("nethermetals")){
                    if (Config.netherMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsNether) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.netherMetalsPoorOresOverride){
                if (Config.netherMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsNether) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }

            final ItemBlock[] itemsNetherModern = {
                    new ItemBlock(poorNetherAluminumOre),new ItemBlock(poorNetherBerylliumOre),
                    new ItemBlock(poorNetherBoronOre), new ItemBlock(poorNetherCadmiumOre),
                    new ItemBlock(poorNetherChromiumOre), new ItemBlock(poorNetherIridiumOre),
                    new ItemBlock(poorNetherMagnesiumOre), new ItemBlock(poorNetherMaganeseOre),
                    new ItemBlock(poorNetherOsmiumOre), new ItemBlock(poorNetherPlutoniumOre),
                    new ItemBlock(poorNetherRutileOre), new ItemBlock(poorNetherTantalumOre),
                    new ItemBlock(poorNetherThoriumOre), new ItemBlock(poorNetherTitaniumOre),
                    new ItemBlock(poorNetherTungstenOre), new ItemBlock(poorNetherUraniumOre),
                    new ItemBlock(poorNetherZirconiumOre)
            };
            if (!Config.netherModernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")){
                    if (Config.netherModernMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsNetherModern) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.netherModernMetalsPoorOresOverride){
                if (Config.netherModernMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsNetherModern) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }

            final ItemBlock[] itemsEnd = {
                    new ItemBlock(poorEndGoldOre),new ItemBlock(poorEndIronOre),
                    new ItemBlock(poorEndAntimonyOre), new ItemBlock(poorEndBismuthOre),
                    new ItemBlock(poorEndCopperOre), new ItemBlock(poorEndLeadOre),
                    new ItemBlock(poorEndMercuryOre), new ItemBlock(poorEndNickelOre),
                    new ItemBlock(poorEndPlatinumOre), new ItemBlock(poorEndSilverOre),
                    new ItemBlock(poorEndTinOre), new ItemBlock(poorEndZincOre)

            };
            if (!Config.endMetalsPoorOresOverride){
                if (Loader.isModLoaded("endmetals")){
                    if (Config.endMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsEnd) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.endMetalsPoorOresOverride){
                if (Config.endMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsEnd) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }

            final ItemBlock[] itemsEndModern = {
                    new ItemBlock(poorEndAluminumOre),new ItemBlock(poorEndBerylliumOre),
                    new ItemBlock(poorEndBoronOre), new ItemBlock(poorEndCadmiumOre),
                    new ItemBlock(poorEndChromiumOre), new ItemBlock(poorEndIridiumOre),
                    new ItemBlock(poorEndMagnesiumOre), new ItemBlock(poorEndMaganeseOre),
                    new ItemBlock(poorEndOsmiumOre), new ItemBlock(poorEndPlutoniumOre),
                    new ItemBlock(poorEndRutileOre), new ItemBlock(poorEndTantalumOre),
                    new ItemBlock(poorEndThoriumOre), new ItemBlock(poorEndTitaniumOre),
                    new ItemBlock(poorEndTungstenOre), new ItemBlock(poorEndUraniumOre),
                    new ItemBlock(poorEndZirconiumOre)
            };
            if (!Config.endModernMetalsPoorOresOverride){
                if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")){
                    if (Config.endModernMetalsPoorOres) {
                        final IForgeRegistry<Item> registry = event.getRegistry();
                        for (final ItemBlock item : itemsEndModern) {
                            final Block block = item.getBlock();
                            final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                    "Block %s has null registry name", block);
                            registry.register(item.setRegistryName(registryName));
                            item.setCreativeTab(PoorMetals.creativeTab);
                        }
                    }
                }
            }else if (Config.endModernMetalsPoorOresOverride){
                if (Config.endModernMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsEndModern) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                        item.setCreativeTab(PoorMetals.creativeTab);
                    }
                }
            }
        }
    }

    public static void initModels(){
        if (Config.vanillaPoorOres) {
            poorIronOre.initModel();
            poorGoldOre.initModel();
        }
        if (!Config.baseMetalsPoorOresOverride){
            if (Loader.isModLoaded("basemetals")){
                if (Config.baseMetalsPoorOres) {
                    poorAdamantineOre.initModel();
                    poorAntimonyOre.initModel();
                    poorBismuthOre.initModel();
                    poorColdIronOre.initModel();
                    poorCopperOre.initModel();
                    poorLeadOre.initModel();
                    poorMercuryOre.initModel();
                    poorNickelOre.initModel();
                    poorPlatinumOre.initModel();
                    poorSilverOre.initModel();
                    poorStarsteelOre.initModel();
                    poorTinOre.initModel();
                    poorZincOre.initModel();
                }
            }
        }else if (Config.baseMetalsPoorOresOverride){
            if (Config.baseMetalsPoorOres) {
                poorAdamantineOre.initModel();
                poorAntimonyOre.initModel();
                poorBismuthOre.initModel();
                poorColdIronOre.initModel();
                poorCopperOre.initModel();
                poorLeadOre.initModel();
                poorMercuryOre.initModel();
                poorNickelOre.initModel();
                poorPlatinumOre.initModel();
                poorSilverOre.initModel();
                poorStarsteelOre.initModel();
                poorTinOre.initModel();
                poorZincOre.initModel();
            }
        }

        if (!Config.modernMetalsPoorOresOverride){
            if (Loader.isModLoaded("modernmetals")){
                if (Config.modernMetalsPoorOres) {
                    poorAluminumOre.initModel();
                    poorBerylliumOre.initModel();
                    poorBoronOre.initModel();
                    poorCadmiumOre.initModel();
                    poorChromiumOre.initModel();
                    poorIridiumOre.initModel();
                    poorMagnesiumOre.initModel();
                    poorMaganeseOre.initModel();
                    poorOsmiumOre.initModel();
                    poorPlutoniumOre.initModel();
                    poorRutileOre.initModel();
                    poorTantalumOre.initModel();
                    poorThoriumOre.initModel();
                    poorTitaniumOre.initModel();
                    poorTungstenOre.initModel();
                    poorUraniumOre.initModel();
                    poorZirconiumOre.initModel();
                }
            }
        }else if (Config.modernMetalsPoorOresOverride){
            if (Config.modernMetalsPoorOres) {
                poorAluminumOre.initModel();
                poorBerylliumOre.initModel();
                poorBoronOre.initModel();
                poorCadmiumOre.initModel();
                poorChromiumOre.initModel();
                poorIridiumOre.initModel();
                poorMagnesiumOre.initModel();
                poorMaganeseOre.initModel();
                poorOsmiumOre.initModel();
                poorPlutoniumOre.initModel();
                poorRutileOre.initModel();
                poorTantalumOre.initModel();
                poorThoriumOre.initModel();
                poorTitaniumOre.initModel();
                poorTungstenOre.initModel();
                poorUraniumOre.initModel();
                poorZirconiumOre.initModel();
            }
        }

        if (!Config.netherMetalsPoorOresOverride){
            if (Loader.isModLoaded("nethermetals")){
                if (Config.netherMetalsPoorOres) {
                    poorNetherGoldOre.initModel();
                    poorNetherIronOre.initModel();
                    poorNetherAntimonyOre.initModel();
                    poorNetherBismuthOre.initModel();
                    poorNetherCopperOre.initModel();
                    poorNetherLeadOre.initModel();
                    poorNetherMercuryOre.initModel();
                    poorNetherNickelOre.initModel();
                    poorNetherPlatinumOre.initModel();
                    poorNetherSilverOre.initModel();
                    poorNetherTinOre.initModel();
                    poorNetherZincOre.initModel();
                }
            }
        }else if (Config.netherMetalsPoorOresOverride){
            if (Config.netherMetalsPoorOres) {
                poorNetherGoldOre.initModel();
                poorNetherIronOre.initModel();
                poorNetherAntimonyOre.initModel();
                poorNetherBismuthOre.initModel();
                poorNetherCopperOre.initModel();
                poorNetherLeadOre.initModel();
                poorNetherMercuryOre.initModel();
                poorNetherNickelOre.initModel();
                poorNetherPlatinumOre.initModel();
                poorNetherSilverOre.initModel();
                poorNetherTinOre.initModel();
                poorNetherZincOre.initModel();
            }
        }

        if (!Config.netherModernMetalsPoorOresOverride){
            if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")){
                if (Config.netherModernMetalsPoorOres) {
                    poorNetherAluminumOre.initModel();
                    poorNetherBerylliumOre.initModel();
                    poorNetherBoronOre.initModel();
                    poorNetherCadmiumOre.initModel();
                    poorNetherChromiumOre.initModel();
                    poorNetherIridiumOre.initModel();
                    poorNetherMagnesiumOre.initModel();
                    poorNetherMaganeseOre.initModel();
                    poorNetherOsmiumOre.initModel();
                    poorNetherPlutoniumOre.initModel();
                    poorNetherRutileOre.initModel();
                    poorNetherTantalumOre.initModel();
                    poorNetherThoriumOre.initModel();
                    poorNetherTitaniumOre.initModel();
                    poorNetherTungstenOre.initModel();
                    poorNetherUraniumOre.initModel();
                    poorNetherZirconiumOre.initModel();
                }
            }
        }else if (Config.netherModernMetalsPoorOresOverride){
            if (Config.netherModernMetalsPoorOres) {
                poorNetherAluminumOre.initModel();
                poorNetherBerylliumOre.initModel();
                poorNetherBoronOre.initModel();
                poorNetherCadmiumOre.initModel();
                poorNetherChromiumOre.initModel();
                poorNetherIridiumOre.initModel();
                poorNetherMagnesiumOre.initModel();
                poorNetherMaganeseOre.initModel();
                poorNetherOsmiumOre.initModel();
                poorNetherPlutoniumOre.initModel();
                poorNetherRutileOre.initModel();
                poorNetherTantalumOre.initModel();
                poorNetherThoriumOre.initModel();
                poorNetherTitaniumOre.initModel();
                poorNetherTungstenOre.initModel();
                poorNetherUraniumOre.initModel();
                poorNetherZirconiumOre.initModel();
            }
        }

        if (!Config.endMetalsPoorOresOverride){
            if (Loader.isModLoaded("endmetals")){
                if (Config.endMetalsPoorOres) {
                    poorEndGoldOre.initModel();
                    poorEndIronOre.initModel();
                    poorEndAntimonyOre.initModel();
                    poorEndBismuthOre.initModel();
                    poorEndCopperOre.initModel();
                    poorEndLeadOre.initModel();
                    poorEndMercuryOre.initModel();
                    poorEndNickelOre.initModel();
                    poorEndPlatinumOre.initModel();
                    poorEndSilverOre.initModel();
                    poorEndTinOre.initModel();
                    poorEndZincOre.initModel();
                }
            }
        }else if (Config.endMetalsPoorOresOverride){
            if (Config.endMetalsPoorOres) {
                poorEndGoldOre.initModel();
                poorEndIronOre.initModel();
                poorEndAntimonyOre.initModel();
                poorEndBismuthOre.initModel();
                poorEndCopperOre.initModel();
                poorEndLeadOre.initModel();
                poorEndMercuryOre.initModel();
                poorEndNickelOre.initModel();
                poorEndPlatinumOre.initModel();
                poorEndSilverOre.initModel();
                poorEndTinOre.initModel();
                poorEndZincOre.initModel();
            }
        }

        if (!Config.endModernMetalsPoorOresOverride){
            if (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")){
                if (Config.endModernMetalsPoorOres) {
                    poorEndAluminumOre.initModel();
                    poorEndBerylliumOre.initModel();
                    poorEndBoronOre.initModel();
                    poorEndCadmiumOre.initModel();
                    poorEndChromiumOre.initModel();
                    poorEndIridiumOre.initModel();
                    poorEndMagnesiumOre.initModel();
                    poorEndMaganeseOre.initModel();
                    poorEndOsmiumOre.initModel();
                    poorEndPlutoniumOre.initModel();
                    poorEndRutileOre.initModel();
                    poorEndTantalumOre.initModel();
                    poorEndThoriumOre.initModel();
                    poorEndTitaniumOre.initModel();
                    poorEndTungstenOre.initModel();
                    poorEndUraniumOre.initModel();
                    poorEndZirconiumOre.initModel();
                }
            }
        }else if (Config.endModernMetalsPoorOresOverride){
            if (Config.endModernMetalsPoorOres) {
                poorEndAluminumOre.initModel();
                poorEndBerylliumOre.initModel();
                poorEndBoronOre.initModel();
                poorEndCadmiumOre.initModel();
                poorEndChromiumOre.initModel();
                poorEndIridiumOre.initModel();
                poorEndMagnesiumOre.initModel();
                poorEndMaganeseOre.initModel();
                poorEndOsmiumOre.initModel();
                poorEndPlutoniumOre.initModel();
                poorEndRutileOre.initModel();
                poorEndTantalumOre.initModel();
                poorEndThoriumOre.initModel();
                poorEndTitaniumOre.initModel();
                poorEndTungstenOre.initModel();
                poorEndUraniumOre.initModel();
                poorEndZirconiumOre.initModel();
            }
        }
    }
}
