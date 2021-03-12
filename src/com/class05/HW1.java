package com.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner scan;
		String birthmonth, season;
		scan = new Scanner (System.in);
		
		System.out.println("What is your birth month ?");
		birthmonth = scan.next();
		
 if(birthmonth.equalsIgnoreCase("December") || birthmonth.equalsIgnoreCase("January") || birthmonth.equalsIgnoreCase("February")) {
		season = "Winter";
	} else if (birthmonth.equalsIgnoreCase("March") || birthmonth.equalsIgnoreCase("April") || birthmonth.equalsIgnoreCase("May")) {
		season = "Spring";
	} else if (birthmonth.equalsIgnoreCase("June") || birthmonth.equalsIgnoreCase("July") || birthmonth.equalsIgnoreCase("August")) {
		season = "Summer";
	} else if (birthmonth.equalsIgnoreCase("September") || birthmonth.equalsIgnoreCase("October") || birthmonth.equalsIgnoreCase("November")) {
		season = "Fall";
	} else {
		season = "Invalid";
		
	}
		System.out.println("You were born in " + season);
		
	}

}
