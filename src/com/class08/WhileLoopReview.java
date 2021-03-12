package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {

		// we need to make user to pay for a soda
		// keep asking user to pay you until it enters 3
		// if user gives more > 3 --> please give less money
		// if user gives less < 3 --> please give more money
		
		Scanner input = new Scanner (System.in);
		 int money;
		 
		 System.out.println("Please pay for the soda");
		 
		 do {
			 
			 money = input.nextInt();
			 
			 if (money < 3) {
				 System.out.println("Please give more money");
			 } else if (money > 3) {
				 System.out.println("Please give less money");
			 }
		 } while (money != 3);
		 System.out.println("Thank you for your purchase");
	
	}

}
