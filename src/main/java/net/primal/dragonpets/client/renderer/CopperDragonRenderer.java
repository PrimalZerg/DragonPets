
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.CopperDragonEntity;
import net.primal.dragonpets.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class CopperDragonRenderer extends MobRenderer<CopperDragonEntity, Modelcustom_model<CopperDragonEntity>> {
	public CopperDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CopperDragonEntity, Modelcustom_model<CopperDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/copper_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CopperDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/copper_dragon.png");
	}
}
