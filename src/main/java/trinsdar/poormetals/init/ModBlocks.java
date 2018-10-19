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
import net.minecraftforge.registries.IForgeRegistry;
import trinsdar.poormetals.Config;
import trinsdar.poormetals.PoorMetals;
import trinsdar.poormetals.blocks.BlockPoorModdedNetherOres;
import trinsdar.poormetals.blocks.BlockPoorModdedNetherOres.PoorModdedNetherOresVariant;
import trinsdar.poormetals.blocks.BlockPoorModdedOres;
import trinsdar.poormetals.blocks.BlockPoorModdedOres.PoorModdedOresVariant;
import trinsdar.poormetals.blocks.BlockPoorVanillaOres;
import trinsdar.poormetals.blocks.BlockPoorVanillaOres.PoorVanillaOresVariant;

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
    poorAntimonyOre = new BlockPoorModdedOres(PoorModdedOresVariant.ANTIMONY);

    public static final BlockPoorModdedNetherOres
    poorIronNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.IRON),
    poorGoldNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.GOLD),
    poorCopperNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.COPPER),
    poorTinNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.TIN),
    poorSilverNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.SILVER),
    poorLeadNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.LEAD),
    poorNickelNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.NICKEL),
    poorZincNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.ZINC),
    poorMercuryNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.MERCURY),
    poorPlatinumNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.PLATINUM),
    poorBismuthNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.BISMUTH),
    poorAntimonyNetherOre = new BlockPoorModdedNetherOres(PoorModdedNetherOresVariant.ANTIMONY);

    @Mod.EventBusSubscriber(modid = PoorMetals.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event){
            if (Loader.isModLoaded("basemetals")){
                if (Config.baseMetalsPoorOres){
                    event.getRegistry().registerAll(poorAntimonyOre, poorBismuthOre,
                            poorCopperOre, poorLeadOre, poorSilverOre, poorNickelOre, poorMercuryOre, poorTinOre, poorPlatinumOre, poorZincOre);
                }
            }
            if (Loader.isModLoaded("nethermetals")){
                if (Config.netherMetalsPoorOres){
                    event.getRegistry().registerAll(poorGoldNetherOre, poorIronNetherOre, poorCopperNetherOre,
                            poorTinNetherOre, poorSilverNetherOre, poorLeadNetherOre, poorNickelNetherOre, poorZincNetherOre,
                            poorMercuryNetherOre, poorPlatinumNetherOre, poorBismuthNetherOre, poorAntimonyNetherOre);
                }
            }
            if (Config.vanillaPoorOres){
                event.getRegistry().registerAll(poorIronOre, poorGoldOre);
            }
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event){
            final ItemBlock[] itemsModded = {
                    new ItemBlock(poorAntimonyOre),new ItemBlock(poorBismuthOre),
                    new ItemBlock(poorCopperOre), new ItemBlock(poorNickelOre),
                    new ItemBlock(poorMercuryOre), new ItemBlock(poorTinOre),
                    new ItemBlock(poorZincOre), new ItemBlock(poorLeadOre),
                    new ItemBlock(poorSilverOre), new ItemBlock(poorPlatinumOre)
            };
            if (Loader.isModLoaded("basemetals")){
                if (Config.baseMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsModded) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                    }
                }
            }
            final ItemBlock[] itemsNether = {
                    new ItemBlock(poorGoldNetherOre),new ItemBlock(poorIronNetherOre),
                    new ItemBlock(poorCopperNetherOre), new ItemBlock(poorTinNetherOre),
                    new ItemBlock(poorLeadNetherOre), new ItemBlock(poorSilverNetherOre),
                    new ItemBlock(poorMercuryNetherOre), new ItemBlock(poorZincNetherOre),
                    new ItemBlock(poorAntimonyNetherOre), new ItemBlock(poorBismuthNetherOre)
            };
            if (Loader.isModLoaded("nethermetals")){
                if (Config.netherMetalsPoorOres) {
                    final IForgeRegistry<Item> registry = event.getRegistry();
                    for (final ItemBlock item : itemsNether) {
                        final Block block = item.getBlock();
                        final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                                "Block %s has null registry name", block);
                        registry.register(item.setRegistryName(registryName));
                    }
                }
            }
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
                }
            }
        }
    }

    public static void initModels(){
        if (Loader.isModLoaded("basemetals")){
            if (Config.baseMetalsPoorOres) {
                poorAntimonyOre.initModel();
                poorBismuthOre.initModel();
                poorCopperOre.initModel();
                poorNickelOre.initModel();
                poorMercuryOre.initModel();
                poorTinOre.initModel();
                poorZincOre.initModel();
                poorLeadOre.initModel();
                poorSilverOre.initModel();
                poorPlatinumOre.initModel();

            }
        }

        if (Loader.isModLoaded("nethermetals")){
            if (Config.netherMetalsPoorOres) {
                poorGoldNetherOre.initModel();
                poorIronNetherOre.initModel();
                poorCopperNetherOre.initModel();
                poorTinNetherOre.initModel();
                poorLeadNetherOre.initModel();
                poorSilverNetherOre.initModel();
                poorNickelNetherOre.initModel();
                poorMercuryNetherOre.initModel();
                poorZincNetherOre.initModel();
                poorPlatinumNetherOre.initModel();
                poorAntimonyNetherOre.initModel();
                poorBismuthNetherOre.initModel();

            }
        }

        if (Config.vanillaPoorOres) {
            poorIronOre.initModel();
            poorGoldOre.initModel();
        }
    }
}
