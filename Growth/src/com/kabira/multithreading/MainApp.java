package com.kabira.multithreading;

public class MainApp {

	public static void main(String[] args) {

		Thread t1 = new Thread(new UiThread());
		Thread t2 = new Thread(new RemoteThread());

		t1.start();
		t2.start();
	

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		process7();
		process8();
		process9();

	}

	public static void process7() {
		System.out.println("P7 Executing");
	}

	public static void process8() {
		System.out.println("P8 Executing");
	}

	public static void process9() {
		System.out.println("P9 Executing");
	}

}
