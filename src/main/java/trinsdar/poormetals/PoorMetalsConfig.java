package trinsdar.poormetals;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;
import trinsdar.poormetals.blocks.BlockPooreOreTypes;
import trinsdar.poormetals.proxy.CommonProxy;

import java.util.Map;
import java.util.TreeMap;

@Config(modid = PoorMetals.MODID)
public class PoorMetalsConfig {

    private static final String CATEGORY_GENERAL = " General";

    private static final String CATEGORY_INDIVIDUAL = " Individual Toggles";

    @Comment("Set to false to disable Vanilla Poor ores")
    @RequiresMcRestart
    public static boolean vanillaPoorOres = true;
    @Comment("Set to false to disable BaseMetals Poor ores")
    @RequiresMcRestart
    public static boolean baseMetalsPoorOres = true;
    @Comment("Set to false to disable ModernMetals Poor ores")
    @RequiresMcRestart
    public static boolean modernMetalsPoorOres = true;
    @Comment("Set to false to disable NetherMetals Poor ores")
    @RequiresMcRestart
    public static boolean netherMetalsPoorOres = true;
    @Comment("Set to false to disable EndMetals Poor ores")
    @RequiresMcRestart
    public static boolean endMetalsPoorOres = true;
    @Comment("Set to false to disable Nether Modern Metals Poor ores")
    @RequiresMcRestart
    public static boolean netherModernMetalsPoorOres = true;
    @Comment("Set to true to enable Poor Ores of respective mods ores even when the respective mod is not loaded.")
    @RequiresMcRestart
    public static boolean modlessOres = false;
    @Comment("Set to false to disable End Modern Metals Poor ores")
    @RequiresMcRestart
    public static boolean endModernMetalsPoorOres = true;
    @Comment("Set to true to enable doubling of poor ores with crack hammer and other mod methods")
    @RequiresMcRestart
    public static boolean poorOreDouble = false;
    @Comment("Set to false to disable regestering of crackhammer recipes for poor ores.")
    @RequiresMcRestart
    public static boolean poorOreCrackHammer = true;
    @Comment("Set to false to disable registering of macerator recipes for poor ores.")
    @RequiresMcRestart
    public static boolean poorOreMacerator = true;

    @Comment("Individual toggels for each ore.")
    @RequiresMcRestart
    public static IndividualToggles individualToggles = new IndividualToggles();

    public static class IndividualToggles {
        public final Map<String, Boolean> ENABLED_ORES = new TreeMap();

        {
            for (BlockPooreOreTypes variant : BlockPooreOreTypes.values()){
                ENABLED_ORES.put("poor_"+ variant.getName() + "_ore", true);
                if (variant.getName().equals("adamantine") || variant.getName().equals("coldiron") || variant.getName().equals("starsteel") || variant.getName().equals("beryllium") || variant.getName().equals("boron") || variant.getName().equals("thorium")){
                    continue;
                }
                ENABLED_ORES.put("poor_nether_"+ variant.getName() + "_ore", true);
                ENABLED_ORES.put("poor_end_"+ variant.getName() + "_ore", true);
            }
        }
    }




    private static void initConfig(Configuration cfg) {
        //cfg.addCustomCategoryComment(CATEGORY_GENERATOR, "World Generator configuration");
        //isOreSpawnEnabled = cfg.getBoolean("enableOreSpawnIntregration", CATEGORY_GENERATOR, isOreSpawnEnabled, "Set to true to enable the use of MMD OreSpawn for world generation(Not currently in use).");
    }
}
