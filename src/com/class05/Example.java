package com.class05;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/*we have to calculate commission based on sales
		 * ask user to enter sale that he
		 * made based on sales we will calculate commission :
		 * if sale is between 10 to 100 --> commission is 10%
		 * if sale is between 101 to 500 --> commission is 20%
		 * if sale is between 501 to 1000 --> commission is 30%
		 * if more than 1000 --> commission is 50%
		 */
		
		Scanner scan;
		double saleAmount, comission = 0;
		scan = new Scanner(System.in);
		
		System.out.println("Please enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
	if (saleAmount < 10) {
			comission = 0;
		   }else if (saleAmount> 10 && saleAmount<=100) {
			comission = saleAmount * 0.1;
		   }else if (saleAmount>=101 && saleAmount<=500) {
			comission = saleAmount *  0.2;
		   } else if (saleAmount>=501 && saleAmount<=1000) {
			comission = saleAmount *  0.3;
		   }else {
			comission = saleAmount *  0.5;
		}
		
		System.out.println("Your sale amount is " + saleAmount + " and your comission is " + comission);
		
	}

}
