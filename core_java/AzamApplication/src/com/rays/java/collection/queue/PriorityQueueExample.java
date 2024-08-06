package com.rays.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		//follows priority of the element
		//can not take null value
		//type sensitive define type 
		//can take duplicate value
		Queue p=new PriorityQueue();
		
		p.offer(11);
		p.offer(22);
		p.offer(33);
		p.offer(44);
		p.offer(55);
		System.out.println(p);
		System.out.println(p.peek());
		while(!p.isEmpty()) {
			System.out.println(p.poll());//it will only print first inserted value 
			
			
		}
		
	}

}
