package me.crus3r.cadiacore2;

import java.util.logging.Logger;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.crus3r.cadiacore2.commands.GamemodeCommand;

public class gamemodeGetCommand extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static CadiaCore2 plugin;
	
	public void gamemodeCmd() {
		
		this.getCommand("gamemode 1").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gmc").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode creative").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 1").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm c").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 0").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gms").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode survival").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 0").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm s").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 2").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gma").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode adventure").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 2").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm a").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode 3").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gmsp").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gamemode spectator").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm 3").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("gm sp").setExecutor((CommandExecutor)new GamemodeCommand());
		
		
	}
	


}
