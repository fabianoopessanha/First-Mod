package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEM = DeferredRegister
            .createItems(ExampleMod.MODID);
    public static final DeferredRegister.Blocks BLOCK = DeferredRegister //Cria a fila de blocos a serem registrados
            .createBlocks(ExampleMod.MODID);
    public static final DeferredItem<Item> SAPPHIRE = ITEM
            .registerItem("sapphire", properties -> new Item(properties.stacksTo(16)));
    public static final DeferredItem<Item> RUBY = ITEM
            .registerItem("ruby", Item::new);
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = BLOCK // Bloco de sapphire
            .registerBlock("sapphire", Block::new);
}