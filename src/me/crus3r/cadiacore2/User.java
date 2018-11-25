package me.crus3r.cadiacore2;

import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.Location;

public class User {

	private transient long teleportRequestTime;
	private transient UUID teleportRequester;
	private transient boolean teleportRequestHere;
	private transient Location teleportLocation;
	private boolean enderSee = false;
	
	@SuppressWarnings("unused")
	public void requestTeleport(boolean here) {
		Player player = null;
		this.teleportRequestTime = System.currentTimeMillis();
		this.teleportRequester = (player == null ? null : player.getUniqueId());
		this.teleportRequestHere = here;
		if(player == null) {
			this.teleportLocation = null;	
		}else {
			this.teleportLocation = (here ? player.getLocation() : player.getLocation());
			
		}	
	}
	
	public void setEnderSee(boolean set) {
		
		this.enderSee = set;
		
	}
	
	}
	

