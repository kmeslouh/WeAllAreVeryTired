package com.class04;

import java.util.Scanner;

public class Demo {
	//shortcut to import ctrl + shift + o

	public static void main(String[] args) {

	  int i = 10;
	  String str = "Hello";
	  
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Please enter any text");
	  
	  String text = scan.nextLine(); // capture your input from console
	  
	  System.out.println("Please enter your name");
	  
	  String name = scan.next(); // captures 1 word till space
	  
	  System.out.println("Nice to meet you " + name);
	  
	  System.out.println("Please enter your age");
	  
	  int age = scan.nextInt();
	  
	  System.out.println("My name is " + name + " and I am " + age + " years old");


	  
	}

}
