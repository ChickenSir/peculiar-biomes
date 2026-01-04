package com.peculiarbiomes.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.Direction;

public class TransparentPillarBlock extends PillarBlock {

    public TransparentPillarBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        // Checks if connected blocks are of the same block type, does not render sides if true
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }
    
}
