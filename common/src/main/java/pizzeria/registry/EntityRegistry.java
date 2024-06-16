package example.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import example.pizzeria.pizzeria;
import example.pizzeria.pizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class EntityRegistry {

	private static final Registrar<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(pizzeria.MOD_ID, Registries.ENTITY_TYPE).getRegistrar();

	public static <T extends EntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
		return ENTITY_TYPES.register(new pizzeriaIdentifier(path), type);
	}
	
	public static void init() {
			}
}