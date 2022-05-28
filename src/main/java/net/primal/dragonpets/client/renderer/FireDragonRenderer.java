
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.FireDragonEntity;
import net.primal.dragonpets.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class FireDragonRenderer extends MobRenderer<FireDragonEntity, Modelcustom_model<FireDragonEntity>> {
	public FireDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FireDragonEntity, Modelcustom_model<FireDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/fire_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FireDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/fire_dragon.png");
	}
}
