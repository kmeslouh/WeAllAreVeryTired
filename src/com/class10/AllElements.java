package com.class10;

public class AllElements {

	public static void main(String[] args) {

		String[] names = new String[9];
		names[0] = "Aisha";
		names[1] = "Aryan";
		names[2] = "Daryna";
		names[3] = "Kenza";
		names[4] = "Mirage";
		names[5] = "Safiet";
		names[6] = "Yara";
		names[7] = "Yuliya";
		names[8] = "Zhanna";

		System.out.println(names[3]);

		String[] name = { "Aisha", "Aryan", "Daryna", "Kenza", "Mirage", "Safiet", "Yara", "Yuliya", "Zhanna" };
		System.out.println(names[3]);
		
		                     // Print with for loop // HOW TO GET ALL ELEMENT FROM AN ARRAY
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		
	}

}
