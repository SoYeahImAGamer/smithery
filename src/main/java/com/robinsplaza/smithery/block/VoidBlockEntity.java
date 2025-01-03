package com.robinsplaza.smithery.block;

import com.robinsplaza.smithery.Smithery;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EndPortalBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class VoidBlockEntity extends BlockEntity {
    public VoidBlockEntity(BlockPos pos, BlockState state) {
        super(Smithery.VOID_BLOCK_ENTITY_TYPE, pos, state);
    }
    public boolean shouldDrawSide(Direction direction) {
        assert this.world != null;
        return Block.shouldDrawSide(this.getCachedState(), this.world, this.getPos(), direction, this.getPos().offset(direction));
    }

    public int getDrawnSidesCount() {
        int i = 0;
        Direction[] var2 = Direction.values();
        int var3 = var2.length;

        for (Direction direction : var2) {
            i += this.shouldDrawSide(direction) ? 1 : 0;
        }

        return i;
    }
}

