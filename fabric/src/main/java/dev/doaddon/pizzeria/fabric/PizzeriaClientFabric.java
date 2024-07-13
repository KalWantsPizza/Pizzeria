package dev.doaddon.pizzeria.fabric;

import dev.doaddon.pizzeria.client.PizzeriaClient;
import net.fabricmc.api.ClientModInitializer;

public class PizzeriaClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        PizzeriaClient.preInitClient();
        PizzeriaClient.onInitializeClient();
    }
}
