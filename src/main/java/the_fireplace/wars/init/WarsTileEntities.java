package the_fireplace.wars.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import the_fireplace.wars.tileentities.TileEntityBasicStructures;
import the_fireplace.wars.tileentities.TileEntityBuildingStructures;
import the_fireplace.wars.tileentities.TileEntityClassSelect;
import the_fireplace.wars.tileentities.TileEntityClassSelectDonator;
import the_fireplace.wars.tileentities.TileEntityGameStructures;
import the_fireplace.wars.tileentities.TileEntityHungerGames;
import the_fireplace.wars.tileentities.TileEntityHungerGamesLv2;
import the_fireplace.wars.tileentities.TileEntitySpleefStructures;
import the_fireplace.wars.tileentities.TileEntityTeleporter;

public abstract class WarsTileEntities {

	public static void createTileEntities() {
		GameRegistry.registerTileEntity(TileEntityTeleporter.class, "simpleTeleporter");
		GameRegistry.registerTileEntity(TileEntityHungerGames.class, "hungerGames");
		GameRegistry.registerTileEntity(TileEntityHungerGamesLv2.class, "hungerGamesLv2");
		//GameRegistry.registerTileEntity(TileEntityPlayerTNT.class, "playertnt");
		GameRegistry.registerTileEntity(TileEntityClassSelect.class, "containerInfo");
		GameRegistry.registerTileEntity(TileEntityClassSelectDonator.class, "containerInfo2");
		GameRegistry.registerTileEntity(TileEntityBasicStructures.class, "basicStructures");
		GameRegistry.registerTileEntity(TileEntitySpleefStructures.class, "spleefStructures");
		GameRegistry.registerTileEntity(TileEntityBuildingStructures.class, "buildingStructures");
		GameRegistry.registerTileEntity(TileEntityGameStructures.class, "gameStructures");
	}
}