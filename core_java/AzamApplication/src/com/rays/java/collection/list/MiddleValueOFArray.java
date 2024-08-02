package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MiddleValueOFArray {
	public static void main(String[] args) {
		
		List c= new ArrayList();
		
		c.add(11);
		c.add(12);
		c.add(13);
		c.add(14);
		c.add(15);
		
		int mid =c.size()/2;
		System.out.println("middle value of the array liost is =" +c.get(mid));
		
		
	}

}
