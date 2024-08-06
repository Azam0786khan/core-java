package com.rays.java.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {
		//follows insertion order
		//do not take null value 
		//take duplicate value
		//it is not type sensitive 
		
		Deque d= new ArrayDeque();
		d.offer(11);
		d.offer(22);
		d.offer(33);
		d.offer(44);
		d.offer(55);
		
		System.out.println(d);
		
		//it will only print first inserted value 
		System.out.println(d.peek());
		
		while(!d.isEmpty()) {
			
			System.out.println(d.poll());//it will print and remove first inserted value
		}
		
		}

}
