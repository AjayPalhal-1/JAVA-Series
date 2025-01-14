package com.kabira.sync.account;

public class MainApp {
	public static void main(String[] args) {

		Account acc = new Account(2000, "Ajay");

		Thread t1 = new Thread(acc);
		Thread t2 = new Thread(acc);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		acc.run();
//		System.out.println("Final Amount :" + acc.getBalance());

	}

}
