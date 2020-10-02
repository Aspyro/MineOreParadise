package MineOreParadise.common.Blocks;

import MineOreParadise.FirstClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = FirstClass.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {

	@ObjectHolder(MineOreParadise.FirstClass.MOD_ID + ":copper_ore")
	public static final Block COPPER_ORE = null;

	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK)).setRegistryName("copper_ore"));
	}

	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		event.getRegistry()
				.register(new BlockItem(COPPER_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS))
						.setRegistryName(COPPER_ORE.getRegistryName()));
	}

}
