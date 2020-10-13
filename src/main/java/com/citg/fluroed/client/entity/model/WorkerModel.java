package com.citg.fluroed.client.entity.model;

import com.citg.fluroed.entities.WorkerFluro;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class WorkerModel<T extends WorkerFluro> extends EntityModel {
    private final ModelRenderer lLeg;
    private final ModelRenderer rLeg;
    private final ModelRenderer head;

    public WorkerModel() {
        textureWidth = 48;
        textureHeight = 48;

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
}
