package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {

		int [] array = new int [5];
		
		array [0] = 10;
		array [1] = 12;
		array [2] = 15;
		array [3] = 9;
		array [4] = 13;
		
		System.out.println(array [2]);
		
		double [] numbers = new double[2];
		numbers [0] = 10.99;
		numbers [1] = 19.01;
		
		numbers [0] = 11.99; // reassign variable
		
		System.out.println(numbers [0]);
		
		// Arrays are fixed in size
		
		String [] names = new String[3];
		names [0] = "Jahanzeb";
		names [1] = "Ozoda";
		names [2] = "Alec";
		
		System.out.println(names [2]);
		
		boolean [] b = new boolean [3];
		b [0] = true;
		b [1] = true;
		b [2] = false;
		
		System.out.println(b [2]);
		
		int size = b.length;
		
	}

}
