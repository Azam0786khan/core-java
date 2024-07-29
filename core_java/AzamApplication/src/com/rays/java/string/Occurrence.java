package com.rays.java.string;

public class Occurrence {
	
	public static void main(String[] args) {
		
		String s ="vijay chauhan";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a') {
				
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
