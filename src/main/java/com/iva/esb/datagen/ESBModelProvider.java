package com.iva.esb.datagen;

import com.iva.esb.ESB;
import com.iva.esb.item.ESBItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ESBModelProvider extends ModelProvider {
    public ESBModelProvider(PackOutput output) {
        super(output, ESB.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ESBItems.CHARGED_COPPER_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ESBItems.ICE_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }
}
