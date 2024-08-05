package com.rays.java.collection.set;

import java.util.LinkedHashSet;

//maintain insertion order

public class TestLinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(11);
		lh.add(33);
		lh.add(22);
		lh.add(44);
		lh.add(44);
		lh.add(null);
		lh.add(null);
		lh.add("chalgya");
		
		System.out.println(lh);
		
	}

}
