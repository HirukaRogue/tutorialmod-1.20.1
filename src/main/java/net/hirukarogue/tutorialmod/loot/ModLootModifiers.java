package net.hirukarogue.tutorialmod.loot;

import com.mojang.serialization.Codec;
import net.hirukarogue.tutorialmod.TutorialMod;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> MOD_LOOT_MODFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, TutorialMod.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            MOD_LOOT_MODFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_SUS_SAND_ITEM =
            MOD_LOOT_MODFIER_SERIALIZERS.register("add_sus_sand_item", AddSusSandItemModifier.CODEC);

    public static void register(IEventBus eventBus) {
        MOD_LOOT_MODFIER_SERIALIZERS.register(eventBus);
    }
}
