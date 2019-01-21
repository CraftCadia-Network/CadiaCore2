package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.crus3r.cadiacore2.User;
import net.md_5.bungee.api.ChatColor;

public class EnderchestCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("enderchest")) {
			if(player.hasPermission("cadiacore2.enderchest")) {
				
				player.closeInventory();
				player.openInventory(player.getEnderChest());
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN +"You have opened your ender chest.");
				
			}else {
				
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have permission!");
				
			}
		}
		return false;
	}

}
