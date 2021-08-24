package com.Revature.ArraysChallenge;

import java.util.Scanner;

public class UserCreatedArray {

	static private Scanner scan = new Scanner(System.in);
	
	public static int[] CreateArray(int arrayLength)
	{
		int[] UserArray = new int[arrayLength];
		return UserArray;
	}
	
	public static int[] PopulateArray(int[] UserArray)
	{
		for(int i=0; i < UserArray.length ; i++)
		{
			System.out.println("Please Enter the value of Array["+i+"]. (int)");
			UserArray[i] = scan.nextInt();
		}
		
		
		return UserArray;
	}
	
	public static double ArrayAverage(int[] UserArray)
	{
		double arrayTotal = 0;
		for(int i =0 ; i < UserArray.length ; i++)
		{
			arrayTotal += UserArray[i];
		}
		double avg = arrayTotal / UserArray.length;
		return avg;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter the Length of the Array you wish to create.(Int)");
		int arrayLength = scan.nextInt();
		
		int[] UserArray = CreateArray(arrayLength);
		
		PopulateArray(UserArray);
		
		System.out.println("The average of the values in your array is "+ArrayAverage(UserArray));
		scan.close();
	}
	
}
