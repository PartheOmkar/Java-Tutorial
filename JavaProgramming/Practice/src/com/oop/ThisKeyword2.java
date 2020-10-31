package com.oop;

public class ThisKeyword2 {
	
	public ThisKeyword2() {
		// TODO Auto-generated constructor stub
		this("Omkar");
		System.out.println("Welcome to Edureka");
	}
	
	public ThisKeyword2(String name){
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword2 obj = new ThisKeyword2();
	}

}
