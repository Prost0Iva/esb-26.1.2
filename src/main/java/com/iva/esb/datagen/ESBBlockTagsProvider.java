package com.iva.esb.datagen;

import com.iva.esb.ESB;
import com.iva.esb.block.ESBBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ESBBlockTagsProvider extends BlockTagsProvider {
    public ESBBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ESB.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ESBBlocks.LIVE_SPRUCE_PLANKS.get());
        tag(BlockTags.PLANKS)
                .add(ESBBlocks.LIVE_SPRUCE_PLANKS.get());
    }
}
