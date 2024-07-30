package com.rays.java.execption;

public class TestExecption {
	
	public static void main(String[] args) {
		
		int i=15;
		//Arithmetic execption
		try {
			System.out.println(i/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	
		//NullpointerExecption
	String str=null;
	
	try {
		
		System.out.println(str.length());
	} catch (NullPointerException e) {
		System.out.println(e.getMessage());
	}
	
	//Indexoutofbound
	String[] array= {"11","22","33","44"};
	try {
		System.out.println(array[5]);
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());	}
	
	
	}

}
