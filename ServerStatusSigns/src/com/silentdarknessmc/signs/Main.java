package com.silentdarknessmc.signs;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.silentdarknessmc.signs.Server.Connection;

public class Main extends JavaPlugin implements Listener {
	public static Main instance;

	public void onEnable() {
		Server server = new Server("10.10.3.108", 25566);
		Main.instance = this;
		this.getConfig().addDefault("Server Port", 25566);
		this.getConfig().addDefault("Server Host", "10.10.3.108");
		this.getConfig().addDefault("Server", "Hub");
		this.getConfig().set("Server Port", 25566);
		this.getConfig().set("Server Host", "10.10.3.108");
		this.getConfig().set("Server", "Hub");
		this.saveDefaultConfig();
		this.saveConfig();
		this.reloadConfig();
		this.getConfig().options().copyDefaults(true);
		System.out.println(server.ParseData(Connection.PLAYERS_ONLINE));
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	}

	public static void main(String[] args) {
		Server server = new Server("10.10.3.108", 25566);
		System.out.println(server.ParseData(Connection.PLAYERS_ONLINE));
	}

	public void onDisable() {

	}

	@EventHandler
	public void onSignCreate(SignChangeEvent e) {
		Server server = new Server("10.10.3.108", 25567);
		if(e.getLine(0).equalsIgnoreCase("[Deathrun]")) {
			e.setLine(0, ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Deathrun" + ChatColor.DARK_AQUA + "]");
			e.setLine(2, ChatColor.GREEN + server.ParseData(Connection.PLAYERS_ONLINE));
			if(e.getLine(1).equalsIgnoreCase("Test")) {
				e.setLine(1, ChatColor.GOLD + "Test");
			}
		}
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Server server = new Server("10.10.3.108", 25567);
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.hasBlock() && e.getClickedBlock().getState() instanceof Sign) {
			Player player = e.getPlayer();
			Sign sign = (Sign) e.getClickedBlock().getState();
			if(sign.getLine(0).equalsIgnoreCase(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Deathrun" + ChatColor.DARK_AQUA + "]")) {
				sign.setLine(2, ChatColor.GREEN + server.ParseData(Connection.PLAYERS_ONLINE));
				if(sign.getLine(1).equalsIgnoreCase(ChatColor.GOLD + "Test")) {
					String destination = Main.instance.getConfig().getString("Server");
			          ByteArrayOutputStream baos = new ByteArrayOutputStream();
			          DataOutputStream dos = new DataOutputStream(baos);
			          try {
						dos.writeUTF("Connect");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
			          try {
						dos.writeUTF(destination);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			          player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
			          try {
						baos.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			          try {
						dos.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}
}