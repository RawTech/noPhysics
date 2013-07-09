package me.rawtech.nophysics;

import org.bukkit.plugin.java.JavaPlugin;

public class RawTechNoPhysics extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BlockListener(), this);
    }
}
