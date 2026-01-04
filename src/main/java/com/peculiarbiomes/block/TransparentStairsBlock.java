package com.peculiarbiomes.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.Direction;

public class TransparentStairsBlock extends StairsBlock {

    public TransparentStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        // Checks if connected blocks are of the same block type, does not render sides if true
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }
    
}
