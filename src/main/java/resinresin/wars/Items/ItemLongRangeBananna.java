package resinresin.wars.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLongRangeBananna extends ItemFood {
	public ItemLongRangeBananna(int par2) {
		super(par2, false);
		this.setMaxStackSize(3);
	}

	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.getFoodStats().addStats(this, itemStack);
		world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		itemStack.stackSize--;

		entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10 * 20, 1));
		entityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 10 * 20, 6));

		return itemStack;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

}