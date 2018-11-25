package me.crus3r.cadiacore2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if (sender instanceof Player) {
		
			if(player.hasPermission("CadiaCore2.fly")) {
				
				if(player.isFlying() == true) {
					
					player.setAllowFlight(false);
					player.setFlying(false);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Disabled");
				}else {
					
					
					player.setAllowFlight(true);
					player.setFlying(true);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Enabled");
				}
				
				
				
			}
			
			
			
		}
		return false;
		
	}
	

}
