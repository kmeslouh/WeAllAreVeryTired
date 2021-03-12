package com.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/* Store a gender using M or F
		 * based on the gender we will specify
		 * if M --> Male
		 * if F --> Female
		 * otherwise --> not sure
		 */

		char gender ='F';
		String description;
		
		switch (gender) {
		
		case 'M':
			description = "Male";
			break;
			
		case 'F' :
			description = "Female";
			break;
		
		default:
			description = "N/A";
		}
		
	}

}
