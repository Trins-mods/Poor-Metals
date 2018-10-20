package trinsdar.poormetals;

import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;
import trinsdar.poormetals.proxy.CommonProxy;

public class Config {
    private static final String CATEGORY_GENERATOR = " World Generator";

    private static final String CATEGORY_GENERAL = " General";

    public static boolean isOreSpawnEnabled = true;

    public static boolean vanillaPoorOres = true;
    public static boolean baseMetalsPoorOres = true;
    public static boolean baseMetalsPoorOresOverride = false;

    public static boolean netherMetalsPoorOres = true;
    public static boolean netherMetalsPoorOresOverride = false;

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
        isOreSpawnEnabled = cfg.getBoolean("enableOreSpawnIntregration", CATEGORY_GENERATOR, isOreSpawnEnabled, "Set to true to enable the use of MMD OreSpawn for world generation");
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        vanillaPoorOres = cfg.getBoolean("enableVanillaPoorOres", CATEGORY_GENERAL, vanillaPoorOres, "Set to false to disable Vanilla Poor ores");
        baseMetalsPoorOres = cfg.getBoolean("enableBaseMetalsPoorOres", CATEGORY_GENERAL, baseMetalsPoorOres, "Set to false to disable BaseMetals Poor ores");
        baseMetalsPoorOresOverride = cfg.getBoolean("enableBaseMetalsPoorOresOverride", CATEGORY_GENERAL, baseMetalsPoorOresOverride, "Set to true to enable Base Metals ores even when Base Metals is not loaded. Does nothing if enableBaseMetalsPoorOresOverride is set to false.");
        netherMetalsPoorOres = cfg.getBoolean("enableNetherMetalsPoorOres", CATEGORY_GENERAL, netherMetalsPoorOres, "Set to false to disable Nether Metals Poor ores");
        netherMetalsPoorOresOverride = cfg.getBoolean("enableNetherMetalsPoorOresOverride", CATEGORY_GENERAL, netherMetalsPoorOresOverride, "Set to true to enable Nether Metals ores even when Nether Metals is not loaded. Does nothing if enableNetherMetalsPoorOresOverride is set to false.");
    }
}
