package com.edureka;
/*
 * A data type of a particular variable can be converted to other datatypes
 * there are 2 way in which we can perform datatype conversion:
 * - Implicit Conversion
 * - Explicit Conversion
 * 
 */
public class DataTypesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implicit Conversion
		char c = 'a';
		int k = c;
		float f = c;
		long l = c;
		double d = c;
		//char b = d; given error
		System.out.println("Implicite Conversion \n"+c+"\n"+k+"\n"+f+"\n"+l+"\n"+d);
		
		// string to int : Integer.parseInt()
		String s = "00";
		int num = Integer.parseInt(s);
		
		// String to Integer : Integer.valueOf()-
		Integer num2 = Integer.valueOf(s);
		
		// int to String : Integer.toString() or String.valueOf()
		
		
	}

}
