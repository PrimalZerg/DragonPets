
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.LapisDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class LapisDragonRenderer extends MobRenderer<LapisDragonEntity, Modeldragon<LapisDragonEntity>> {
	public LapisDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.3f);
		this.addLayer(new EyesLayer<LapisDragonEntity, Modeldragon<LapisDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/lapis_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LapisDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/lapis_dragon.png");
	}
}
