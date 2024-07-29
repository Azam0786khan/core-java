package com.rays.core.inheritance;

public class Rectangle extends Shape {

	private int length;

	private int width;

	public int getLength() {
		return length;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public double area() {

		double area = length * width;
		return area;
	}
}
