package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class InputOutputDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// create file if it is not exit
		File employeeInfoFile = new File("/root/Desktop/today/InputOutputDemo.txt");
		
		
		InputOutputDemo demo = new InputOutputDemo();
		// write operation on file
		demo.writeToFile(employeeInfoFile);
		// read operation on file
		demo.readFile(employeeInfoFile);
	}
	
	public void writeToFile(File fileToWrite) {
		
		// use printwriter to perform write opeartion on file
		PrintWriter empInfoWriter =null;
	try {
		
		empInfoWriter = new PrintWriter(fileToWrite);
		// write on file
		empInfoWriter.println("Hello");
		empInfoWriter.println("I am Parthe Omkar");
		
	}catch(FileNotFoundException e) {
		
		System.out.println("given file was not fount on the local disk"+fileToWrite.getName());
		throw new RuntimeException();
		
	}finally {
		// close file
		empInfoWriter.close();
	}
	}
	
	public void readFile(File fileToRead) throws FileNotFoundException {
		// scanner class is used to read file
		Scanner read = new Scanner(fileToRead);
		// while read.hasnext() is used to read file up to its not null
		while(read.hasNext()) {
			// print readed output
			System.out.println(read.nextLine());
		}
		// close read cursour
		read.close();
	}
}
