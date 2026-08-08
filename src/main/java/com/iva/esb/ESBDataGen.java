package com.iva.esb;

import com.iva.esb.datagen.ESBBlockLootTableProvider;
import com.iva.esb.datagen.ESBBlockTagsProvider;
import com.iva.esb.datagen.ESBModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;

@EventBusSubscriber(modid = ESB.MODID)
public class ESBDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();

        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ESBModelProvider(packOutput));
        generator.addProvider(true, new ESBBlockTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ESBBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
    }
}
