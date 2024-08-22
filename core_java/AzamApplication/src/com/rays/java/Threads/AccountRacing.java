package com.rays.java.Threads;

public class AccountRacing {

	public int balance;

	public int getBalance() {
		return balance;
	}	

	public AccountRacing() {
	}

	public synchronized void deposit(String name, int balance) {

		this.balance = this.balance + balance;
		 
		System.out.println(name + " " + " amount " + this.balance);
	}

}
