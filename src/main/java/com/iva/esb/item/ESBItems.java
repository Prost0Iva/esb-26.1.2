package com.iva.esb.item;

import com.iva.esb.ESB;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ESBItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ESB.MODID);

    public static final DeferredItem<Item> CHARGED_COPPER_INGOT = ITEMS.registerSimpleItem("charged_copper_ingot");
    public static final DeferredItem<Item> ICE_CRYSTAL = ITEMS.registerSimpleItem("ice_crystal");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
