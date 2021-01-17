package com.simplilearn.exceptionhandling;

public class ExceptionHandlingTest {

	public static void main(String[] args) {
		
		trasanction(100,null);
	}
	
	
	public static void trasanction(int amount , String username) {
		
		int balance = 2000;
		int res = 0;
		
		
		
		try {
			// Arithmetic exception when amount 0. 
			res = balance / amount;
			
			// Null pointer exception once username is null.
			username.length();
			
			// NumberFormat Exception when username is non convertible value
			int resp = Integer.parseInt(username);
			
			
			
		} catch (ArithmeticException e) {
			System.out.println("Handled :: "+e.getClass());
		} catch (NumberFormatException e) {
			System.out.println("Handled :: "+e.getClass());
		} catch (Exception e) {
			System.out.println("General Handled :: "+e.getClass());
		}	
		System.out.println("Avg :"+res);

	}

}
