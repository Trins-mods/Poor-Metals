package trinsdar.poormetals;

import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;
import trinsdar.poormetals.proxy.CommonProxy;

public class Config {
    private static final String CATEGORY_GENERATOR = " World Generator";

    private static final String CATEGORY_GENERAL = " General";

    private static final String CATEGORY_INDIVIDUAL = " Individual Toggles";

    public static boolean isOreSpawnEnabled = true;

    public static boolean vanillaPoorOres = true;
    public static boolean baseMetalsPoorOres = true;
    public static boolean baseMetalsPoorOresOverride = false;
    public static boolean modernMetalsPoorOres = true;
    public static boolean modernMetalsPoorOresOverride = false;

    public static boolean netherMetalsPoorOres = true;
    public static boolean netherMetalsPoorOresOverride = false;
    public static boolean endMetalsPoorOres = true;
    public static boolean endMetalsPoorOresOverride = false;
    public static boolean netherModernMetalsPoorOres = true;
    public static boolean netherModernMetalsPoorOresOverride = false;
    public static boolean endModernMetalsPoorOres = true;
    public static boolean endModernMetalsPoorOresOverride = false;

    public static boolean poorOreDouble = false;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initConfig(cfg);
        } catch (Exception e1) {
            PoorMetals.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged())
                cfg.save();
        }
    }

    private static void initConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERATOR, "World Generator configuration");
        isOreSpawnEnabled = cfg.getBoolean("enableOreSpawnIntregration", CATEGORY_GENERATOR, isOreSpawnEnabled, "Set to true to enable the use of MMD OreSpawn for world generation(Not currently in use).");
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        vanillaPoorOres = cfg.getBoolean("enableVanillaPoorOres", CATEGORY_GENERAL, vanillaPoorOres, "Set to false to disable Vanilla Poor ores");
        baseMetalsPoorOres = cfg.getBoolean("enableBaseMetalsPoorOres", CATEGORY_GENERAL, baseMetalsPoorOres, "Set to false to disable BaseMetals Poor ores");
        baseMetalsPoorOresOverride = cfg.getBoolean("enableBaseMetalsPoorOresOverride", CATEGORY_GENERAL, baseMetalsPoorOresOverride, "Set to true to enable Base Metals ores even when Base Metals is not loaded. Does nothing if enableBaseMetalsPoorOres is set to false.");
        modernMetalsPoorOres = cfg.getBoolean("enableModernMetalsPoorOres", CATEGORY_GENERAL, modernMetalsPoorOres, "Set to false to disable ModernMetals Poor ores");
        modernMetalsPoorOresOverride = cfg.getBoolean("enableModernMetalsPoorOresOverride", CATEGORY_GENERAL, modernMetalsPoorOresOverride, "Set to true to enable Modern Metals ores even when Modern Metals is not loaded. Does nothing if enableModernMetalsPoorOres is set to false.");
        netherMetalsPoorOres = cfg.getBoolean("enableNetherMetalsPoorOres", CATEGORY_GENERAL, netherMetalsPoorOres, "Set to false to disable Nether Metals Poor ores");
        netherMetalsPoorOresOverride = cfg.getBoolean("enableNetherMetalsPoorOresOverride", CATEGORY_GENERAL, netherMetalsPoorOresOverride, "Set to true to enable Nether Metals ores even when Nether Metals is not loaded. Does nothing if enableNetherMetalsPoorOres is set to false.");
        endMetalsPoorOres = cfg.getBoolean("enableEndMetalsPoorOres", CATEGORY_GENERAL, endMetalsPoorOres, "Set to false to disable End Metals Poor ores");
        endMetalsPoorOresOverride = cfg.getBoolean("enableEndMetalsPoorOresOverride", CATEGORY_GENERAL, endMetalsPoorOresOverride, "Set to true to enable End Metals ores even when End Metals is not loaded. Does nothing if enableEndMetalsPoorOres is set to false.");
        netherModernMetalsPoorOres = cfg.getBoolean("enableNetherModernMetalsPoorOres", CATEGORY_GENERAL, netherModernMetalsPoorOres, "Set to false to disable Nether Modern Metals Poor ores");
        netherModernMetalsPoorOresOverride = cfg.getBoolean("enableNetherModernMetalsPoorOresOverride", CATEGORY_GENERAL, netherModernMetalsPoorOresOverride, "Set to true to enable Nether Modern Metals ores even when Nether Metals & Modern Metals are not loaded. Does nothing if enableNetherModernMetalsPoorOres is set to false.");
        endModernMetalsPoorOres = cfg.getBoolean("enableEndModernMetalsPoorOres", CATEGORY_GENERAL, endModernMetalsPoorOres, "Set to false to disable End Modern Metals Poor ores");
        endModernMetalsPoorOresOverride = cfg.getBoolean("enableEndModernMetalsPoorOresOverride", CATEGORY_GENERAL, endModernMetalsPoorOresOverride, "Set to true to enable End Modern Metals ores even when End Metals & Modern Metals are not loaded. Does nothing if enableEndModernMetalsPoorOres is set to false.");
        poorOreDouble = cfg.getBoolean("enablePoorOreDoubling", CATEGORY_GENERAL, poorOreDouble, "Set to true to enable doubling of poor ores with crack hammer and other mod methods(Not currently in use).");
    }
}
