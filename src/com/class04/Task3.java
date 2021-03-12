package com.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		// Create a Java program that will ask user to input city and temperature. Your
		// program should convert Fahrenheit into celsius and print “The temperature is
		// the city __ is __”

		Scanner task = new Scanner(System.in);

		System.out.println("Name of the city ");

		String city = task.next();

		System.out.println("What is the temperature in Fahrenheit");

		int temp = task.nextInt();

		double converttocel = ((temp - 32) / 1 / 8);

		System.out.println("The temperature in the city " + city + " is " + converttocel);

	}

}
