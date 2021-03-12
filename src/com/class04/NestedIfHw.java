package com.class04;

public class NestedIfHw {

	public static void main(String[] args) {

		boolean diploma = true;
		boolean degreeprogram = true;
		double score = 3.5;

		if (diploma) {
			System.out.println("Congratulations");
			if (score >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else if (score < 3.5) {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You have to get a degree");
		}
		System.out.println("---------------------------------");
		int mortgagerate = 5;
		int mortgageprice = 500;

		if (mortgagerate > 4.5) {
			System.out.println("You cant buy a house");

		} else {

			if (mortgageprice > 200000) {
				System.out.println("you can take a loan");

			} else {
				System.out.println("you will pay cash");
			}
		}

	}

}
