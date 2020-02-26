package com.dassault.qa.javalearning;

public class Human {
	
	String name;
	char sex;
	int age;
	static int count=0;
	
	public Human() {
		count++;
	}
	
	
	private void walk() {
		float height=6.1f;
		System.out.println(name+ " is walking");
	}
	
	public void talk() {
		float height=6.0f;
		System.out.println(name+ " is talking");
	}
	
	public void run() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human hm1 = new Human();
		hm1.name= "Rohan";
		hm1.sex ='M';
		hm1.age=31;
		
		Human hm2 = new Human();
		hm2.name= "Mahesh";
		hm2.sex ='M';
		hm2.age=35;
		
		Human hm3 = new Human();	
		Human hm4 = new Human();
		System.out.println(count);
	
	//	hm.walk();
	//	hm.talk();
		
	//firstname.concat(lastname);
	}

}
