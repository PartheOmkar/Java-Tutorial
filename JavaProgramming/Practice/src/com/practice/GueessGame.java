package com.practice;

import java.util.Scanner;

public class GueessGame {

	static void playgame()
	{
		Scanner input = new Scanner(System.in);
		int guessno;
		int machinno;
		int count = 0;
		
		machinno = (int)(100*Math.random())+1;
		while(true)
		{
			System.out.println("Enter a Number");
			guessno = input.nextInt();
			count++;
			if(guessno == machinno)
			{
				System.out.println("You Win this game your guess is true");
				System.out.println("The game is over");
				break;
			}
			if(count == 6)
			{
				System.out.println("The game is over you have try Multiple guesses");
				System.out.println("The Machine No is " + machinno);
				break;
			}
			else if(guessno > machinno)
			{
				System.out.println("The Guess No is Greater Than The Machine Number");
				System.out.println("Enter a Small No then " + guessno);
			}
			else if(guessno < machinno)
			{
				System.out.println("The Guess No is Smaller Then The Machine Number");
				System.out.println("Enter a Bigger No Then " + guessno);
			}
			
		}
		//close(input);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Play this game guess the number");
		System.out.println("guess the Number in between the 1 and 100");
		playgame();
	}

}