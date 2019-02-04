package me.crus3r.cadiacore2;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import me.crus3r.cadiacore2.commands.SetSrvMOTD;

public class Events implements Listener{

	MotdHandler MotdHandler;
	public Events(MotdHandler _MotdHandler) {
		
		MotdHandler = _MotdHandler;
		
	}
	
	@EventHandler
	public void onPing(ServerListPingEvent e) {
		
	e.setMotd(SetSrvMOTD.motd);	
	e.setMaxPlayers(e.getNumPlayers() + 1);
		
	}
	
}
