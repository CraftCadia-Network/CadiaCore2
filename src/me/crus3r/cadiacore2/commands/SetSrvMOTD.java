package me.crus3r.cadiacore2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class SetSrvMOTD implements CommandExecutor{

	public static String motd = "MyServer";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;

		if(label.equalsIgnoreCase("setserverlist")) {
			
			if(player.hasPermission("cadiacore2.serverlist")) {
				
				if(args.length == 0) {
					
					sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "CadiaCore2: " + ChatColor.RED + "You must include a MOTD.");
					
				}else {
					
					motd = args[0];
					sender.sendMessage(ChatColor.GREEN + "SUccessfully set internal server MOTD to " + ChatColor.YELLOW + args[0]);
				}
				
			}
			
		}
		
		
		
		return false;
	}

	
	
}
