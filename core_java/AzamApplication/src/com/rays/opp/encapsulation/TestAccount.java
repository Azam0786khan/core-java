package com.rays.opp.encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a1=new Account("510000091156","saving",123.501);
		
		System.out.println(a1.getnumber());
		System.out.println(a1.getType());
		System.out.println(a1.getBalance());
	

		
		System.out.println(" deposit"+a1.deposit(1400.0));
		
		System.out.println(" withdraw"+a1.withdraw(200.0));
		
		System.out.println(" fundTransfer"+a1.fundTransfer("fffgg",23.501));
		

		

		

	}
		
	}
	
