package com.rays.java.Threads;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread (new ByRunnable("Azam"));
		Thread t2=new Thread (new ByRunnable("khan"));
		
		t1.start();
		t2.start();
	}

}
