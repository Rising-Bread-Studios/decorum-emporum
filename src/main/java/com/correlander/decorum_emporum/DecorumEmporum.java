package com.correlander.decorum_emporum;

import com.correlander.decorum_emporum.datagen.DataGeneration;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DecorumEmporum.MODID)
public class DecorumEmporum {
    public static final String MODID = "decorum_emporum";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DecorumEmporum(IEventBus modEventBus) {
        //Registration.init(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(Registration::addCreative);
        modEventBus.addListener(DataGeneration::generate);
        modEventBus.addListener(Registration::registerCapabilities);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        //Common Setup Event.
        // LOGGER.info("HELLO FROM COMMON SETUP");
        // if (Config.logDirtBlock)
        //     LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        // LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
        // Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }
}