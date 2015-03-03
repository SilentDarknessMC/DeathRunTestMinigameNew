package com.silentdarknessmc.deathrun.listeners;

import static org.bukkit.ChatColor.BLACK;
import static org.bukkit.ChatColor.DARK_AQUA;
import static org.bukkit.ChatColor.GOLD;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.silentdarknessmc.deathrun.Main;
import com.silentdarknessmc.deathrun.utils.Chat;

public class Signs implements Listener {
	private String server1ip = Main.instance.getConfig().getString("Server1IP");
	private int server1port = Main.instance.getConfig().getInt("Server1Port");
	private String server2ip = Main.instance.getConfig().getString("Server2IP");
	private int server2port = Main.instance.getConfig().getInt("Server2Port");
	private String server3ip = Main.instance.getConfig().getString("Server3IP");
	private int server3port = Main.instance.getConfig().getInt("Server3Port");
	private String server4ip = Main.instance.getConfig().getString("Server4IP");
	private int server4port = Main.instance.getConfig().getInt("Server4Port");
	private String server5ip = Main.instance.getConfig().getString("Server5IP");
	private int server5port = Main.instance.getConfig().getInt("Server5Port");
	private String server6ip = Main.instance.getConfig().getString("Server6IP");
	private int server6port = Main.instance.getConfig().getInt("Server6Port");
	private String server7ip = Main.instance.getConfig().getString("Server7IP");
	private int server7port = Main.instance.getConfig().getInt("Server7Port");
	private String server8ip = Main.instance.getConfig().getString("Server8IP");
	private int server8port = Main.instance.getConfig().getInt("Server8Port");
	
	@EventHandler
	public void onSignCreate(SignChangeEvent e) {
		Server server1 = new Server(server1ip, server1port);
		Server server2 = new Server(server2ip, server2port);
		Server server3 = new Server(server3ip, server3port);
		Server server4 = new Server(server4ip, server4port);
		Server server5 = new Server(server5ip, server5port);
		Server server6 = new Server(server6ip, server6port);
		Server server7 = new Server(server7ip, server7port);
		Server server8 = new Server(server8ip, server8port);
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 1]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 1" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Prison");
			e.setLine(2, server1.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 2]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 2" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Prison");
			e.setLine(2, server2.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 3]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 3" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Prison");
			e.setLine(2, server3.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 4]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 4" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Prison");
			e.setLine(2, server4.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 5]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 5" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Cave");
			e.setLine(2, server5.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 6]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 6" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Cave");
			e.setLine(2, server6.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 7]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 7" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Cave");
			e.setLine(2, server7.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
		
		if(e.getLine(0).equalsIgnoreCase("[Deathrun 8]")) {
			e.setLine(0, DARK_AQUA + "[" + GOLD + "Deathrun 8" + DARK_AQUA + "]");
			e.setLine(1, BLACK + "Cave");
			e.setLine(2, server8.ParseData(Server.Connection.PLAYERS_ONLINE));
			e.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
		}
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Server server1 = new Server(server1ip, server1port);
		Server server2 = new Server(server2ip, server2port);
		Server server3 = new Server(server3ip, server3port);
		Server server4 = new Server(server4ip, server4port);
		Server server5 = new Server(server5ip, server5port);
		Server server6 = new Server(server6ip, server6port);
		Server server7 = new Server(server7ip, server7port);
		Server server8 = new Server(server8ip, server8port);
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.hasBlock() && e.getClickedBlock().getState() instanceof Sign) {
			Player player = e.getPlayer();
			Sign sign = (Sign) e.getClickedBlock().getState();
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 1" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Prison");
				sign.setLine(2, server1.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server1.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 2" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Prison");
				sign.setLine(2, server2.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server2.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 3" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Prison");
				sign.setLine(2, server3.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server3.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 4" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Prison");
				sign.setLine(2, server4.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server4.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 5" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Cave");
				sign.setLine(2, server5.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server5.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 6" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Cave");
				sign.setLine(2, server6.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server6.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 7" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Cave");
				sign.setLine(2, server7.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server7.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
			
			if(sign.getLine(0).equalsIgnoreCase(DARK_AQUA + "[" + GOLD + "Deathrun 8" + DARK_AQUA + "]")) {
				sign.setLine(1, BLACK + "Cave");
				sign.setLine(2, server8.ParseData(Server.Connection.PLAYERS_ONLINE));
				sign.setLine(3, DARK_AQUA + "<<" + GOLD + "Deathrun" + DARK_AQUA + ">>");
				if(sign.getLine(2).equalsIgnoreCase("30/30")) {
					e.setCancelled(true);
					player.sendMessage(Chat.ChatStarter() + " That Game Is Already Full!");
				} else if(!sign.getLine(2).equalsIgnoreCase("30/30")) {
					String destination = Main.instance.getConfig().getString("Server8.Server");
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					DataOutputStream dos = new DataOutputStream(baos);
					try {
						dos.writeUTF("Connect");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						dos.writeUTF(destination);
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						baos.close();
					} catch (IOException e3) {
						e3.printStackTrace();
					}
					try {
						dos.close();
					} catch (IOException e4) {
						e4.printStackTrace();
					}
					player.sendPluginMessage(Main.instance, "BungeeCord", baos.toByteArray());
				}
			}
		}
	}
}