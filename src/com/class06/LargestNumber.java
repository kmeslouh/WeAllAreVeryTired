package com.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3, largest = 0;

		System.out.println("Please enter 3 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are equals");
		} else {

			if (num1 > num2) {

				if (num1 > num3) {
					largest = num1;
				} else {
					largest = num3;
				}
			} else {

				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}
			}
			System.out.println("The largest number among " + num1 + " ," + num2 + " ," + num3 + " is " + largest);

		}
	}

}
