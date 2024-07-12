package dev.doaddon.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.pizzeria.pizzeria;
import dev.doaddon.pizzeria.pizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

import java.util.function.Supplier;

public class ScreenhandlerTypeRegistry {

    private static final Registrar<MenuType<?>> MENU_TYPES = DeferredRegister.create(pizzeria.MOD_ID, Registries.MENU).getRegistrar();

    public static <T extends AbstractContainerMenu> RegistrySupplier<MenuType<T>> register(String name, Supplier<MenuType<T>> menuType){
        return MENU_TYPES.register(new pizzeriaIdentifier(name), menuType);
    }

    public static void init() {
    }
}
