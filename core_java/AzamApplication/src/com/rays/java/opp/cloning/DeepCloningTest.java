package com.rays.java.opp.cloning;

public class DeepCloningTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s=new Student("Azam", new Address("Indore"));
		
		Student s1=(Student) s.clone();
		
		s1.name = "acha";
		s1.city = new Address("bhopal");
		
		System.out.println(s);
		System.out.println(s1);
		
		
	}

}
