package com.oop;
/*
 * if child class has the same method as declared in the parent class, it is known as Method Overriding
 * 
 * Method Overriding must be used in case of inheritance. it has IS-A relationship
 * Method must have the same name as in parent class
 * Method must have the same parameters as in parent class
 */
public class MethodOverriding extends Vechical{
	
	@Override
	public void move() {
		System.out.println("This is Method Overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading overridingObj = new MethodOverloading();
		
	}

}
