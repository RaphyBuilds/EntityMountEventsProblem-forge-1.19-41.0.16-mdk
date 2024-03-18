package net.raphybuilds.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FIRSTMOD_TAB = new CreativeModeTab("firsttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAPHY.get());
        }
    };
}
