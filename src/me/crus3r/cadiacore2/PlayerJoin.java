package me.crus3r.cadiacore2;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
	
	private CadiaCore2 instance;
	
	public PlayerJoin(CadiaCore2 instance) {
		this.instance = instance;
	}
	
	/*
	 * This gets triggered once a Player joins the server.
	 */
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		sendMOTD(player);
	}
	
	/*
	 *  This is used for sending the MOTD
	 */
	
	private void sendMOTD(Player player) {
		for (int index=0; index<256; index++) {
			String path = "line_" + index;
			if (this.instance.motdFile.fileConfig.contains(path)) {
				String message = this.instance.motdFile.fileConfig.getString(path);
				message = colorize(message);
				player.sendMessage(message);
			} else {
				return;
			}
		}
	}
	
	/*
	 * This is used for sending messages with color. 
	 */
	
	private String colorize(String input) {
		String returnValue = ChatColor.translateAlternateColorCodes('&', input);
		return returnValue;
	}
}
