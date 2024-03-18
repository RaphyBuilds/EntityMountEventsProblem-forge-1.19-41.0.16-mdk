package net.raphybuilds.firstmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.raphybuilds.firstmod.FirstMod;
import net.raphybuilds.firstmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static Tier RAPHY;
    static {
        RAPHY = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 3f, 4f, 24,
                        ModTags.Blocks.NEEDS_RAPHY_TOOL,() ->Ingredient.of(ModItems.RAPHY.get())),
        new ResourceLocation(FirstMod.MOD_ID, "raphy"), List.of(Tiers.NETHERITE), List.of());
    }
}
