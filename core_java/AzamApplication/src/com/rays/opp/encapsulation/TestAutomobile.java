package com.rays.opp.encapsulation;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile at=new Automobile();
		
		at.setcolor("white");
		System.out.println(at.getcolor());
		at.setSpeed(140);
		System.out.println(at.getSpeed());
		at.setGear(6);
		System.out.println(at.getGear());
		at.setMake("car");
		System.out.println(at.getMake());
	}

}
