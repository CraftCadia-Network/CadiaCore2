package me.crus3r.cadiacore2.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
			if(player.hasPermission("cadiacore2.gamemode")) {
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Invalid Argument.");
					
				}else if(args.length == 1) {
					
					if(args[1] == "creative") {
						
						player.setGameMode(GameMode.CREATIVE);
						
					}else if(args[0] == "survival") {
						
						player.setGameMode(GameMode.SURVIVAL);
						
					}
					
				}
				
			}else {
				
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have sufficient permission to do that command.");
				
			}
			
			
		}
		return false;
	}
	
	
	

}
