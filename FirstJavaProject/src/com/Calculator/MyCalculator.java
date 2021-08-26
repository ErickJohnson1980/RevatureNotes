package com.Calculator;

public class MyCalculator {

	
	public int power(int n , int p )
	{
		int result =0;
		
			try {
				for(int i = 0; i <p ; i++)
				{
					result= result*n;
				}
				
			} catch (Exception e) {
				
				System.out.println(e);
			}
		
		
		
		return result;
	}
	
}
