package com.mystic.atlantis.blocks;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TrapDoorBlock;

public class AtlanteanWoodTrapdoorBlock extends TrapDoorBlock {

    public AtlanteanWoodTrapdoorBlock(Properties settings) {
        super(settings
                .sound(SoundType.WOOD)
                .noOcclusion()
                .requiresCorrectToolForDrops()
                .strength(3.0F, 6.0F));
    }
}
