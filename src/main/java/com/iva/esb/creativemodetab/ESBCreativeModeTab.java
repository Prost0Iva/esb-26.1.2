package com.iva.esb.creativemodetab;

import com.iva.esb.ESB;
import com.iva.esb.block.ESBBlocks;
import com.iva.esb.item.ESBItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ESBCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ESB.MODID);

    public static final Supplier<CreativeModeTab> ESB_INGREDIENTS = CREATIVE_MODE_TABS.register("esb_ingredients", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ESBItems.CHARGED_COPPER_INGOT.get()))
            .title(Component.translatable("creativetab.esb.ingredients"))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ESBItems.CHARGED_COPPER_INGOT);
                output.accept(ESBItems.ICE_CRYSTAL);
            }))
            .build());

    public static final Supplier<CreativeModeTab> ESB_BOCKS = CREATIVE_MODE_TABS.register("esb_blocks", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ESBBlocks.LIVE_SPRUCE_PLANKS.get()))
            .title(Component.translatable("creativetab.esb.blocks"))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ESBBlocks.LIVE_SPRUCE_PLANKS);
            }))
            .build());

    public static final Supplier<CreativeModeTab> ESB_WEAPONS = CREATIVE_MODE_TABS.register("esb_weapons", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ESBItems.CHARGED_COPPER_SWORD.get()))
            .title(Component.translatable("creativetab.esb.weapons"))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ESBItems.CHARGED_COPPER_SWORD);
                output.accept(ESBItems.SPRUCE_CLEAVER);
            }))
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
