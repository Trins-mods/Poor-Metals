package trinsdar.poormetals;

import net.minecraftforge.common.config.Configuration;
import trinsdar.poormetals.proxy.CommonProxy;

public class Config {
    private static final String CATEGORY_GENERATOR = " World Generator";

    private static final String CATEGORY_GENERAL = " General";

    public static boolean isOreSpawnEnabled = true;

    public static boolean vanillaPoorOres = true;
    public static boolean baseMetalsPoorOres = true;

    public static boolean netherMetalsPoorOres = true;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initConfig(cfg);
        } catch (Exception e1) {

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
        netherMetalsPoorOres = cfg.getBoolean("enableNetherMetalsPoorOres", CATEGORY_GENERAL, netherMetalsPoorOres, "Set to false to disable Nether Metals Poor ores");
    }
}
