package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowExceptionTest {

	public static void main(String[] args) {
		 // Throw keyword is used to throw exception.
//		ageValidator(100);
		trascation(20);
	}
	
	// age validator -> age > 18 
	
	public static void ageValidator(int age) {
		try {
			if(age> 18) {
				System.out.println("Welcome to facebook !");
			} else {
				throw new Exception("Not a valid age .");
			}
			
		} catch (Exception e) {
			System.out.println("Error Name :: "+e.getClass());
			System.out.println("Error Message :: "+e.getMessage());
		}
		System.out.println("The Age :: "+age);
		
	}
	
	public static void trascation(int amount) {
		int balance = 2000;
		int avg = 0;
		try {
			if(amount > 0) {
				avg = balance / amount ;
			} else {
				throw new IOException(" Invalid Amount "+ amount);
			}
		} catch (Exception e) {
			System.out.println("Error Name :: "+e.getClass());
			System.out.println("Error Message :: "+e.getMessage());
		}
		System.out.println("The Avg :: "+avg);
	}
	

}
