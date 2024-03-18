package net.raphybuilds.firstmod.util;

import net.raphybuilds.firstmod.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_RAPHY_TOOL
                = tag("needs_raphy_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(FirstMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}