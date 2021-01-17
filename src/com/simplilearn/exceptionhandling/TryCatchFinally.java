package com.simplilearn.exceptionhandling;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		System.out.println("Outside try");
		try {
			System.out.println("Inside try");
			int res= 1000 / 0;
		} catch (Exception e) {
			System.out.println("Inside catch :: Exception Occurss");
		} finally {
			System.out.println("Inside finally  :: always excute");
		}

	}
}
