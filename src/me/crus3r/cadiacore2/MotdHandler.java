package me.crus3r.cadiacore2;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class MotdHandler {

		public String line1 = "Welcome to CadiaGames!";
		public String line2 = "Enjoy your stay!";
	
	public void SetupMotd(Player p) {
		
		File f = new File("plugins/CadiaCore2/MotdData/" + "Motd_" + p.getName() + ".yml");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
		yml.addDefault("Line1", line1);
		yml.addDefault("Line2", line2);
		yml.options().copyDefaults(true);
		try {
			yml.save(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}
	

