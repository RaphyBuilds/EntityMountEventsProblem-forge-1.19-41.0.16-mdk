package net.raphybuilds.firstmod.entity.client.Renderer;



import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.client.Model.DragonModel;
import net.raphybuilds.firstmod.entity.custom.DragonEntity;
import net.raphybuilds.firstmod.entity.custom.RaryEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DragonRenderer extends GeoEntityRenderer<DragonEntity> {
    public DragonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DragonModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(DragonEntity instance) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/dragon_texture.png");
    }

    @Override
    public RenderType getRenderType(DragonEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1f,1f,1f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

