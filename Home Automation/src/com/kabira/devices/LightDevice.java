package com.kabira.devices;

public class LightDevice implements Device {

	String lightDevicceName;
	String brand;
	int warranty;
	boolean status;

	public LightDevice(String lightDevicceName, String brand, int warranty, boolean status) {
		super();
		this.lightDevicceName = lightDevicceName;
		this.brand = brand;
		this.warranty = warranty;
		this.status = status;
	}

	public String getLightDevicceName() {
		return lightDevicceName;
	}

	public void setLightDevicceName(String lightDevicceName) {
		this.lightDevicceName = lightDevicceName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
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
		System.out.println("Device Name              : " + this.getLightDevicceName());
		System.out.println("Device Brand             : " + this.getBrand());
		System.out.println("Device Warranty in Years : " + this.getWarranty());

		if (turnOn()) {
			System.out.println("Current Status       :      ON ");
		} else {
			System.out.println("Current Status       :      OFF ");
		}

	}

}
