package com.Revature.DataTypes;

public class Driver {
 public static void main(String[] args) {
	// 8 Primitive DataTypes
	 
	 boolean isCool = true;//1 bit of reserved memory
	 
	 byte reallySmallNumber = 127; // 8 bits of reserved memory
	 
	 short shortNumber = 32467;//16 bits of reserved memory
	 
	 char letter = 'm'; //16 bits of mem that represents an ascii character
 
	 int Integer = 100; //32 bits of reserved memory
	 
	 float lessPreciseDecimal = 93.2f; //32 bits of reserved memory
	 
	 double trueDecimal = 145.63; // 64 bits of reserved memory
	 
	 long veryLargeNumber = 12345; // 64 bits of reserved memory
	 
	 // since java 7 you can use underscores for readability
	 
	 long creditCardNumber = 1234_5678_5757L; 
	 int secondsInDay = 86_408;
	 
	 int x = 4;
	 int y = 10;
	 
	 System.out.println(x+y);
	 
	 String name = "Spongebob";
	 
	 System.out.println("Hello "+name+" you are "+ x+y + " years old!");
	 
	 byte a = 40;
	 short b = a;//transform bytes into shorts
	 int c = b; // this is called widening, widening is transforming a small type to a large datatpye, this is implicit casting 
	 
	 
	 double dub = 900.9;
	 int Myint = (int) dub;// this is explicit casting and results in data loss.
	 
	 System.out.println("Myint now equals "+Myint);
	 
	 // Everything we coded above are java literals. fixed values assigned to primitive datatype.
	 
	 
	 
 }
}
