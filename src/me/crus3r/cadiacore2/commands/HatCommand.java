package me.crus3r.cadiacore2.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import net.md_5.bungee.api.ChatColor;

public class HatCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
	if(player.hasPermission("cadiacore2.hat")) {
		
	if(label.equalsIgnoreCase("hat")) {
			
			if((args.length > 0) && ((args[0].contains("rem")) || (args[0].contains("off")) || (args[0].equalsIgnoreCase("0")))) {
				
				PlayerInventory inv = player.getInventory();
				ItemStack head = inv.getHelmet();
				if((head == null) || (head.getType() == Material.AIR)) {
					
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Your hat is empty.");
					
				}else {
					
					ItemStack air = new ItemStack(Material.AIR);
					inv.setHelmet(air);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Your hat has been removed.");
					
				}
				
			}else if(player.getItemInHand().getType() != Material.AIR) {
				
				ItemStack hand = player.getItemInHand();
				if(hand.getType().getMaxDurability() == 0) {
					
					PlayerInventory inv = player.getInventory();
					ItemStack head = inv.getHelmet();
					inv.setHelmet(hand);
					inv.setItemInHand(head);
					player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Your hat has been placed.");
					
				}
				
			}
			
		}
		
	}else {
		
		player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "You do not have permission!");
		
	}
	
		
		return false;
	}
	
	
}
