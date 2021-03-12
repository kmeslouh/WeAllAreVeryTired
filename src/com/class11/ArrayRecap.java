package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		/*  We want to create an array and store  element
		 * from a user
		 */
		
		Scanner scan;
		
		String[] array;
		
		scan = new Scanner (System.in);
		System.out.println("How many String elements would you like to store");
		
		int size = scan.nextInt();
		
		array = new String [size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a String");
			array[i] = scan.next();
		}
		for (String str:array) {
			System.out.print(str + " ");
		}
		
		
		

	}

}
