package me.crus3r.cadiacore2;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.crus3r.cadiacore2.commands.FlyCommand;

public class CadiaCore2 extends JavaPlugin{

	public void onEnable() {
		
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nCadiaCore2 Loaded.\n\n--------------------oOo--------------------");
		this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
	}
	
	public void onDisable() {
		
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nCadiaCore2 Disabled..\n\n--------------------oOo--------------------");
		
	}
	
}
