package com.dassault.qa.javalearning;

public class Bike implements Vehicle{

	
	public String getType() {
		
		
		return "Bike";
	}

	
	public void start() {
		System.out.println("Bike is starting");
		
	}

	
	public void stop() {
		System.out.println("Bike is Stopping");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle h = new Bike();
		Bike c = new Bike();
		

	}

	

}
