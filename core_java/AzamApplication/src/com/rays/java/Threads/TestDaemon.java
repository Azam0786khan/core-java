package com.rays.java.Threads;

public class TestDaemon {

	public static void main(String[] args) {

		DaemonThread d = new DaemonThread("Azam");
		d.setDaemon(true);

		d.start();

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Done");

		}
	}
}
