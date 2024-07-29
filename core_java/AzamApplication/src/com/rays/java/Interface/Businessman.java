package com.rays.java.Interface;

public class Businessman implements Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("social worker help others");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("businessman earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("businessman do donation");
		
	}

	@Override
	public void party() {
		System.out.println("businessman do party");
		
	}
	
	

}
