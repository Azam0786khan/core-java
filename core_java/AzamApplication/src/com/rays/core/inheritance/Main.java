package com.rays.core.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		
		System.out.println(c.area());
		
		Rectangle r = new Rectangle(5,5);
		
		System.out.println(r.area());
		
		Triangle t = new Triangle(5,4);
		
		System.out.println(t.area());
	}
}
