package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FeedCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (player.hasPermission("cadiacore2.feed")) {
			
			if(label.equalsIgnoreCase("feed")) {
				
				if(args.length == 0) {
					
					player.setFoodLevel(20);
					
				}else if(args.length == 1) {
					
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.setFoodLevel(20);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.YELLOW + targetPlayer.getName() + ChatColor.GREEN + "'s hunger was sated.");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Your hunger no longer exists.");
				}
				
			}
			
		}
		return false;
	}

}
