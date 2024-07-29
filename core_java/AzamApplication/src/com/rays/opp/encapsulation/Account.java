package com.rays.opp.encapsulation;

public class Account {

	private String number;
	private String type;
	private double balance;
	
	public String getnumber() {
		return this.number;
		
	}
	public Account(String number,String type,double balance) {
		this.number=number;
		this.type = type;
		this.balance = balance; 
		
		
	}
	

	
	public String getType() {
		return type;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double amount) {

		return this.balance = balance + amount;

	}
	public double fundTransfer(String number,double amount) {
		
		if (amount > this.balance) {

			System.out.println("insufficient balance");

		} else {

			return this.balance-amount;
		}

		return this.balance;
		
		
	}
	
	public double withdraw(double amount) {

		if (amount > this.balance) {

			System.out.println("insufficient balance");

		} else {

			return this.balance = balance - amount;

		}

		return this.balance;

	}
	
	}

		
		
	
	
	
	
	

