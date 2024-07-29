package com.rays.java;


public class AverageOfOddNum1 {
	
public static void main(String[] args) {
	
	int num=10;
	
	int even=0;
	int odd=0;
	int evencount=0;
    int oddcount=0;
	
	while(num>0) {
		
		if(num%2==0) {
	
		even=even+num;
		evencount++;

		
		}else {

			odd=odd+num;
			oddcount++;

		}
		
		num--;
		
	}
	
	System.out.println("Average of even numbers =" + even/evencount);
	System.out.println("Average of odd numbers =" + odd/oddcount);

		
		
	
	
	
	}
}
