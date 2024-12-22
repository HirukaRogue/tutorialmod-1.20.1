package net.hirukarogue.tutorialmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.hirukarogue.tutorialmod.block.ModBlocks;
import net.hirukarogue.tutorialmod.villager.ModVillagers;
import net.hirukarogue.tutorialmod.item.ModItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.STRAWBERRY.get(), 12),
                    10, 8, 0.02f
            ));

            //Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(ModItems.CORN.get(), 6),
                    10, 8, 0.035f
            ));
        }

        if (event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //Level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.GOLD_INGOT, 30),
                    new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                    10,8,0.05f
            ));
        }

        if (event.getType() == VillagerProfession.LIBRARIAN) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 2));

            //Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    enchantedBook,
                    10,8,0.05f
            ));
        }

        if (event.getType() == ModVillagers.SOUND_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(Items.JUKEBOX, 1),
                    3,8,0.08f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.NOTE_BLOCK, 1),
                    20,8,0.08f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ModBlocks.SOUND_BLOCK.get(), 1),
                    20,8,0.08f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.MUSIC_DISC_5, 1),
                    20,8,0.08f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 7),
                    new ItemStack(Items.MUSIC_DISC_11, 1),
                    20,8,0.08f
            ));

            // level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(Items.MUSIC_DISC_13, 1),
                    20,8,0.08f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(Items.MUSIC_DISC_BLOCKS, 1),
                    20,8,0.08f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 13),
                    new ItemStack(Items.MUSIC_DISC_CHIRP, 1),
                    20,8,0.08f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(Items.MUSIC_DISC_CAT, 1),
                    20,8,0.08f
            ));

            //level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 18),
                    new ItemStack(Items.MUSIC_DISC_FAR, 1),
                    20,8,0.08f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 23),
                    new ItemStack(Items.MUSIC_DISC_MALL, 1),
                    20,8,0.08f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 24),
                    new ItemStack(Items.MUSIC_DISC_MELLOHI, 1),
                    20,8,0.08f
            ));

            //level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_STRAD, 1),
                    20,8,0.08f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 30),
                    new ItemStack(Items.MUSIC_DISC_RELIC, 1),
                    20,8,0.08f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_STAL, 1),
                    20,8,0.08f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_WAIT, 1),
                    20,8,0.08f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_WARD, 1),
                    20,8,0.08f
            ));

            //level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    20,8,0.08f
            ));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 29),
                    new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                    20,8,0.08f
            ));
        }

    }

    @SubscribeEvent
    public static void CustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 12),
                new ItemStack(ModItems.RAW_SAPPHIRE.get(), 30),
                10,2,0.2f
        ));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 30),
                new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
                2,12,0.15f
        ));
    }
}
