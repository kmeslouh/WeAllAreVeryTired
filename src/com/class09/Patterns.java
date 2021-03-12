package com.class09;

public class Patterns {

	public static void main(String[] args) {

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 8; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for (int n = 4; n >= 1; n-- ) { // only for rows
			for (int m = 6; m >= 1; m--) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");

	}

}
