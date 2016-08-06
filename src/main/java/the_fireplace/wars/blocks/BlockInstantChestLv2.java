package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;

import java.util.Random;

public class BlockInstantChestLv2 extends Block {

	public BlockInstantChestLv2() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {
		if (!world.isRemote) {

			int i = pos.getX();
			int j = pos.getY();
			int k = pos.getZ();

			WarsMod.generateBlock(world, i, j, k, Blocks.chest);

			TileEntity chestTile = world.getTileEntity(pos);

			if (chestTile instanceof TileEntityChest) {

				Random random = new Random();

				for (int slot = 0; slot < 27; slot++) {

					int num = random.nextInt(275);

					if (num == 1) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.golden_helmet));
					}
					if (num == 2) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.golden_chestplate));
					}

					if (num == 5) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.golden_leggings));
					}

					if (num == 6) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.golden_boots));
					}
					if (num == 7) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.apple));
					}
					if (num == 8) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chicken));
					}
					if (num == 9) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bread));
					}
					if (num == 10) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.fish));
					}
					if (num == 11) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.iron_ingot));
					}
					if (num == 12) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));
					}
					if (num == 13) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));
					}
					if (num == 14) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chainmail_leggings));
					}
					if (num == 15) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chainmail_chestplate));
					}
					if (num == 16) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.chainmail_helmet));
					}
					if (num == 17) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.stick));
					}
					if (num == 18) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));
					}
					if (num == 19) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bowl));
					}
					if (num == 20) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));
					}
					if (num == 21) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.stone_axe));
					}
					if (num == 22) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.flint_and_steel));
					}
					if (num == 23) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.shears));
					}
					if (num == 24) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.bow));
					}
					if (num == 25) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.arrow, 2));
					}
					if (num == 26) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.fishing_rod));
					}

					if (num == 31) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));
					}
					if (num == 32) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));
					}
					if (num == 33) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_boots));
					}
					if (num == 34) {
						((TileEntityChest) chestTile).setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));
					}
				}
			}
		}
		return true;
	}
}
