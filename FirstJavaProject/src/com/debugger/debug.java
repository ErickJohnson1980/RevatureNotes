package com.debugger;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class debug {
	
	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	       
	        
	        try
            {
             int x = scan.nextInt();
             int y = scan.nextInt();
             int result = 0;
             result = x/y;
             
              System.out.println(result);
            }
            catch (Exception e)
            {
             System.out.println(e);
             
            }
	            
	        
	        
	    }
	    
	
}
