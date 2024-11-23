package net.hirukarogue.tutorialmod.datagen;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.block.ModBlocks;
import net.hirukarogue.tutorialmod.util.ModCustomTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Metal detector tag
        this.tag(ModCustomTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(Blocks.IRON_BARS).add(Blocks.IRON_DOOR).add(Blocks.IRON_TRAPDOOR)
                .add(Blocks.ANVIL).add(Blocks.CHAIN).add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.BLAST_FURNACE).add(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE).add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                .addTag(Tags.Blocks.ORES_COPPER).addTag(Tags.Blocks.STORAGE_BLOCKS_COPPER).addTag(Tags.Blocks.STORAGE_BLOCKS_RAW_COPPER)
                .addTag(Tags.Blocks.ORES_IRON).addTag(Tags.Blocks.STORAGE_BLOCKS_IRON).addTag(Tags.Blocks.STORAGE_BLOCKS_RAW_IRON)
                .addTag(Tags.Blocks.ORES_GOLD).addTag(Tags.Blocks.STORAGE_BLOCKS_GOLD).addTag(Tags.Blocks.STORAGE_BLOCKS_RAW_GOLD);

        //mineable with specific tool
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.SAPPHIRE_BLOCK.get(),
                ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                ModBlocks.SAPPHIRE_ORE.get(),
                ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                ModBlocks.END_SAPPHIRE_ORE.get()
        );
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                ModBlocks.SOUND_BLOCK.get()
        );

        //need tools sectios
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.NETHER_SAPPHIRE_ORE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.SAPPHIRE_ORE.get(),
                ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.SAPPHIRE_BLOCK.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.END_SAPPHIRE_ORE.get());
    }
}
