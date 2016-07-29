package the_fireplace.wars.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.registry.WarsItems;

public class BlockWaterOre extends Block {

	public BlockWaterOre() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	
	@Override 
	public Item getItemDropped(IBlockState state, Random random, int j) {
		return WarsItems.waterGem;
	}
	
	
	@Override
	public int quantityDropped(Random random) {
		return 1;

	}

}