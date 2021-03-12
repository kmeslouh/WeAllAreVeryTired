package com.tasks;

public class GroupTask2 {

	public static void main(String[] args) {

		int [] [] numbers= {
				{5,6,7,8},
				{23,45,66,84},
				{102,345,543,678}
		};
		
		for ( int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				if ( numbers[r] [c]%2==0 ) {
					System.out.print(numbers [r][c]+" ");
					
				}
				
			}
			System.out.println();
		}
	}

}
