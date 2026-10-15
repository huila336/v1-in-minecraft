package com.example.v1mod;

import com.example.v1mod.registry.ModEntities;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(V1Mod.MODID)
public class V1Mod {
    public static final String MODID = "v1mod";

    public V1Mod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITY_TYPES.register(bus);
    }
}
