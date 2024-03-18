package net.raphybuilds.firstmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.block.custom.RaphyLampBlock;
import net.raphybuilds.firstmod.item.ModCreativeModeTab;
import net.raphybuilds.firstmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
public static  final DeferredRegister<Block>BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);
public static final RegistryObject<Block>RAPHY_BLOCK = registerBlock("raphy_block",
        ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FIRSTMOD_TAB);
public static final RegistryObject<Block>RAPHY_ORE = registerBlock("raphy_ore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),ModCreativeModeTab.FIRSTMOD_TAB);
public static final RegistryObject<Block>DEEPSLATE_RAPHY_ORE = registerBlock("deepslate_raphy_ore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),ModCreativeModeTab.FIRSTMOD_TAB);
public static final RegistryObject<Block>ENDSTONE_RAPHY_ORE = registerBlock("endstone_raphy_ore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),ModCreativeModeTab.FIRSTMOD_TAB);
public static final RegistryObject<Block>NETHERRACK_RAPHY_ORE = registerBlock("netherrack_raphy_ore",
        ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),ModCreativeModeTab.FIRSTMOD_TAB);
public static final RegistryObject<Block>RAPHY_LAMP = registerBlock("raphy_lamp",
        ()-> new RaphyLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                .strength(6f).requiresCorrectToolForDrops()
                .lightLevel(state -> state.getValue(RaphyLampBlock.LIT) ?15 : 0)), ModCreativeModeTab.FIRSTMOD_TAB);

private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
registerBlockItem(name, toReturn,tab);
    return  toReturn;
}
private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                        CreativeModeTab tab) {
  return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),new Item.Properties(). tab(tab)));
}
public  static void register(IEventBus eventBus){
  BLOCKS.register(eventBus);

}


}
