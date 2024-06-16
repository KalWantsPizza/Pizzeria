package example.pizzeria.fabric;

import example.pizzeria.client.pizzeriaClient;
import net.fabricmc.api.ClientModInitializer;

public class pizzeriaClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        pizzeriaClient.preInitClient();
        pizzeriaClient.onInitializeClient();
    }
}
