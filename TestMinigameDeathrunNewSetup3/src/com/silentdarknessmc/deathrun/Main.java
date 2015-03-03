package com.silentdarknessmc.deathrun;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main instance;
	
	public void onEnable() {
		Main.instance = this;
		this.getConfig().addDefault("Server1IP", "localhost");
		this.getConfig().addDefault("Server1Port", 25565);
		this.getConfig().addDefault("Server2IP", "localhost");
		this.getConfig().addDefault("Server2Port", 25565);
		this.getConfig().addDefault("Server3IP", "localhost");
		this.getConfig().addDefault("Server3Port", 25565);
		this.getConfig().addDefault("Server4IP", "localhost");
		this.getConfig().addDefault("Server4Port", 25565);
		this.getConfig().addDefault("Server5IP", "localhost");
		this.getConfig().addDefault("Server5Port", 25565);
		this.getConfig().addDefault("Server6IP", "localhost");
		this.getConfig().addDefault("Server6Port", 25565);
		this.getConfig().addDefault("Server7IP", "localhost");
		this.getConfig().addDefault("Server7Port", 25565);
		this.getConfig().addDefault("Server8IP", "localhost");
		this.getConfig().addDefault("Server8Port", 25565);
		this.getConfig().addDefault("Server1.Server", "Deathrun1");
		this.getConfig().addDefault("Server2.Server", "Deathrun2");
		this.getConfig().addDefault("Server3.Server", "Deathrun3");
		this.getConfig().addDefault("Server4.Server", "Deathrun4");
		this.getConfig().addDefault("Server5.Server", "Deathrun5");
		this.getConfig().addDefault("Server6.Server", "Deathrun6");
		this.getConfig().addDefault("Server7.Server", "Deathrun7");
		this.getConfig().addDefault("Server8.Server", "Deathrun8");
	}
	
	public void onDisable() {
		
	}
}