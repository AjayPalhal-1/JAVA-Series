package com.kabira.socket_prog;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {
	// server shou4ld be running always 24*7

	public static void main(String[] args) {

		try (
			ServerSocket server = new ServerSocket(2000)) { // 20000 is port no. we can give it 1024 to 65535
			Socket receiver = server.accept();// blocking call wait un till receives clinet
			System.out.println("Server Running..........!!!!!!!");

			DataInputStream din = new DataInputStream(receiver.getInputStream());
			String msg = din.readUTF();
			
			
			System.out.println(msg);
			receiver.close();
			server.close();
			System.out.println("Server Stopped..............!!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
