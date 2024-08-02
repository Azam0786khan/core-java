package com.rays.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		
		c.add(8);
		c.add('a');
		c.add("collection");
		c.add(5.5);
		c.add(true);
		
		System.out.println(c);
		
		
		
		Collection c1=new ArrayList();
		
		c1.add(8);
		c1.add('b');
		c1.add("collect");
		c1.add(6.6);
		c1.add(false);
//		
//		c.addAll(c1);
//		
//		System.out.println(c);
//		
//		c.clear();
//		System.out.println(c);
		
//		c.contains(8);
//		System.out.println(c.contains(8));
		
//		c.containsAll(c1);
//		System.out.println(c.containsAll(c1));
		
//		c.isEmpty();
//		System.out.println(c.isEmpty());
		
//	    Iterator it=c.iterator();
//	    	
//	    	while(it.hasNext()) {
//	    		 
//	    		Object ob=it.next();
//	    		
//	    		System.out.println(ob);
//	    		}
//		c.remove(8);
//		System.out.println(c);
//			
//		c.removeAll(c1);
//		System.out.println(c);
		
//		c.retainAll(c1);
//		System.out.println(" c"+c);
		
		c.size();
		System.out.println(c.size());
		
		}
}
