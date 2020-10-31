package com.edureka;
//string are mutable
public class StringDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "Happy";
		System.out.println("Original String is : "+s1);
		s1 = s1.concat(" Learning");
		System.out.println("After concatination string is : "+s1);
		// Operation on String
		
		String s2 = "Omkar";
		String s3 = "parthe";
		//print the length of string length()
		System.out.println(s2.length());
		
		// print the substrin of main string substring(indexOf_mainString)
		System.out.println(s2.substring(2));
		
		//compare a two string compareTo
		System.out.println(s2.compareTo(s3));
		
		// check string is empty or not isEmpty()
		System.out.println(s2.isEmpty());
		
		// to convert lower case toLowerCase()
		System.out.println(s2.toLowerCase());
		
		// to convert upper case toUpperCase()
		System.out.println(s2.toUpperCase());

	}

}
