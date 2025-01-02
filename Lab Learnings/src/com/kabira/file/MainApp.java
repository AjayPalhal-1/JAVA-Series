package com.kabira.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		File file = new File("input.txt");

		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				String str = sc.nextLine().trim();
				Factory ref = FactoryClass.makeVehicle(str);
				ref.design();
				ref.manfacture();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
