package com.Revature.ControlFlow;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalcChallenge {

	public static String RemoveZerosFromDouble(double D)
	{
		//This method removes the trailing zeros, but i'm not sure if it's the best answer.
		 DecimalFormat removeZeros = new DecimalFormat("#.##################");
	        String Number = removeZeros.format(D);
		
		return Number;
	}
	public static double GradeCalc(double ec , double mPoints , double Points)
	{
		//This method calculates the percentage grade
		// First we check to see if the input is correct.
		if(Points > mPoints)
		{ //If points made are higher than the points possible we exit, an A+ can only be achieved with extra credit.
			System.out.println("Regular Points earned can't be higher than Maximum Points possible! Please Try Again!");
		     System.exit(0); 
		}
		System.out.println("Doing the math...");
		Double P= (Points * 100 / mPoints);
		Double Extra = (ec * 100 / mPoints);
		P += Extra;
		return P;
	}
	public static String letterGrade(Double D)
	{
		//This method Calculates the letter grade
		String letter = "";
		 if (D > 100)
		 {
			 letter = "A+";
		 }
		 else if((D <= 100)&&(D >= 90))
		 {
			 letter = "A";
		 }
		 else if((D <= 89)&&(D >= 80))
		 {
			 letter = "B";
		 }
		 else if((D <= 79)&&(D >= 70))
		 {
			 letter = "C";
		 }
		 else if((D <= 69)&&(D >= 60))
		 {
			 letter = "D";
		 }
		 else if((D <= 59)&&(D >= 0))
		 {
			 letter = "F";
		 }
		 else if(D < 0)
		 {
			 letter = "F-";
		 }
		 return letter;
			 /*
			 Grade Scale
			 A 90 -100
			 B 80 -89
			 C 70-79
			 D 60-69
			 F 0-59	 
			 */
			
	}
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter The Maximum Amount Of Points Possible. Not Including Extra credit Points");
        double maxPoints = scan.nextDouble();
        System.out.println("Please Enter The Total Amount Of Extra credit Points The Student Received.");
        double ecPoints = scan.nextDouble();
        System.out.println("Please Enter The Amount Of Regular Points The Student Got. Not Including Extra Credit Points");
        double Points = scan.nextDouble();
        scan.close();
        double totalPercent = GradeCalc(ecPoints ,maxPoints , Points);
        String formattedNumber = RemoveZerosFromDouble(totalPercent);
       
        System.out.println("The Student Got "+formattedNumber+" Percent!");
        
        System.out.println("The Student Got A Letter Grade Of "+letterGrade(totalPercent)+" . \nThank You for using Letter Grade Calculator");
        
        
	}

}
