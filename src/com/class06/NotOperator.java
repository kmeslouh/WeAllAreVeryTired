package com.class06;

public class NotOperator {

	public static void main(String[] args) {

		boolean rain = true;

		if (!rain) {
			System.out.println("I will go to the park");
		}

		boolean boo = !true;
		System.out.println(boo); // false

		boolean boo1 = !false;
		System.out.println(boo1); // true

		boolean traffic = true;
		if (!traffic) {
			System.out.println("I will come on time");
		}

		String day="Friday";
		if (!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		boolean homework = true;
		if (!homework) {
			System.out.println("I will be happy");
		}
	}

}
