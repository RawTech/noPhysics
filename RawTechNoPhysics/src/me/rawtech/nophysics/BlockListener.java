package me.rawtech.nophysics;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockSpreadEvent;

public class BlockListener implements Listener  {
	
	public static RawTechNoPhysics plugin;

	public BlockListener(RawTechNoPhysics instance)
	{
		plugin = instance;
	}
	
	@EventHandler
	public void onBlockSpread(BlockSpreadEvent event)
	{
        if (event.getNewState().getType() == Material.FIRE) event.setCancelled(true);
    }
	
	@EventHandler
	public void onBlockBurn(BlockBurnEvent event)
	{
		event.setCancelled(true);
	}
	
	@EventHandler
	public void onBlockFade(BlockFadeEvent event)
	{
		event.setCancelled(true);
	}
	
	@EventHandler
	public void onBlockGrow(BlockGrowEvent event)
	{
		event.setCancelled(true);
	}

}
