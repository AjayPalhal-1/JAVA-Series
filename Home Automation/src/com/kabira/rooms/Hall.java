package com.kabira.rooms;
import java.util.ArrayList;

import com.kabira.devices.Device;
import com.kabira.devices.LightDevice;

public class Hall extends Room {

	public Hall() {
		device = new ArrayList<Device>();
	}

	@Override
	public void displayRoomDetails() {
																																																																																																																						

	}

	

	@Override
	public void addDevices() {
//		public LightDevice(String lightDevicceName, String brand, int warranty, boolean status) {

		
		LightDevice ld1 = new LightDevice("Fan", "LG", 2, true);
		device.add(ld1);
		ld1.deviceHistory();

	}
	

}
