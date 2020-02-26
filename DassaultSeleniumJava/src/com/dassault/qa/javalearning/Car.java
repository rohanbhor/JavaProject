package com.dassault.qa.javalearning;

public class Car implements Vehicle{

	
	public String getType() {
		
		
		return "CAR";
	}

	
	public void start() {
		System.out.println("Cart is starting");
		
	}

	
	public void stop() {
		System.out.println("Cart is Stopping");
		
	}
	
	public void openWindows() {
		System.out.println("Opening car windows");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle h = new Car();
		Car c = new Car();
		

	}

	

}
