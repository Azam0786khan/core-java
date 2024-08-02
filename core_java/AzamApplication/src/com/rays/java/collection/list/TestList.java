package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
		List c=new ArrayList();
		
		c.add(0,11);
		c.add(1,12);
		c.add(2,13);
		c.add(3,14);
		
		c.add(4,15);
		System.out.println(c);
		
		c.get(2);
		System.out.println(c.get(2));
		
		c.remove(3);
		System.out.println(c.remove(3));
		
		c.set(0, 10);
		System.out.println(c);
		
		c.subList(0, 2);
		System.out.println(c);
		
		c.indexOf(12);
		System.out.println(c.indexOf(12));
		
		c.lastIndexOf(13);
		System.out.println(c.lastIndexOf(13));
		
	}

}
