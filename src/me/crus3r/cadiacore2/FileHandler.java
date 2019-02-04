package me.crus3r.cadiacore2;

import java.io.File;

public class FileHandler {

	String Path = "plugins/CadiaCore2";
	
	public void Setup() {	
		File MainDirectory = new File(Path);
		if(!MainDirectory.exists()) {
			MainDirectory.mkdir();	
		}
		File MotdData = new File(Path + "/motd");
		if(!MotdData.exists()) {
			
			MotdData.mkdir();
			
		}
	}
}