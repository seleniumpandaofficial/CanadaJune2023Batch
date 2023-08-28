package com.day13.java_ExceptionHandling_in_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concept8_Throws_keyword {

	public static void main(String[] args) {
		try {
			fileNotFoundeExceptionValidation();
		} catch (FileNotFoundException e) {
			System.out.println("The file never existed in the first place");
			e.printStackTrace();
		}

	}
	
	
	public static void fileNotFoundeExceptionValidation() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("Desktop//abc.txt");
	}

}
