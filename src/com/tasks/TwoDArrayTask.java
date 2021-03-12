package com.tasks;

public class TwoDArrayTask {

	public static void main(String[] args) {

		// Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		// Miss
		// and Smith, Jordan, Jackson, Obama.
		// After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		// Miss Jordan.

		String[] [] name = {{"Mr", "Mrs", "Ms", "Miss"},{"Smith", "Jordan", "Jackson", "Obama"}};

		System.out.println(name[0][1]+" " + name[1][0] );
	}

}
