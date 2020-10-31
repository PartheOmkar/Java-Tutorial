package com.oop;
/*
 * this keyword is used as reference variable to the current object
 * this can be passed as an argument in the constructor call
 * this can be used to involve current class method
 * this can be passed as an argument in the method call
 * this() can be used to invoke current class constructor
 * the this keyword is mainly used to refer current class instance variable and it can also
 * be return the current class instance from the method
 */
public class ThisKeyword 
{
	int rollno;
	String name;
	
	public ThisKeyword(int rollno, String name) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno+" "+name);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThisKeyword obj1 = new ThisKeyword(10, "Omkar");
		ThisKeyword obj2 = new ThisKeyword(20, "Batman");
		obj1.display();
		obj2.display();
	}

}
