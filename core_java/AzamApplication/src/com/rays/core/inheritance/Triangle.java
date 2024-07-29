package com.rays.core.inheritance;

public class Triangle extends Shape {

	private int base;

	private int height;

	public int getBase() {
		return base;
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;

	}

	public int getHeight() {
		return height;
	}

	public double area() {
		double area = 0.5 * base * height;

		return area;
	}

}
