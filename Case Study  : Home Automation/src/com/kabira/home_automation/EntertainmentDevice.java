package com.kabira.home_automation;

public class EntertainmentDevice implements Device {

	int volume; // levels 1,2
	String deviceType; // audio or video
	String brandName;
	String deviceName;
	boolean status;

	public EntertainmentDevice(int volume, boolean status, String deviceType, String brandName, String deviceName) {
		super();
		this.volume = volume;
		this.deviceType = deviceType;
		this.brandName = brandName;
		this.deviceName = deviceName;
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean turnOff() {
		if (this.getStatus() == false) {
			return true;
		}
		return false;
	}

	@Override
	public boolean turnOn() {
		if (this.getStatus()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isONN() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deviceHistory() {
		System.out.println("Device Name              : " + this.getDeviceName());
		System.out.println("Device Brand             : " + this.getBrandName());
		System.out.println("Device Type              : " + this.getDeviceType());

		if (turnOn()) {
			System.out.println("Current Status       :      ON ");
		} else {
			System.out.println("Current Status       :      OFF ");
		}

	}

}
