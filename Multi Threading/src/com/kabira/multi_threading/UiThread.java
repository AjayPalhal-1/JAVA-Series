package com.kabira.multi_threading;

public class UiThread  implements Runnable{

	@Override
	public void run() {

		process1();
		process2();
	}
	

	public void process1() {
		System.out.println("P1 Called");
	}

	public void process2() {
		System.out.println("P2 Called");
	}

}
