package me.crus3r.cadiacore2;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.crus3r.cadiacore2.commands.EnderchestCommand;
import me.crus3r.cadiacore2.commands.FlyCommand;
import me.crus3r.cadiacore2.commands.GamemodeCommand;
import me.crus3r.cadiacore2.commands.HatCommand;
import me.crus3r.cadiacore2.commands.HealCommand;
import me.crus3r.cadiacore2.commands.TpCommand;
import me.crus3r.cadiacore2.commands.WorkbenchCommand;

public class CadiaCore2 extends JavaPlugin{

	public final Logger logger = Logger.getLogger("Minecraft");
	public static CadiaCore2 plugin;
	
	@Override
	public void onEnable() {
			
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nCadiaCore2 Loaded.\n\n--------------------oOo--------------------");
		this.getCommand("heal").setExecutor((CommandExecutor)new HealCommand());
		this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
		this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("hat").setExecutor((CommandExecutor)new HatCommand());
		this.getCommand("tp").setExecutor((CommandExecutor)new TpCommand());
		this.getCommand("workbench").setExecutor((CommandExecutor)new WorkbenchCommand());
		this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCommand());
		enderCmd();
	}
	
	@Override
	public void onDisable() {
		
		PluginDescriptionFile pdfFile = this.getDescription();
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nCadiaCore2 Disabled..\n\n--------------------oOo--------------------");
		
	}
	
	public void enderCmd() {
		
		this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCommand());
		this.getCommand("ender").setExecutor((CommandExecutor)new EnderchestCommand());
		this.getCommand("ec").setExecutor((CommandExecutor)new EnderchestCommand());
		
	}
	
}
