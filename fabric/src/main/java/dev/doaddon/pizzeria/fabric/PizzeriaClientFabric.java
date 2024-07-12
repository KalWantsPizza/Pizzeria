package dev.doaddon.pizzeria.fabric;

import dev.doaddon.pizzeria.client.pizzeriaClient;
import net.fabricmc.api.ClientModInitializer;

public class pizzeriaClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        pizzeriaClient.preInitClient();
        pizzeriaClient.onInitializeClient();
    }
}
