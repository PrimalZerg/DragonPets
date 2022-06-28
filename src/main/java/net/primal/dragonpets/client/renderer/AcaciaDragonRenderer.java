
package net.primal.dragonpets.client.renderer;

import net.primal.dragonpets.entity.AcaciaDragonEntity;
import net.primal.dragonpets.client.model.Modeldragon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class AcaciaDragonRenderer extends MobRenderer<AcaciaDragonEntity, Modeldragon<AcaciaDragonEntity>> {
	public AcaciaDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragon(context.bakeLayer(Modeldragon.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AcaciaDragonEntity, Modeldragon<AcaciaDragonEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pets:textures/acacia_dragon_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AcaciaDragonEntity entity) {
		return new ResourceLocation("dragon_pets:textures/acacia_dragon.png");
	}
}
