package net.hirukarogue.tutorialmod.item;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.hirukarogue.tutorialmod.util.ModCustomTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 5,
                    ModCustomTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
}
