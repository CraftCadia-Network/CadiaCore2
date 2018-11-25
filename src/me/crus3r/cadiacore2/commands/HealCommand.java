package me.crus3r.cadiacore2.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor{
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if (sender instanceof Player) {
		
		if(label.equalsIgnoreCase("heal")) {
			
			if(args.length == 0) {
				
				player.setHealth(20);
				player.setFireTicks(0);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You have been healed.");
			}else if(args.length == 1) {
				
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				targetPlayer.setFireTicks(0);
				targetPlayer.setHealth(20);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Player " + ChatColor.YELLOW + targetPlayer.getName() + ChatColor.GREEN + "has been healed.");
				
			}
			
		}
		
		}
		return false;
		
	}
	


}
