package example.pizzeria.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class pizzeriaClient {

    public static void onInitializeClient() {
    }


    public static void registerEntityRenderers() {
    }


    public static void preInitClient() {
        registerEntityRenderers();
    }
}