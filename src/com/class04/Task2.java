package com.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. If they
		// are 18 and older you will issue a driver license to them, otherwise you will
		// offer them to get a learners permit.
		
System.out.println("This is DMV Virginia, how old are you ?");

        Scanner input = new Scanner(System.in);
        
		int age = input.nextInt();
		 
		if ( age >= 18) {
			System.out.println("You can have your driver license !");
		} else {
			System.out.println("You can get a learner permit");
		}

	}

}
