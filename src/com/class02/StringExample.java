package com.class02;

public class StringExample {

	public static void main(String[] args) {
		String name;
		name = "Chris";
		String greeting = "Good Morning!";
		String phoneNumber = "123-456-7890";
		
		String stringNumber = "12";
		String space = " ";
		
		String letter = "A";
		String letter2 ="A ";
		
		char oneLetter = 'A';
		
		// Hello, my name is Chris 
		System.out.println("Hello, my name is " + name);
		
		// How are you Chris?
		System.out.println("How are you " + name + " ?");
		
		int age = 25;
		// I am 25
		System.out.println("I am " + age);
		
		char grade = 'A';
		// Chris is A student 
		System.out.println( name + " is " + grade + " student" );
		
		/* String concatenation operator + can be used when we attach String to another String
		 * We attach String to a number 
		 * We attach String to any character or boolean 
		 */
		 String car = "Tesla";
		 int year = 2021;
		  // I drive 2021 Tesla
		 System.out.println("I drive " + year + " " + car);
		 
		 String computer = "MacBook";
		 int memory = 250;
		 // Chris has MacBook with 250 GB memory
		 System.out.println( name + " has " + computer + " with " + memory + " GB memory" );
		 
		 String combinedValue = year + " " + car ;
		 // 2021 Tesla 
		 System.out.println(combinedValue);
		 
		 byte day = 7;
		 String month = "February ";
		 
		 String date = month+day;
		 System.out.println(date);
		 
		 
		 
		 
		 
		 

	}

}
