package net.hirukarogue.tutorialmod.block;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.block.custom.CornCropBlock;
import net.hirukarogue.tutorialmod.block.custom.GemPolisherBlock;
import net.hirukarogue.tutorialmod.block.custom.SoundBlock;
import net.hirukarogue.tutorialmod.block.custom.StrawberryCropBlock;
import net.hirukarogue.tutorialmod.item.ModItems;
import net.hirukarogue.tutorialmod.sound.ModSounds;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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

    //stais and slabs
    public static final RegistryObject<Block> SAPPHIRE_STAIRS =
            registerBlock("sapphire_stairs", () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_SLAB =
            registerBlock("sapphire_slab", () -> new SlabBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST)));

    //redstone funcions
    public static final RegistryObject<Block> SAPPHIRE_BUTTON =
            registerBlock("sapphire_button", () -> new ButtonBlock(BlockBehaviour.Properties
                    .copy(Blocks.STONE_BUTTON)
                    .sound(SoundType.AMETHYST), BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SAPPHIRE_PRESSURE_PLATE =
            registerBlock("sapphire_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST),BlockSetType.IRON));

    //fences and walls
    public static final RegistryObject<Block> SAPPHIRE_FENCE =
            registerBlock("sapphire_fence", () -> new FenceBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE =
            registerBlock("sapphire_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> SAPPHIRE_WALL =
            registerBlock("sapphire_wall", () -> new WallBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST)));

    //different blocks
    public static final RegistryObject<Block> CATMINT =
            registerBlock("catmint", () -> new FlowerBlock(() -> MobEffects.LUCK, 5, BlockBehaviour.Properties
                    .copy(Blocks.ALLIUM)
                    .noOcclusion()
                    .noCollission()));
    public static final RegistryObject<Block> POTTED_CATMINT =
            BLOCKS.register("potted_catmint", () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.CATMINT, BlockBehaviour.Properties
                    .copy(Blocks.POTTED_ALLIUM)
                    .noOcclusion()));

    //crops
    public static final RegistryObject<Block> STRAWBERRY_CROP =
            BLOCKS.register("strawberry_crop", () -> new StrawberryCropBlock(BlockBehaviour.Properties
                    .copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CORN_CROP =
            BLOCKS.register("corn_crop", () -> new CornCropBlock(BlockBehaviour.Properties
                    .copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //doors and trapdoors
    public static final RegistryObject<Block> SAPPHIRE_DOOR =
            registerBlock("sapphire_door", () -> new DoorBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> SAPPHIRE_TRAP_DOOR =
            registerBlock("sapphire_trap_door", () -> new TrapDoorBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));

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
                    .copy(Blocks.IRON_BLOCK).sound(ModSounds.SOUND_BLOCK_SOUNDS)));

    //Custom Block
    public static final RegistryObject<Block> GEM_POLSHER =
            registerBlock("gem_polisher", () -> new GemPolisherBlock(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK).noOcclusion()));

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
