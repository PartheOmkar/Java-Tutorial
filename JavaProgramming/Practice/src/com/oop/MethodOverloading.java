package com.oop;

/* A class may define multiple methods with the same name and return type, but different number of arguments 
 * or arguments of different data types. this is called Method Overloading
 */
public class MethodOverloading 
{
	public void area(int b, int h) {
		System.out.println("the area is : "+0.5*b*h);
	}
	public void ares(int r) {
		System.out.println("The area is : "+3.14*r*r);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		
		obj.area(5, 6);
		obj.ares(5);
		
	}
}
