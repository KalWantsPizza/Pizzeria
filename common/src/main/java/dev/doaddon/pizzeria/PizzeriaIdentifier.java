package dev.doaddon.pizzeria;

import net.minecraft.resources.ResourceLocation;

public class PizzeriaIdentifier extends ResourceLocation {

    public PizzeriaIdentifier(String path) {
        super(Pizzeria.MOD_ID, path);
    }

    public static String asString(String path) {
        return (Pizzeria.MOD_ID + ":" + path);
    }
}
