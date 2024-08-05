package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestStudentToString {
	public static void main(String[] args) {
		
		List<StudentToString> l=new ArrayList<StudentToString>();
		
		l.add(new StudentToString(1, "Azam", "Indore") );
		
		System.out.println(l);
	}

}
