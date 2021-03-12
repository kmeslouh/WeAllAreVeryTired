package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {

		String [][] usa = {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahasee"}
		};
		
		System.out.println(usa.length); // 5 arrays / rows
		System.out.println(usa[0].length); // 5 element inside 1 array 
		System.out.println(usa[1].length); // 3 element inside 2 array
		
		for (int r=0; r<usa.length; r++) { // iterates over rows
			
			for (int c=0; c<usa[r].length; c++) {
				
				System.out.print(usa[r][c] + " ");
	    	}
			
			System.out.println();
		}
		
		System.out.println("---------- Using nested for each loop --------------------");
		
		for (String[] cities : usa) {
			for (String city : cities) {
				System.out.print(city + " ");
			}
			 
			System.out.println();
		}
		
		
	}
}
