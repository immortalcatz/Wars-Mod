package resinresin.wars.Items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.warsmod;

public class ItemAncientEmblem extends Item {
	public ItemAncientEmblem() { 
		super();
		this.setCreativeTab(warsmod.tabWarsItems); 
													
													

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.EPIC;
	}

}