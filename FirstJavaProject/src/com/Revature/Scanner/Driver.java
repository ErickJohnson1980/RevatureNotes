package com.Revature.Scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		// an object 
		// classes are blueprints of an object and define how they behave
		
		Scanner scan = new Scanner(System.in); //the new keyword instantiates an object from the class
		
		// prompt the user and capture their input
		
		System.out.println("Please Enter your name!");
		
		String name = scan.nextLine();
		
		System.out.println("Enter your age!" );
		
		int age = scan.nextInt();
		
		
		System.out.println("Hello " + name + " In 100 years you will be " +FutureAge(age)+" Years Old!");

		
		
	}
	
	public static int FutureAge(int a)
	{
	a = a +100;
	
	return a;
		
	}
	

}
