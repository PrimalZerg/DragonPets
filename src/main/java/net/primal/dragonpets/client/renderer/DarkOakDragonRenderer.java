
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.DarkOakDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class DarkOakDragonRenderer extends MobRenderer<DarkOakDragonEntity, Modeldragon<DarkOakDragonEntity>> {
	public DarkOakDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<DarkOakDragonEntity, Modeldragon<DarkOakDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/dark_oak_dragon_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(DarkOakDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/dark_oak_dragon.png");
	}
}
