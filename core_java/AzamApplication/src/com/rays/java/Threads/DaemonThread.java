package com.rays.java.Threads;

public class DaemonThread extends Thread {

	public String name;

	public DaemonThread() {
		// TODO Auto-generated constructor stub
	}

	public DaemonThread(String name) {

		this.name = name;
	}
	
	@Override
	public void run() {
	
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("thread");
			
		}
		
	}
	

}
