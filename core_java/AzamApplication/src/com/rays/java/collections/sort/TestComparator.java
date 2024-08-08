package com.rays.java.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	
	public static void main(String[] args) {
		
		List<ComparatorExample> list = new ArrayList<ComparatorExample>();
		
		list.add(new ComparatorExample(4, "Sun" ,5));
		list.add(new ComparatorExample(3, "moon" ,4));
		list.add(new ComparatorExample(2, "saturn", 3));
		list.add(new ComparatorExample(1, "jupitor", 2));
		
		ComparatorById c= new ComparatorById();
		Collections.sort(list, c);
		
		list.forEach(System.out::println);
		System.out.println("---------------------");
		
		ComparatorByName c1=new ComparatorByName();
		Collections.sort(list, c1);
		list.forEach(System.out::println);
		System.out.println("---------------------");
		
		
		ComparatorByRollNo c2=new ComparatorByRollNo();
		Collections.sort(list, c2);
		list.forEach(System.out::println);
		System.out.println("-----------------------");
		
		ComparartorByAll c3=new ComparartorByAll();
		Collections.sort(list, c3);
		list.forEach(System.out::println);
		
	}

}
