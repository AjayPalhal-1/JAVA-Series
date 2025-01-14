package com.kabira.synchronization;

public class Counter {
	int count = 0;

	public synchronized void increment() {
		this.count++;
	}

	public int getCount() {
		return this.count;
	}

}
