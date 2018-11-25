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
				
				if(label.equalsIgnoreCase("gamemode 1") || label.equalsIgnoreCase("gmc") || label.equalsIgnoreCase("gm1") || label.equalsIgnoreCase("gm c") || label.equalsIgnoreCase("gm 1") || label.equalsIgnoreCase("gamemode creative")) {
					
					if(args.length == 0) {
						
						player.setGameMode(GameMode.CREATIVE);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to creative for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.setGameMode(GameMode.CREATIVE);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to creative for " + ChatColor.YELLOW + targetPlayer.getName());
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to creative.");
					}
					
				}
				
				if(label.equalsIgnoreCase("gamemode 0") || label.equalsIgnoreCase("gms") || label.equalsIgnoreCase("gm0") || label.equalsIgnoreCase("gm ss") || label.equalsIgnoreCase("gm 0") || label.equalsIgnoreCase("gamemode survival")) {
					
					if(args.length == 0) {
						
						player.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to survival for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to survival for " + ChatColor.YELLOW + targetPlayer.getName());
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to survival.");
					}
					
				}
				if(label.equalsIgnoreCase("gamemode 2") || label.equalsIgnoreCase("gma") || label.equalsIgnoreCase("gm2") || label.equalsIgnoreCase("gm a") || label.equalsIgnoreCase("gm 2") || label.equalsIgnoreCase("gamemode adventure")) {
					
					if(args.length == 0) {
						
						player.setGameMode(GameMode.ADVENTURE);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to adventure for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.setGameMode(GameMode.ADVENTURE);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to adventure for " + ChatColor.YELLOW + targetPlayer.getName());
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to adventure.");
					}
					
				}
				if(label.equalsIgnoreCase("gamemode 3") || label.equalsIgnoreCase("gmsp") || label.equalsIgnoreCase("gm3") || label.equalsIgnoreCase("gm sp") || label.equalsIgnoreCase("gm 3") || label.equalsIgnoreCase("gamemode spectator")) {
					
					if(args.length == 0) {
						
						player.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to spectator for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to spectator for " + ChatColor.YELLOW + targetPlayer.getName());
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Gamemode set to spectator.");
					}
					
				}
				
			}else {
				
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have sufficient permission to do that command.");
				
			}
			
			
		}
		return false;
	}
	
	
	

}
