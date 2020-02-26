package com.dassault.qa.javalearning;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle v1 = new Car();
		System.out.println(v1.getType());
	
		
		Vehicle v2 =new Bike();
		System.out.println(v2.getType());
		
		
		Car c1 = new Car();
		System.out.println(c1.getType());
		c1.start();
		c1.openWindows();
		
		
		Bike b = new Bike();
		System.out.println(b.getType());
		
		
	}

}
