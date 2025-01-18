package com.kabira.rooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestinMainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Room> rooms = new ArrayList<Room>();
		houseManager(rooms);
	}

	public static void houseManager(List<Room> rooms) {
		Scanner sc = new Scanner(System.in);
		int mainChoice;

		while (true) {
			System.out.println("\n****** House Manager Menu : ******");
			System.out.println("1. Add Rooms in the House");
			System.out.println("2. Add Devices to Rooms");
			System.out.println("3. Add Devices to Rooms");
			System.out.println("4. For Exiting The House Manager Menu  !!!! ");

			System.out.print("Enter your choice: ");
			mainChoice = sc.nextInt();

			switch (mainChoice) {
			case 1:
				// Add rooms to the house
				UtilityClass.addRoomsInHouse(rooms);
				break;

			case 2:
				// Check if rooms exist before adding devices
				if (rooms == null || rooms.isEmpty()) {
					System.out.println("No rooms available! Please add rooms first.");
					UtilityClass.addRoomsInHouse(rooms);
				} else {
					Room selectedRoom = UtilityClass.selectParticularRoom(rooms);

					selectedRoom.menuAddDevice();

				}
				break;

			case 4:
				// Exit the menu
				System.out.println("Exited House Manager. Godbye!");
				return;
			case 3:
//				System.out.println("");
				UtilityClass.displayInfoAboutDevice(rooms);
				break;
			default:
				// Handle invalid input
				System.out.println("Invalid choice! Please select a valid option.");
				break;
			}
		}
	}

}
