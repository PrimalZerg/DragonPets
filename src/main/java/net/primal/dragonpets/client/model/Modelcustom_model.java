package net.primal.dragonpets.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dragon_pets", "modelcustom_model"), "main");
	public final ModelPart wingright;
	public final ModelPart wingleft;
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart leg0;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.wingright = root.getChild("wingright");
		this.wingleft = root.getChild("wingleft");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(21, 49).addBox(-10.9564F, -0.001F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-10.9564F, 0.999F, 0.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 14.5029F, -3.4979F, -0.0298F, 0.0275F, 0.222F));
		PartDefinition cube_r1 = wingright.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 35).addBox(-3.9597F, 0.499F, -0.0167F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r2 = wingright.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 38).addBox(-4.9605F, -0.001F, -0.9816F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition upperwingright = wingright.addOrReplaceChild("upperwingright",
				CubeListBuilder.create().texOffs(31, 27).addBox(-9.9574F, 0.499F, 0.0094F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 13).addBox(-9.9574F, 0.999F, 0.0094F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 0.0F, -0.5F, -0.0172F, 0.1298F, -0.132F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(16, 48).addBox(9.9564F, -0.001F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0436F, 0.999F, 0.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 14.5029F, -3.4979F, -0.0219F, -0.0173F, -0.223F));
		PartDefinition cube_r3 = wingleft.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 32).addBox(-4.0403F, 0.499F, -0.0167F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r4 = wingleft.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(14, 40).addBox(-1.0395F, -0.001F, -0.9816F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition upperwingleft = wingleft.addOrReplaceChild("upperwingleft",
				CubeListBuilder.create().texOffs(22, 30).addBox(-0.0426F, 0.499F, 0.0094F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 0).addBox(-0.0426F, 0.999F, 0.0094F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -0.5F, -0.023F, -0.173F, 0.1329F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(48, 42).addBox(-1.5F, -3.6355F, -9.6962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(52, 34).addBox(-1.5F, -3.6355F, -10.6962F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-2.0F, -4.6355F, -7.6962F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.5F, -4.6355F, -10.6962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
						.addBox(1.0F, -4.6355F, -4.9462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 48)
						.addBox(-2.0F, -4.6355F, -4.9462F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -5.6355F, -9.9462F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(0.25F, -4.8855F, -5.1962F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 9)
						.addBox(-2.25F, -3.3855F, -5.1962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
						.addBox(1.25F, -3.3855F, -5.1962F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 30)
						.addBox(-3.25F, -4.8855F, -5.1962F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -4.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 37).addBox(-3.0F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0484F, -3.2758F, -6.5217F, 1.5589F, -1.2736F, -1.9321F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 28).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.75F, -4.3855F, -4.6962F, 0.4429F, -0.8187F, -0.7072F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.0F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0484F, -3.2758F, -6.5217F, 1.5589F, 1.2736F, 1.9321F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 19)
						.addBox(0.0F, -4.0F, -2.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-1.0F, -2.0F, -1.0F, 2.0F,
								2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6355F, -4.6962F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(56, 4).addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, -4.3855F, -4.6962F, 0.4429F, 0.8187F, 0.7072F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(12, 53).addBox(-3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 53)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -4.1355F, -5.1962F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(41, 44).addBox(-3.5F, -0.5F, 0.25F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(7, 45)
						.addBox(0.5F, -0.5F, 0.25F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -4.1355F, -5.1962F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.1566F, 1.0373F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 32)
						.addBox(0.0F, -2.1566F, 1.0373F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.9799F, 0.999F, -2.5387F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 48)
						.addBox(-0.9799F, 0.499F, -2.5387F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 54)
						.addBox(-1.9799F, 0.499F, -0.5387F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -4.2635F, 12.1113F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 8).addBox(-2.0201F, 0.999F, -2.5387F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 46)
						.addBox(-2.0201F, 0.499F, -2.5387F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 26)
						.addBox(-1.0201F, 0.499F, -0.5387F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -4.2635F, 12.1113F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 0.4397F, -1.342F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.7471F, 13.5021F, 0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(40, 42).addBox(-1.0F, 0.4707F, 3.1056F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.2793F, 3.1928F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 30)
						.addBox(0.0F, -2.2793F, -0.8072F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, -0.2793F, -0.8072F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 7.5F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(17, 50).addBox(0.0F, -1.7737F, 0.7164F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-1.0F, 0.2263F, 0.7164F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(6, 53).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-1.0F, 3.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 4).addBox(-1.0F, 3.0F, 3.0F, 1.0F, 1.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 16.2365F, 1.1113F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r18 = leg0.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(30, 45).addBox(-1.5F, 1.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r19 = leg0.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(44, 47).addBox(-1.5F, 0.5F, -1.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, 0.5F, 1.4399F, 0.0F, 0.0F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(52, 51).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 51)
						.addBox(-1.0F, 3.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-1.0F, 3.0F, 3.0F, 1.0F, 1.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 16.2365F, 1.1113F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r20 = leg1.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(41, 29).addBox(-1.5F, 2.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, 0.0F, 1.789F, 0.0F, 0.0F));
		PartDefinition cube_r21 = leg1.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(32, 47).addBox(-1.5F, 0.75F, -1.75F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, 0.5F, 1.7017F, 0.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(40, 51).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 16.2365F, -2.8887F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r22 = leg2.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(26, 40).addBox(-1.5F, 1.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, -1.0F, 1.6581F, 0.0F, 0.0F));
		PartDefinition cube_r23 = leg2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(23, 45).addBox(-1.5F, -0.25F, -2.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.5F, -0.5F, 1.7017F, 0.0F, 0.0F));
		PartDefinition cube_r24 = leg2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(34, 51).addBox(-1.0F, -1.0F, 0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg3 = partdefinition
				.addOrReplaceChild(
						"leg3", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(2.5F, 19.2365F, -3.8887F));
		PartDefinition cube_r25 = leg3.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(8, 38).addBox(-1.5F, 0.25F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.5F, 0.0F, 1.6581F, 0.0F, 0.0F));
		PartDefinition cube_r26 = leg3.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(14, 44).addBox(-1.5F, -0.75F, -2.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.5F, 0.5F, 1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r27 = leg3.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.0F, 0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(18, 32).addBox(-2.0F, -8.5F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 38)
						.addBox(-1.5F, -8.25F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(0.0F, -10.5F, -5.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingright.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.tail.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tail.xRot = headPitch / (180F / (float) Math.PI);
		this.leg2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.wingleft.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
