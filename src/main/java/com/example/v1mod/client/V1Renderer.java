package com.example.v1mod.client;

import com.example.v1mod.V1Entity;
import com.example.v1mod.V1Mod;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class V1Renderer extends MobRenderer<V1Entity, HumanoidModel<V1Entity>> {
    private static final ResourceLocation TEXTURE =
        new ResourceLocation(V1Mod.MODID, "textures/entity/v1.png");

    public V1Renderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(V1Entity entity) {
        return TEXTURE;
    }
}
