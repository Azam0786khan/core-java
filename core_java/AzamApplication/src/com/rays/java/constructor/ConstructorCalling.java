package com.rays.java.constructor;

public class ConstructorCalling extends constructor {
	
	public ConstructorCalling(String name, String address, String phoneNo ) {
	
	super(name, address, phoneNo);
	}
	
	public static void main(String[] args) {
		
		ConstructorCalling c=new ConstructorCalling("azam","indore","237423789");
		
		
	}
	

}
