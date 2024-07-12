package dev.doaddon.pizzeria.fabric;

import dev.doaddon.pizzeria.pizzeria;
import dev.doaddon.pizzeria.registry.CompostableRegistry;
import net.fabricmc.api.ModInitializer;

public class pizzeriaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        pizzeria.init();
        CompostableRegistry.registerCompostable();
        pizzeria.commonSetup();
    }
}
