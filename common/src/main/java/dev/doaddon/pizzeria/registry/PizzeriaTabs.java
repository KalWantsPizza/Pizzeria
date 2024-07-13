package dev.doaddon.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.pizzeria.Pizzeria;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PizzeriaTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Pizzeria.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PIZZERIA_TAB = CREATIVE_MODE_TABS.register("pizzeria", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
            .icon(() -> new ItemStack(Items.GRASS))
            .title(Component.translatable("creativetab.pizzeria.tab"))
            .displayItems((parameters, out) -> {

            })
            .build());

    public static void init() {
        CREATIVE_MODE_TABS.register();
    }
}
