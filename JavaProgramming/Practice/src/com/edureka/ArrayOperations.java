package com.edureka;

public class ArrayOperations 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char source[] = {'H','A','P','P','Y','L','E','A','R','N','I','N','G'};
		char copy[]= new char[7];
		
		// Copying element from one array to another
		System.arraycopy(source,0,copy,1,5);
		
		System.out.println(new String(copy));
		
		//deleting element from array
		int flag = 3;
		for(int i=0;i<source.length;i++) {
			if(flag == i) {
				for(int j=i+1;i<source.length-1;j++) {
					source[i]=source[j];
					i++;
				}
				System.out.println(source);
			}
		}
		

	}

}
