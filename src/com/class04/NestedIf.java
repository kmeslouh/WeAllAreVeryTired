package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;
		boolean classToday = true;

		// is it morning ? ----> Good morning

		if (morning) {
			System.out.println("Let me check if I have class today");
			
			if (classToday) {
				System.out.println("Good morning my classmates");
				
			} else {
				System.out.println("Good morning my family");
			}
		}
		System.out.println("--- End of the code ---");
		
		// ------------------------------------------------------------------------------------------------------------
		
		boolean isFriday = false;
		int day = 13;
		
		if (isFriday) {
			 System.out.println("It is a movie day !!!");
			 
			 if (day == 13) {
				 System.out.println("I will watch a scary movie");
			 } else {
				 System.out.println("I watch any available movie");
		 }
			 
		} else {
			 System.out.println("I will stay at home and study Java");
		 }
		 
		}
		
		
	}


