package com.rays.java;

public class SecondLargestArray {

	public static void main(String[] args) {
		int[] array = { 12, 33, 22, 55, 34, 88, 56, 89 };

		SecondLargestArray m = new SecondLargestArray();
		m.secondLargest(array);
	}

	public void secondLargest(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("max = " + max);
	}
}

