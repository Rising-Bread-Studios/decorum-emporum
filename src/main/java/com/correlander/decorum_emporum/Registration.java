package com.correlander.decorum_emporum;

import com.correlander.decorum_emporum.blocks.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Registration {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DecorumEmporum.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DecorumEmporum.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DecorumEmporum.MODID);

    public static final DeferredBlock<SimpleBlock> SIMPLE_BLOCK = BLOCKS.register("breen_boblin", SimpleBlock::new);
    public static final DeferredItem<Item> SIMPLE_BLOCK_ITEM = ITEMS.register("breen_boblin", () -> new BlockItem(SIMPLE_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<ComplexBlock> COMPLEX_BLOCK = BLOCKS.register("breen_boblin_big_brother", ComplexBlock::new);
    public static final DeferredItem<Item> COMPLEX_BLOCK_ITEM = ITEMS.register("breen_boblin_big_brother", () ->
            new BlockItem(COMPLEX_BLOCK.get(), new Item.Properties()));
    public static final Supplier<BlockEntityType<ComplexBlockEntity>> COMPLEX_BLOCK_ENTITY = BLOCK_ENTITIES.register("breen_boblin_big_brother", () ->
            BlockEntityType.Builder.of(ComplexBlockEntity::new, COMPLEX_BLOCK.get()).build(null));

    public static void init(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BLOCK_ENTITIES.register(modEventBus);
    }

    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, Registration.COMPLEX_BLOCK_ENTITY.get(), (o, direction) -> o.getItemHandler());
    }

    static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(SIMPLE_BLOCK_ITEM);
            event.accept(COMPLEX_BLOCK_ITEM);
        }
    }
}