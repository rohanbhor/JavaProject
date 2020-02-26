package com.dassault.qa.javalearning;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<>();
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Pineapple");
		list1.add("Grapes");
		
		System.out.println(list1);
		
	
		System.out.println("****************************");
		
		List<String> list2= new ArrayList<>();
		
		for (int i=0; i<list1.size(); i++) {
			if((i%2) == 0) {
				list2.add(list1.get(i));
			}
			
		}
		
		list2.remove(0);
		for(String s : list2) {
			System.out.println(s);
		}
	}

}
