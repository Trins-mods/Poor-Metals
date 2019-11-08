package trinsdar.poormetals.init;

import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import trinsdar.poormetals.PoorMetalsConfig;
import trinsdar.poormetals.PoorMetals;
import trinsdar.poormetals.blocks.BlockPoorEndOres;
import trinsdar.poormetals.blocks.BlockPoorNetherOres;
import trinsdar.poormetals.blocks.BlockPoorOres;
import trinsdar.poormetals.blocks.BlockPooreOreTypes;


import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ModBlocks {
    static final Map<String, Entry<Block, Item>> toRegisterVanilla = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterBme = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterMme = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterNether = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterEnd = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterNetherMme = new LinkedHashMap<>();
    static final Map<String, Entry<Block, Item>> toRegisterEndMme = new LinkedHashMap<>();

    public static final BlockPoorOres poorIronOre = registerVanillaBlock(new BlockPoorOres(BlockPooreOreTypes.IRON));
    public static final BlockPoorOres poorGoldOre = registerVanillaBlock(new BlockPoorOres(BlockPooreOreTypes.GOLD));

    public static final BlockPoorOres poorCopperOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.COPPER));
    public static final BlockPoorOres poorTinOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.TIN));
    public static final BlockPoorOres poorSilverOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.SILVER));
    public static final BlockPoorOres poorLeadOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.LEAD));
    public static final BlockPoorOres poorNickelOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.NICKEL));
    public static final BlockPoorOres poorZincOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.ZINC));
    public static final BlockPoorOres poorMercuryOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.MERCURY));
    public static final BlockPoorOres poorPlatinumOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.PLATINUM));
    public static final BlockPoorOres poorBismuthOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.BISMUTH));
    public static final BlockPoorOres poorAntimonyOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.ANTIMONY));
    public static final BlockPoorOres poorAdamantineOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.ADAMANTINE));
    public static final BlockPoorOres poorColdIronOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.COLD_IRON));
    public static final BlockPoorOres poorStarsteelOre = registerBmeBlock(new BlockPoorOres(BlockPooreOreTypes.STARSTEEL));

    public static final BlockPoorOres poorAluminumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.ALUMINUM));
    public static final BlockPoorOres poorBerylliumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.BERYLLIUM));
    public static final BlockPoorOres poorBoronOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.BORON));
    public static final BlockPoorOres poorCadmiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.CADMIUM));
    public static final BlockPoorOres poorChromiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.CHROMIUM));
    public static final BlockPoorOres poorIridiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.IRIDIUM));
    public static final BlockPoorOres poorMagnesiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.MAGNESIUM));
    public static final BlockPoorOres poorManganeseOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.MAGANESE));
    public static final BlockPoorOres poorOsmiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.OSMIUM));
    public static final BlockPoorOres poorPlutoniumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.PLUTONIUM));
    public static final BlockPoorOres poorRutileOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.RUTILE));
    public static final BlockPoorOres poorTantalumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.TANTALUM));
    public static final BlockPoorOres poorThoriumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.THORIUM));
    public static final BlockPoorOres poorTitaniumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.TITANIUM));
    public static final BlockPoorOres poorTungstenOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.TUNGSTEN));
    public static final BlockPoorOres poorUraniumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.URANIUM));
    public static final BlockPoorOres poorZirconiumOre = registerMmeBlock(new BlockPoorOres(BlockPooreOreTypes.ZIRCONIUM));

    public static final BlockPoorNetherOres poorNetherIronOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.IRON));
    public static final BlockPoorNetherOres poorNetherGoldOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.GOLD));
    public static final BlockPoorNetherOres poorNetherCopperOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.COPPER));
    public static final BlockPoorNetherOres poorNetherTinOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.TIN));
    public static final BlockPoorNetherOres poorNetherSilverOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.SILVER));
    public static final BlockPoorNetherOres poorNetherLeadOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.LEAD));
    public static final BlockPoorNetherOres poorNetherNickelOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.NICKEL));
    public static final BlockPoorNetherOres poorNetherZincOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.ZINC));
    public static final BlockPoorNetherOres poorNetherMercuryOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.MERCURY));
    public static final BlockPoorNetherOres poorNetherPlatinumOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.PLATINUM));
    public static final BlockPoorNetherOres poorNetherBismuthOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.BISMUTH));
    public static final BlockPoorNetherOres poorNetherAntimonyOre = registerNetherBlock(new BlockPoorNetherOres(BlockPooreOreTypes.ANTIMONY));

    public static final BlockPoorEndOres poorEndIronOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.IRON));
    public static final BlockPoorEndOres poorEndGoldOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.GOLD));
    public static final BlockPoorEndOres poorEndCopperOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.COPPER));
    public static final BlockPoorEndOres poorEndTinOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.TIN));
    public static final BlockPoorEndOres poorEndSilverOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.SILVER));
    public static final BlockPoorEndOres poorEndLeadOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.LEAD));
    public static final BlockPoorEndOres poorEndNickelOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.NICKEL));
    public static final BlockPoorEndOres poorEndZincOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.ZINC));
    public static final BlockPoorEndOres poorEndMercuryOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.MERCURY));
    public static final BlockPoorEndOres poorEndPlatinumOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.PLATINUM));
    public static final BlockPoorEndOres poorEndBismuthOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.BISMUTH));
    public static final BlockPoorEndOres poorEndAntimonyOre = registerEndBlock(new BlockPoorEndOres(BlockPooreOreTypes.ANTIMONY));

    public static final BlockPoorEndOres poorEndAluminumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.ALUMINUM));
    public static final BlockPoorEndOres poorEndBerylliumOre = new BlockPoorEndOres(BlockPooreOreTypes.BERYLLIUM);
    public static final BlockPoorEndOres poorEndBoronOre = new BlockPoorEndOres(BlockPooreOreTypes.BORON);
    public static final BlockPoorEndOres poorEndCadmiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.CADMIUM));
    public static final BlockPoorEndOres poorEndChromiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.CHROMIUM));
    public static final BlockPoorEndOres poorEndIridiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.IRIDIUM));
    public static final BlockPoorEndOres poorEndMagnesiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.MAGNESIUM));
    public static final BlockPoorEndOres poorEndManganeseOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.MAGANESE));
    public static final BlockPoorEndOres poorEndOsmiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.OSMIUM));
    public static final BlockPoorEndOres poorEndPlutoniumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.PLUTONIUM));
    public static final BlockPoorEndOres poorEndRutileOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.RUTILE));
    public static final BlockPoorEndOres poorEndTantalumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.TANTALUM));
    public static final BlockPoorEndOres poorEndThoriumOre = new BlockPoorEndOres(BlockPooreOreTypes.THORIUM);
    public static final BlockPoorEndOres poorEndTitaniumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.TITANIUM));
    public static final BlockPoorEndOres poorEndTungstenOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.TUNGSTEN));
    public static final BlockPoorEndOres poorEndUraniumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.URANIUM));
    public static final BlockPoorEndOres poorEndZirconiumOre = registerEndMmeBlock(new BlockPoorEndOres(BlockPooreOreTypes.ZIRCONIUM));

    public static final BlockPoorNetherOres poorNetherAluminumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.ALUMINUM));
    public static final BlockPoorNetherOres poorNetherBerylliumOre = new BlockPoorNetherOres(BlockPooreOreTypes.BERYLLIUM);
    public static final BlockPoorNetherOres poorNetherBoronOre = new BlockPoorNetherOres(BlockPooreOreTypes.BORON);
    public static final BlockPoorNetherOres poorNetherCadmiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.CADMIUM));
    public static final BlockPoorNetherOres poorNetherChromiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.CHROMIUM));
    public static final BlockPoorNetherOres poorNetherIridiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.IRIDIUM));
    public static final BlockPoorNetherOres poorNetherMagnesiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.MAGNESIUM));
    public static final BlockPoorNetherOres poorNetherManganeseOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.MAGANESE));
    public static final BlockPoorNetherOres poorNetherOsmiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.OSMIUM));
    public static final BlockPoorNetherOres poorNetherPlutoniumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.PLUTONIUM));
    public static final BlockPoorNetherOres poorNetherRutileOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.RUTILE));
    public static final BlockPoorNetherOres poorNetherTantalumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.TANTALUM));
    public static final BlockPoorNetherOres poorNetherThoriumOre = new BlockPoorNetherOres(BlockPooreOreTypes.THORIUM);
    public static final BlockPoorNetherOres poorNetherTitaniumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.TITANIUM));
    public static final BlockPoorNetherOres poorNetherTungstenOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.TUNGSTEN));
    public static final BlockPoorNetherOres poorNetherUraniumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.URANIUM));
    public static final BlockPoorNetherOres poorNetherZirconiumOre = registerNetherMmeBlock(new BlockPoorNetherOres(BlockPooreOreTypes.ZIRCONIUM));

    static <T extends Block> T registerVanillaBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterVanilla.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerBmeBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterBme.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerMmeBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterMme.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerNetherBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterNether.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerEndBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterEnd.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerNetherMmeBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterNetherMme.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    static <T extends Block> T registerEndMmeBlock(T block) {
        ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                "Block %s has null registry name", block);
        String ore = registryName.toString().replace(PoorMetals.MODID + ":", "");
        toRegisterEndMme.put(ore, new SimpleEntry<>(block, new ItemBlock(block)));
        return block;
    }

    public static void registerBlocks(){
        if (PoorMetalsConfig.vanillaPoorOres){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterVanilla.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if ( PoorMetalsConfig.baseMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("basemetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterBme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if (PoorMetalsConfig.modernMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("modernmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterMme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if (PoorMetalsConfig.netherMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("nethermetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNether.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if (PoorMetalsConfig.netherModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNetherMme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if (PoorMetalsConfig.endMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("endmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEnd.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }

        if (PoorMetalsConfig.endModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEndMme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ForgeRegistries.BLOCKS.register(block.getKey());
                }
            }
        }
    }

    public static void registerItemBlocks(){
        if (PoorMetalsConfig.vanillaPoorOres){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterVanilla.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if ( PoorMetalsConfig.baseMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("basemetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterBme.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if (PoorMetalsConfig.modernMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("modernmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterMme.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if (PoorMetalsConfig.netherMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("nethermetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNether.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if (PoorMetalsConfig.netherModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNetherMme.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if (PoorMetalsConfig.endMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("endmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEnd.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }

        if (PoorMetalsConfig.endModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEndMme.entrySet()){
                Entry<Block, Item> entry2 = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    Item item = entry2.getValue();
                    Block block = entry2.getKey();
                    ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(),
                            "Block %s has null registry name", block);
                    ForgeRegistries.ITEMS.register(item.setRegistryName(registryName));
                    item.setCreativeTab(PoorMetals.creativeTab);
                }
            }
        }
    }

    public static void initModels(){
        if (PoorMetalsConfig.vanillaPoorOres){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterVanilla.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorOres)block.getKey()).initModel();
                }
            }
        }

        if ( PoorMetalsConfig.baseMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("basemetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterBme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorOres)block.getKey()).initModel();
                }
            }
        }

        if (PoorMetalsConfig.modernMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("modernmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterMme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorOres)block.getKey()).initModel();
                }
            }
        }

        if (PoorMetalsConfig.netherMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("nethermetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNether.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorNetherOres)block.getKey()).initModel();
                }
            }
        }

        if (PoorMetalsConfig.netherModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("nethermetals")))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterNetherMme.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorNetherOres)block.getKey()).initModel();
                }
            }
        }

        if (PoorMetalsConfig.endMetalsPoorOres && (PoorMetalsConfig.modlessOres || Loader.isModLoaded("endmetals"))){
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEnd.entrySet()){
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())){
                    ((BlockPoorEndOres)block.getKey()).initModel();
                }
            }
        }

        if (PoorMetalsConfig.endModernMetalsPoorOres && (PoorMetalsConfig.modlessOres || (Loader.isModLoaded("modernmetals") && Loader.isModLoaded("endmetals")))) {
            for (Entry<String, Entry<Block, Item>> entry : toRegisterEndMme.entrySet()) {
                Entry<Block, Item> block = entry.getValue();
                if (PoorMetalsConfig.individualToggles.ENABLED_ORES.get(entry.getKey())) {
                    ((BlockPoorEndOres) block.getKey()).initModel();
                }
            }
        }
    }
}
