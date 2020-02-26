package com.dassault.qa.javalearning;

public class WhileLoopExample {
	
	
	public static String getMonthString(int month) {	
		switch (month){
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "No month found";				
		}
	}
	
	public static void printMonthString(int month) {	
		String monthstring ;
		switch (month){	
		case 1: 
			monthstring= "January"; 
			break;
		case 2: 
			monthstring= "February"; 
			break;
		case 3: 
			monthstring= "March";
			break;
		case 4: 
			monthstring= "April";
			break;
		case 5: 
			monthstring= "May";
			break;
		case 6: 
			monthstring= "June";
			break;
		case 7: 
			monthstring= "July";
			break;
		case 8: 
			monthstring= "August";
			break;
		case 9: 
			monthstring= "September";
			break;
		case 10: 
			monthstring= "October";
			break;
		case 11: 
			monthstring= "November";
			break;
		case 12: 
			monthstring= "December";
			break;
		default: 
			monthstring= "No month found";	
		}
		
		System.out.println(monthstring);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;	
		while(i<13) {
			printMonthString(i);
			i++;
		}
	/*	
		while(i<13) {
			System.out.println(getMonthString(i));
			i++;
		}
	*/
	}

}
