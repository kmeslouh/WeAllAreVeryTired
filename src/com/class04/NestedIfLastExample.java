package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {

		int age = 18;
		int weight = 110;

		if (age >= 18) {
			System.out.println("Let's check your weight");
			if (weight >= 110) {
				System.out.println("You can donate");
			}
		} else {
			System.out.println("You can not donate");
		}
	}

}
