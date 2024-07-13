package dev.doaddon.pizzeria.fabric;

import dev.doaddon.pizzeria.Pizzeria;
import dev.doaddon.pizzeria.registry.PizzeriaCompostables;
import net.fabricmc.api.ModInitializer;

public class PizzeriaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Pizzeria.init();
        PizzeriaCompostables.registerCompostable();
        Pizzeria.commonSetup();
    }
}
