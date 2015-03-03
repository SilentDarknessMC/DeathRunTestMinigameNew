package com.silentdarknessmc.signs;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
	private String host;
	private int port;
	
	public Server(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public Server(String host) {
		this.host = host;
		this.port = 25565;
	}
	
	public Server() {
		this.host = "10.10.3.108";
		this.port = 25565;
	}
	
	public String ParseData(Connection connection) {
		try {
			Socket socket = new Socket();
			OutputStream os;
			DataOutputStream dos;
			InputStream is;
			InputStreamReader isr;
			
			socket.setSoTimeout(2500);
			socket.connect(new InetSocketAddress(host, port), 2500);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			is = socket.getInputStream();
			isr = new InputStreamReader(is, Charset.forName("UTF-16BE"));
			
			dos.write(new byte[] { (byte) 0xFE, (byte) 0x01 });
			
			int packetId = is.read();
			
			if(packetId == -1) {
				System.out.println("EOS");
			}
			
			if(packetId != 0xFF) {
				System.out.println("Invalid Packet Id! " + packetId);
			}
			
			int length = isr.read();
			
			if(length == -1) {
				System.out.println("EOS");
			}
			
			if(length == 0) {
				System.out.println("Invalid Length");
			}
			
			char[] chars = new char[length];
			
			if(isr.read(chars, 0,length) != length) {
				System.out.println("EOS");
			}
			
			String string = new String(chars);
			String[] data = string.split("\0");
			
			if(connection == Connection.PLAYERS_ONLINE) {
				return Integer.parseInt(data[4]) + "/" + Integer.parseInt(data[5]);
			} else if(connection == Connection.MOTD) {
				return data[3];
			} else if(connection == Connection.SERVER_VERSION) {
				return data[2];
			} else {
				System.out.println("Connection Value Not Handled!");
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}
	
	public enum Connection {
		PLAYERS_ONLINE, MOTD, SERVER_VERSION;
	}
}