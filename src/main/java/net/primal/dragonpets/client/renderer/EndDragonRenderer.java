
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.EndDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class EndDragonRenderer extends MobRenderer<EndDragonEntity, Modeldragon<EndDragonEntity>> {
	public EndDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EndDragonEntity, Modeldragon<EndDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/end_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EndDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/end_dragon.png");
	}
}
