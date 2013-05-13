package me.rawtech.nophysics;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RawTechNoPhysics extends JavaPlugin {
	
	private BlockListener bListener = new BlockListener(this);
	
	public void onEnable()
	{		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(bListener, this);
	}

}
