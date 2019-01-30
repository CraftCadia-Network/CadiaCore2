package me.crus3r.cadiacore2;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


import me.crus3r.cadiacore2.commands.BroadcastCommand;
import me.crus3r.cadiacore2.commands.EnderchestCommand;
import me.crus3r.cadiacore2.commands.FeedCommand;
import me.crus3r.cadiacore2.commands.FlyCommand;
import me.crus3r.cadiacore2.commands.GamemodeCommand;
import me.crus3r.cadiacore2.commands.HatCommand;
import me.crus3r.cadiacore2.commands.HealCommand;
import me.crus3r.cadiacore2.commands.JarDupeCommadn;
import me.crus3r.cadiacore2.commands.TpCommand;
import me.crus3r.cadiacore2.commands.WorkbenchCommand;
import me.crus3r.cadiacore2.commands.vanishCommand;
import me.crus3r.cadiacore2.events.PlayerJoin;
import me.crus3r.cadiacore2.files.MOTDFile;

public class CadiaCore2 extends JavaPlugin implements Listener{

	public final Logger logger = Logger.getLogger("Minecraft");
	public static CadiaCore2 plugin;
	public HashMap<UUID,PermissionAttachment> playerPermissions = new HashMap<>();
	
	public MOTDFile motdFile;
	
	@Override
	public void onEnable() {
		plugin = this;
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.motdFile = new MOTDFile(this);
		this.registerEvents();
		this.registerCommands();
		this.saveDefaultConfig();
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------oOo--------------------\n\nCadiaCore2 Loaded.\n\n--------------------oOo--------------------");	
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "--------------------oOo--------------------\n\nCadiaCore2 Disabled..\n\n--------------------oOo--------------------");
		
	}
	
	public void registerEvents() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);

	}
	
	public void registerCommands() {
		this.getCommand("heal").setExecutor((CommandExecutor)new HealCommand());
		this.getCommand("fly").setExecutor((CommandExecutor)new FlyCommand());
		this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCommand());
		this.getCommand("helpss").setExecutor((CommandExecutor)new JarDupeCommadn());
		this.getCommand("hat").setExecutor((CommandExecutor)new HatCommand());
		this.getCommand("tp").setExecutor((CommandExecutor)new TpCommand());
		this.getCommand("workbench").setExecutor((CommandExecutor)new WorkbenchCommand());
		this.getCommand("feed").setExecutor((CommandExecutor)new FeedCommand());
		this.getCommand("vanish").setExecutor((CommandExecutor)new vanishCommand());
		this.getCommand("broadcast").setExecutor((CommandExecutor)new BroadcastCommand());
		this.getCommand("enderchest").setExecutor((CommandExecutor)new EnderchestCommand());


	}
	public void broadcastCmd() {

}
	//
	//		E	v	e	n	t		H	a	n	d	l	e	r 	for permissions
	//
	@EventHandler
	public void breakBlock(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		if(!player.hasPermission("cadiacore2.breakblock")) {
			
			event.setCancelled(true);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "[" + ChatColor.AQUA + "CadiaHQ" + ChatColor.LIGHT_PURPLE + "] " + ChatColor.GREEN + "Hey! You cant do that!");
		}
		
	}
	
	@EventHandler
	public void join(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		setupPermissions(player);
		
	}
	
	
	public void setupPermissions(Player player) {
		
		PermissionAttachment attachment = player.addAttachment(this);
		this.playerPermissions.put(player.getUniqueId(), attachment);
		permissionsSetter(player.getUniqueId());
	}
	
	private void permissionsSetter(UUID uuid) {
		
		PermissionAttachment attachment = this.playerPermissions.get(uuid);
		for(String groups : this.getConfig().getConfigurationSection("groups").getKeys(false)) {
			
			for(String permissions : this.getConfig().getStringList("Groups." + groups + ".permissions")) {
				
				attachment.setPermission(permissions, true);
				
			}
			
		}
		
	}
	
	
}
