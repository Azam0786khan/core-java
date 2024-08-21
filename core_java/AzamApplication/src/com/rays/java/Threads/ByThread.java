package com.rays.java.Threads;

public class ByThread extends Thread {

	public String name;

	public ByThread() {

	}

	public ByThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i + "=" + name);
		}
	}
}
