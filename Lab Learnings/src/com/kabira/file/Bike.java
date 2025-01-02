package com.kabira.file;

public class Bike implements Factory {

	@Override
	public void design() {

		System.out.println("Bike Designing....!!!!");
	}

	@Override
	public void manfacture() {
		System.out.println("Bike Manifacturing....!!!!");

	}

}
