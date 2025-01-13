package com.kabira.multithreading;

public class RemoteThread  implements Runnable{

	@Override
	public void run() {
		process4();
		process5();
		process6();
	}
	
	public void process4()
	{
		System.out.println("P4 Executing..");
	}
	public void process5()
	{
		System.out.println("P5 Executing..");
	}public void process6()
	{
		System.out.println("P6 Executing..");
	}
	
}
