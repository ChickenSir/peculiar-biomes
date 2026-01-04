package com.peculiarbiomes.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.util.math.Direction;

public class TransparentFenceBlock extends FenceBlock {

    public TransparentFenceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        // Checks if connected blocks are of the same block type, does not render sides if true
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }
    
}
