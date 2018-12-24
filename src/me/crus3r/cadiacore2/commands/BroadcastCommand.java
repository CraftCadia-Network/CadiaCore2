package me.crus3r.cadiacore2.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class BroadcastCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("broadcast") || label.equalsIgnoreCase("shout") || label.equalsIgnoreCase("!")) {
			
			Player player = (Player) sender;
			
			if (player.hasPermission("cadiacore2.broadcast")) {
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Usage: /broadcast <message>");
					
				}else if(args.length == 1){
					
					Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "]" + ChatColor.GREEN + " " + args[0]);
					
				}
				
				
			}
			
		}
		
		return false;
	}

}
