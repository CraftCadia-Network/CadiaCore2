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
					
				}else if(args.length == 0) {
					
					GameMode targetGameMode = this.convertToGamemode(args[0]);
					if (targetGameMode.equals(null)) {
						player.sendMessage(ChatColor.RED + "Gamemode not found!");
						return false;
					}
					player.setGameMode(targetGameMode);
					String gameModeName = targetGameMode.toString().substring(0, 1).toUpperCase() + targetGameMode.toString().substring(1).toLowerCase();
					player.sendMessage(ChatColor.GREEN + "Your gamemode has been changed to " + gameModeName);
				}
				
			}else {
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have sufficient permission to do that command.");
			}	
		}
		return false;
	}
	
	public GameMode convertToGamemode(String input) {
		input = input.toLowerCase();
		switch (input) {
			case "c":
				return GameMode.CREATIVE;
			case "creative":
				return GameMode.CREATIVE;
			case "1":
				return GameMode.CREATIVE;
			case "survival":
				return GameMode.SURVIVAL;
			case "s":
				return GameMode.SURVIVAL;
			case "0":
				return GameMode.SURVIVAL;
			case "adventure":
				return GameMode.ADVENTURE;
			case "a":
				return GameMode.ADVENTURE;
			case "2":
				return GameMode.ADVENTURE;
			default:
				return null;
		}
					
	}
	

}
