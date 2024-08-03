package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class FailFastAndFailSafe {
	
	public static void main(String[] args) {
		

//		List li=new ArrayList();
//		li.add(11);
//		li.add(22);
//		li.add(33);
//		li.add(44);
//		
//		//fail fast with ilterator
//		
//		ListIterator it= li.listIterator();
//		li.add(55)	;
//		
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			
//		}
//         
//         System.out.println(li);
//         
       //Enumeration with vector
	
        Vector v= new Vector();
        v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		
		Enumeration E=v.elements()
;
		v.addElement(50);
		
		while (E.hasMoreElements()) {
			Object object = (Object) E.nextElement();
			System.out.println(object);
			
		}
        
         
         
         
	}

}
