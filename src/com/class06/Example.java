package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/* We need to calculate final price after the discount 
		 * We need to check if there is sale
		 * If no sale --> I am not going for shopping
		 * If there is sale 
		 *       we will ask the item
		 *       we will ask the price
		 * If price is less than 10$ --> apply 5% discount
		 * If price is between 10 and 100 --> apply 10% discount
		 * If price is between 100 and 500 --> apply 20% discount
		 * If price is more than 500 --> apply 30% discount
		 */
		
		double discount = 0, finalprice;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Do we have sale today");
		 boolean sale = input.nextBoolean();
		 
		 if (sale == true ) {
			 System.out.println("What item do you want ?");
			 String item = input.next();
			 System.out.println("How much it is ?");
			 double price = input.nextDouble();
			 if (price < 10) {
				 discount = price * 0.05;
			 } else if ( price >=10 && price<= 100) {
				 discount = price * 0.1;
			 } else if (price >=101 && price<= 500) {
				 discount = price * 0.2;
			 } else if (price > 500) {
				 discount = price * 0.3;
			 }
			 
			 finalprice = price - discount;
			 
			 System.out.println("I bought a " + item + " the price is " + price + " the discount is " + discount + " and the final price is " + finalprice);
			 
		 } else {
			 System.out.println("I am not going for shopping today :( ");
		 }
		
		
		
		
		
		
		
		
		
		
		
	}

}
