package com.example.v1mod.registry;

import com.example.v1mod.V1Entity;
import com.example.v1mod.V1Mod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, V1Mod.MODID);

    public static final RegistryObject<EntityType<V1Entity>> V1 =
        ENTITY_TYPES.register("v1", () ->
            EntityType.Builder.of(V1Entity::new, MobCategory.MONSTER)
                .sized(0.6F, 1.95F)
                .build("v1mod:v1")
        );

    private ModEntities() {}
}
