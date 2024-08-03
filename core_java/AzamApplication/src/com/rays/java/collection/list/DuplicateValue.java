package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateValue {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(33);
		l.add(44);
		
		List l2=new ArrayList();

		
	Iterator it =l.iterator();
	
	while (it.hasNext()) {
		Object object = (Object) it.next();
		if(!l2.contains(object)) {
			l2.add(object);
		}
	}
	
	System.out.println("previous list = " +l);
	System.out.println("new list =" +l2);
	
	
	
	
	
	}
}
