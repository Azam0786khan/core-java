package com.rays.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashset {
	
	public static void main(String[] args) {
		
		
		
		Set s= new HashSet();
		
		s.add(11);
		s.add(null);
		s.add(null);
		s.add(44);
		s.add(44);
		s.add('a');
		
		System.out.println(s);
	}

}
