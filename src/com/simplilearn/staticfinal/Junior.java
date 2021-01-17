package com.simplilearn.staticfinal;

public class Junior extends Student {
	
	// static variable
	public static int marks = 300;

	// final methods from super class cannot be override.
	public final static void getMark() {
		marks = 200;
		System.out.println("The marks are " + marks);
	}

}
