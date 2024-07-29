package com.rays.java;

public class LargestArrayNo {
	
	public static void main(String[] args) {
		
		int[] array = {23,45,89,35,67,56,16,111};
		
		LargestArrayNo a=new LargestArrayNo();
		a.averageOfArray(array);
		
	}
		public void averageOfArray(int[] array) {
			
			int max=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];
				
			}
		}
		
		System.out.println("Largest number of the array is = " +max);
		}

		
	}


