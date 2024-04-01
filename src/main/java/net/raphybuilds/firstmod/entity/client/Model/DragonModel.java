package net.raphybuilds.firstmod.entity.client.Model;



import net.minecraft.resources.ResourceLocation;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.custom.DragonEntity;
import net.raphybuilds.firstmod.entity.custom.DragonEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DragonModel extends AnimatedGeoModel<DragonEntity> {
    @Override
    public ResourceLocation getModelResource(DragonEntity DragonEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "geo/dragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DragonEntity DragonEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "textures/entity/dragon_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DragonEntity DragonEntity) {
        return new ResourceLocation(FirstMod.MOD_ID, "animations/dragon.animation.json");
    }
}

