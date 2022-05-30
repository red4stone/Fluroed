package com.citg.fluroed.client.entity.model;

import com.citg.fluroed.Fluroed;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class WorkerModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation WORKER_EYE_LAYER = new ModelLayerLocation(new ResourceLocation(Fluroed.MODID, "worker_fluro"), "main");
	public static final ModelLayerLocation WORKER_OUTER_LAYER = new ModelLayerLocation(new ResourceLocation(Fluroed.MODID, "worker_fluro"), "outer");
	private final ModelPart root;
    //private final ModelPart lLeg;
	//private final ModelPart rLeg;
	//private final ModelPart head;
	//private final ModelPart eyebone;
	//private final ModelPart spikes;

	public WorkerModel(ModelPart root) {
        this.root = root;
        //this.lLeg = root.getChild("lLeg");
		//this.rLeg = root.getChild("rLeg");
		//this.head = root.getChild("head");
		//this.eyebone = root.getChild("eyebone");
		//this.spikes = root.getChild("spikes");
	}

	public static LayerDefinition createOuterLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition lLeg = partdefinition.addOrReplaceChild("lLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 4.4211F, -1.1364F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.5473F, 0.7898F));

		PartDefinition cube_r1 = lLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4527F, -0.7898F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rLeg = partdefinition.addOrReplaceChild("rLeg", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 4.4211F, -1.1364F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 12.5473F, 0.7898F));

		PartDefinition cube_r2 = rLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4527F, -0.7898F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -4.5F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -0.5F));

		//PartDefinition eyebone = head.addOrReplaceChild("eyebone", CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, -2.0F, -3.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition spikes = partdefinition.addOrReplaceChild("spikes", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition spike1 = spikes.addOrReplaceChild("spike1", CubeListBuilder.create(), PartPose.offset(-5.2929F, 5.8787F, 1.0F));

		PartDefinition cube_r3 = spike1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7071F, 2.1213F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition spike2 = spikes.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, 1.0F));

		PartDefinition spike3 = spikes.addOrReplaceChild("spike3", CubeListBuilder.create(), PartPose.offset(-6.1213F, -5.7071F, 1.0F));

		PartDefinition cube_r4 = spike3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1213F, 0.7071F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition spike4 = spikes.addOrReplaceChild("spike4", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -5.0F, 0.0F));

		PartDefinition spike5 = spikes.addOrReplaceChild("spike5", CubeListBuilder.create(), PartPose.offset(5.0F, -4.0F, 0.0F));

		PartDefinition cube_r5 = spike5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition spike6 = spikes.addOrReplaceChild("spike6", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 2.0F, 0.0F));

		PartDefinition spike7 = spikes.addOrReplaceChild("spike7", CubeListBuilder.create(), PartPose.offset(8.0F, 2.0F, 0.0F));

		PartDefinition cube_r6 = spike7.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

    public static LayerDefinition createEyeLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition eyebone = partdefinition.addOrReplaceChild("eyebone", CubeListBuilder.create().texOffs(16, 24).addBox(-2.0F, -2.0F, -3.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -0.5F));
        return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

    @Override
    public ModelPart root() {
        return this.root;
    }
}

/*

public class WorkerModel<Type extends Entity> extends EntityModel<Type> {
    private final ModelPart body;

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
		new ResourceLocation(Fluroed.MODID, "worker_fluro"), "main");

    public WorkerModel(ModelPart root) {
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -8.0F, -7.0F, 10.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

        body.addOrReplaceChild("lLeg", 
            CubeListBuilder.create().texOffs(26, 27)
                .addBox(5.0F, -3.0F, -6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(-7.0F, -3.0F, -6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(-7.0F, -3.0F, 4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(5.0F, -3.0F, 4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
            PartPose.offset(0.0F, 0.0F, 0.0F));

        body.addOrReplaceChild("rLeg", 
            CubeListBuilder.create().texOffs(0, 22)
                .addBox(-2.0F, -10.0F, -11.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(-2.0F, -11.0F, -11.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(-1.0F, -11.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(1.0F, -12.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                .addBox(-3.0F, -12.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
            PartPose.offset(2.0F, 18.0F, 4.0F));
        
            return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(Type p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_,
            float p_102623_) {
        // TODO Auto-generated method stub
        
    }

    @Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		this.body.render(poseStack, buffer, packedLight, packedOverlay, red, green, blue, 0.75f);
	}
}
*/