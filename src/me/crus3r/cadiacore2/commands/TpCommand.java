package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class TpCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("cadiacore2.tp")) {
			
			if(label.equalsIgnoreCase("tp")) {
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Usage: /tp <player>");
					
				}else if(args.length == 1) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					player.teleport(targetPlayer);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You have been teleported to " + ChatColor.YELLOW + targetPlayer.getName());
					targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.YELLOW + player.getName() + ChatColor.GREEN + " has teleported to you.");
				}
				
			}
			
		}else {
			
			player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have permission!");
			
		}
		return false;
	}

}
