package com.edureka;

public class StaticKeyword 
{
	void nonStaticKeyword()
	{
		System.out.println("this is non Static keyword function");
	}
	
	static void statickeyword()
	{
		System.out.println("this is static keyword function");
	}
	
	public static void main(String[] args) 
	{
		StaticKeyword obj = new StaticKeyword();
		obj.nonStaticKeyword();
		statickeyword();
	}

}
