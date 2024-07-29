package com.rays.java.opp.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Shape c = new Circle(5);
		
		System.out.println(c.area());
		
		 Shape r= new Rectangle(5,5);
		
		System.out.println(r.area());
		
		Shape t = new Triangle(5,4);
		
		System.out.println(t.area());
		
		
		Shape[] s= new Shape[3];
		
		s[0] = new Circle(5);
		System.out.println(s[0].area());
		s[1] = new Rectangle(5,5);
		System.out.println(s[1].area());
		s[2] = new Triangle(5, 4);
		System.out.println(s[2].area());

	}
}
