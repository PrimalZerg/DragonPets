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
public class Modelbig_dragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dragon_pets", "modelbig_dragon"), "main");
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart leftarm;
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart rightarm;
	public final ModelPart wingleft;
	public final ModelPart wingright;
	public final ModelPart bb_main;

	public Modelbig_dragon(ModelPart root) {
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.leftarm = root.getChild("leftarm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.rightarm = root.getChild("rightarm");
		this.wingleft = root.getChild("wingleft");
		this.wingright = root.getChild("wingright");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(90, 38).addBox(-2.5F, -4.3185F, -15.1571F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(102, 10).addBox(-2.5F, -4.3185F, -16.1571F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-3.0F, -6.3185F, -12.1571F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -10.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition frills = head.addOrReplaceChild("frills",
				CubeListBuilder.create().texOffs(0, 36).addBox(-1.5F, -6.8149F, -2.3058F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, -2.5036F, -13.1012F));
		PartDefinition cube_r1 = frills.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(69, 71).addBox(0.0F, -1.8257F, -0.0076F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -1.1267F, 5.3355F, 0.0876F, 0.0869F, 0.0076F));
		PartDefinition cube_r2 = frills.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -1.9128F, -0.5038F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -1.0831F, 5.8374F, 0.0876F, -0.0869F, -0.0076F));
		PartDefinition horns = head.addOrReplaceChild("horns",
				CubeListBuilder.create().texOffs(91, 24).addBox(0.75F, -1.8149F, 5.6942F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 24)
						.addBox(0.75F, 0.4351F, 4.4442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -1.8149F, -3.0558F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 27)
						.addBox(-4.75F, 0.4351F, 4.4442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 91)
						.addBox(-4.75F, -1.8149F, 5.6942F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, -4.5036F, -13.1012F));
		PartDefinition cube_r3 = horns.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(11, 99).addBox(-4.75F, 0.136F, 4.864F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(23, 99)
						.addBox(0.75F, 0.136F, 4.864F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 6.9964F, -12.6012F));
		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -17.923F, -2.1747F, 0.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(69, 75)
						.addBox(-2.0F, -13.923F, -2.1747F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(70, 24)
						.addBox(-3.0F, -14.173F, -1.9247F, 6.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition curlyhorns = head.addOrReplaceChild("curlyhorns",
				CubeListBuilder.create().texOffs(100, 91).addBox(0.25F, -10.4504F, -1.002F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(100, 67).addBox(-4.25F, -10.4504F, -1.002F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.6319F, -7.905F));
		PartDefinition cube_r5 = curlyhorns.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(100, 17).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6484F, -8.9371F, -1.0378F, 0.2953F, 0.8252F, 0.5046F));
		PartDefinition cube_r6 = curlyhorns.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 76).addBox(-5.5709F, -4.8931F, -0.2656F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0484F, -3.2758F, -6.5217F, 1.5589F, 1.2736F, 1.9321F));
		PartDefinition cube_r7 = curlyhorns.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(35, 102).addBox(0.5709F, -4.8931F, -0.2656F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0484F, -3.2758F, -6.5217F, 1.5589F, -1.2736F, -1.9321F));
		PartDefinition cube_r8 = curlyhorns.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(100, 32).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6484F, -8.9371F, -1.0378F, 0.2953F, -0.8252F, -0.5046F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(52, 71).addBox(-2.0F, -1.8845F, -1.8132F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5F, 4.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -2.3926F, -4.7072F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.364F, 23.7635F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 76).addBox(-2.0F, -2.7227F, -12.6365F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.364F, 23.7635F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -0.1805F, -15.0871F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.364F, 19.7635F, 0.3491F, 0.0F, 0.0F));
		PartDefinition frills2 = tail.addOrReplaceChild("frills2",
				CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 1.4794F, -26.8267F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.364F, 23.7635F));
		PartDefinition cube_r12 = frills2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(44, 69).addBox(0.0F, -3.9305F, -14.0871F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r13 = frills2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.2582F, -0.8642F, -8.9249F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.2635F, 4.6113F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition cube_r14 = frills2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 8).addBox(-4.7418F, -0.8642F, -8.9249F, 5.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -3.2635F, 4.6113F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition cube_r15 = frills2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(44, 63).addBox(0.0F, -5.9727F, -12.1365F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.0F, -5.9727F, -4.1365F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition spikes = tail.addOrReplaceChild("spikes", CubeListBuilder.create(), PartPose.offset(-1.5F, -10.6275F, 28.3747F));
		PartDefinition cube_r16 = spikes.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 100).addBox(-2.7418F, -1.8642F, -5.9249F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(69, 71).addBox(-4.4918F, -1.8642F, -9.4249F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition cube_r17 = spikes.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(100, 21).addBox(-0.5082F, -1.8642F, -9.4249F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(100, 25).addBox(-2.2582F, -1.8642F, -5.9249F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition cube_r18 = spikes.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(95, 96).addBox(-1.0F, -3.4833F, -5.1673F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -1.4835F, 1.3908F, 0.9163F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(32, 91).addBox(0.3F, -2.6524F, -1.5143F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 38)
						.addBox(-0.95F, 12.3734F, -4.906F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-1.2F, 12.9816F, -4.1303F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(0.05F, 4.3476F, 0.9857F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2F, 10.9155F, -8.1853F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r19 = leftarm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.25F, -13.6933F, -2.0794F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3F, 17.339F, -1.1217F, -0.2182F, 0.0F, 0.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(0, 88).addBox(-2.7F, -1.3256F, -1.9747F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 91)
						.addBox(-1.95F, 4.6744F, 2.0253F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 71)
						.addBox(-3.2F, 12.9168F, -1.4378F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 24)
						.addBox(-2.95F, 13.56F, -0.6381F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 79)
						.addBox(-1.95F, 4.6744F, 5.0253F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.55F, 10.4053F, 0.8896F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(84, 89).addBox(-0.3F, -1.3256F, -1.9747F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(66, 94).addBox(-0.05F, 4.6744F, 2.0253F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 87)
						.addBox(-1.05F, 12.9168F, -1.4378F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 28)
						.addBox(-1.05F, 13.56F, -0.6381F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(83, 71)
						.addBox(-0.05F, 4.6744F, 5.0253F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.55F, 10.4053F, 0.8896F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(44, 91).addBox(-1.3F, -2.6088F, -2.5133F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(86, 78).addBox(-2.05F, 12.417F, -5.905F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 64)
						.addBox(-1.8F, 13.0252F, -5.1293F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-1.05F, 4.3912F, -0.0133F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, 10.9155F, -7.1853F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r20 = rightarm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(76, 94).addBox(1.25F, -13.6933F, -2.0794F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3F, 17.3826F, -2.1208F, -0.2182F, 0.0F, 0.0F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(93, 10).addBox(13.9371F, -10.7746F, -12.3164F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-7.0629F, -9.7746F, -5.5664F, 24.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 14.5029F, -3.4979F, -0.0298F, -0.0275F, -0.222F));
		PartDefinition cube_r21 = wingleft.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(70, 0).addBox(-6.0893F, -10.2746F, -4.5511F, 17.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r22 = wingleft.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(20, 84).addBox(-7.3782F, -10.7746F, -3.1054F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition upperwingleft = wingleft.addOrReplaceChild("upperwingleft",
				CubeListBuilder.create().texOffs(0, 67).addBox(-3.5318F, -6.9505F, -7.8128F, 23.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 44).addBox(-2.5318F, -6.4505F, -6.0628F, 21.0F, 0.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.132F));
		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(95, 84).addBox(-15.9371F, -10.7746F, -12.3164F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(0, 22).addBox(-16.9371F, -9.7746F, -5.5664F, 24.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 14.5029F, -3.4979F, -0.0298F, 0.0275F, 0.222F));
		PartDefinition cube_r23 = wingright.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(70, 5).addBox(-10.9107F, -10.2746F, -4.5511F, 17.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r24 = wingright.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(46, 84).addBox(-1.6218F, -10.7746F, -3.1054F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition upperwingright = wingright.addOrReplaceChild("upperwingright",
				CubeListBuilder.create().texOffs(50, 67).addBox(-19.4682F, -6.9505F, -7.8128F, 23.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(42, 44).addBox(-18.4682F, -6.4505F, -6.0628F, 21.0F, 0.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.132F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(70, 10).addBox(-4.0F, -18.5F, -11.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 71)
						.addBox(-3.0F, -17.25F, -4.0F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(0.0F, -21.5F, -11.0F, 0.0F, 5.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wingright.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.wingleft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
