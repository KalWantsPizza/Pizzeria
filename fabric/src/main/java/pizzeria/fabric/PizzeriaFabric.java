package example.pizzeria.fabric;

import example.pizzeria.pizzeria;
import example.pizzeria.registry.CompostableRegistry;
import net.fabricmc.api.ModInitializer;

public class pizzeriaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        pizzeria.init();
        CompostableRegistry.registerCompostable();
        pizzeria.commonSetup();
    }
}
