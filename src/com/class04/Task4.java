package com.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		// Create a Java program that will ask if user has a credit card or not. If you
		// user does not have a credit card then offer them. If they do have one ask
		// what is balance on the card? If balance of the card is larger than 1000, tell
		// them to pay off immediately, otherwise you can tell them that they can spend
		// more
		Scanner kiki = new Scanner(System.in);

		System.out.println("Do you have a credit card ? Please answer true or false");

		boolean card = kiki.nextBoolean();

		if (card == true) {

		System.out.println("What is the balance on the card ?");
		
        int balance = kiki.nextInt();

		
		 if (balance > 1000) {
				System.out.println("You have to pay off immedialty");
			} else {
				System.out.println("You can spend more");
			}  
		}else {
				System.out.println(" Would you like to open a credit card ?");

			
		}	
				
		
		
		

	}
	}


