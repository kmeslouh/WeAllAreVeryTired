package com.tasks;

public class GroupTask4 {

	public static void main(String[] args) {

		String[][] countries = {
				{"Dominican Republic", "Canada", "Cuba", "Mexica"},
				{"Brazil", "Argentina", "Colombia","Peru"},
				{"Great Britain", "Italy", "Monaco","France"},
				{"Nigeria", "Ghana", "Kenya", "Tanzania"}
				};
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("--- Nested For Each Loop ---");
		for (String[] names : countries) {
			for (String n : names) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}	
	}

