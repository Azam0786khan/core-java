package com.rays.java;

public class Factorial {

	public static void main(String[] args) {
		
		
		int factorial = 1;
		
		for (int i=6; i>1;i--) {
			
			factorial= factorial*i;
		}
		
		System.out.println(factorial);
	}
}
