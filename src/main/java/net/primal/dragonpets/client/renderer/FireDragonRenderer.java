
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.FireDragonEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class FireDragonRenderer extends HumanoidMobRenderer<FireDragonEntity, HumanoidModel<FireDragonEntity>> {
	public FireDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<FireDragonEntity, HumanoidModel<FireDragonEntity>>(this) {
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
