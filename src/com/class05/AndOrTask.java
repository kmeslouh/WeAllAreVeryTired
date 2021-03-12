package com.class05;

import java.util.Scanner;

public class AndOrTask {

	public static void main(String[] args) {

		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner scan = new Scanner(System.in);
		int height;

		System.out.println("Please enter your height in inches");
		height = scan.nextInt();

		if (height < 60) {
			System.out.println("You are a person who's height is short");
			
		} else if (height >= 60 && height <= 72) {
			System.out.println("You are a person who's height is medium");
			
		} else if (height >= 72) {
			System.out.println("You are a person who's height is tall");
		}

	}

}
