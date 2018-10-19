package trinsdar.poormetals;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import trinsdar.poormetals.proxy.CommonProxy;

@Mod(modid = PoorMetals.MODID, name = PoorMetals.MODNAME, version = PoorMetals.VERSION)
public class PoorMetals {
    public static final String MODID = "poormetals";
    public static final String MODNAME = "Poor Metals";
    public static final String VERSION= "@VERSION@";

    @SidedProxy(clientSide = "trinsdar.poormetals.proxy.ClientProxy", serverSide = "trinsdar.poormetals.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }

    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
