package com.class04;

import java.util.Scanner;

public class AnotherDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		
		int num1 = input.nextInt();
		
	System.out.println("Please enter second number");
	
	int num2 = input.nextInt();
	
	 if (num1 > num2) {
		 System.out.println( num1 + " is larger than " + num2 );
	 } else if ( num1 < num2 ) {
		 System.out.println( num2 + "is larger than " + num1 );
	 } else {
		 System.out.println( num1 + " is equals to " + num2);
	 }
	
	
		
	}

}
