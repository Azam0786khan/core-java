package com.rays.java.Threads;

public class TestRacing extends Thread {
	
	public static AccountRacing a = new AccountRacing();
	
	public String name;

	public TestRacing(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			a.deposit(this.name, 1000);
		}
	}
	public static void main(String[] args) {
		
		TestRacing t1= new TestRacing("Azam");
		
		TestRacing t2= new TestRacing("khan");
		
		t1.start();
		t2.start();
	}
	
	
		
		
		
		
		
	

}
