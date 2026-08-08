package com.iva.esb.datagen;

import com.iva.esb.block.ESBBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ESBBlockLootTableProvider extends BlockLootSubProvider {
    public ESBBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ESBBlocks.LIVE_SPRUCE_PLANKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ESBBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
