package dev.doaddon.pizzeria;

import dev.doaddon.pizzeria.registry.*;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pizzeria {
    public static final String MOD_ID = "pizzeria";
    public static final Logger LOGGER = LogManager.getLogger("[Let's Do Addon] Pizzeria");
    
    public static void init() {
        PizzeriaTabs.init();
        PizzeriaObjects.init();
        PizzeriaBlockEntityTypes.init();
        PizzeriaMobEffects.init();
        PizzeriaRecipeTypes.init();
        PizzeriaEntities.init();
        PizzeriaSoundEvents.init();
    }

    public static void commonSetup(){
    }

    public static ResourceLocation MOD_ID(String path) {
        return new ResourceLocation(Pizzeria.MOD_ID, path);
    }
}

