package com.rays.opp.encapsulation;

import java.io.ObjectInputStream.GetField;

public class TestPerson {

 public static void main(String[] args) {
	
	 Person p1=new Person();
	 
	 p1.setFirstName("ajay");
	 System.out.println(p1.getFirstName());
	 p1.setlastName("rajput");
	 System.out.println(p1.getlastName());
	 p1.setage(20);
	 System.out.println(p1.getage());
	 p1.setaddress("Indore");
	 System.out.println(p1.getaddress());
	 
	 
}
}
