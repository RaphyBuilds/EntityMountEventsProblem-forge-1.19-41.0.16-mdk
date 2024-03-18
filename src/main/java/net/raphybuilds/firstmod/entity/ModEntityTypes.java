package net.raphybuilds.firstmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.custom.RaryEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FirstMod.MOD_ID);
    public static final RegistryObject<EntityType<RaryEntity>> RARY =
    ENTITY_TYPES.register("rary",
            ()->EntityType.Builder.of(RaryEntity::new, MobCategory.MONSTER)
                    .sized(0.4f, 1.5f)
            .build(new ResourceLocation(FirstMod.MOD_ID, "rary").toString()));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
