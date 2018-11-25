package me.crus3r.cadiacore2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.crus3r.cadiacore2.User;

public class TpaCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("cadiacore2.tpa")) {
			if(args.length < 1) {
				player.sendMessage(ChatColor.RED + "Usage: /tpa <player>");
			}
			if(player.getName().equalsIgnoreCase(player.getName())) {
				player.sendMessage(ChatColor.RED + "Usage: /tpa <player>");
			}
		}
		
		return false;
	}

	
	
	
}
