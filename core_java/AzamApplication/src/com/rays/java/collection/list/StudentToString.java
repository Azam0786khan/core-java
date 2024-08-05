
package com.rays.java.collection.list;

public class StudentToString {

	
	private int rollno;
	private String name;
	private String address;
	
	public StudentToString() {
		// TODO Auto-generated constructor stub
	}

	public StudentToString(int rollno, String name, String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentToString [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
