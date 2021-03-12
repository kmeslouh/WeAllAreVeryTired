package com.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner input;
		int quiz, midterm, finalscore, gpa;
		char grade = 0;
		input = new Scanner(System.in);
		
		System.out.println("Please enter your Quiz score");
		quiz = input.nextInt();
		
		System.out.println("Please enter your Midterm score");
		midterm = input.nextInt();
		
		System.out.println("Please enter your Final score");
		finalscore = input.nextInt();
		
		gpa = (quiz + midterm + finalscore)/3;
		
		if ( gpa >= 90) {
			grade = 'A';
		} else if (gpa >=70 && gpa<90) {
			grade = 'B';
		} else if (gpa >=50 && gpa<70) {
			grade = 'C';
		} else if (gpa <50) {
			grade = 'F';
		}
			System.out.println("Your grade is " + grade);
		}
	
		
	}


