package com.kabira.rooms;

import java.util.List;
import java.util.Scanner;

import com.kabira.devices.Device;

public final class UtilityClass {
	static Scanner sc = new Scanner(System.in);

	public static Room selectParticularRoom(List<Room> rooms) {
		if (rooms == null) {
			System.out.println("There Is Prior Room You Need TO Add ");
			addRoomsInHouse(rooms);

		} else {
			int roomNo = 0;
			for (Room room : rooms) {
				System.out.println("Room Number : " + (roomNo++) + " " + room.getClass().getSimpleName());
			} 

			// do while add remained
			System.out.println("Select Room From Above List ");
			int targetroom = sc.nextInt();

			if (targetroom >= 0 && targetroom <= rooms.size()) {
				System.out.println("Room Is Valid");
				return rooms.get(targetroom); // target room cha index

			} else {
				System.out.println("Room Is Invalid");

			}

		}

		return null;

	}

	public static void addRoomsInHouse(List<Room> rooms) {
		Scanner sc = new Scanner(System.in);

		System.out.println("**** Now Are Adding Rooms In House ****");

		System.out.println("Choose a room to add In House:");
		System.out.println("1. Hall");
		System.out.println("2. Kitchen");
		System.out.println("3. Bedroom");
		System.out.println("4. For Exiting The Adding Rooms In House !!!");

		int choice;
		int deviceChoice;

		do {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Hall hall = new Hall();

				rooms.add(hall);
				System.out.println(" Hall added to the House .");
				System.out.println("Are You Wanted Add Devices in Hall :");
				System.out.println("Yes : 1");
				System.out.println("No :  0");
				deviceChoice = sc.nextInt();
				if (deviceChoice == 1) {
					hall.addDevices();

				} else {
					System.out.println("Ok No Problem Explore Other Feature ");
				}

				break;

			case 2:
				Kitchen kitchen = new Kitchen();
				rooms.add(kitchen);

				System.out.println(" Kitchen added to the House .");
				System.out.println("Are You Wanted Add Devices in Kitchen :");
				System.out.println("Yes : 1");
				System.out.println("No :  0");
				deviceChoice = sc.nextInt();
				if (deviceChoice == 1) {
					kitchen.addDevices();

				} else {
					System.out.println("Ok No Problem Explore Other Feature ");
				}

				break;

			case 3:
				Bedroom bedroom = new Bedroom();
				rooms.add(bedroom);
//				bedroom.addDevices();

				System.out.println("Bedroom added to the House");
				System.out.println("Are You Wanted Add Devices in Bedroom :");
				System.out.println("Yes : 1");
				System.out.println("No :  0");
				deviceChoice = sc.nextInt();
				if (deviceChoice == 1) {
					bedroom.addDevices();

				} else {
					System.out.println("Ok No Problem Explore Other Feature ");
				}
				break;

			case 4:
				System.out.println("Stoped Adding Rooms In House ...");
				break;

			default:
				System.out.println("Invalid choice! Please select a valid option.");
			}
		} while (choice != 4);

		System.out.println("Rooms added successfully.");
	}

	public static void displayInfoAboutDevice(List<Room> rooms) {
		Room targetedRoom = selectParticularRoom(rooms);
		List<Device> mydevices = targetedRoom.getDevice();
		int counter = 0;
		for (Device device : mydevices) {
			System.out.println("Device Number : " + counter++ + "  " + device.getClass().getSimpleName());

		}

	}

}
