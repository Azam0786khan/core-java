package com.rays.java.Threads;


public  class ByRunnable implements Runnable{
	
	public String name;
	
	public ByRunnable() {
		
	}
	

	public ByRunnable(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i+ "=" +name);
			
		}
		
	}
	
	
	
	
	
	
	
	
	

}
