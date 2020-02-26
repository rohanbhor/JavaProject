package com.dassault.qa.javalearning;

public class ConditionsExamples {
	
	public static String getBiggerString(String s1, String s2) {	
		if(s1.length()>s2.length()) {
			return s1;
		}else if (s1.length()<s2.length()) {
			return s2;
		}
		
		return s1+" and "+s2+" are equal";
	}

	
	public static void main(String[] args) {
		
		String s1 ="First";
		String s2="First";
		
		System.out.println("The bigger string is :"+getBiggerString(s1, s2));
	
	}

	
}
