package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		
		/* We need to get time based on the time we need to identify what is the time of the day
		 *    if time is between 1 to 11 --> morning
		 *    if time is between 12 to 13 --> noon
		 *    if time is between 14 to 17 --> afternoon
		 *    if time is between 18 to 21 --> evening
		 *    if time is between 22 to 24 --> night
		 */
		
		Scanner scan;
		int time;
		String timeOfTheDay = null;
		
		scan = new Scanner(System.in);
		
		System.out.println("Please enter the time in 24 hours format");
		time = scan.nextInt();
		
		if (time>=1 && time<=11) {
			timeOfTheDay = "Morning";
			
			}else if (time>=12 && time<=13) {
				timeOfTheDay = "Noon";
				
			} else if (time>=14 && time<=17) {
				timeOfTheDay = "Afternoon";
				
			} else if (time>=18 && time<=21) {
				timeOfTheDay = "Evening";
				
			} else if (time>=22 && time<=24) {
				timeOfTheDay = "Night";
				
			}
		
		System.out.println("It is " + timeOfTheDay);
		
 
	}

}
