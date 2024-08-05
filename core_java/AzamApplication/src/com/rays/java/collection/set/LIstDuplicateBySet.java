package com.rays.java.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LIstDuplicateBySet {

	public static void main(String[] args) {
		
	    List l=new ArrayList();
	
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(33);
		l.add(44);
		
		LinkedHashSet lh=new LinkedHashSet(l);
		
		System.out.println(lh);
		
		
		

	}

}
