package dev.doaddon.pizzeria.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.doaddon.pizzeria.Pizzeria;
import dev.doaddon.pizzeria.registry.PizzeriaCompostables;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Pizzeria.MOD_ID)
public class PizzeriaForge {

    public PizzeriaForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(Pizzeria.MOD_ID, modEventBus);
        Pizzeria.init();

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(PizzeriaCompostables::registerCompostable);
        Pizzeria.commonSetup();
    }
}
