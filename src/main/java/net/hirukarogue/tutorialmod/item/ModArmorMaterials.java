package net.hirukarogue.tutorialmod.item;

import net.hirukarogue.tutorialmod.TutorialMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    SAPPHIRE("sapphire", 26, new int[]{ 5, 7, 5, 4 }, 25,
            SoundEvents.ARMOR_EQUIP_GOLD, 1f, 0f, () -> Ingredient.of(ModItems.SAPPHIRE.get()));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float thoughness;
    private final float knockBackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue,
                      SoundEvent equipSound, float thoughness, float knockBackResistance,
                      Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.thoughness = thoughness;
        this.knockBackResistance = knockBackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TutorialMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.thoughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockBackResistance;
    }
}
