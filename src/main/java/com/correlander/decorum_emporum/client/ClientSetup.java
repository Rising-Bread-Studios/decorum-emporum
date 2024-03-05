package com.correlander.decorum_emporum.client;

import com.correlander.decorum_emporum.Registration;
import com.correlander.decorum_emporum.client.rendering.ComplexBlockRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import static com.correlander.decorum_emporum.DecorumEmporum.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    //Registering the renderers and telling minecraft that whenever a new instance of a BE is made to use the specified renderer
    @SubscribeEvent
    public static void initClient(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(Registration.COMPLEX_BLOCK_ENTITY.get(), ComplexBlockRenderer::new);
    }
}
