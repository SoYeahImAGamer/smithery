package com.robinsplaza.smithery.world;

import com.robinsplaza.smithery.Smithery;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> QUICKSILVER_ORE_PLACED = registerKey("quicksilver_ore_placed");

    public static void boostrap(BootstrapContext<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, NETHER_RUBY_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, //VeinsPerChunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(88), VerticalAnchor.absolute(126))));
        register(context, QUICKSILVER_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUICKSILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, //VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(126))));


    }


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Smithery.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
