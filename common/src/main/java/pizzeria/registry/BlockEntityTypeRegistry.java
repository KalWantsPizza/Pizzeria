package example.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import example.pizzeria.pizzeria;
import example.pizzeria.pizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class BlockEntityTypeRegistry {

    private static final Registrar<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(pizzeria.MOD_ID, Registries.BLOCK_ENTITY_TYPE).getRegistrar();

    private static <T extends BlockEntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return BLOCK_ENTITY_TYPES.register(new pizzeriaIdentifier(path), type);
    }

    public static void init() {
        
    }
}
