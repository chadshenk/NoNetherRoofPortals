package com.github.nonetherroofportals;

import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

import java.util.List;

public class PortalListener implements Listener {

    @EventHandler
    public void onPortalCreate(PortalCreateEvent event) {
        if (event.getWorld().getEnvironment() == World.Environment.NETHER) {
            List<BlockState> blocks = event.getBlocks();

            for (final BlockState block : blocks) {
                if  (block.getY() >= 128) {
                    if (event.getEntity() instanceof Player)   {
                        event.getEntity().sendMessage("§4Cannot create portal above nether bedrock.");
                    }
                    event.setCancelled(true);
                    return;
                }
            }
        }
    }
}
