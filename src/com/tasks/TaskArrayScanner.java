package com.tasks;

import java.util.Scanner;

public class TaskArrayScanner {

	public static void main(String[] args) {

		/*
		 * Create an array on double value using Scanner.Calculate the sum of all stored
		 * elements in that array
		 */

		Scanner scan;
		int[] array;
		int sum = 0;
		scan = new Scanner(System.in);
		System.out.println("How many number would you like to store ?");
		int size = scan.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter the numbers");
			a[i] = scan.nextInt();
			sum += a[i];
		}
		System.out.println("The sum of the numbers is " + sum);

		sum = 0;

		for (double num : a) { // USING FOR EACH LOOP
			sum += num;
		}
		System.out.println("The sum of the numbers is " + sum);
	}
}
