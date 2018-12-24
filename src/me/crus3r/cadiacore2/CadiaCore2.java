package me.crus3r.cadiacore2;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


import me.crus3r.cadiacore2.permissions.eventListener;
import me.crus3r.cadiacore2.commands.BroadcastCommand;
import me.crus3r.cadiacore2.commands.EnderchestCommand;
import me.crus3r.cadiacore2.commands.FeedCommand;
import me.crus3r.cadiacore2.commands.FlyCommand;
import me.crus3r.cadiacore2.commands.GamemodeCommand;
import me.crus3r.cadiacore2.commands.HatCommand;
import me.crus3r.cadiacore2.commands.HealCommand;
import me.crus3r.cadiacore2.commands.TpCommand;
import me.crus3r.cadiacore2.commands.WorkbenchCommand;

public class CadiaCore2 extends JavaPlugin implements Listener{

	public final Logger logger = Logger.getLogger("Minecraft");
	public static CadiaCore2 plugin;
	
	public void log(String string) {
		
		System.out.println(string);
		
	}
	
	
	public void registerListeners() {
		
		
		
	}
	
	
	@Override
	public void onEnable() {
			
		plugin = this;
		this.getServer().getPluginManager().registerEvents(this, this);
		
		commandExecutor();
		registerListeners();
		this.saveDefaultConfig();
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nCadiaCore2 Loaded.\n\n--------------------oOo--------------------");
		
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nCadiaCore2 Disabled..\n\n--------------------oOo--------------------");
		
	}
		

	public void commandExecutor() {
		this.getCommand("heal").setExecutor((CommandExecutor)new HealCommand());
		//Referencing a public void method because of all the commands required. I will do this often
		broadcastCmd();
		this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
		this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("hat").setExecutor((CommandExecutor)new HatCommand());
		this.getCommand("tp").setExecutor((CommandExecutor)new TpCommand());
		this.getCommand("workbench").setExecutor((CommandExecutor)new WorkbenchCommand());
		this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCommand());
		//Referencing a public void method because of all the commands required. Its alot :P
		enderCmd();
		this.getCommand("feed").setExecutor((CommandExecutor)new FeedCommand());
	}
	
public void broadcastCmd() {
	
		this.getCommand("broadcast").setExecutor((CommandExecutor)new BroadcastCommand());
		this.getCommand("shout").setExecutor((CommandExecutor)new BroadcastCommand());
	
}
	
	public void enderCmd() {
		
		this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCommand());
		this.getCommand("ender").setExecutor((CommandExecutor)new EnderchestCommand());
		this.getCommand("ec").setExecutor((CommandExecutor)new EnderchestCommand());
		
	}
	
	@EventHandler
	public void breakBlock(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		if(!player.hasPermission("cadiacore2.breakblock")) {
			
			event.setCancelled(true);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Hey! You cant do that!");
		}
		
	}
	
	
	
	
}
