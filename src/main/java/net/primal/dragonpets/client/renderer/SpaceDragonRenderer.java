
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.SpaceDragonEntity;
import net.primal.dragonpets.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class SpaceDragonRenderer extends MobRenderer<SpaceDragonEntity, Modelcustom_model<SpaceDragonEntity>> {
	public SpaceDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpaceDragonEntity, Modelcustom_model<SpaceDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/space_dragon_overlay.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpaceDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/space_dragon.png");
	}
}
