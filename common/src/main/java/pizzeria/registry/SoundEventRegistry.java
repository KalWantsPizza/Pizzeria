package example.pizzeria.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import example.pizzeria.pizzeria;
import example.pizzeria.pizzeriaIdentifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class SoundEventRegistry {
    private static final Registrar<SoundEvent> SOUND_EVENTS = DeferredRegister.create(pizzeria.MOD_ID, Registries.SOUND_EVENT).getRegistrar();

    private static RegistrySupplier<SoundEvent> create(String name) {
        final ResourceLocation id = new pizzeriaIdentifier(name);
        return SOUND_EVENTS.register(id, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void init() {
        
    }
}
