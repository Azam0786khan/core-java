package com.rays.java.constructor;

public class constructor {
	
	private String name;
	private String address;
	private String phoneNo;
	
	public constructor() {
		System.out.println("default constructor");
	}
	
	public constructor(String name, String address) {
		
		this();
		this.name=name;
		this.address=address;
		System.out.println(this.name);
		System.out.println(this.address);
	}
	
	public constructor(String name, String address, String phoneNo) {
		
		this(name, address);
		this.phoneNo=phoneNo;
		System.out.println(this.phoneNo);
	}

}
