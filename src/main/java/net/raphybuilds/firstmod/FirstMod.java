package net.raphybuilds.firstmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.raphybuilds.firstmod.block.ModBlocks;
import net.raphybuilds.firstmod.entity.ModEntityTypes;
import net.raphybuilds.firstmod.entity.client.RaryRenderer;
import net.raphybuilds.firstmod.item.ModItems;
import net.raphybuilds.firstmod.world.feature.ModConfiguredFeatures;
import net.raphybuilds.firstmod.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FirstMod.MOD_ID)
public class FirstMod {
    public static final String MOD_ID = "firstmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    //very important comment
    public FirstMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        GeckoLib.initialize();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.RARY.get(), RaryRenderer::new);

        }
    }
}

