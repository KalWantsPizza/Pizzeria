package example.pizzeria;

import net.minecraft.resources.ResourceLocation;

public class pizzeriaIdentifier extends ResourceLocation {

    public pizzeriaIdentifier(String path) {
        super(pizzeria.MOD_ID, path);
    }

    public static String asString(String path) {
        return (pizzeria.MOD_ID + ":" + path);
    }
}
