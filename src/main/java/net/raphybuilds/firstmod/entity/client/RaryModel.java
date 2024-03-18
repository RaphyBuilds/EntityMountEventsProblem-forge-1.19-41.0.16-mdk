package net.raphybuilds.firstmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.custom.RaryEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaryModel extends AnimatedGeoModel<RaryEntity> {
    @Override
    public ResourceLocation getModelResource(RaryEntity raryEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "geo/rary.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RaryEntity raryEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/rary_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RaryEntity raryEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "animations/rary.animation.json");
    }
}
