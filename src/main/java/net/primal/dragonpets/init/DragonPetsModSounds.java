
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonPetsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("dragon_pets", "cave_dragon_growl"),
				new SoundEvent(new ResourceLocation("dragon_pets", "cave_dragon_growl")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "cave_dragon"), new SoundEvent(new ResourceLocation("dragon_pets", "cave_dragon")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "space_dragon"), new SoundEvent(new ResourceLocation("dragon_pets", "space_dragon")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "dragon_hurt"), new SoundEvent(new ResourceLocation("dragon_pets", "dragon_hurt")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "soft_growl"), new SoundEvent(new ResourceLocation("dragon_pets", "soft_growl")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "dragon_flaps"), new SoundEvent(new ResourceLocation("dragon_pets", "dragon_flaps")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "dragon_hurts"), new SoundEvent(new ResourceLocation("dragon_pets", "dragon_hurts")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "ice_dragon_growls"),
				new SoundEvent(new ResourceLocation("dragon_pets", "ice_dragon_growls")));
		REGISTRY.put(new ResourceLocation("dragon_pets", "dragon_growl"), new SoundEvent(new ResourceLocation("dragon_pets", "dragon_growl")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
