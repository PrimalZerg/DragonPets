
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.RedstoneDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class RedstoneDragonRenderer extends MobRenderer<RedstoneDragonEntity, Modeldragon<RedstoneDragonEntity>> {
	public RedstoneDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<RedstoneDragonEntity, Modeldragon<RedstoneDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/redstone_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RedstoneDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/redstone_dragon.png");
	}
}
