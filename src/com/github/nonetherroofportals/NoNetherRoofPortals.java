package com.github.nonetherroofportals;

import org.bukkit.plugin.java.JavaPlugin;

public class NoNetherRoofPortals extends JavaPlugin {

    @Override
    public void onEnable()  {
        getServer().getPluginManager().registerEvents(new PortalListener(), this);
    }
}
