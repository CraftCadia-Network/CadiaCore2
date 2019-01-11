package me.crus3r.cadiacore2.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class vanishCommand implements CommandExecutor{

	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("vanish") || label.equalsIgnoreCase("v")) {
			Player player = (Player) sender;
			
			if(player.hasPermission("CadiaCore2.vanish")) {
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Usage: /vanish <name>");
					
				}else if(args.length == 1) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.hidePlayer(targetPlayer);
					
					
				}
				
			}
			
		}
		return false;
	}

}
