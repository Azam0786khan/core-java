package com.rays.opp.encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private int gear;
	private String make;
	
	
	public void setcolor(String color) {
	 this.color=color;
	}
	public String getcolor() {
		return this.color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
		
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
}
