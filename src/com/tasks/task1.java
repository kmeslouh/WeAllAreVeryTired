package com.tasks;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] days;
		int pos;

		System.out.println("How many String elements would you like to store");

		int size = scan.nextInt();

		days = new String[size];

		for (int i = 0; i < size; i++) {
			pos = i + 1;
			System.out.println("Please enter day " + pos + " of the week");
			days[i] = scan.next();
		}
		for (String str : days) {
			System.out.println(str);
		}

	}
}