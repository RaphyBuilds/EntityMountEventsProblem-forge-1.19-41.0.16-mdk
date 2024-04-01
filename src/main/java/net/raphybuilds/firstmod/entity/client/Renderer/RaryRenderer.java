package net.raphybuilds.firstmod.entity.client.Renderer;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.client.Model.RaryModel;
import net.raphybuilds.firstmod.entity.custom.RaryEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaryRenderer extends GeoEntityRenderer<RaryEntity> {
    public RaryRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RaryModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(RaryEntity instance) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/rary_texture.png");
    }

    @Override
    public RenderType getRenderType(RaryEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1f,1f,1f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
