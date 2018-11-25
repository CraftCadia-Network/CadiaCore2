package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class WorkbenchCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("cadiacore2.workbench")) {
			
			if(label.equalsIgnoreCase("workbench")) {
				
				player.openWorkbench(null, true);
				
			}
			
		}else {
			
			player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have permission!");
			
		}
		
		return false;
	}

}
