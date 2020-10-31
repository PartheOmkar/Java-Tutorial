package com.edureka;

/*
 * Variables are memory locations which are reserved to store values
 * this implies while declaring a variable you reserve some memory
 * there are 3 types of variables:
 * 1 > Local
 * 2 > Instance
 * 3 > Class/Static
 */
public class VariablesIntro 
{
	// instance variable
	int var = 10;
	
	// static variable
	static int staticVariable = 0;
	void local()
	{
		//local variable
		int lc = 15;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		VariablesIntro inst = new VariablesIntro();
		
		inst.var = 23;
		
		// static variable are class level not a instance level
		VariablesIntro.staticVariable = 54;
	}

}
