package com.revature.util;

import com.revature.exceptions.NotAClassException;
import com.revature.exceptions.NotAGradeException;
import com.revature.exceptions.NotANumberException;
import com.revature.exceptions.NotAllLettersException;
import com.revature.models.Student;

// all this class is is a place for useful methods
public class UtilityMethods {

	/**
	 * https://stackabuse.com/how-to-make-custom-exceptions-in-java/
	 * 
	 * @param gradeYear
	 * @throws NotAGradeException
	 */
	public static void validateGradeYear(int gradeYear) throws NotAGradeException{
		
		if (gradeYear <= 0 || gradeYear > 4) {
			throw new NotAGradeException("Please enter a valid grade number between 1 and 4");
		}
		
	}
    public static void validateName(String str) throws NotAllLettersException{
		
	    for(int i =0; i < str.length(); i++)
	    {
	    	char letter = str.charAt(i);
	    	if(!Character.isLetter(letter))
	    	{
	    		throw new NotAllLettersException(str+ " Is Not A Valid Name! Please try again.");
	    	}
	    }
		
	}
public static void validateNumber(int number) throws NotANumberException{
		
	    	if(number < 0)
	    	{
	    		throw new NotANumberException(number+ " Is Not A Valid Number! Please try again.");
	    	}
	    
		
	}

public static void validateClass(int number) throws NotAClassException{
	
	if(number < 0 || number > 5)
	{
		throw new NotAClassException(number+ " Is Not A Valid Class! Enter valid a number 1-5");
	}


}


	public static void printStudentInfo(Student[] arr) {
		
		for (Student s : arr) {
			s.showStatus();
		}
		
	}
	
}