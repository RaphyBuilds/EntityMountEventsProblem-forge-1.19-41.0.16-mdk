package net.raphybuilds.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.entity.ModEntityTypes;

public class ModItems {
 public static final DeferredRegister<Item> ITEMS =
         DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

public static final RegistryObject<Item> RAPHY = ITEMS.register("raphy",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB)));
public static final RegistryObject<Item> RAW_RAPHY = ITEMS.register("raw_raphy",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB)));
public static final RegistryObject<Item> RAPHYSWORD = ITEMS.register("raphysword",
        () -> new SwordItem(ModToolTiers.RAPHY,8,4f,
                new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB).stacksTo(1)));
public static final RegistryObject<Item> RARY_SPAWN_EGG = ITEMS.register("rary_spawn_egg",
        () -> new ForgeSpawnEggItem(ModEntityTypes.RARY, 0x22b341, 0x19732e,
                new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB)));

    public static final RegistryObject<Item> DRAGON_SPAWN_EGG = ITEMS.register("dragon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DRAGON, 0x20b330, 0x19622e,
                    new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB)));
    public static final RegistryObject<Item> RAPHY_PICKAXE = ITEMS.register("raphy_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RAPHY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FIRSTMOD_TAB).stacksTo(1)));

public static void register(IEventBus eventBus){
  ITEMS.register(eventBus);
}

}
