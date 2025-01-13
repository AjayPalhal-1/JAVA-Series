package com.kabira.multi_threading;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new UiThread()); // clean coding 
		Thread t2 = new Thread(new RemoteThread()); // 

		t1.start(); // to register the thread with thread scheduler
		t2.start();
		
		

		try {
			t1.join(); // t1 and t2 complete firstly and then go in main function 
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		process5();
		process6();
		process7();

		


	}
	
	public static void process5()
	{
		System.out.println("P5 Called");
	}
	
	public static void process6()
	{
		System.out.println("P6 Called");
	}
	
	public static void process7()
	{
		System.out.println("P7 Called");
	}
//
//	public void run() {
//
////		this.setName("Thread 1 ");
//		System.out.println(this.getName());
//		process1();
//		process2();
//		process3();
//		process4();
//
//	}
//
//	public void process1() {
//		System.out.println("P1 Called");
//	}
//
//	public void process2() {
//		System.out.println("P2 Called");
//	}
//
//	public void process3() {
//		System.out.println("P3 Called");
//	}
//
//	public void process4() {
//		System.out.println("P4 Called");
//	}

}
