package MineOreParadise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FirstClass.MOD_ID)
public class FirstClass {

	// La constante d'identifiant du mod.
	public static final String MOD_ID = "mineoreparadise";

	// Le logger du mod <- Qu'est-ce que c'est ?
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// Constructeur de la classe principale, on enregistre ici nos events
	// <- A quoi servent ces events ? Pourquoi eux et pas d'autres
	// s'il en existe d'autres ?
	public FirstClass(){
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
	}

	private void setup(final FMLCommonSetupEvent event){
		LOGGER.info("MineOre Paradise setup");
	}

	private void clientSetup(final FMLClientSetupEvent event){
		LOGGER.info("MineOre Paradise client setup");
	}

	private void serverSetup(final FMLDedicatedServerSetupEvent event){

		LOGGER.info("MineOre Paradise server setup");
	}
}
