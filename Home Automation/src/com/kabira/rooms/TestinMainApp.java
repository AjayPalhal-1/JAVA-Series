package com.kabira.rooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestinMainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Room> rooms = new ArrayList<Room>();
		houseManager(rooms);

//		int mainChoice;

//		addRoomsInHouse(rooms);
//		System.out.println("Are You Want Add Devices");
//		System.out.println("Yes : 1");
//		System.out.println(" No :  0");
//		mainChoice= sc.nextInt();
//		if(mainChoice==1)
//		{
//			if(rooms==null)
//			{
//				System.out.println("You Need Add Rooms Firstly ");
//				addRoomsInHouse(rooms);
//				Room.menuAddDevice();
//			}
//			Room.menuAddDevice();
//
//		}
//		else
//		{
//			System.out.println("You are in Outer Else");
//		}

	}

	public static void houseManager(List<Room> rooms) {
		Scanner sc = new Scanner(System.in);
		int mainChoice;

		while (true) {
			System.out.println("\nHouse Manager Menu:");
			System.out.println("1. Add Rooms in the House");
			System.out.println("2. Add Devices to Rooms");
			System.out.println("3. Exit");

			System.out.print("Enter your choice: ");
			mainChoice = sc.nextInt();

			switch (mainChoice) {
			case 1:
				// Add rooms to the house
				addRoomsInHouse(rooms);
				break;

			case 2:
				// Check if rooms exist before adding devices
				if (rooms == null || rooms.isEmpty()) {
					System.out.println("No rooms available! Please add rooms first.");
					addRoomsInHouse(rooms);
				} else {
					Room.menuAddDevice();

				}
				break;

			case 3:
				// Exit the menu
				System.out.println("Exiting House Manager. Goodbye!");
				return;

			default:
				// Handle invalid input
				System.out.println("Invalid choice! Please select a valid option.");
				break;
			}
		}
	}

	public static void addRoomsInHouse(List<Room> rooms) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a room to add In House:");
		System.out.println("1. Hall");
		System.out.println("2. Kitchen");
		System.out.println("3. Bedroom");
		System.out.println("4. Exit");

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
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice! Please select a valid option.");
			}
		} while (choice != 4);

		System.out.println("Rooms added successfully.");
	}

}
