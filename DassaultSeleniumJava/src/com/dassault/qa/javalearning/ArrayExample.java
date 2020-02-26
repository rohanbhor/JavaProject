package com.dassault.qa.javalearning;

public class ArrayExample {
	
	public static int biggerNumber(int[] myArr) {
		int largetstNum = 0;

		for(int i=0;i<myArr.length; i++ ) {		
			if(largetstNum < myArr[i]) {
			largetstNum = myArr[i];
			}	
		}

		return largetstNum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArr = {10,23,34,5,100,320,201};
		
		int myNum;
		myNum = biggerNumber(myArr);
		System.out.println(myNum);
		
	}



}
