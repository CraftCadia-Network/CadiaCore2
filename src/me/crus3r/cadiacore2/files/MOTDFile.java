package me.crus3r.cadiacore2.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.crus3r.cadiacore2.CadiaCore2;

public class MOTDFile {
	
	private CadiaCore2 instance;
	
	private String FILENAME = "motd.txt";
	
	public File file;
	public FileConfiguration fileConfig;
	
	public MOTDFile(CadiaCore2 instance) {
		this.instance = instance;
		this.reload();
		this.save();
	}
	
	public void save() {
		try {
			if (!this.file.exists()) {
				this.instance.saveResource("motd.txt", false);
			}
			this.fileConfig.save(this.file);
			this.reload();
		} catch (IOException e) {
			System.out.println("Failed to save " + this.FILENAME);
		}
	}
	
	public void reload() {
		this.file = new File(this.instance.getDataFolder(), this.FILENAME);
		this.fileConfig = YamlConfiguration.loadConfiguration(this.file);
	}

}
