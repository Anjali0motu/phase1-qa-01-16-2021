package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowsExceptionTest {

	public static void main(String[] args) {
		// throws keyword is used to declaring (announcing) and exception.
		//		trasaction(0);
		
		try {
			trasaction(100);
		} catch (IOException e) {
			System.out.println("Error Name :: "+e.getClass());
			System.out.println("Error Message :: "+e.getMessage());
		}
	}
	
	public static void trasaction(int amount) throws IOException {
		if(amount > 0 ) {
			System.out.println("Valid amount "+amount);
		} else {
			throw new IOException("In valid user amount "+ amount);
		}
	}

}
