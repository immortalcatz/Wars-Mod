package the_fireplace.wars.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.tileentities.TileEntityGameStructures;

public class BlockSelectorGames extends BlockContainer {

	public BlockSelectorGames() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	@Override
	public int getRenderType()
	{
		return 3;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		TileEntity te = world.getTileEntity(pos);
		if (te == null || player.isSneaking()) {
			return false;
		}
		FMLNetworkHandler.openGui(player, WarsMod.instance, 7, world, x, y, z);
		return true;
	}


	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityGameStructures();
	}

}
