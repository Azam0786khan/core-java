package com.rays.java.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

//not execpt null value
//arrange list in sorted manner
//should define type (<Integer>)
//remove duplicate value 
// not maintain insertion order


public class TestTreeset {

	public static void main(String[] args) {
		
      SortedSet<Integer> s= new TreeSet<Integer>();
		
		s.add(11);
		s.add(33);
		s.add(22);
		s.add(44);
		s.add(44);
		
		
		System.out.println(s);
		

	}

}
