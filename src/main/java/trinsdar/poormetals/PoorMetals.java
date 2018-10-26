package trinsdar.poormetals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import trinsdar.poormetals.proxy.CommonProxy;

import java.io.File;

@Mod(modid = PoorMetals.MODID, name = PoorMetals.MODNAME, version = PoorMetals.VERSION, dependencies = PoorMetals.DEPENDENCIES)
public class PoorMetals {
    public static final String MODID = "poormetals";
    public static final String MODNAME = "Poor Metals";
    public static final String VERSION= "@VERSION@";
    public static final String DEPENDENCIES = "after:basemetals;";
    public static final CreativeTabs creativeTab = new CreativeTabPoorMetals(MODID);

    @SidedProxy(clientSide = "trinsdar.poormetals.proxy.ClientProxy", serverSide = "trinsdar.poormetals.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static PoorMetals instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
