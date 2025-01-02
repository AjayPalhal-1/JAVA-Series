package com.kabira.file;

public class Car implements Factory {
	@Override
	public void design() {

		System.out.println("Bike Designing....!!!!");
	}

	@Override
	public void manfacture() {
		System.out.println("Bike Manifacturing....!!!!");

	}

}
