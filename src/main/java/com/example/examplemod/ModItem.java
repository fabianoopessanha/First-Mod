package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEM = DeferredRegister
            .createItems(ExampleMod.MODID);
    public static final DeferredItem<Item> SAPPHIRE = ITEM
            .registerItem("sapphire", properties -> new Item(properties.stacksTo(16)));
}