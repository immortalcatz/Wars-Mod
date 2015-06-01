package resinresin.wars.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import resinresin.wars.warsmod;

public class BlockInstantChestLv2 extends Block {

	public BlockInstantChestLv2() {
		super(Material.iron);
		setCreativeTab(warsmod.tabWarsBlocks);
	}

	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		world.setBlock(i + 0, j + 0, k + 0, Block.chest.blockID, 2, 2);
		TileEntityChest chest2 = new TileEntityChest();

		world.setBlockTileEntity(i + 0, j + 0, k + 0, chest2);

		Random random = new Random();

		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {

			int num = random.nextInt(275);

			if (num == 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_helmet));

			}
			if (num == 2) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_chestplate));

			}

			if (num == 5) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_leggings));

			}

			if (num == 6) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.golden_boots));

			}
			if (num == 7) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.apple));

			}
			if (num == 8) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chicken));

			}
			if (num == 9) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bread));

			}
			if (num == 10) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.fish));

			}
			if (num == 11) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.iron_ingot));

			}
			if (num == 12) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));

			}
			if (num == 13) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_boots));

			}
			if (num == 14) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_leggings));

			}
			if (num == 15) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_chestplate));

			}
			if (num == 16) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.chainmail_helmet));

			}
			if (num == 17) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stick));

			}
			if (num == 18) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.gold_ingot));

			}
			if (num == 19) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bowl));

			}
			if (num == 20) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.wooden_sword));

			}
			if (num == 21) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.stone_axe));

			}
			if (num == 22) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.flint_and_steel));

			}
			if (num == 23) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.shears));

			}
			if (num == 24) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.bow));

			}
			if (num == 25) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.arrow, 2));

			}
			if (num == 26) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.fishing_rod));

			}

			if (num == 31) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_helmet));

			}
			if (num == 32) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_chestplate));

			}
			if (num == 33) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_boots));

			}
			if (num == 34) {
				chest2.setInventorySlotContents(slot, new ItemStack(Items.leather_leggings));

			}

		}
		return blockConstructorCalled;
	}

}