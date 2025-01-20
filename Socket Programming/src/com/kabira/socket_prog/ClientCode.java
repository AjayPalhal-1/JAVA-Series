package com.kabira.socket_prog;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String msg = "Client says: Wassp";
			try {
				Socket sender = new Socket(InetAddress.getByName("localhost"),2000);
				
				DataOutput dout = new DataOutputStream(sender.getOutputStream()); // we gonna send data from client to server
				dout.writeUTF(msg);
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
