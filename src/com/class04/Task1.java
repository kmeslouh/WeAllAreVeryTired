package com.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed. If loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.

		System.out.println("What is the amount of loan is needed");

		int num = input.nextInt();

		if (num <= 200000) {
			System.out.println("You can lend the money");
		} else {
			System.out.println("Client rejected");
		}

		
	}

}
