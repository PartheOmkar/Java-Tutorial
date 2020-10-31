package com.oop;

public class ConstructorChaining {
	
	public String sname;
	public int smark;
	// default constructor of a class
	public ConstructorChaining() {
		// this will call the constructor with string parameter
		this("Omkar");
	}
	public ConstructorChaining(String name) {
		// this will call the constructor with string parameter and int
		this(name,70);
	}
	
	public ConstructorChaining(String name, int mark) {
		this.sname = name;
		this.smark = mark;
	}
	
	void display() {
		System.out.println("Student Name : "+ sname);
		System.out.println("Student Roll No : "+smark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChaining obj = new ConstructorChaining();
		obj.display();

	}

}
