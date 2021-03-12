package com.class04;

public class NestedIfExample {

	public static void main(String[] args) {
		boolean morning = false;
		boolean classToday = true;

		if (morning) {

			System.out.println("Let me check if I have a class today");
		} else {

			if (classToday) {
				System.out.println("I will attend class at Syntax");
			} else {
				System.out.println("I can relax");
			}
		}

	}

}
