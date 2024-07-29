package com.rays.java;

public class FindIndexPositionOfArray {
	
	public static void main(String[] args) {
		
		int [] array = {88,77,66,55,44,33,22,11};
		
		int value =99;
		
		 FindIndexPositionOfArray f = new  FindIndexPositionOfArray();
		 
		 System.out.println("position is : " +f.findIndexPositionOfArray(array,value));
		
		
	}
	
	 public int findIndexPositionOfArray(int[] array,int value) {
		 
		 for(int i = 0;i<array.length;i++) {
			 
			 if(array[i]==value) {
				 
				 return i;
			 }
		 }
		 return 1;
	 } 

}
