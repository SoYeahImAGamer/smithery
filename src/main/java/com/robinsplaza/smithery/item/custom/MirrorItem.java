package com.robinsplaza.smithery.item.custom;

import net.minecraft.block.Portal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MirrorItem extends Item implements Portal {
    public MirrorItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, BlockPos pos){
        if (user.canUsePortals(true)) {
            if (!world.isClient && user instanceof ServerPlayerEntity) {
                ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            }
            user.tryUsePortal(this, pos);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Nullable
    @Override
    public TeleportTarget createTeleportTarget(ServerWorld world, Entity entity, BlockPos pos) {
        RegistryKey<World> registryKey = world.getRegistryKey();
        ServerWorld serverWorld = world.getServer().getWorld(registryKey);
        Vec3d vec3d;
        float f;
        if (serverWorld == null) {
            return null;
        } else {
            if (entity instanceof ServerPlayerEntity) {
                ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) entity;
                return serverPlayerEntity.getRespawnTarget(false, TeleportTarget.NO_OP);
            }

            vec3d = entity.getWorldSpawnPos(serverWorld, pos).toBottomCenterPos();
            f = entity.getYaw();
        }

        return new TeleportTarget(serverWorld, vec3d, entity.getVelocity(), f, entity.getPitch(), TeleportTarget.SEND_TRAVEL_THROUGH_PORTAL_PACKET.then(TeleportTarget.ADD_PORTAL_CHUNK_TICKET));
    }
}

