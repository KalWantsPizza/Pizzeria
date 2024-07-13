package dev.doaddon.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.pizzeria.Pizzeria;
import dev.doaddon.pizzeria.PizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class PizzeriaEntities {

	private static final Registrar<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Pizzeria.MOD_ID, Registries.ENTITY_TYPE).getRegistrar();

	public static <T extends EntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
		return ENTITY_TYPES.register(new PizzeriaIdentifier(path), type);
	}
	
	public static void init() {
			}
}