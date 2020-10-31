package com.edureka;

public class Methods 
{
	int addition(int val1, int val2) {
		val1 = 40;
		int result = val1+val2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj = new Methods();
		int val1 = 20;
		int val2 = 30;
		System.out.println(val1);
		// call by referance
		int result = obj.addition(val1, val2);
		System.out.println(val1);
		System.out.println("the addition is :"+result);
		// call by value
		int result2 = obj.addition(30, 400);
		System.out.println(result2);

	}

}
