package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {

		/*
		 * We play lottery and we have a win number which is 17
		 * we need to keeps asking a user to enter any number from 1 to 100
		 * Until correct number is entered
		 */
		
		Scanner input = new Scanner (System.in);
		int num;
		int lotteryNumber = 17;
		
		do {
			System.out.println("Please enter any number from 1 to 100 to win");
			num = input.nextInt();
			
			} while (num != lotteryNumber);
		
		System.out.println("Congratulations you entered " + num + " which is the lucky number");
		
		
	}
}
