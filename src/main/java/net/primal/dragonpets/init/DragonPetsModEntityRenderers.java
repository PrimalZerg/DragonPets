
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.primal.dragonpets.init;

import net.primal.dragonpets.client.renderer.SpaceDragonRenderer;
import net.primal.dragonpets.client.renderer.RedstoneDragonRenderer;
import net.primal.dragonpets.client.renderer.IronDragonRenderer;
import net.primal.dragonpets.client.renderer.IceDragonRenderer;
import net.primal.dragonpets.client.renderer.GoldDragonRenderer;
import net.primal.dragonpets.client.renderer.FireDragonRenderer;
import net.primal.dragonpets.client.renderer.EndDragonRenderer;
import net.primal.dragonpets.client.renderer.DiamondDragonRenderer;
import net.primal.dragonpets.client.renderer.CopperDragonRenderer;
import net.primal.dragonpets.client.renderer.AmethystDragonRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonPetsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DragonPetsModEntities.ICE_DRAGON.get(), IceDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.FIRE_DRAGON.get(), FireDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.DIAMOND_DRAGON.get(), DiamondDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.GOLD_DRAGON.get(), GoldDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.REDSTONE_DRAGON.get(), RedstoneDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.IRON_DRAGON.get(), IronDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.COPPER_DRAGON.get(), CopperDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.AMETHYST_DRAGON.get(), AmethystDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.SPACE_DRAGON.get(), SpaceDragonRenderer::new);
		event.registerEntityRenderer(DragonPetsModEntities.END_DRAGON.get(), EndDragonRenderer::new);
	}
}
