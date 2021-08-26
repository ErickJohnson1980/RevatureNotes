package com.Revature;

public class mainMethodDemo {
     
	
	
	public static void main(String[] args) {
		
		System.out.println("Testing 1,2,3");
		
		for( String n : args)
		{
			System.out.println(n);
		}
		try {
			System.out.println("The third command is"+args[2]);
		} catch (Exception e) {
			System.out.println("theres an exception");
		}
		System.out.println("I reached this code");
	}
	
}
