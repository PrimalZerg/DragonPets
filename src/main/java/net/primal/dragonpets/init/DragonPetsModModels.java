
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.primal.dragonpets.client.model.Modelcustom_model;
import net.primal.dragonpets.client.model.Modelbig_dragon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DragonPetsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbig_dragon.LAYER_LOCATION, Modelbig_dragon::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
