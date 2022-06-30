
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.OakDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class OakDragonRenderer extends MobRenderer<OakDragonEntity, Modeldragon<OakDragonEntity>> {
	public OakDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<OakDragonEntity, Modeldragon<OakDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/oak_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OakDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/oak_dragon.png");
	}
}
