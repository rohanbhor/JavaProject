package com.dassault.qa.javalearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set <String> mySet = new HashSet<String>();
		mySet.add("S");
		mySet.add("E");
		mySet.add("L");
		mySet.add("E");
		mySet.add("N");
		mySet.add("I");
		mySet.add("U");
		mySet.add("M");
		
		Iterator<String> it1 = mySet.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+"   ");
		}
		
		/////////////////////////////////////////////////////////////
		System.out.println("");
		
		Set <Integer> mySetInt = new HashSet<Integer>();
		mySetInt.add(5);
		mySetInt.add(4);
		mySetInt.add(5);
		mySetInt.add(6);
		mySetInt.add(9);
		mySetInt.add(3);
		mySetInt.add(2);
		mySetInt.add(3);
		
		Iterator<Integer> it2 = mySetInt.iterator();
		
		while(it2.hasNext()) {	
			System.out.print(it2.next()+"   ");
		}
		
		///////////////////////////////////////////////////////////////
		System.out.println("");
		List <Integer> myIntList = new ArrayList<Integer>();
		myIntList.add(5);
		myIntList.add(4);
		myIntList.add(5);
		myIntList.add(6);
		myIntList.add(9);
		myIntList.add(3);
		myIntList.add(2);
		myIntList.add(3);
		
		Iterator<Integer> it3 = myIntList.iterator();
		
		while(it3.hasNext()) {	
			System.out.print(it3.next()+"   ");
		}
		////////////////////////////////////////////////////////////////
			
	}

}
