package com.citg.fluroed.client.entity.model;

import com.citg.fluroed.Fluroed;
import com.citg.fluroed.entities.WorkerFluro;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
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

public class WorkerModel<T extends Entity> extends HierarchicalModel<T> {
    private final ModelPart root;
    private final ModelPart lLeg;
    private final ModelPart rLeg;

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation(Fluroed.MODID, "worker_fluro"), "main");

    public WorkerModel(ModelPart part) {
        this.root = part;
        this.lLeg = part.getChild("lLeg");
        this.rLeg = part.getChild("rLeg");
    }

    public static LayerDefinition createBodyLayer(CubeDeformation p_170526_) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, p_170526_);
        partdefinition.addOrReplaceChild("lLeg", cubelistbuilder, PartPose.offset(-2.0F, 18.0F, 4.0F));
        partdefinition.addOrReplaceChild("rLeg", cubelistbuilder, PartPose.offset(2.0F, 18.0F, 4.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
     }

    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public void setupAnim(T p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_,
            float p_102623_) {
        // TODO Auto-generated method stub
        
    }
}
