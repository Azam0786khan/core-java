package com.rays.java;

public class IntegerArray {
	public static void main(String[] args) {

		int[] array = { 22, 33, 44,87, 55, 66, 88 };

		IntegerArray a = new IntegerArray();
		a.averageOfArray(array);
	}

	public void averageOfArray(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Largest number of the array is = "+max);
	}
}
