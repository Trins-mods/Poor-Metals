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
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import trinsdar.poormetals.Config;
import trinsdar.poormetals.PoorMetals;
import trinsdar.poormetals.blocks.BlockPoorEndOres;
import trinsdar.poormetals.blocks.BlockPoorNetherOres;
import trinsdar.poormetals.blocks.BlockPoorOres;
import trinsdar.poormetals.blocks.BlockPooreOreTypes;


import java.util.ArrayList;

@ObjectHolder(PoorMetals.MODID)
public class ModBlocks {
    public static final BlockPoorOres
    poorIronOre = new BlockPoorOres(BlockPooreOreTypes.IRON),
    poorGoldOre = new BlockPoorOres(BlockPooreOreTypes.GOLD);

    public static final BlockPoorOres
    poorCopperOre = new BlockPoorOres(BlockPooreOreTypes.COPPER),
    poorTinOre = new BlockPoorOres(BlockPooreOreTypes.TIN),
    poorSilverOre = new BlockPoorOres(BlockPooreOreTypes.SILVER),
    poorLeadOre = new BlockPoorOres(BlockPooreOreTypes.LEAD),
    poorNickelOre = new BlockPoorOres(BlockPooreOreTypes.NICKEL),
    poorZincOre = new BlockPoorOres(BlockPooreOreTypes.ZINC),
    poorMercuryOre = new BlockPoorOres(BlockPooreOreTypes.MERCURY),
    poorPlatinumOre = new BlockPoorOres(BlockPooreOreTypes.PLATINUM),
    poorBismuthOre = new BlockPoorOres(BlockPooreOreTypes.BISMUTH),
    poorAntimonyOre = new BlockPoorOres(BlockPooreOreTypes.ANTIMONY),
    poorAdamantineOre = new BlockPoorOres(BlockPooreOreTypes.ADAMANTINE),
    poorColdIronOre = new BlockPoorOres(BlockPooreOreTypes.COLD_IRON),
    poorStarsteelOre = new BlockPoorOres(BlockPooreOreTypes.STARSTEEL);

    public static final BlockPoorOres
    poorAluminumOre = new BlockPoorOres(BlockPooreOreTypes.ALUMINUM),
    poorBerylliumOre = new BlockPoorOres(BlockPooreOreTypes.BERYLLIUM),
    poorBoronOre = new BlockPoorOres(BlockPooreOreTypes.BORON),
    poorCadmiumOre = new BlockPoorOres(BlockPooreOreTypes.CADMIUM),
    poorChromiumOre = new BlockPoorOres(BlockPooreOreTypes.CHROMIUM),
    poorIridiumOre = new BlockPoorOres(BlockPooreOreTypes.IRIDIUM),
    poorMagnesiumOre = new BlockPoorOres(BlockPooreOreTypes.MAGNESIUM),
    poorManganeseOre = new BlockPoorOres(BlockPooreOreTypes.MAGANESE),
    poorOsmiumOre = new BlockPoorOres(BlockPooreOreTypes.OSMIUM),
    poorPlutoniumOre = new BlockPoorOres(BlockPooreOreTypes.PLUTONIUM),
    poorRutileOre = new BlockPoorOres(BlockPooreOreTypes.RUTILE),
    poorTantalumOre = new BlockPoorOres(BlockPooreOreTypes.TANTALUM),
    poorThoriumOre = new BlockPoorOres(BlockPooreOreTypes.THORIUM),
    poorTitaniumOre = new BlockPoorOres(BlockPooreOreTypes.TITANIUM),
    poorTungstenOre = new BlockPoorOres(BlockPooreOreTypes.TUNGSTEN),
    poorUraniumOre = new BlockPoorOres(BlockPooreOreTypes.URANIUM),
    poorZirconiumOre = new BlockPoorOres(BlockPooreOreTypes.ZIRCONIUM);

    public static final BlockPoorNetherOres
    poorNetherIronOre = new BlockPoorNetherOres(BlockPooreOreTypes.IRON),
    poorNetherGoldOre = new BlockPoorNetherOres(BlockPooreOreTypes.GOLD),
    poorNetherCopperOre = new BlockPoorNetherOres(BlockPooreOreTypes.COPPER),
    poorNetherTinOre = new BlockPoorNetherOres(BlockPooreOreTypes.TIN),
    poorNetherSilverOre = new BlockPoorNetherOres(BlockPooreOreTypes.SILVER),
    poorNetherLeadOre = new BlockPoorNetherOres(BlockPooreOreTypes.LEAD),
    poorNetherNickelOre = new BlockPoorNetherOres(BlockPooreOreTypes.NICKEL),
    poorNetherZincOre = new BlockPoorNetherOres(BlockPooreOreTypes.ZINC),
    poorNetherMercuryOre = new BlockPoorNetherOres(BlockPooreOreTypes.MERCURY),
    poorNetherPlatinumOre = new BlockPoorNetherOres(BlockPooreOreTypes.PLATINUM),
    poorNetherBismuthOre = new BlockPoorNetherOres(BlockPooreOreTypes.BISMUTH),
    poorNetherAntimonyOre = new BlockPoorNetherOres(BlockPooreOreTypes.ANTIMONY);

    public static final BlockPoorEndOres
    poorEndIronOre = new BlockPoorEndOres(BlockPooreOreTypes.IRON),
    poorEndGoldOre = new BlockPoorEndOres(BlockPooreOreTypes.GOLD),
    poorEndCopperOre = new BlockPoorEndOres(BlockPooreOreTypes.COPPER),
    poorEndTinOre = new BlockPoorEndOres(BlockPooreOreTypes.TIN),
    poorEndSilverOre = new BlockPoorEndOres(BlockPooreOreTypes.SILVER),
    poorEndLeadOre = new BlockPoorEndOres(BlockPooreOreTypes.LEAD),
    poorEndNickelOre = new BlockPoorEndOres(BlockPooreOreTypes.NICKEL),
    poorEndZincOre = new BlockPoorEndOres(BlockPooreOreTypes.ZINC),
    poorEndMercuryOre = new BlockPoorEndOres(BlockPooreOreTypes.MERCURY),
    poorEndPlatinumOre = new BlockPoorEndOres(BlockPooreOreTypes.PLATINUM),
    poorEndBismuthOre = new BlockPoorEndOres(BlockPooreOreTypes.BISMUTH),
    poorEndAntimonyOre = new BlockPoorEndOres(BlockPooreOreTypes.ANTIMONY);

    public static final BlockPoorEndOres
    poorEndAluminumOre = new BlockPoorEndOres(BlockPooreOreTypes.ALUMINUM),
    poorEndBerylliumOre = new BlockPoorEndOres(BlockPooreOreTypes.BERYLLIUM),
    poorEndBoronOre = new BlockPoorEndOres(BlockPooreOreTypes.BORON),
    poorEndCadmiumOre = new BlockPoorEndOres(BlockPooreOreTypes.CADMIUM),
    poorEndChromiumOre = new BlockPoorEndOres(BlockPooreOreTypes.CHROMIUM),
    poorEndIridiumOre = new BlockPoorEndOres(BlockPooreOreTypes.IRIDIUM),
    poorEndMagnesiumOre = new BlockPoorEndOres(BlockPooreOreTypes.MAGNESIUM),
    poorEndManganeseOre = new BlockPoorEndOres(BlockPooreOreTypes.MAGANESE),
    poorEndOsmiumOre = new BlockPoorEndOres(BlockPooreOreTypes.OSMIUM),
    poorEndPlutoniumOre = new BlockPoorEndOres(BlockPooreOreTypes.PLUTONIUM),
    poorEndRutileOre = new BlockPoorEndOres(BlockPooreOreTypes.RUTILE),
    poorEndTantalumOre = new BlockPoorEndOres(BlockPooreOreTypes.TANTALUM),
    poorEndThoriumOre = new BlockPoorEndOres(BlockPooreOreTypes.THORIUM),
    poorEndTitaniumOre = new BlockPoorEndOres(BlockPooreOreTypes.TITANIUM),
    poorEndTungstenOre = new BlockPoorEndOres(BlockPooreOreTypes.TUNGSTEN),
    poorEndUraniumOre = new BlockPoorEndOres(BlockPooreOreTypes.URANIUM),
    poorEndZirconiumOre = new BlockPoorEndOres(BlockPooreOreTypes.ZIRCONIUM);

    public static final BlockPoorNetherOres
    poorNetherAluminumOre = new BlockPoorNetherOres(BlockPooreOreTypes.ALUMINUM),
    poorNetherBerylliumOre = new BlockPoorNetherOres(BlockPooreOreTypes.BERYLLIUM),
    poorNetherBoronOre = new BlockPoorNetherOres(BlockPooreOreTypes.BORON),
    poorNetherCadmiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.CADMIUM),
    poorNetherChromiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.CHROMIUM),
    poorNetherIridiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.IRIDIUM),
    poorNetherMagnesiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.MAGNESIUM),
    poorNetherManganeseOre = new BlockPoorNetherOres(BlockPooreOreTypes.MAGANESE),
    poorNetherOsmiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.OSMIUM),
    poorNetherPlutoniumOre = new BlockPoorNetherOres(BlockPooreOreTypes.PLUTONIUM),
    poorNetherRutileOre = new BlockPoorNetherOres(BlockPooreOreTypes.RUTILE),
    poorNetherTantalumOre = new BlockPoorNetherOres(BlockPooreOreTypes.TANTALUM),
    poorNetherThoriumOre = new BlockPoorNetherOres(BlockPooreOreTypes.THORIUM),
    poorNetherTitaniumOre = new BlockPoorNetherOres(BlockPooreOreTypes.TITANIUM),
    poorNetherTungstenOre = new BlockPoorNetherOres(BlockPooreOreTypes.TUNGSTEN),
    poorNetherUraniumOre = new BlockPoorNetherOres(BlockPooreOreTypes.URANIUM),
    poorNetherZirconiumOre = new BlockPoorNetherOres(BlockPooreOreTypes.ZIRCONIUM);

    @Mod.EventBusSubscriber(modid = PoorMetals.MODID)
    public static class RegistrationHandler {

        private static ArrayList<BlockPoorOres> vanilla = null;
        private static ArrayList<BlockPoorNetherOres> netherMetalsRegular = null;
        private static ArrayList<BlockPoorEndOres> endMetalsRegular = null;
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
                                poorManganeseOre, poorOsmiumOre, poorPlutoniumOre, poorRutileOre,
                                poorTantalumOre, poorThoriumOre, poorTitaniumOre, poorTungstenOre,
                                poorUraniumOre, poorZirconiumOre);
                    }
                }
            }else if (Config.modernMetalsPoorOresOverride){
                if (Config.modernMetalsPoorOres){
                    event.getRegistry().registerAll(poorAluminumOre, poorBerylliumOre, poorBoronOre,
                            poorCadmiumOre, poorChromiumOre, poorIridiumOre, poorMagnesiumOre,
                            poorManganeseOre, poorOsmiumOre, poorPlutoniumOre, poorRutileOre,
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
                        event.getRegistry().registerAll(poorNetherAluminumOre, poorNetherCadmiumOre, poorNetherChromiumOre,
                                poorNetherIridiumOre, poorNetherMagnesiumOre, poorNetherManganeseOre,
                                poorNetherOsmiumOre, poorNetherPlutoniumOre, poorNetherRutileOre, poorNetherTantalumOre,
                                poorNetherTitaniumOre, poorNetherTungstenOre, poorNetherUraniumOre, poorNetherZirconiumOre);
                    }
                }
            }else if (Config.netherModernMetalsPoorOresOverride){
                if (Config.netherModernMetalsPoorOres){
                    event.getRegistry().registerAll(poorNetherAluminumOre, poorNetherCadmiumOre, poorNetherChromiumOre,
                                poorNetherIridiumOre, poorNetherMagnesiumOre, poorNetherManganeseOre,
                                poorNetherOsmiumOre, poorNetherPlutoniumOre, poorNetherRutileOre, poorNetherTantalumOre,
                                poorNetherTitaniumOre, poorNetherTungstenOre, poorNetherUraniumOre, poorNetherZirconiumOre);
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
                        event.getRegistry().registerAll(poorEndAluminumOre, poorEndCadmiumOre, poorEndChromiumOre,
                                poorEndIridiumOre, poorEndMagnesiumOre, poorEndManganeseOre,
                                poorEndOsmiumOre, poorEndPlutoniumOre, poorEndRutileOre, poorEndTantalumOre,
                                poorEndTitaniumOre, poorEndTungstenOre, poorEndUraniumOre, poorEndZirconiumOre);
                    }
                }
            }else if (Config.endModernMetalsPoorOresOverride){
                if (Config.endModernMetalsPoorOres){
                    event.getRegistry().registerAll(poorEndAluminumOre, poorEndCadmiumOre, poorEndChromiumOre,
                                poorEndIridiumOre, poorEndMagnesiumOre, poorEndManganeseOre,
                                poorEndOsmiumOre, poorEndPlutoniumOre, poorEndRutileOre, poorEndTantalumOre,
                                poorEndTitaniumOre, poorEndTungstenOre, poorEndUraniumOre, poorEndZirconiumOre);
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
                    new ItemBlock(poorMagnesiumOre), new ItemBlock(poorManganeseOre),
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
                    new ItemBlock(poorNetherAluminumOre), new ItemBlock(poorNetherCadmiumOre),
                    new ItemBlock(poorNetherChromiumOre), new ItemBlock(poorNetherIridiumOre),
                    new ItemBlock(poorNetherMagnesiumOre), new ItemBlock(poorNetherManganeseOre),
                    new ItemBlock(poorNetherOsmiumOre), new ItemBlock(poorNetherPlutoniumOre),
                    new ItemBlock(poorNetherRutileOre), new ItemBlock(poorNetherTantalumOre),
                    new ItemBlock(poorNetherTitaniumOre), new ItemBlock(poorNetherTungstenOre),
                    new ItemBlock(poorNetherUraniumOre), new ItemBlock(poorNetherZirconiumOre)
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
                    new ItemBlock(poorEndAluminumOre), new ItemBlock(poorEndCadmiumOre),
                    new ItemBlock(poorEndChromiumOre), new ItemBlock(poorEndIridiumOre),
                    new ItemBlock(poorEndMagnesiumOre), new ItemBlock(poorEndManganeseOre),
                    new ItemBlock(poorEndOsmiumOre), new ItemBlock(poorEndPlutoniumOre),
                    new ItemBlock(poorEndRutileOre), new ItemBlock(poorEndTantalumOre),
                    new ItemBlock(poorEndTitaniumOre), new ItemBlock(poorEndTungstenOre),
                    new ItemBlock(poorEndUraniumOre), new ItemBlock(poorEndZirconiumOre)
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
                    poorManganeseOre.initModel();
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
                poorManganeseOre.initModel();
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
                    //poorNetherBerylliumOre.initModel();
                    //poorNetherBoronOre.initModel();
                    poorNetherCadmiumOre.initModel();
                    poorNetherChromiumOre.initModel();
                    poorNetherIridiumOre.initModel();
                    poorNetherMagnesiumOre.initModel();
                    poorNetherManganeseOre.initModel();
                    poorNetherOsmiumOre.initModel();
                    poorNetherPlutoniumOre.initModel();
                    poorNetherRutileOre.initModel();
                    poorNetherTantalumOre.initModel();
                    //poorNetherThoriumOre.initModel();
                    poorNetherTitaniumOre.initModel();
                    poorNetherTungstenOre.initModel();
                    poorNetherUraniumOre.initModel();
                    poorNetherZirconiumOre.initModel();
                }
            }
        }else if (Config.netherModernMetalsPoorOresOverride){
            if (Config.netherModernMetalsPoorOres) {
                poorNetherAluminumOre.initModel();
                //poorNetherBerylliumOre.initModel();
                //poorNetherBoronOre.initModel();
                poorNetherCadmiumOre.initModel();
                poorNetherChromiumOre.initModel();
                poorNetherIridiumOre.initModel();
                poorNetherMagnesiumOre.initModel();
                poorNetherManganeseOre.initModel();
                poorNetherOsmiumOre.initModel();
                poorNetherPlutoniumOre.initModel();
                poorNetherRutileOre.initModel();
                poorNetherTantalumOre.initModel();
                //poorNetherThoriumOre.initModel();
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
                    //poorEndBerylliumOre.initModel();
                    //poorEndBoronOre.initModel();
                    poorEndCadmiumOre.initModel();
                    poorEndChromiumOre.initModel();
                    poorEndIridiumOre.initModel();
                    poorEndMagnesiumOre.initModel();
                    poorEndManganeseOre.initModel();
                    poorEndOsmiumOre.initModel();
                    poorEndPlutoniumOre.initModel();
                    poorEndRutileOre.initModel();
                    poorEndTantalumOre.initModel();
                    //poorEndThoriumOre.initModel();
                    poorEndTitaniumOre.initModel();
                    poorEndTungstenOre.initModel();
                    poorEndUraniumOre.initModel();
                    poorEndZirconiumOre.initModel();
                }
            }
        }else if (Config.endModernMetalsPoorOresOverride){
            if (Config.endModernMetalsPoorOres) {
                poorEndAluminumOre.initModel();
                //poorEndBerylliumOre.initModel();
                //poorEndBoronOre.initModel();
                poorEndCadmiumOre.initModel();
                poorEndChromiumOre.initModel();
                poorEndIridiumOre.initModel();
                poorEndMagnesiumOre.initModel();
                poorEndManganeseOre.initModel();
                poorEndOsmiumOre.initModel();
                poorEndPlutoniumOre.initModel();
                poorEndRutileOre.initModel();
                poorEndTantalumOre.initModel();
                //poorEndThoriumOre.initModel();
                poorEndTitaniumOre.initModel();
                poorEndTungstenOre.initModel();
                poorEndUraniumOre.initModel();
                poorEndZirconiumOre.initModel();
            }
        }
    }
}
