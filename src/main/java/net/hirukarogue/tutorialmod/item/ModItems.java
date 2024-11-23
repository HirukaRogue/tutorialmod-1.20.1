package net.hirukarogue.tutorialmod.item;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.block.custom.FuelItem;
import net.hirukarogue.tutorialmod.item.custom.MetalDetectorItem;
import net.hirukarogue.tutorialmod.item.custom.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //items setup
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //items
    public static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE =
            ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    //advanced items
    public static final RegistryObject<Item> METAL_DETECTOR =
            ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    //food items
    public static final RegistryObject<Item> STRAWBERRY =
            ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    //fuel items
    public static final RegistryObject<Item> PINE_CONE =
            ITEMS.register("pine_cone", () -> new FuelItem(new Item.Properties(), 400));

    //item method setup
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
