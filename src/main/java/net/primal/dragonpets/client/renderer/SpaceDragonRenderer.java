
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.SpaceDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class SpaceDragonRenderer extends MobRenderer<SpaceDragonEntity, Modeldragon<SpaceDragonEntity>> {
	public SpaceDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpaceDragonEntity, Modeldragon<SpaceDragonEntity>>(this) {
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
