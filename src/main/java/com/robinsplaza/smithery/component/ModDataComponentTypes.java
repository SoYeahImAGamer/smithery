package com.robinsplaza.smithery.component;

import com.robinsplaza.smithery.Smithery;
import java.util.function.UnaryOperator;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModDataComponentTypes {
    public static final DataComponentType<BlockPos> COORDINATES =
            register("coordinates", builder -> builder.persistent(BlockPos.CODEC));


    private static <T>DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name),
                builderOperator.apply(DataComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        Smithery.LOGGER.info("Registering Data Component Types for " + Smithery.MOD_ID);
    }
}