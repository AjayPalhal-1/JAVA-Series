package com.kabira.home_automation;

public class TempratureDevice implements Device {

	int tempratureLevel;
	String name;
	String brandName;
	boolean status;

	public TempratureDevice(int tempratureLevel, boolean status, String name, String brandName) {
		super();
		this.tempratureLevel = tempratureLevel;
		this.name = name;
		this.brandName = brandName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getTempratureLevel() {
		return tempratureLevel;
	}

	public void setTempratureLevel(int tempratureLevel) {
		this.tempratureLevel = tempratureLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean turnOff() {
		if (this.isStatus() == false) {
			return true;
		}
		return false;
	}

	@Override
	public boolean turnOn() {
		if (this.isStatus()) {
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
		System.out.println("Device Name              : " + this.getName());
		System.out.println("Device Brand             : " + this.getBrandName());
		System.out.println("Device Temprature level  : " + this.getTempratureLevel());

		if (turnOn()) {
			System.out.println("Current Status       :      ON ");
		} else {
			System.out.println("Current Status       :      OFF ");
		}

	}

}
