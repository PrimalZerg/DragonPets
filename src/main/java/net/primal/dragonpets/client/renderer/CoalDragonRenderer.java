
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.CoalDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class CoalDragonRenderer extends MobRenderer<CoalDragonEntity, Modeldragon<CoalDragonEntity>> {
	public CoalDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CoalDragonEntity, Modeldragon<CoalDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/coal_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CoalDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/coal_dragon.png");
	}
}