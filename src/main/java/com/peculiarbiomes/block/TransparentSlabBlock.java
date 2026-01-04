package com.peculiarbiomes.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.Direction;

public class TransparentSlabBlock extends SlabBlock {

    public TransparentSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        // Checks if connected blocks are of the same block type, does not render sides if true
        return stateFrom.isOf(this) && state.get(TYPE) != SlabType.DOUBLE ? true : super.isSideInvisible(state, stateFrom, direction);
    }
    
}
