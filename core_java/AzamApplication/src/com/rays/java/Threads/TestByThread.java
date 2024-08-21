package com.rays.java.Threads;

public class TestByThread {
	
	public static void main(String[] args) {
		
		ByThread t1=new ByThread("Azam");
		
		ByThread t2=new ByThread("khan");
		
		t1.start();
		t2.start();
	}

}
