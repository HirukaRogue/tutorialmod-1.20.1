package net.hirukarogue.tutorialmod.block;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.block.custom.SoundBlock;
import net.hirukarogue.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    //basic block setup
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);



    //normal blocks
    public static final RegistryObject<Block> SAPPHIRE_BLOCK =
            registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK =
            registerBlock("raw_sapphire_block", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.STONE)));

    //ore blocks
    public static final RegistryObject<Block> SAPPHIRE_ORE =
            registerBlock("sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .sound(SoundType.STONE)
                    .strength(2f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE =
            registerBlock("deepslate_sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .strength(3f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE =
            registerBlock("nether_sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,5)));
    public static final RegistryObject<Block> END_SAPPHIRE_ORE =
            registerBlock("end_sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.END_STONE)
                    .sound(SoundType.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,8)));

    //advanced Blocks
    public static final RegistryObject<Block> SOUND_BLOCK =
            registerBlock("sound_block", () -> new SoundBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)));


    //setup methods
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
