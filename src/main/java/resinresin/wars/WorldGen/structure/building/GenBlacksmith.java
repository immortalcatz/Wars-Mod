package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.ResinresinLoader;

public class GenBlacksmith {

	public GenBlacksmith(EntityPlayer player, int i, int j, int k) {
		ResinresinLoader blacksmith = new ResinresinLoader("blacksmith.resinresin");

		blacksmith.generate(player.worldObj, i - 7, j - 1, k - 7, false);
	}

}
