package com.kabira.rooms;

import java.util.List;
import java.util.Scanner;

import com.kabira.devices.Device;
import com.kabira.devices.EntertainmentDevice;
import com.kabira.devices.LightDevice;
import com.kabira.devices.TempratureDevice;

// Base Class 
public abstract class Room {


	 List<Device> device;
	 

	public List<Device> getDevice() {
		return device;
	}

	

	public abstract void addDevices();

	public abstract void displayRoomDetails();

	public  void menuAddDevice() {
		Scanner sc = new Scanner(System.in);


		int ch;
		System.out.println("Add Light Device             : 1");
		System.out.println("Add Entertaintment Device    : 2");
		System.out.println("Add Bathroom Device          : 3");
		System.out.println("Add Temprature Device        : 4");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.print("Enter Light Device Name: ");
			String lightDeviceName = sc.nextLine();
			sc.nextLine();

			System.out.print("Enter Brand: ");
			String brand = sc.nextLine();

			System.out.print("Enter Warranty (in years): ");
			int warranty = sc.nextInt();

			System.out.print("Enter Status (true for ON, false for OFF): ");
			boolean status = sc.nextBoolean();

			LightDevice lightDevice = new LightDevice(lightDeviceName, brand, warranty, status);

			this.getDevice().add(lightDevice);
			System.out.println("Light Device has been added. ");
			break;

		case 2:

			System.out.print("Enter Device Name: ");
			String deviceName = sc.nextLine();
			sc.nextLine();

			System.out.print("Enter Brand Name: ");
			String brandName = sc.nextLine();

			System.out.print("Enter Device Type (e.g. Audio or Video): ");
			String deviceType = sc.nextLine();

			System.out.print("Enter Volume Level (0-100): ");
			int volume = sc.nextInt();

			System.out.print("Enter Status (true for ON, false for OFF): ");
			boolean status1 = sc.nextBoolean();

			EntertainmentDevice entertainmentDevice = new EntertainmentDevice(volume, status1, deviceType, brandName,
					deviceName);

			System.out.println("Entertainment Device Created: " + entertainmentDevice);
			break;

		case 3:
			System.out.println("Bathroom Device has been added.");
			// Add logic specific to bathroom devices if needed
			break;

		case 4:
			System.out.print("Enter Device Name: ");
			String name = sc.nextLine();
			sc.nextLine();

			System.out.print("Enter Brand Name: ");
			String brandName1 = sc.nextLine();

			System.out.print("Enter Temperature Level: ");
			int tempratureLevel = sc.nextInt();

			System.out.print("Enter Status (true for ON, false for OFF): ");
			boolean status2 = sc.nextBoolean();

			// Create an instance of TempratureDevice with the user inputs
			TempratureDevice tempratureDevice = new TempratureDevice(tempratureLevel, status2, name, brandName1);

			System.out.println("Temperature Device Created: " + tempratureDevice);

			System.out.println("Temprature Device has been added.");
			break;

		default:
			System.out.println("Invalid choice! Please select a valid option.");
			break;
		}

	}
}
