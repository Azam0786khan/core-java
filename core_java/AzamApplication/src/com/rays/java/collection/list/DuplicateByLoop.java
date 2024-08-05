package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class DuplicateByLoop {

public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add(11);
		l.add(22);
		l.add(33);
		l.add(33);
		l.add(44);
		
		for(int i=0;i<l.size();i++) {
			
		 for(int j=i+1;j<l.size();j++) {
			 
			 if(l.get(i) == l.get(j)) {
				 
				 l.remove(j);
			 }
		 }
		}
		
		System.out.println(l);
		}
}
