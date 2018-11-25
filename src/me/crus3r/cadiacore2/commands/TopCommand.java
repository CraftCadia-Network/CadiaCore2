package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TopCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("cadiacore2.top")) {
			
			if(label.equalsIgnoreCase("top")) {
				
				int topX = player.getLocation().getBlockX();
				int topZ = player.getLocation().getBlockZ();
				float pitch = player.getLocation().getPitch();
				float yaw = player.getLocation().getYaw();
					//Need Additional Classes. Taking a break from this class.
				
			}
			
		}
		
		return false;
	}

}
