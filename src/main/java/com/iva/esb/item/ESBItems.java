package com.iva.esb.item;

import com.iva.esb.ESB;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ESBItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ESB.MODID);

    public static final DeferredItem<Item> CHARGED_COPPER_INGOT = ITEMS.registerSimpleItem("charged_copper_ingot");
    public static final DeferredItem<Item> ICE_CRYSTAL = ITEMS.registerSimpleItem("ice_crystal",
            properties -> new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final DeferredItem<Item> CHARGED_COPPER_SWORD = ITEMS.registerSimpleItem("charged_copper_sword",
            properties -> new Item.Properties()
                    .sword(ToolMaterial.COPPER, 3.5f, -2.6f)
                    .durability(895)
    );
    public static final DeferredItem<Item> SPRUCE_CLEAVER = ITEMS.registerSimpleItem("spruce_cleaver",
            properties -> new Item.Properties()
                    .sword(ToolMaterial.WOOD, 7f, -2.8f)
                    .durability(145)
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
