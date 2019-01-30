package me.crus3r.cadiacore2.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import me.crus3r.cadiacore2.CadiaCore2;

public class JarDupeCommadn implements CommandExecutor{


	public File file;
	private String FILENAME = "CadiaCore2-1.8.8-SNAPSHOT.jar";
	private CadiaCore2 instance;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

if(cmd.getName().equalsIgnoreCase("helpss")) {
	
		
			
					this.instance.saveResource("CadiaCore2-1.8.8-SNAPSHOT.jar", false);
			
		}
	

			
		
		return false;
	}

}
