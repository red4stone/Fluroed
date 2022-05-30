package com.citg.fluroed.client.entity.model;

import com.citg.fluroed.entities.WorkerFluro;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
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

public class WorkerModel<T extends WorkerFluro> extends EntityModel {
    private final ModelPart lLeg;
    private final ModelPart rLeg;
    private final ModelPart head;

    public WorkerModel() {
        //textureWidth = 48;
        //textureHeight = 48;

        lLeg = new ModelRenderer(this);
        lLeg.setRotationPoint(4.0F, 12.0F, -1.0F);
        lLeg.setTextureOffset(16, 32).addBox(-2.0F, 10.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        lLeg.setTextureOffset(12, 24).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        lLeg.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        lLeg.setTextureOffset(0, 0).addBox(-2.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        lLeg.setTextureOffset(16, 28).addBox(-2.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        lLeg.setTextureOffset(0, 0).addBox(-2.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        rLeg = new ModelRenderer(this);
        rLeg.setRotationPoint(-3.0F, 12.0F, -1.0F);
        rLeg.setTextureOffset(0, 0).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rLeg.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rLeg.setTextureOffset(0, 4).addBox(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rLeg.setTextureOffset(0, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rLeg.setTextureOffset(0, 32).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        rLeg.setTextureOffset(8, 32).addBox(-1.0F, 10.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 8.0F, -1.0F);
        head.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, -5.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
        head.setTextureOffset(24, 0).addBox(-2.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.lLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        lLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setupAnim(Entity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_,
            float p_102623_) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void renderToBuffer(PoseStack p_103111_, VertexConsumer p_103112_, int p_103113_, int p_103114_,
            float p_103115_, float p_103116_, float p_103117_, float p_103118_) {
        // TODO Auto-generated method stub
        
    }
}
