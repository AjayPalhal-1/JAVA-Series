package com.kabira.file_handling;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamHandling {

	public static void main(String[] args) {

		try {

			String mydata = "Today is Last Day Of Core Java"; // need to convert in byte array
			FileOutputStream fout = new FileOutputStream("data.txt", true); // 2nd param for append // by default is
																			// false we need
			// byte[] data= mydata.getBytes(); // here we doing this
			BufferedOutputStream bout = new BufferedOutputStream(fout); // 4kbyte by default size // 1. when buffer is
																		// full 2. explicitly we can flush
			DataOutputStream dout = new DataOutputStream(fout);// convert string data into byte array
			// fout.write(data);
			// always use buffer with I/O Oprations
			dout.writeUTF(mydata); // universal text format // html utf we
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
