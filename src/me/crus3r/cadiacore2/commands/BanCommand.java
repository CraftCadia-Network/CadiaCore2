package me.crus3r.cadiacore2.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class BanCommand implements CommandExecutor{

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("cadiacore2.ban")) {
			
			if(label.equalsIgnoreCase("ban")) {
				
				if(args.length == 0) {
					
					player.sendMessage(ChatColor.RED + "Wrong Usage, man. Try: /ban <name> <reason>");
					
				}else if (args.length == 1) {
					
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.kickPlayer(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You have been banned!" + ChatColor.RED + "Reason: Not Specified");
					targetPlayer.setBanned(true);
					
					
				}else if(args.length == 2) {
					
					
					
				}
				
			}
			
		}
		return false;
	}

}
