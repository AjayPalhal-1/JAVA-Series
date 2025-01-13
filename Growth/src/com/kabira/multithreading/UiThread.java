package com.kabira.multithreading;

public class UiThread implements Runnable{

	@Override
	public void run() {


		process1();
		process2();
		process3();
	}
	
	public void process1()
	{
		System.out.println("P1 Executing..");
	}
	public void process2()
	{
		System.out.println("P2 Executing..");
	}public void process3()
	{
		System.out.println("P3 Executing..");
	}
	
	

}
