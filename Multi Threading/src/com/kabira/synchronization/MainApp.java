package com.kabira.synchronization;



public class MainApp {

	public static void main(String[] args) {

		Counter c1 = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 150; i++) {
				c1.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int j = 0; j < 150; j++) {
				c1.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Value Of Count Finally : "+c1.getCount());;

	}
	
	

}
