package com.simplilearn.staticfinal;

public class Student {
	
	// static variable
	public static int marks = 100;
	
	public final static String school = "ABC school";
	
	// non static -> instance variable 
	public float avgMarks = 20.24f;
	
	//static method
	public static void getMark() {
		marks = 200;
		System.out.println("The marks are "+ marks);
	}
	
	// non static method
	public void getAvgMarks() {
		System.out.println("The avg marks are "+ avgMarks );
	}
	
}
