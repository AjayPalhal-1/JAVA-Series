package com.kabira.file_handling;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("data.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);

			DataInputStream din = new DataInputStream(fin);
//			din.read();
			while (din.available() > 0) {
				System.out.print(din.read());
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
