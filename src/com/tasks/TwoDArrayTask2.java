package com.tasks;

public class TwoDArrayTask2 {

	public static void main(String[] args) {

		String [][] cars = {
				{"Ford", "Chevrolet", "Jeep"},
				{"Audi", "BMW"},
				{"Kia", "Hyundai"},
				{"Ferrari", "Fiat"},
		};
		
		for (String [] auto : cars) {
			for (String car : auto) {
				System.out.print(car + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		
		String [][] grocery = {
				{"Tomato", "Potato", "Carrot"},
				{"Strawberry", "Banana", "Kiwi"},
				{"Milk", "Butter"},
				{"Chocolate"},
		};
		for (int r=0; r<grocery.length; r++) {
			for (int c=0; c<grocery[r].length; c++) {
				System.out.print(grocery[r][c] + " ");
			}
			System.out.println();
		}
	}
}
