package com.rays.java.execption;

public class Bank {

	public static void main(String[] args) {
			Bank b=new Bank(10000,12000);
			try {
				System.out.println(b.withdraw());
			} catch (BankExecption e) {
				System.out.println(e);
			}
	}

	public double amount;
	public double balance;

	public Bank( double balance, double amount) {

		this.balance = balance;
		this.amount = amount;

	}

	public double withdraw() throws BankExecption{
		if (this.amount > this.balance) {
			throw new BankExecption("insufficient balance");
		} else {
			return this.balance = balance - amount;
		}
		
	}

}
