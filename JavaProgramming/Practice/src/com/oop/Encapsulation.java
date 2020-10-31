package com.oop;
/*
 * Data Hiding : the user will have no idea about the inner implementation of class
 * Increased Flexibility : we can make variable and method read-only or write-only as per requirement
 * reusability : easy to reuse and easy to change with new requirements
 * Testing is easy
 */
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 en = new Encapsulation1();
		en.setName("Omkar");
		System.out.println(en.getName());
	}

}
