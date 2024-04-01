package net.raphybuilds.firstmod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.ModEntityTypes;
import net.raphybuilds.firstmod.entity.custom.DragonEntity;
import net.raphybuilds.firstmod.entity.custom.RaryEntity;

import net.minecraft.world.item.Items;


public class ModEvents {
    @Mod.EventBusSubscriber(modid = FirstMod.MOD_ID)
    public static class ForgeEvents {


        @SubscribeEvent
        public static void onLivingHurt(LivingHurtEvent event) {
            if (event.getEntity() instanceof Sheep) {
                if (event.getSource().getEntity() instanceof Player player) {
                    if (player.getMainHandItem().getItem() == Items.BEEF) {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep with BEEF!... But why?"));
                    } else {
                        player.sendSystemMessage(Component.literal(player.getName().getString() + " hurt a Sheep!"));
                    }
                }
            }
        }



    }
        @Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModEventBusEvents {
            @SubscribeEvent
            public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
                event.put(ModEntityTypes.RARY.get(), RaryEntity.setAttributes());
                event.put(ModEntityTypes.DRAGON.get(), DragonEntity.setAttributes());
            }




        }

}





