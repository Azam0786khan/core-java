package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {
	public static void main(String[] args) {
		
		List li=new ArrayList();
		li.add(11);
		li.add(22);
		li.add(33);
		li.add(44);
		li.add(55);
		li.add(66);
		
		ListIterator it= li.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
		
	 Iterator t= li.iterator();
	 while(t.hasNext()) {
		 
		Object obj =  t.next();
		System.out.println(obj);
	 }
			 
			 
			 
			 
			 
	}
}
