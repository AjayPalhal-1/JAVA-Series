package com.kabira;

public class Address {
	
	String Taluka ;
	String Zila ;
	int pincode;
	public Address(String taluka, String zila, int pincode) {
		super();
		Taluka = taluka;
		Zila = zila;
		this.pincode = pincode;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		Taluka = taluka;
	}
	public String getZila() {
		return Zila;
	}
	public void setZila(String zila) {
		Zila = zila;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
