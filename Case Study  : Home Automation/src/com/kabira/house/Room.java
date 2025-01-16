package com.kabira.house;

import java.util.List;

import com.kabira.home_automation.Device;

public abstract class Room {
	
//	String roomType;
//
//	public Room(String roomType) {
//		super();
//		this.roomType = roomType;
//	}
//
//	public String getRoomType() {
//		return roomType;
//	}
//
//	public void setRoomType(String roomType) {
//		this.roomType = roomType;
//	}
	
	List<Device> device;
	public abstract void addDevices();
	
	public abstract void displayRoomDetails();
	
	

}
