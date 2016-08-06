package the_fireplace.wars.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import the_fireplace.wars.WarsMod;
import the_fireplace.wars.worldgen.ResinresinLoader;

public class BlockRoadPiece extends Block {

	public BlockRoadPiece() {
		super(Material.iron);
		setCreativeTab(WarsMod.tabWarsBlocks);
	}

	ResinresinLoader road = new ResinresinLoader("roadPiece.resinresin");

	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float par7, float par8, float par9) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		WarsMod.generateBlock(world, i, j, k, Blocks.air);
		road.generate(world, i, j - 1, k, true);
		return true;
	}
}
