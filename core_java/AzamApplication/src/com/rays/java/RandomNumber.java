package com.rays.java;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i=1; i<5; i++) {
			
			int num = random.nextInt(100)+1;
			
			System.out.println(num);
			
		}
		
		
		
		
	}

}
