package com.class09;

public class Recap {

	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						System.out.println(a + " " + b + " " + c + " " + d);
					}
				}

			}
		}
		System.out.println("------------------------------------------");

		for (int z = 0; z < 24; z++) {
			for (int x = 0; x < 60; x++) {
				if (x < 10 && z < 10) {
					System.out.println("0" + z + ":0" + x);
				} else if (z < 10 && x >= 10) {
					System.out.println("0" + z + ":" + x);
				} else if (z >= 10 && z < 10) {
					System.out.println(z + ":0" + z);
				} else {
					System.out.println(z + ":" + x);
				}
			}
		}
		System.out.println("----------------------------------------------------");
		

		int mult;
		
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= 9; n++ ) {
			mult = i * n;
			System.out.println(i + "*" + n + "=" + mult);	
			}
		}
		

	}

}
