package com.tasks;

import java.util.Scanner;

public class PrintArrayInverse {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		int size = 5;
		int[] nums = new int[size];

		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
    }
    for (int num : nums) {
      System.out.println(num*10);
    }

	}
}
