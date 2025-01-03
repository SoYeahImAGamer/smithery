package com.robinsplaza.smithery.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.EndGatewayBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EndGatewayBlockEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VoidBlock extends BlockWithEntity {
    public static final MapCodec<VoidBlock> CODEC = createCodec(VoidBlock::new);
    public VoidBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VoidBlockEntity(pos, state);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof VoidBlockEntity) {
            int i = ((VoidBlockEntity)blockEntity).getDrawnSidesCount();

            for(int j = 0; j < i; ++j) {
                double d = (double)pos.getX() + random.nextDouble();
                double e = (double)pos.getY() + random.nextDouble();
                double f = (double)pos.getZ() + random.nextDouble();
                double g = (random.nextDouble() - 0.5) * 0.5;
                double h = (random.nextDouble() - 0.5) * 0.5;
                double k = (random.nextDouble() - 0.5) * 0.5;
                int l = random.nextInt(2) * 2 - 1;
                if (random.nextBoolean()) {
                    f = (double)pos.getZ() + 0.5 + 0.25 * (double)l;
                    k = (double)(random.nextFloat() * 2.0F * (float)l);
                } else {
                    d = (double)pos.getX() + 0.5 + 0.25 * (double)l;
                    g = (double)(random.nextFloat() * 2.0F * (float)l);
                }

                world.addParticle(ParticleTypes.PORTAL, d, e, f, g, h, k);
            }

        }
    }
}
