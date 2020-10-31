package com.ExceptionHandling;

public class DividebyZero 
{
	public void divide(int num1, int num2) {
		try {
		System.out.println(num1/num2);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("The problrm in division "+e.getMessage());
		}
		System.out.println("the end of division method");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 3;
		DividebyZero obj = new DividebyZero();
		obj.divide(num1, num2);

	}

}
