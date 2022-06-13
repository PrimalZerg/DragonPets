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

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldragon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dragon_pets", "modeldragon"), "main");
	private static final String UPPERWINGRIGHT = "upperwingright";
	private static final String UPPERWINGLEFT = "upperwingleft";
	private static final String RIGHTFOOT = "rightfoot";
	private static final String LEFTFOOT = "leftfoot";
	private static final String RIGHTHAND = "righthand";
	private static final String LEFTHAND = "lefthand";
	private static final String TAIL2 = "tail2";
	private static final String TAIL3 = "tail3";
	private static final String TAIL4 = "tail4";
	public final ModelPart body;
	public final ModelPart wingright;
	public final ModelPart upperwingright;
	public final ModelPart wingleft;
	public final ModelPart upperwingleft;
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart tail4;
	public final ModelPart rightleg;
	public final ModelPart rightfoot;
	public final ModelPart leftleg;
	public final ModelPart leftfoot;
	public final ModelPart rightarm;
	public final ModelPart righthand;
	public final ModelPart leftarm;
	public final ModelPart lefthand;

	public Modeldragon(ModelPart root) {
		this.body = root.getChild("body");
		this.wingright = root.getChild("wingright");
		this.upperwingright = this.wingright.getChild("upperwingright");
		this.wingleft = root.getChild("wingleft");
		this.upperwingleft = this.wingleft.getChild("upperwingleft");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.rightleg = root.getChild("rightleg");
		this.rightfoot = this.rightleg.getChild("rightfoot");
		this.leftleg = root.getChild("leftleg");
		this.leftfoot = this.leftleg.getChild("leftfoot");
		this.rightarm = root.getChild("rightarm");
		this.righthand = this.rightarm.getChild("righthand");
		this.leftarm = root.getChild("leftarm");
		this.lefthand = this.leftarm.getChild("lefthand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(30, 38).addBox(-1.5F, -0.8333F, -0.1667F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(18, 32).addBox(-2.0F, -1.0833F, -4.1667F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(0.0F, -3.0833F, -4.1667F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.3333F, -0.8333F));
		PartDefinition wingright = partdefinition.addOrReplaceChild("wingright",
				CubeListBuilder.create().texOffs(21, 49).addBox(-11.2315F, -1.2195F, -3.044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(0, 12).addBox(-11.2315F, -0.2195F, -0.044F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.5029F, -3.4979F, -0.0202F, 0.0352F, 0.5275F));
		PartDefinition cube_r1 = wingright.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 35).addBox(-3.7971F, 1.2302F, -0.0555F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4402F, -1.9497F, -0.0703F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r2 = wingright.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 38).addBox(-4.822F, 0.7302F, -0.8879F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4402F, -1.9497F, -0.0703F, 0.0F, 0.4363F, 0.0F));
		PartDefinition upperwingright = wingright.addOrReplaceChild("upperwingright",
				CubeListBuilder.create().texOffs(31, 27).addBox(-9.894F, 1.2448F, 0.0571F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 13).addBox(-9.894F, 1.7448F, 0.0571F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.4402F, -1.9497F, -0.5703F, -0.0172F, 0.1298F, -0.132F));
		PartDefinition wingleft = partdefinition.addOrReplaceChild("wingleft",
				CubeListBuilder.create().texOffs(16, 48).addBox(10.2328F, -1.2196F, -3.0315F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(0, 12).mirror().addBox(-0.7672F, -0.2196F, -0.0315F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 16.5029F, -3.4979F, -0.0157F, -0.0231F, -0.5285F));
		PartDefinition cube_r3 = wingleft.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 32).addBox(-4.2008F, 1.2302F, -0.0627F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4423F, -1.9498F, -0.0505F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r4 = wingleft.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(14, 40).addBox(-1.1818F, 0.7302F, -0.8943F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4423F, -1.9498F, -0.0505F, 0.0F, -0.4363F, 0.0F));
		PartDefinition upperwingleft = wingleft.addOrReplaceChild("upperwingleft",
				CubeListBuilder.create().texOffs(22, 30).addBox(-0.1058F, 1.2449F, 0.0569F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 13).mirror().addBox(-0.1058F, 1.7449F, 0.0569F, 10.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.4423F, -1.9498F, -0.5505F, -0.023F, -0.173F, 0.1329F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(48, 42).addBox(-1.5F, -3.8665F, -9.6005F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(52, 34).addBox(-1.5F, -3.8665F, -10.6005F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-2.0F, -4.8665F, -7.6005F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -4.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition horns = head.addOrReplaceChild("horns",
				CubeListBuilder.create().texOffs(56, 9).addBox(-2.25F, -1.0571F, -3.787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 48)
						.addBox(-2.25F, -2.3071F, -3.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.5F, -2.3071F, -9.287F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
						.addBox(1.25F, -2.3071F, -3.537F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
						.addBox(1.25F, -1.0571F, -3.787F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5594F, -1.3135F));
		PartDefinition cube_r5 = horns.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 53).addBox(-3.75F, 0.0303F, -1.0303F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(20, 53).addBox(-0.25F, 0.0303F, -1.0303F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -2.5F, -3.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition frill = head.addOrReplaceChild("frill",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.3071F, -8.537F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5594F, -1.3135F));
		PartDefinition cube_r6 = frill.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(7, 45).addBox(0.25F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.9634F, -1.9565F, 0.0894F, 0.2173F, 0.0193F));
		PartDefinition cube_r7 = frill.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(41, 44).addBox(0.0F, -1.4128F, -0.5038F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -0.9634F, -2.9565F, 0.088F, -0.1304F, -0.0115F));
		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5594F, -4.3135F));
		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(15, 19).addBox(0.0F, -3.2564F, -1.9021F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -1.7564F, -1.4021F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-1.0F, -1.2564F, -0.9021F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition curlyhorns = head.addOrReplaceChild("curlyhorns",
				CubeListBuilder.create().texOffs(54, 30).addBox(-7.2984F, -0.9168F, 1.0386F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(56, 2).addBox(-3.7984F, -0.9168F, 1.0386F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0484F, -4.1997F, -6.1391F));
		PartDefinition cube_r9 = curlyhorns.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(56, 0).addBox(0.4642F, 0.0328F, 0.0013F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5589F, 1.2736F, 1.9321F));
		PartDefinition cube_r10 = curlyhorns.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(56, 4).addBox(0.5172F, 0.0328F, -0.6059F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2984F, -1.1097F, 1.8256F, 0.4429F, 0.8187F, 0.7072F));
		PartDefinition cube_r11 = curlyhorns.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(54, 37).addBox(-3.4642F, 0.0328F, 0.0013F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0968F, 0.0F, 0.0F, 1.5589F, -1.2736F, -1.9321F));
		PartDefinition cube_r12 = curlyhorns.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(54, 28).addBox(-3.5172F, 0.0328F, -0.6059F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7984F, -1.1097F, 1.8256F, 0.4429F, -0.8187F, -0.7072F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -1.0405F, 0.1534F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 32)
						.addBox(0.0F, -3.0405F, 0.1534F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0858F, 4.0858F));
		PartDefinition cube_r13 = tail2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, 0.906F, 1.0334F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 50)
						.addBox(0.0F, -1.094F, 1.0334F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, -2.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.75F, 2.25F));
		PartDefinition cube_r14 = tail3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(10, 30).addBox(0.0F, -1.5549F, -0.6131F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, 0.4451F, -0.6131F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.75F, -0.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, 3.0F));
		PartDefinition cube_r15 = tail4.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(40, 42).addBox(-1.0F, 0.9593F, 3.2358F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, -3.25F, 0.6109F, 0.0F, 0.0F));
		PartDefinition frills = tail4.addOrReplaceChild("frills", CubeListBuilder.create(), PartPose.offset(0.0F, 1.75F, -7.25F));
		PartDefinition cube_r16 = frills.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, 1.1833F, -1.4399F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.7471F, 10.0021F, 0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r17 = frills.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5549F, 3.3869F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r18 = frills.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 8).addBox(-1.96F, 1.7377F, -2.4232F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -4.2635F, 8.6113F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition cube_r19 = frills.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.04F, 1.7377F, -2.4232F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -4.2635F, 8.6113F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition spikes = tail.addOrReplaceChild("spikes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r20 = spikes.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(52, 26).addBox(-0.96F, 1.2377F, -0.4232F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(53, 46).addBox(-1.96F, 1.2377F, -2.4232F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -5.6777F, 10.6971F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition cube_r21 = spikes.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(25, 54).addBox(-2.04F, 1.2377F, -0.4232F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(53, 48).addBox(-1.04F, 1.2377F, -2.4232F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -5.6777F, 10.6971F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(6, 53).addBox(-1.0F, -1.25F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-1.0F, 1.75F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 4)
						.addBox(-1.0F, 1.75F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 18.2365F, 1.1113F));
		PartDefinition rightfoot = rightleg.addOrReplaceChild(
				"rightfoot", CubeListBuilder.create().texOffs(44, 47).addBox(-1.5F, 0.5587F, -2.762F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(30, 45).addBox(-1.5F, 1.0587F, -2.762F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 4.4413F, 1.512F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(52, 51).addBox(0.0F, -1.25F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 51)
						.addBox(0.0F, 1.75F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, 1.75F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, 18.2365F, 1.1113F));
		PartDefinition leftfoot = leftleg.addOrReplaceChild(
				"leftfoot", CubeListBuilder.create().texOffs(32, 47).addBox(-1.5F, 0.4153F, -3.0219F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(41, 29).addBox(-1.5F, 0.9153F, -3.0219F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 4.5847F, 1.7719F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild(
				"rightarm", CubeListBuilder.create().texOffs(40, 51).addBox(-0.5F, -0.499F, -1.0436F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 2).addBox(-0.5F, 2.501F, 0.9564F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 17.4865F, -2.8887F));
		PartDefinition cube_r22 = rightarm.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(34, 51).addBox(-1.0F, -1.0F, 0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 3.501F, -1.0436F, -0.2182F, 0.0F, 0.0F));
		PartDefinition righthand = rightarm.addOrReplaceChild(
				"righthand", CubeListBuilder.create().texOffs(23, 45).addBox(-1.5F, 0.375F, -2.625F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(26, 40).addBox(-1.5F, 0.875F, -2.625F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.376F, -0.1686F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild(
				"leftarm", CubeListBuilder.create().texOffs(0, 34).addBox(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-0.25F, 2.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.75F, 17.4865F, -2.8887F));
		PartDefinition cube_r23 = leftarm.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, -1.0F, 0.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 3.5F, -1.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition lefthand = leftarm.addOrReplaceChild(
				"lefthand", CubeListBuilder.create().texOffs(14, 44).addBox(-1.5F, 0.25F, -2.375F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(8, 38).addBox(-1.5F, 0.75F, -2.375F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.25F, 5.5F, -0.375F));
		return LayerDefinition.create(meshdefinition, 63, 64);
	}

	// public void prepareMobModel(T entity, float limbswing, float limbSwingAmount,
	// float ageInTicks, float netHeadYaw,
	// float headPitch) {
	// if (entity.isInSittingPose()) {
	// this.body.setPos(-1.5F, 2.5F, 0.0F);
	// this.body.xRot = 40F;
	// } else {
	// this.body.setPos(-1.5F, 4.5F, -1F);
	// this.body.xRot = 0F;
	// }
	// }
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.wingright.zRot = Mth.cos(limbSwing * 0.9F + (float) Math.PI) * limbSwingAmount;
		this.upperwingright.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.90F + (float) Math.PI) * limbSwingAmount;
		this.tail2.yRot = Mth.cos(limbSwing * -0.45F + (float) Math.PI) * limbSwingAmount;
		this.tail3.yRot = Mth.cos(limbSwing * 0.45F + (float) Math.PI) * limbSwingAmount;
		this.tail4.yRot = Mth.cos(limbSwing * -0.45F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.upperwingleft.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.wingleft.zRot = Mth.cos(limbSwing * 0.9F) * limbSwingAmount;
		this.rightarm.xRot = 0.5F;
		this.righthand.xRot = -30F;
		this.righthand.setPos(0.0F, 6.3F, -1.0F);
		this.leftarm.xRot = 0.5F;
		this.lefthand.setPos(0.0F, 6.3F, -1.0F);
		this.lefthand.xRot = -30F;
		this.rightleg.xRot = -50.0F;
		this.rightfoot.xRot = -42.5F;
		this.leftleg.xRot = -50.0F;
		this.leftfoot.xRot = -42.5F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
