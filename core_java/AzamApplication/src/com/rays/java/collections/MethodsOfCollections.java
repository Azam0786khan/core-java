package com.rays.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsOfCollections {
	public static void main(String[] args) {
		
		List l1=new ArrayList();
		
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		
		List l2 = new ArrayList();
		
		l2.add(66);
		l2.add(77);
		
		Collections.copy(l1, l2);
		System.out.println(l1);
		
		int num=Collections.binarySearch(l1, 33);
		System.out.println(num);
		

}
}
