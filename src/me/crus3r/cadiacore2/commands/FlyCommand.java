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
		if(label.equalsIgnoreCase("fly")) {
			
			if(player.hasPermission("CadiaCore2.fly")) {
				
				if(player.isFlying() == false) {
					
					if(args.length == 0) {
						player.setAllowFlight(true);
						player.setFlying(true);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Enabled for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.setAllowFlight(true);
						targetPlayer.setFlying(true);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Enabled for " + ChatColor.YELLOW + player.getName());
						targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Enabled for " + ChatColor.YELLOW + player.getName());
					}
					
				}else if(player.isFlying() == true) {
					
					if(args.length == 0) {
						player.setAllowFlight(false);
						player.setFlying(false);
						player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Disabled for " + ChatColor.YELLOW + player.getName());
					}else if(args.length == 1) {
						
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						if(targetPlayer.isOnline() == true) {
							
							targetPlayer.setAllowFlight(false);
							targetPlayer.setFlying(false);
							player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Disabled for " + ChatColor.YELLOW + player.getName());
							targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Fly Disabled for " + ChatColor.YELLOW + player.getName());
							
						}else if(targetPlayer.isOnline() == false) {
							
							player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Target player is not online.");
							
						}
						
					}
					
				}
				
				
				
				
			}
			
		}else {
			
			player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have permission!");
			
		}
			
			
		}
		return false;
		
	}
	

}
