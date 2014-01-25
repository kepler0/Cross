package k2b6s9j.Cross;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "Cross", name = "Cross", version = "1.0")
public class Cross {

    @Mod.Instance("Cross")
    public static Cross instance;

    public static Logger log;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.log = event.getModLog();

        PrintModInfo();
    }

    private void PrintModInfo() {
        log.info("Cross");
        log.info("Copyright Kepler Sticka-Jones 2014");
    }

    @Mod.EventHandler
    public void initialize(FMLInitializationEvent event) {

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
