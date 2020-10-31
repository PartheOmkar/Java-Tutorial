package com.oop;
/*
 * The Super keyword in java is a reference variable that is used to refer parent class object
 * 
 * Java super keyword
 * 1 > used to refer immediate parent class instance variable
 * 2 > used to invoke parent class method
 * 3 > used to invoke parent class constructor
 */
public class SuperKeyword extends Vechical{
	String wheels = "Truck has 4 wheels";
	
	void display()
	{
		System.out.println(wheels);
		System.out.println(super.wheels);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword a = new SuperKeyword();
		a.display();
	}

}
