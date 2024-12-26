package net.hirukarogue.tutorialmod.block.entity;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<GemPolisherBlockEntity>> GEM_POLISHER_BE =
            BLOCK_ENTITIES.register("gem_polisher_be", () ->
                    BlockEntityType.Builder.of(GemPolisherBlockEntity::new,
                            ModBlocks.GEM_POLSHER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
