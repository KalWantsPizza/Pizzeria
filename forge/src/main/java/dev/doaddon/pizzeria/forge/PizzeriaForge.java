package dev.doaddon.pizzeria.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.doaddon.pizzeria.pizzeria;
import dev.doaddon.pizzeria.registry.CompostableRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(pizzeria.MOD_ID)
public class pizzeriaForge {

    public pizzeriaForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(pizzeria.MOD_ID, modEventBus);
        PreInit.preInit();
        pizzeria.init();

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(CompostableRegistry::registerCompostable);
        pizzeria.commonSetup();
    }
}
