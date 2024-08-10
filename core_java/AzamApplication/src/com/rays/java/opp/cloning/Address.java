package com.rays.java.opp.cloning;

public class Address {
	
	private String address;
	public Address(String address) {
		super();
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Employee [ address=" + address + "]";
	}
	
	

}

