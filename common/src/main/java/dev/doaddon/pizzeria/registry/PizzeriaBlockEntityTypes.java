package dev.doaddon.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.pizzeria.Pizzeria;
import dev.doaddon.pizzeria.PizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class PizzeriaBlockEntityTypes {

    private static final Registrar<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Pizzeria.MOD_ID, Registries.BLOCK_ENTITY_TYPE).getRegistrar();

    private static <T extends BlockEntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return BLOCK_ENTITY_TYPES.register(new PizzeriaIdentifier(path), type);
    }

    public static void init() {
        
    }
}
