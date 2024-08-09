package com.rays.java.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {
	
	public static void main(String[] args) {
		
		List<Contestant> list= new ArrayList<Contestant>();
		
		list.add(new Contestant("kamal","1234567890"));
		list.add(new Contestant("dhamal", "8574835741"));
		list.add(new Contestant("chaman", "1392043872"));
		list.add(new Contestant("kaman", "0284570493"));
		list.add(new Contestant("baman", "3846934784"));
		list.add(new Contestant("kamal", "1234567890"));
		list.add(new Contestant("naman", "4563538736"));
		
		list.stream().map(s->s.phone).forEach(System.out::println);
		
		System.out.println("valid phone no---");
		
		list.stream().map(s->s.phone).filter(s->s.length()==10).forEach(System.out::println);
		
		System.out.println("remove duplicate value -------------");
         
		list.stream().map(s->s.phone).filter(s->s.length()==10).distinct().forEach(System.out::println);
		
		System.out.println("shuffle phone no.---------------");
		list.stream().map(s -> s.phone).filter(s -> s.length() == 10).distinct().collect(Collectors.collectingAndThen(
				Collectors.toList(), e -> {Collections.shuffle(e); 
				 return e.stream();
				})).forEach(System.out::println);
		System.out.println("winnnerssss-------------");
		list.stream().map(s -> s.phone).filter(s -> s.length() == 10).distinct().collect(Collectors.collectingAndThen(
				Collectors.toList(), e -> {Collections.shuffle(e); 
				 return e.stream();
				})).limit(3).forEach(System.out::println);
}
}
