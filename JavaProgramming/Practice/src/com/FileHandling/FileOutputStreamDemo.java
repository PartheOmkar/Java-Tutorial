package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStreamDemo obj = new FileOutputStreamDemo();
		obj.writeToFile(new File("/root/Desktop/today/InputOutputDemo.txt"));

	}
	
	public void writeToFile(File file) throws IOException {
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		fileOutput.write("Hello i am parthe omkar".getBytes());
		fileOutput.close();
	}

}
